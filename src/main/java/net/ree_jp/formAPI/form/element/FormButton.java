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

package net.ree_jp.formAPI.form.element;

import cn.nukkit.form.element.ElementButton;

public class FormButton extends ElementButton {

    private Runnable task;

    public FormButton(String text, Runnable task) {
        super(text);
    }

    public void setTask(Runnable task) {
        this.task = task;
    }

    public void runTask() {
        this.task.run();
    }
}
