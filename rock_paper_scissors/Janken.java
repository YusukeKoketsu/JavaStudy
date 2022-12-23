class Janken {
	
	public static void main(String ages[]){
		
//---------------------定数-----------------------------
		final String rock =  "グー";
		final String paper = "パー";
		final String scissors = "チョキ";
//-------------------------------------------------------
		String resultDisplay = "";					// 勝敗結果表示
	
		Player P1 = new Player(ages[0]);			// コマンドライン引数から名前を受け取り
		Player P2 = new Player(ages[1]);
		
		System.out.println("じゃんけん・・・ぽん！！");
		
		P1.makeHandStatus();			// P1のじゃんけんの手を作成
		P2.makeHandStatus();			// P2のじゃんけんの手を作成
		
		
//--------------------勝敗処理-------------------------------
		
			if(P1.handStatus.equals(P2.handStatus)){
				resultDisplay = "あいこ！勝負つかず！";
			}else if(	(P1.handStatus.equals(rock) && P2.handStatus.equals(scissors))
					||	(P1.handStatus.equals(paper) && P2.handStatus.equals(rock))
					||	(P1.handStatus.equals(scissors) && P2.handStatus.equals(paper))	)
			{
				resultDisplay = P1.name + "さんの勝ち！！";
			}else if(	(P2.handStatus.equals(rock) && P1.handStatus.equals(scissors))
					||	(P2.handStatus.equals(paper) && P1.handStatus.equals(rock))
					||	(P2.handStatus.equals(scissors) && P1.handStatus.equals(paper))	)
			{
					resultDisplay = P2.name + "さんの勝ち！！";
			}else{
					resultDisplay = "不正行為が見つかりました";
			}
		
		System.out.println(resultDisplay);				// 勝敗表示
		
	}

}