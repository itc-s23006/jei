// s23006
// このプログラムは、ラグビーの試合結果から2チームの勝ち点を計算し、表示するプログラムである。
// 32行追加プログラム

class d48Q6kadai {
		public static void main(String[] args) {
				if (args.length != 4) {
						System.out.println("数値を四つ指定してください");
						return;
				}

				Achievement teamA = new Achievement();
				teamA.set(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				Achievement teamB = new Achievement();
				teamB.set(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

				Match match = new Match();
				match.setAchievements(teamA, teamB);
				System.out.println(match.showResult());
		}
}

class Match {
		Achievement teamA;
		Achievement teamB;

		void setAchievements(Achievement a, Achievement b) {
				teamA = a;
				teamB = b;
		}

		String showResult() {
				if (teamA.point > teamB.point) { // teamA > teamB = "Aチームの勝ち", teamB > teamA = "Bチームの勝ち"
						System.out.println("Aチームの勝ち");
				} else {
						System.out.println("Bチームの勝ち");
				}
				return
				"Team A:" + winPoint(teamA.point, teamB.point, teamA.tryNumber)
				+ "Team B:" + winPoint(teamB.point, teamA.point, teamB.tryNumber);
		}

		int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber) {
				return matchPoint(teamXPoint, teamYPoint) + bonusPoint(teamXTryNumber);
		}

		int matchPoint(int teamXPoint, int teamYPoint) {
				if (teamXPoint == teamYPoint) {
						return 2;
				} else if (teamXPoint > teamYPoint) {
						return 4;
				} else if (teamYPoint - teamXPoint <= 7) {
						return 1;
				}
				return 0;
		}

		int bonusPoint(int tryNumber) {
				return tryNumber >= 4 ? 1 : 0;
		}
}

class Achievement {
		int point;
		int tryNumber;

		void set(int teamPoint, int teamTryNumber) {
				point = teamPoint;
				tryNumber = teamTryNumber;
		}
}
