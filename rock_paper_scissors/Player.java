class Player{
	
	final String rock =  "�O�[";
	final String paper = "�p�[";
	final String scissors = "�`���L";
	
	String name;									// �v���C���[��
	String handStatus;								// ����񂯂�̎�
	
	Player(String name){							// �R�}���h���C���������疼�O���󂯎��name�ɑ��
		
		this.name = name;
	}
	
//---------------------------�����_���ŏo������쐬-----------------------
	
	void makeHandStatus(){
	
		int random = 1 + (int)(Math.random() * 3.0);
		
		switch(random){
		case 1:
			this.handStatus = rock;
			break;
		case 2:
			this.handStatus = paper;
			break;
		default:
			this.handStatus = rock;
			break;
		}
	
		System.out.println(name +"����̎�� : " + handStatus);
		
	}
	
//------------------------------------------------------------------------

}