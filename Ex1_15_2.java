/*-< ���K�FEx1_15_2 >---------------------------------
�R�����g�ɏ]����2�����z�񂩂�f�[�^�𒊏o���ĉ�ʂɕ\������v���O����������Ă��������B
----------------------------------------------------*/
import java.util.List;
import java.util.ArrayList;

class Ex1_15_2{
	public static void main (String[] args) {
		
		/*
		**���̏������z��B�i�[����Ă�����͈ȉ��̂Ƃ���B
		**  - dogs[x][0]�F���O
		**  - dogs[x][1]�F�N��
		**  - dogs[x][2]�F����
		*/
		String[][] dogs = {
		                    {"���R" , "4��"  , "���X"} ,
		                    {"���M" , "2��"  , "�I�X"} ,
		                    {"�u�u" , "3��"  , "���X"} ,
		                    {"�V��" , "8��"  , "�I�X"} ,
		                    {"�u�u" , "3��"  , "���X"} ,
		                    {"�y��" , "1��"  , "���X"} ,
		                    {"����" , "14��" , "�I�X"} ,
		                    {"����" , "10��" , "���X"} ,
		                    {"�|�`" , "6��"  , "�I�X"} ,
		                    {"�G��" , "2��"  , "���X"} 
		                  };
		
		/*�ȉ��̃v���O�������쐬���Ă��������B
		**  �@Sring�^������ArrayList�uadultFemaleDogsList�v���쐬����
		**  �A2�����z��dogs����ȉ��̏����ɂ��Ă͂܂閼�O�𒊏o���A���ׂ�adultFemaleDogsList�Ɋi�[����
		**     - 4�Έȏ�
		**     - ���X
		**    ���q���g�F�N��̕����񂩂�u�΁v������������@�ɂ��Ē��ׂĂ݂悤�I
		**  �BadultFemaleDogsList�Ɋi�[����Ă��邷�ׂẴf�[�^��println�ŕ\������
		*/
		
		

		List<String> adultFemaleDogsList = new ArrayList<String>();   // adultFemaleDogsList�̔z���String�^�ō쐬
		int age = 0;        // ��
		
		
		for(int i = 0; i < dogs.length; i++){
			
			age = Integer.parseInt(dogs[i][1].replace("��", ""));  // �΂Ƌ󔒂�u�������č΂��폜���Aint�^�ɑ��
			
			if(age >= 4 && dogs[i][2].equals("���X")){
				
				adultFemaleDogsList.add(dogs[i][0]);
			
			}
			
		}
		
		for(int j = 0; j < adultFemaleDogsList.size(); j++){
			
			System.out.println(adultFemaleDogsList.get(j));
		
		}
		
		
	}
}