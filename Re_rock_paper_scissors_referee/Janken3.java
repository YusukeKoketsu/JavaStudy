class Janken3 {
	
	public static void main(String ages[]){
		
		String p1Name = ages[0];
		String p2Name = ages[1];
		String refereeName = ages[2];
		
		Player3 p1 = new Player3(p1Name);
		Player3 p2 = new Player3(p2Name);
		Referee3 referee = new Referee3(refereeName);
		
		p1.makeHandStatus();					// �v���C���[�̏o��������߂�
		p2.makeHandStatus();

		referee.startColl();					// �X�^�[�g�R�[��
		
		referee.statusCheck(p1);				// �C���X�^���X�œn���āA�C���X�^���X���̏�񂷂ׂĎg����悤�ɂ���
		referee.statusCheck(p2);
		
		referee.resultCall();					// ���ʔ��\�R�[��
		
		referee.winOrLossDecision(p1, p2);		// ���ʂ�\��
		
	}
	
}