class Player2{
	
	final String rock =  "�O�[";
	final String paper = "�p�[";
	final String scissors = "�`���L";
	
	String name;									// �v���C���[��
	String handStatus;								// ����񂯂�̎�
	
	Player2(String name){							// �R�}���h���C���������疼�O���󂯎��name�ɑ��
		
		this.name = name;
	}
	
//---------------------------�����_���ŏo������쐬-----------------------
	
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
			this.handStatus = "���G";
			break;
		default:
			this.handStatus = rock;
			break;
		}
	
	}
	
//------------------------------------------------------------------------

}