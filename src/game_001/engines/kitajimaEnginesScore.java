package game_001.engines;

import java.util.ArrayList;
import java.util.List;

import game_001.judge.scoreboard;

public class kitajimaEnginesScore {
	// クラス変数
	public scoreboard scoreboard;
	public int side;

	/**
	 * スコアボードをセット
	 * @param sb
	 */
	public  kitajimaEnginesScore (scoreboard sb, int s) {
		scoreboard = sb;
		side = s;
	}
	
	/**
	 * 一回勝つまでグーだけ、勝ったらチョキだけ
	 * 
	 * @return int 
	 */
	public int bout() {
		List<Integer> tmpScore = new ArrayList<>();
		tmpScore = scoreboard.getScore();
		if (tmpScore.get(side - 1) == 0) {
			return 1;
		} else {
			return 2;
		}
	}

}
