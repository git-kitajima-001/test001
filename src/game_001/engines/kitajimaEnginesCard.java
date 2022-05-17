package game_001.engines;

import java.util.ArrayList;
import java.util.List;

import game_001.judge.scoreboard;

public class kitajimaEnginesCard {
	// クラス変数
	public scoreboard scoreboard;
	public int side;

	/**
	 * スコアボードをセット
	 * @param sb
	 */
	public  kitajimaEnginesCard (scoreboard sb, int s) {
		scoreboard = sb;
		side = s;
	}
	
	/**
	 * 最初はグー、あとは相手の真似
	 * 
	 * @return int 
	 */
	public int bout() {
		List<List<Integer>> tmpHistAll = new ArrayList<>();
		List<Integer> tmpHist = new ArrayList<>();
		
		tmpHistAll = scoreboard.getCardHist();
		if (tmpHistAll.size() == 0) {
			return 1;
		}
		
		for (List<Integer> tmpHist2 : tmpHistAll) {
			tmpHist = tmpHist2;
			
		}
		
		if (side == 1) {
			return tmpHist.get(1);
		} else {
			return tmpHist.get(0);
		}
			
	}

}
