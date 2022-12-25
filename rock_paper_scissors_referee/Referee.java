class Referee {
	
//---------------------定数-----------------------------
	final String rock =  "グー";
	final String paper = "パー";
	final String scissors = "チョキ";
//-------------------------------------------------------
	
	String refereeName;
	String resultDisplay = "";
	
	Referee(String name){							// 審判名
		this.refereeName = ("審判" + name);
	}
	
//------------------スタートコール------------------------------
	void startColl(){
		System.out.println(refereeName + "「それでは、じゃんけんを開始致します。」");
		System.out.println(refereeName + "「じゃんけん・・・ぽん！！」");
	}
	
//-------------------プレイヤーの手を確認--------------------------
	void playerHandStatus(String p1HandStatus, String p2HandStatus, String p1name, String p2name){
		
		System.out.println(refereeName + "「" + p1name + "さんの手は" + p1HandStatus + "でした！");
		System.out.println(refereeName + "「" + p2name + "さんの手は" + p2HandStatus + "でした！");
		
	}
	
//--------------------勝敗処理-------------------------------

	void judgeCall(String p1Status, String p2Status, String p1name, String p2name){		
		
		System.out.println(refereeName + "「結果は・・・」");
		
			if(p1Status.equals(p2Status)){
				resultDisplay = refereeName + "「あいこ！勝負つかず！」";
			}else if(	(p1Status.equals(rock) && p2Status.equals(scissors))
					||	(p1Status.equals(paper) && p2Status.equals(rock))
					||	(p1Status.equals(scissors) && p2Status.equals(paper))	)
			{
				resultDisplay = refereeName + "「" + p1name + "さんの勝ち！！」";
			}else if(	(p2Status.equals(rock) && p1Status.equals(scissors))
					||	(p2Status.equals(paper) && p1Status.equals(rock))
					||	(p2Status.equals(scissors) && p1Status.equals(paper))	)
			{
					resultDisplay = refereeName + "「" + p2name + "さんの勝ち！！」";
			}else{
					if(p1Status.equals("無敵")){
						 resultDisplay = p1name;
					}else if (p2Status.equals("無敵")){
						resultDisplay = p2name;
					}else{
						resultDisplay = p1name + "さんと" + p2name;
					}
				
					resultDisplay = refereeName + "「" + resultDisplay + "さんの不正行為が見つかりました」";
			}
		
		System.out.println(resultDisplay);

		
	}
	
}