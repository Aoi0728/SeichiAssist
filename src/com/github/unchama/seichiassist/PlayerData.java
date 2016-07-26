package com.github.unchama.seichiassist;

import java.util.ArrayList;
import java.util.List;




public class PlayerData {
	//初めて参加した時のフラグ
	boolean firstjoinflag;
	//エフェクトのフラグ
	boolean effectflag;
	//内訳メッセージを出すフラグ
	boolean messageflag;
	//1分間のデータを保存するincrease:１分間の採掘量
	MineBlock minuteblock;
	//３０分間のデータを保存する．
	MineBlock halfhourblock;
	//ガチャの基準となるポイント
	int gachapoint;
	//最後のガチャポイントデータ
	int lastgachapoint;
	//今回の採掘速度上昇レベルを格納
	int minespeedlv;
	//持ってるポーションエフェクト全てを格納する．
	List<EffectData> effectdatalist;

	PlayerData(){
		firstjoinflag = false;
		effectflag = true;
		messageflag = false;
		minuteblock = new MineBlock();
		halfhourblock = new MineBlock();
		effectdatalist = new ArrayList<EffectData>();
		gachapoint = 0;
		lastgachapoint = 0;
		minespeedlv = 0;
		minuteblock.before = 0;
		halfhourblock.before = minuteblock.before;
	}
}
