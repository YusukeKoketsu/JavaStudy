class Janken2 {
	
	public static void main(String ages[]){
		
	
		Player2 P1 = new Player2(ages[0]);			// �R�}���h���C���������疼�O���󂯎��
		Player2 P2 = new Player2(ages[1]);
		Referee referee = new Referee(ages[2]);
		
		P1.makeHandStatus();			// P1�̂���񂯂�̎���쐬
		P2.makeHandStatus();			// P2�̂���񂯂�̎���쐬
		
		
		referee.startColl();
		referee.playerHandStatus(P1.handStatus, P2.handStatus, P1.name, P2.name);
		referee.judgeCall(P1.handStatus, P2.handStatus, P1.name, P2.name);
		
	}

}