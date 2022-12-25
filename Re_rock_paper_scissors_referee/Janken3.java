class Janken3 {
	
	public static void main(String ages[]){
		
		String p1Name = ages[0];
		String p2Name = ages[1];
		String refereeName = ages[2];
		
		Player3 p1 = new Player3(p1Name);
		Player3 p2 = new Player3(p2Name);
		Referee3 referee = new Referee3(refereeName);
		
		p1.makeHandStatus();					// プレイヤーの出し手を決める
		p2.makeHandStatus();

		referee.startColl();					// スタートコール
		
		referee.statusCheck(p1);				// インスタンスで渡して、インスタンス内の情報すべて使えるようにする
		referee.statusCheck(p2);
		
		referee.resultCall();					// 結果発表コール
		
		referee.winOrLossDecision(p1, p2);		// 結果を表示
		
	}
	
}