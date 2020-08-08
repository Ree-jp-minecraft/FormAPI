package net.ree_jp.formAPI.form;

import cn.nukkit.Player;
import cn.nukkit.form.response.FormResponse;

public interface Response {
    void handleResponse(Player player, FormResponse response);
}
