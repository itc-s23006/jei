public class d52Q2kadai {
		public class Cooking {
				private String name;
				private int time;
				Cooking(String name, int time) {
						this.name = name;
						this.time = time;
				}
				public String getName() { return name; }
				public int getTime() { return time; }
		}

		public class Cooker {
				private Cooking c1 = new Cooking("ステーキ", 20);
				private Cooking c2 = new Cooking("ミニサラダ", 10);
		}
}
