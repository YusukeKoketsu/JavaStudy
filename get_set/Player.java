class Player {
	
	private final String rock = "�O�[";
	private final String paper = "�p�[";
	private final String scissors = "�`���L";


	private String name;
	private String handStatus;
	
	public Player(String name){					// �R���g���X�g���g�p���Ė��O���Z�b�g
		this.name = name;
	}
	
	public String getName(){					// �v���C���[���̎Q�Ɨp
		return this.name;
	}
	
/*	public void setName(String name){			�����setter�͎g�p���Ȃ����A��Ŗ��O��ύX�������Ƃ������ꍇ�Ɏg�p����B
		this.name = name;
	}
*/
	
	public String getHandStatus(){
		return this.handStatus;
	}
	
	public String getMakeHandStatus(){
		makeHandStatus();
		return this.handStatus;
	}
	
	private void makeHandStatus(){
		
		int hand = (int)(1 + Math.random() * 3.0);
		
		switch(hand){
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
			System.out.println("�s���s�ׂł�");
			break;
		}	
	}

}