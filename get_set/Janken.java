class Janken {

	public static void main(String ages[]){
		
		String p1Name = ages[0];
		String p2Name = ages[1];
		String refereeName = ages[2];
	
		Player p1 = new Player(p1Name);
		Player p2 = new Player(p2Name);
		Referee referee = new Referee(refereeName);
		
		referee.startCall();
		
		p1.getMakeHandStatus();
		p2.getMakeHandStatus();
		
		referee.checkHand(p1);
		referee.checkHand(p2);
		
		referee.resultCall(p1, p2);
		
	}

}