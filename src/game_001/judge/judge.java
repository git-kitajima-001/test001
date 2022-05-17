package game_001.judge;

import java.util.List;

import game_001.consts.cards;

public class judge {
	// クラス変数
	public scoreboard scoreboard;
	public List<Integer> currentScore;


	
	/**
	 * スコアボードをセット
	 * @param sb
	 */
	public judge (scoreboard sb) {
		scoreboard = sb;
	}
	
	/**
	 *  判定
	 * @param user1
	 * @param user2
	 * @return
	 */
	public Integer judgment(int user1, int user2) {
		int winner = 0;
		// あいこ
		if (user1 == user2) {
			return winner;
		}
		
		// user1がグー
		if (user1 == cards.GU) {
			// user2がチョキ
			if (user2 == cards.CHOKI) {
				winner = 1;
			// user2がパー
			} else {
				winner = 2;
			}
		}
		
		// user1がチョキ
		if (user1 == cards.CHOKI) {
			// user2がグー
			if (user2 == cards.GU) {
				winner = 2;
			// user2がパー
			} else {
				winner = 1;
			}
		}

		// user1がパー
		if (user1 == cards.PA) {
			// user2がグー
			if (user2 == cards.GU) {
				winner = 1;
			// user2がチョキ
			} else {
				winner = 2;
			}
		}
		
		scoreboard.calcScore(winner, user1, user2);
		return winner;
	}
	

}







