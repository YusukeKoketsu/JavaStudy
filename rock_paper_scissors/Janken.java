class Janken {
	
	public static void main(String ages[]){
		
//---------------------�萔-----------------------------
		final String rock =  "�O�[";
		final String paper = "�p�[";
		final String scissors = "�`���L";
//-------------------------------------------------------
		String resultDisplay = "";					// ���s���ʕ\��
	
		Player P1 = new Player(ages[0]);			// �R�}���h���C���������疼�O���󂯎��
		Player P2 = new Player(ages[1]);
		
		System.out.println("����񂯂�E�E�E�ۂ�I�I");
		
		P1.makeHandStatus();			// P1�̂���񂯂�̎���쐬
		P2.makeHandStatus();			// P2�̂���񂯂�̎���쐬
		
		
//--------------------���s����-------------------------------
		
			if(P1.handStatus.equals(P2.handStatus)){
				resultDisplay = "�������I���������I";
			}else if(	(P1.handStatus.equals(rock) && P2.handStatus.equals(scissors))
					||	(P1.handStatus.equals(paper) && P2.handStatus.equals(rock))
					||	(P1.handStatus.equals(scissors) && P2.handStatus.equals(paper))	)
			{
				resultDisplay = P1.name + "����̏����I�I";
			}else if(	(P2.handStatus.equals(rock) && P1.handStatus.equals(scissors))
					||	(P2.handStatus.equals(paper) && P1.handStatus.equals(rock))
					||	(P2.handStatus.equals(scissors) && P1.handStatus.equals(paper))	)
			{
					resultDisplay = P2.name + "����̏����I�I";
			}else{
					resultDisplay = "�s���s�ׂ�������܂���";
			}
		
		System.out.println(resultDisplay);				// ���s�\��
		
	}

}