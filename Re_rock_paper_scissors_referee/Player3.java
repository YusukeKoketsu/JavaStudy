class Player3 {
	
	final String rock = "�O�[";
	final String paper = "�p�[";
	final String scissors = "�`���L";
	
	String name;				// �v���C���[��
	String handStatus;			// �o������̏��
	
	Player3(String name){
		this.name = name;		// �v���C���[�����Z�b�g
	}
	
	void makeHandStatus(){
		
		int i = (int)(1 + Math.random() * 3.0);			// 1�`3�̒��Ń����_���ɍ��
		
		switch(i){
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
			handStatus = ("�G���[�I�I����s�\");
			break;
		}
	}
	
}