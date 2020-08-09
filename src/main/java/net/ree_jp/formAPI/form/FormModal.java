/*
 * RRRRRR                         jjj
 * RR   RR   eee    eee               pp pp
 * RRRRRR  ee   e ee   e _____    jjj ppp  pp
 * RR  RR  eeeee  eeeee           jjj pppppp
 * RR   RR  eeeee  eeeee          jjj pp
 *                              jjjj  pp
 *
 * Copyright (c) 2020. Ree-jp.  All Rights Reserved.
 */

package net.ree_jp.formAPI.form;

import cn.nukkit.form.window.FormWindowModal;

public class FormModal extends FormWindowModal {
    private Runnable trueTask;
    private Runnable falseTask;

    public FormModal(String title, String content, String trueButtonText, String falseButtonText) {
        super(title, content, trueButtonText, falseButtonText);
    }

    public FormModal(String title, String content, String trueButtonText, String falseButtonText, Runnable trueTask, Runnable falseTask) {
        super(title, content, trueButtonText, falseButtonText);
        this.trueTask = trueTask;
        this.falseTask = falseTask;
    }

    public void setTrueTask(Runnable task) {
        this.trueTask = task;
    }

    public void setFalseTask(Runnable task) {
        this.falseTask = task;
    }

    public void runTask(Boolean bool) {
        if (bool) {
            trueTask.run();
        } else {
            falseTask.run();
        }
    }
}
