package game_001;

import game_001.engines.kitajimaEnginesCard;
import game_001.engines.kitajimaEnginesRand;
import game_001.judge.judge;
import game_001.judge.scoreboard;

public class MainController {

	public static void main(String[] args) {

		// 第1引数の数だけ勝負
		// int numberBout = Integer.parseInt(args[0]);
		// 勝負回数設定
		int numberBout = 100 ;

		// スコアボードをインスタンス化
		scoreboard scoreboard = new scoreboard();
		
		// ジャッジをインスタンス化
		judge judge = new judge(scoreboard);
		
		// プレイヤーをインスタンス化
		kitajimaEnginesRand user1 = new kitajimaEnginesRand(scoreboard, 1);
		kitajimaEnginesCard user2 = new kitajimaEnginesCard(scoreboard, 2);

		// 勝負
		for (int i = 0; i < numberBout; i++) {
			int user1_card = user1.bout();
			int user2_card = user2.bout();
			int result = judge.judgment(user1_card, user2_card);
		}
		scoreboard.resultScore();
	}

}
