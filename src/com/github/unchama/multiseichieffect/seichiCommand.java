package com.github.unchama.multiseichieffect;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

public class seichiCommand implements TabExecutor {
	MultiSeichiEffect plugin;

	public seichiCommand(MultiSeichiEffect _plugin){
		plugin = _plugin;
	}
	@Override
	public List<String> onTabComplete(CommandSender arg0, Command arg1,
			String arg2, String[] arg3) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if(args.length == 0){
			plugin.reloadConfig();
			sender.sendMessage("MultiSeichiEffectのconfig.ymlをリロードしました。");
			gachaCommand.onEnableGachaLoad();
			sender.sendMessage("リロードしたconfig.ymlを元にガチャデータをセットしなおしました。");
			return true;
		}
		return false;
	}

}
