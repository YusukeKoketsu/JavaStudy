class Referee {
	
	private final String rock = "グー";
	private final String paper = "パー";
	private final String scissors = "チョキ";
	

	private String name;
	
	public Referee(String name){				// コントラストを使用して名前をセット
		this.name = name;
	}
	
	public String getName(){					// レフリー名の参照用
		return this.name;
	}
	
	public void startCall(){
		message("勝負を開始致します。");
		message("じゃんけん・・・ぽん！！");
	}
	
	public void resultCall(Player p1, Player p2){
		message("結果は・・・");
		playerHandStatus(p1, p2);
	}
	
	
	private void message(String mes){
		System.out.println("審判" + name + "「" + mes + "」");
	}
	
	public void checkHand(Player player){
		message(player.getName() + "さんは" + player.getHandStatus() + "を出しました。");
	}
	
	private void playerHandStatus(Player p1, Player p2){
		
		if(p1.getHandStatus().equals(p2.getHandStatus())){
			message("あいこ・・・引き分け！！");
		}else if(	(p1.getHandStatus().equals(rock) && p2.getHandStatus().equals(scissors))
				 || (p1.getHandStatus().equals(scissors) && p2.getHandStatus().equals(paper))
				 || (p1.getHandStatus().equals(paper) && p2.getHandStatus().equals(rock))		){
				 	message(p1.getName() + "さんの勝ち！！");
		}else if(	(p2.getHandStatus().equals(rock) && p1.getHandStatus().equals(scissors))
				 || (p2.getHandStatus().equals(scissors) && p1.getHandStatus().equals(paper))
				 || (p2.getHandStatus().equals(paper) && p1.getHandStatus().equals(rock))		){
				 	message(p2.getName() + "さんの勝ち！！");
		}else{
			System.out.println("勝負が成立しませんでした。");
		}
	}
	

}