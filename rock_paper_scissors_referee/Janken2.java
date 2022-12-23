class Janken2 {
	
	public static void main(String ages[]){
		
	
		Player2 P1 = new Player2(ages[0]);			// コマンドライン引数から名前を受け取る
		Player2 P2 = new Player2(ages[1]);
		Referee referee = new Referee(ages[2]);
		
		P1.makeHandStatus();			// P1のじゃんけんの手を作成
		P2.makeHandStatus();			// P2のじゃんけんの手を作成
		
		
		referee.startColl();
		referee.playerHandStatus(P1.handStatus, P2.handStatus, P1.name, P2.name);
		referee.judgeCall(P1.handStatus, P2.handStatus, P1.name, P2.name);
		
	}

}