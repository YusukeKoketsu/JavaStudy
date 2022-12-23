class Player2{
	
	final String rock =  "グー";
	final String paper = "パー";
	final String scissors = "チョキ";
	
	String name;									// プレイヤー名
	String handStatus;								// じゃんけんの手
	
	Player2(String name){							// コマンドライン引数から名前を受け取りnameに代入
		
		this.name = name;
	}
	
//---------------------------ランダムで出し手を作成-----------------------
	
	void makeHandStatus(){
	
		int random = 1 + (int)(Math.random() * 4.0);
		
		switch(random){
		case 1:
			this.handStatus = rock;
			break;
		case 2:
			this.handStatus = paper;
			break;
		case 3:
			this.handStatus = "無敵";
			break;
		default:
			this.handStatus = rock;
			break;
		}
	
	}
	
//------------------------------------------------------------------------

}