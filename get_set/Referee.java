class Referee {
	
	private final String rock = "�O�[";
	private final String paper = "�p�[";
	private final String scissors = "�`���L";
	

	private String name;
	
	public Referee(String name){				// �R���g���X�g���g�p���Ė��O���Z�b�g
		this.name = name;
	}
	
	public String getName(){					// ���t���[���̎Q�Ɨp
		return this.name;
	}
	
	public void startCall(){
		message("�������J�n�v���܂��B");
		message("����񂯂�E�E�E�ۂ�I�I");
	}
	
	public void resultCall(Player p1, Player p2){
		message("���ʂ́E�E�E");
		playerHandStatus(p1, p2);
	}
	
	
	private void message(String mes){
		System.out.println("�R��" + name + "�u" + mes + "�v");
	}
	
	public void checkHand(Player player){
		message(player.getName() + "�����" + player.getHandStatus() + "���o���܂����B");
	}
	
	private void playerHandStatus(Player p1, Player p2){
		
		if(p1.getHandStatus().equals(p2.getHandStatus())){
			message("�������E�E�E���������I�I");
		}else if(	(p1.getHandStatus().equals(rock) && p2.getHandStatus().equals(scissors))
				 || (p1.getHandStatus().equals(scissors) && p2.getHandStatus().equals(paper))
				 || (p1.getHandStatus().equals(paper) && p2.getHandStatus().equals(rock))		){
				 	message(p1.getName() + "����̏����I�I");
		}else if(	(p2.getHandStatus().equals(rock) && p1.getHandStatus().equals(scissors))
				 || (p2.getHandStatus().equals(scissors) && p1.getHandStatus().equals(paper))
				 || (p2.getHandStatus().equals(paper) && p1.getHandStatus().equals(rock))		){
				 	message(p2.getName() + "����̏����I�I");
		}else{
			System.out.println("�������������܂���ł����B");
		}
	}
	

}