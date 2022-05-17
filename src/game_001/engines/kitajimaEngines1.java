package game_001.engines;

import game_001.judge.scoreboard;

public class kitajimaEngines1 {
	public scoreboard scoreboard;
	public int side;

	/**
	 * スコアボードをセット
	 * @param sb
	 */
	public  kitajimaEngines1 (scoreboard sb, int s) {
		scoreboard = sb;
		side = s;
	}
	
	/**
	 * 常にグーを出す
	 * 
	 * @return int 1 
	 */
	public static int bout() {
		return 1;
	}

}
