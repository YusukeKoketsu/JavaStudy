/*-< 演習：Ex1_10_4 >---------------------------------
コメントに従って2次元配列からデータを抽出して画面に表示する
プログラムを作ってください。
----------------------------------------------------*/
class Ex1_10_4 {
	public static void main (String[] args) {
		
		//出力元の2次元配列
		String[][] animals = {
		                       {"モコ" ,"トイプードル" ,"4歳" ,"メス"},
		                       {"ポチ" ,"シバイヌ　　" ,"6歳" ,"オス"},
		                       {"ムギ" ,"パピヨン　　" ,"2歳" ,"オス"},
		                       {"ブブ" ,"ブルドッグ　" ,"3歳" ,"メス"},
		                       {"シロ" ,"秋田犬　　　" ,"8歳" ,"オス"}
		                     };
		
		
		/*
		**以下の条件を満たす2次元配列のデータ抽出&表示する処理を書いてください。
		**  - for文を2つ組み合わせる
		**  - 「animals.length」「 animals[i].length」
		**  - 出力結果は以下になる
		**       モコ / トイプードル / 4歳 / メス
		**       ポチ / シバイヌ　　 / 6歳 / オス
		**       ムギ / パピヨン　　 / 2歳 / オス
		**       ブブ / ブルドッグ　 / 3歳 / メス
		**       シロ / 秋田犬　　　 / 8歳 / オス
		*/
		
		String display = "";
		int count = 1;
		
		for(int i = 0; i < animals.length; i++) {
			
			display = "";   //初期化設定
			count = 1;      //初期化設定
			
			for(int num = 0; num < animals[i].length; num++){
			
				if(count < animals[i].length) {
					display = display + animals[i][num] + " / ";
				}else{
					display = display + animals[i][num];
				}
				count++;
			}
			
			System.out.println(display);
		
		}
		
		
		
		
		
		
	}
}
