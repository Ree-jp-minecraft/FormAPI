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

package net.ree_jp.formAPI.event;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.response.FormResponse;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.utils.TextFormat;
import net.ree_jp.formAPI.form.Response;

public class FormListener implements Listener {

    @EventHandler
    public void formResponse(PlayerFormRespondedEvent ev) {
        Player p = ev.getPlayer();
        FormWindow window = ev.getWindow();
        FormResponse res = ev.getResponse();

        try {
            if (res != null && window instanceof Response) {
                ((Response) window).handleResponse(p, res);
            }
        } catch (Exception ex) {
            p.sendMessage(TextFormat.RED + "form_error:" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
