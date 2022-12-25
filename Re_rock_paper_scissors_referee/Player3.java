class Player3 {
	
	final String rock = "グー";
	final String paper = "パー";
	final String scissors = "チョキ";
	
	String name;				// プレイヤー名
	String handStatus;			// 出した手の状態
	
	Player3(String name){
		this.name = name;		// プレイヤー名をセット
	}
	
	void makeHandStatus(){
		
		int i = (int)(1 + Math.random() * 3.0);			// 1～3の中でランダムに作る
		
		switch(i){
		case 1:
			handStatus = rock;
			break;
		case 2:
			handStatus = paper;
			break;
		case 3:
			handStatus = scissors;
			break;
		default:
			handStatus = ("エラー！！判定不可能");
			break;
		}
	}
	
}