/*-< 演習：Ex1_05_1 >-------------------------------------------------------------------
以下�@〜�Dのデータを格納する変数を定義したい。
それぞれに適した型で変数宣言&初期化を行ってください。
なお、変数名はJavaの一般的に規則に従っていることはもちろん、
「どのようなデータが格納されているか一目でわかる名前」になるよう意識してつけてください。
  �@ IT業界の生涯賃金（調べてください）
  �A IT業界の市場規模（調べてください）
  �B 自分の好きな漢字1文字 ※char型を使いましょう
  �C 自分のなりたい職業
  �D 自分が既卒かどうか ※boolean型を使いましょう
--------------------------------------------------------------------------------------*/
class Ex1_05_1 {
	public static void main (String[] args) {
		
		int lifetimeWage = 276000000;
		
		long marketSize = 16401600000000L;
		
		char like = '卍';
		
		String job = "プログラマー";
		
		boolean previousGraduate = true;
		
		System.out.println(lifetimeWage);
		System.out.println(marketSize);
		System.out.println(like);
		System.out.println(job);
		System.out.println(previousGraduate);
		
	}
}
