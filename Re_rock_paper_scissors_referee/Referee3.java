class Referee3 {
	
	final String rock = "グー";
	final String paper = "パー";
	final String scissors = "チョキ";
	
	String name;					// 審判名
	String playerHandStatus;				// プレイヤーの出し手チェック
	
	Referee3(String name){
		this.name = "審判" + name;			// 審判名をセット
		
	}
	
	void statusCheck(Player3 player){						// Player3のクラス型で引数としてもらえば、Player3型の中に入っている情報すべて使える
		
		if(player.handStatus.equals(rock)){
			playerHandStatus = rock;
		}else if(player.handStatus.equals(paper)){
			playerHandStatus = paper;
		}else if(player.handStatus.equals(scissors)){
			playerHandStatus = scissors;
		}															// if文に不正行為が見つかった場合の処理は、今回は入れない。
		
		refereeMessage(player.name + "さんは、" + playerHandStatus + "を出しました。");
		
	}
	
	
	void winOrLossDecision(Player3 p1, Player3 p2){										// 勝敗判定
		
			if(p1.handStatus.equals(p2.handStatus)){
				refereeMessage("あいこ！引き分けでした。");
			}else if(	(p1.handStatus.equals(rock) && p2.handStatus.equals(scissors))
					||	(p1.handStatus.equals(scissors) && p2.handStatus.equals(paper))
					|| 	(p1.handStatus.equals(paper) && p2.handStatus.equals(rock))		)
					{
						refereeMessage(p1.name + "さんの勝ち！！");
			}else if(	(p2.handStatus.equals(rock) && p1.handStatus.equals(scissors))
					||	(p2.handStatus.equals(scissors) && p1.handStatus.equals(paper))
					|| 	(p2.handStatus.equals(paper) && p1.handStatus.equals(rock))		)
					{
						refereeMessage(p2.name + "さんの勝ち！！");
			}else{
						refereeMessage("不正行為が見つかった");
			}
		
	}
	
	void resultCall(){
		refereeMessage("結果は・・・");
	}
	
	void startColl(){
		refereeMessage("それでは、開始致します。");
		refereeMessage("じゃんけん・・・ぽん！！");
	}
	
	
	void refereeMessage(String mes){
		System.out.println(this.name + "「" + mes + "」");
	}

	
}