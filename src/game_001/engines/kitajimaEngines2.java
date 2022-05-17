package game_001.engines;

import game_001.judge.scoreboard;

public class kitajimaEngines2 {
	public scoreboard scoreboard;
	public int side;

	/**
	 * スコアボードをセット
	 * @param sb
	 */
	public  kitajimaEngines2 (scoreboard sb, int s) {
		scoreboard = sb;
		side = s;
	}
	
	/**
	 * 常にチョキを出す
	 * 
	 * @return int 1 
	 */
	public static int bout() {
		return 2;
	}

}
