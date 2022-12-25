class Referee3 {
	
	final String rock = "�O�[";
	final String paper = "�p�[";
	final String scissors = "�`���L";
	
	String name;					// �R����
	String playerHandStatus;				// �v���C���[�̏o����`�F�b�N
	
	Referee3(String name){
		this.name = "�R��" + name;			// �R�������Z�b�g
		
	}
	
	void statusCheck(Player3 player){						// Player3�̃N���X�^�ň����Ƃ��Ă��炦�΁APlayer3�^�̒��ɓ����Ă����񂷂ׂĎg����
		
		if(player.handStatus.equals(rock)){
			playerHandStatus = rock;
		}else if(player.handStatus.equals(paper)){
			playerHandStatus = paper;
		}else if(player.handStatus.equals(scissors)){
			playerHandStatus = scissors;
		}															// if���ɕs���s�ׂ����������ꍇ�̏����́A����͓���Ȃ��B
		
		refereeMessage(player.name + "����́A" + playerHandStatus + "���o���܂����B");
		
	}
	
	
	void winOrLossDecision(Player3 p1, Player3 p2){										// ���s����
		
			if(p1.handStatus.equals(p2.handStatus)){
				refereeMessage("�������I���������ł����B");
			}else if(	(p1.handStatus.equals(rock) && p2.handStatus.equals(scissors))
					||	(p1.handStatus.equals(scissors) && p2.handStatus.equals(paper))
					|| 	(p1.handStatus.equals(paper) && p2.handStatus.equals(rock))		)
					{
						refereeMessage(p1.name + "����̏����I�I");
			}else if(	(p2.handStatus.equals(rock) && p1.handStatus.equals(scissors))
					||	(p2.handStatus.equals(scissors) && p1.handStatus.equals(paper))
					|| 	(p2.handStatus.equals(paper) && p1.handStatus.equals(rock))		)
					{
						refereeMessage(p2.name + "����̏����I�I");
			}else{
						refereeMessage("�s���s�ׂ���������");
			}
		
	}
	
	void resultCall(){
		refereeMessage("���ʂ́E�E�E");
	}
	
	void startColl(){
		refereeMessage("����ł́A�J�n�v���܂��B");
		refereeMessage("����񂯂�E�E�E�ۂ�I�I");
	}
	
	
	void refereeMessage(String mes){
		System.out.println(this.name + "�u" + mes + "�v");
	}

	
}