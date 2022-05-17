package game_001.judge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class scoreboard {
	public List<Map<String, Integer>> allScore = new ArrayList<>();
	public List<List<Integer>> totalScore = new ArrayList<>();
	public List<List<Integer>> cardHistory = new ArrayList<>();

	/**
	 * とりあえず勝ったら+1
	 * @param winner
	 * @return
	 */
	public List<Integer> calcScore(int winner, int user1, int user2) {
		List<Integer> tmpScore = new ArrayList<>();
		List<Integer> tmpCard = new ArrayList<>();
		if (winner == 1) {
			tmpScore.add(1);
			tmpScore.add(0);			
		} else if (winner == 2) {
			tmpScore.add(0);
			tmpScore.add(1);			
			
		} else {
			tmpScore.add(0);
			tmpScore.add(0);			
		}
		
		tmpCard.add(user1);
		tmpCard.add(user2);
		
		setScore(tmpScore, tmpCard);
		return tmpScore;
		
	}
	
	/**
	 * 
	 * @param currentScore
	 */
	public void setScore(List<Integer> currentScore, List<Integer> currentCard) {
		totalScore.add(currentScore);
		cardHistory.add(currentCard);
		
	}

	/**
	 * 
	 */
	public List<Integer> getScore() {
		int user1 = 0;
		int user2 = 0;
		List<Integer> tmpScore = new ArrayList<>();
		
		for(List<Integer> tmp: totalScore) {
			if (tmp.get(0) == 1) {
				user1 += 1;
			} else if (tmp.get(1) == 1) {
				user2 += 1;
			}
			
		}
		tmpScore.add(user1);
		tmpScore.add(user2);
		
		return tmpScore;	
	}

	/**
	 * 
	 */
	public List<List<Integer>> getCardHist() {		
		return cardHistory;	
	}

	/**
	 * 
	 */
	public void resultScore() {
		int user1 = 0;
		int user2 = 0;
		for(List<Integer> tmp: totalScore) {
			if (tmp.get(0) == 1) {
				user1 += 1;
			} else if (tmp.get(1) == 1) {
				user2 += 1;
			}
			
		}
		System.out.println("TotalResult -> "+user1+" : "+user2);
	}

}
