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

import cn.nukkit.Player;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.response.FormResponse;
import cn.nukkit.form.response.FormResponseModal;
import cn.nukkit.form.response.FormResponseSimple;
import net.ree_jp.formAPI.form.element.FormButton;

public interface Response {
    default void handleResponse(Player p, FormResponse res) {
        if (res instanceof FormResponseSimple) {
            ElementButton button = ((FormResponseSimple) res).getClickedButton();
            if (button instanceof FormButton) {
                ((FormButton) button).runTask();
            }
        }
        if (res instanceof FormResponseModal && this instanceof FormModal) {
            ((FormModal) this).runTask(((FormResponseModal) res).getClickedButtonId() == 0);
        }
    }
}
