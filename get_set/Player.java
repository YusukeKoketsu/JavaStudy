class Player {
	
	private final String rock = "グー";
	private final String paper = "パー";
	private final String scissors = "チョキ";


	private String name;
	private String handStatus;
	
	public Player(String name){					// コントラストを使用して名前をセット
		this.name = name;
	}
	
	public String getName(){					// プレイヤー名の参照用
		return this.name;
	}
	
/*	public void setName(String name){			今回はsetterは使用しないが、後で名前を変更したいといった場合に使用する。
		this.name = name;
	}
*/
	
	public String getHandStatus(){
		return this.handStatus;
	}
	
	public String getMakeHandStatus(){
		makeHandStatus();
		return this.handStatus;
	}
	
	private void makeHandStatus(){
		
		int hand = (int)(1 + Math.random() * 3.0);
		
		switch(hand){
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
			System.out.println("不正行為です");
			break;
		}	
	}

}