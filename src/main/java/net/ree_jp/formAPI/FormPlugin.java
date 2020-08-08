package net.ree_jp.formAPI;

import cn.nukkit.plugin.PluginBase;
import net.ree_jp.formAPI.event.FormListener;

class FormPlugin extends PluginBase {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FormListener(), this);
        super.onEnable();
    }
}
