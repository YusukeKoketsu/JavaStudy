class Referee {
	
//---------------------�萔-----------------------------
	final String rock =  "�O�[";
	final String paper = "�p�[";
	final String scissors = "�`���L";
//-------------------------------------------------------
	
	String refereeName;
	String resultDisplay = "";
	
	Referee(String name){							// �R����
		this.refereeName = ("�R��" + name);
	}
	
//------------------�X�^�[�g�R�[��------------------------------
	void startColl(){
		System.out.println(refereeName + "�u����ł́A����񂯂���J�n�v���܂��B�v");
		System.out.println(refereeName + "�u����񂯂�E�E�E�ۂ�I�I�v");
	}
	
//-------------------�v���C���[�̎���m�F--------------------------
	void playerHandStatus(String p1HandStatus, String p2HandStatus, String p1name, String p2name){
		
		System.out.println(refereeName + "�u" + p1name + "����̎��" + p1HandStatus + "�ł����I");
		System.out.println(refereeName + "�u" + p2name + "����̎��" + p2HandStatus + "�ł����I");
		
	}
	
//--------------------���s����-------------------------------

	void judgeCall(String p1Status, String p2Status, String p1name, String p2name){		
		
		System.out.println(refereeName + "�u���ʂ́E�E�E�v");
		
			if(p1Status.equals(p2Status)){
				resultDisplay = refereeName + "�u�������I���������I�v";
			}else if(	(p1Status.equals(rock) && p2Status.equals(scissors))
					||	(p1Status.equals(paper) && p2Status.equals(rock))
					||	(p1Status.equals(scissors) && p2Status.equals(paper))	)
			{
				resultDisplay = refereeName + "�u" + p1name + "����̏����I�I�v";
			}else if(	(p2Status.equals(rock) && p1Status.equals(scissors))
					||	(p2Status.equals(paper) && p1Status.equals(rock))
					||	(p2Status.equals(scissors) && p1Status.equals(paper))	)
			{
					resultDisplay = refereeName + "�u" + p2name + "����̏����I�I�v";
			}else{
					if(p1Status.equals("���G")){
						 resultDisplay = p1name;
					}else if (p2Status.equals("���G")){
						resultDisplay = p2name;
					}else{
						resultDisplay = p1name + "�����" + p2name;
					}
				
					resultDisplay = refereeName + "�u" + resultDisplay + "����̕s���s�ׂ�������܂����v";
			}
		
		System.out.println(resultDisplay);

		
	}
	
}