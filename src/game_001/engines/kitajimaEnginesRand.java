package game_001.engines;

import java.util.Random;

import game_001.judge.scoreboard;

public class kitajimaEnginesRand {
	// クラス変数
	public scoreboard scoreboard;
	public int side;

	/**
	 * スコアボードをセット
	 * @param sb
	 */
	public  kitajimaEnginesRand (scoreboard sb, int s) {
		scoreboard = sb;
		side = s;
	}
	
	/**
	 * 乱数で手を出す
	 * 
	 * @return int 
	 */
	public int bout() {
		Random rand = new Random();
		return rand.nextInt(3) + 1;
	}

}
