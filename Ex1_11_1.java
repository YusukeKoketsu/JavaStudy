/*-< ���K�FEx1_11_1 >---------------------------------
while�����g�p���āA6�̖ڂ��ł�܂ŃT�C�R�����~�葱����v���O�������쐬���Ă��������B
��1�`6�܂ł̃����_����int�^�̒l���擾������@ �F 1 + (int)(Math.random() * 6.0)
��6�̖ڂ��o����u6���o���̂ł��I�����܂��v�ƕ\�����Ă�������
----------------------------------------------------*/
class Ex1_11_1 {
	public static void main (String[] args) {
		
		int i = 0;
		
/*  �Ȃ��Ă���
		i = 1 + (int)(Math.random() * 6.0);
			
		System.out.println(i);
*/
		
		while(i != 6) {
			
			i = 1 + (int)(Math.random() * 6.0);
			
			System.out.println(i);
		
		}
		
		System.out.println("6���o���̂ł��I�����܂�");
		
	}
}
