/*-< ���K�FEx1_10_4 >---------------------------------
�R�����g�ɏ]����2�����z�񂩂�f�[�^�𒊏o���ĉ�ʂɕ\������
�v���O����������Ă��������B
----------------------------------------------------*/
class Ex1_10_4 {
	public static void main (String[] args) {
		
		//�o�͌���2�����z��
		String[][] animals = {
		                       {"���R" ,"�g�C�v�[�h��" ,"4��" ,"���X"},
		                       {"�|�`" ,"�V�o�C�k�@�@" ,"6��" ,"�I�X"},
		                       {"���M" ,"�p�s�����@�@" ,"2��" ,"�I�X"},
		                       {"�u�u" ,"�u���h�b�O�@" ,"3��" ,"���X"},
		                       {"�V��" ,"�H�c���@�@�@" ,"8��" ,"�I�X"}
		                     };
		
		
		/*
		**�ȉ��̏����𖞂���2�����z��̃f�[�^���o&�\�����鏈���������Ă��������B
		**  - for����2�g�ݍ��킹��
		**  - �uanimals.length�v�u animals[i].length�v
		**  - �o�͌��ʂ͈ȉ��ɂȂ�
		**       ���R / �g�C�v�[�h�� / 4�� / ���X
		**       �|�` / �V�o�C�k�@�@ / 6�� / �I�X
		**       ���M / �p�s�����@�@ / 2�� / �I�X
		**       �u�u / �u���h�b�O�@ / 3�� / ���X
		**       �V�� / �H�c���@�@�@ / 8�� / �I�X
		*/
		
		String display = "";
		int count = 1;
		
		for(int i = 0; i < animals.length; i++) {
			
			display = "";   //�������ݒ�
			count = 1;      //�������ݒ�
			
			for(int num = 0; num < animals[i].length; num++){
			
				if(count < animals[i].length) {
					display = display + animals[i][num] + " / ";
				}else{
					display = display + animals[i][num];
				}
				count++;
			}
			
			System.out.println(display);
		
		}
		
		
		
		
		
		
	}
}