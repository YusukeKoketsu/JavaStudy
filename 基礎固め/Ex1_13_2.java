/*-< ���K�FEx1_13_2 >---------------------------------
�R�}���h���C�������Ŏ󂯎���������iA�^�F1, B�^�F2, O�^�F3, AB�^�F4�j�ɉ����āA
�ȉ��̎��s���ʂ�\������v���O�������쐬���Ă��������B
�������Aswitch����K���g�p���Ă��������B

  (A�^)�����͂��ꂽ�ꍇ �F"���Ȃ��͙{���ʂȐ��i�̕��ł��ˁH"
  (B�^)�����͂��ꂽ�ꍇ �F"���Ȃ��̓}�C�y�[�X�Ȑ��i�̕��ł��ˁH"
  (O�^)�����͂��ꂽ�ꍇ �F"���Ȃ��͑�G�c�Ȑ��i�ł��ˁH"
  (AB�^)�����͂��ꂽ�ꍇ�F"���Ȃ��͓V�˔��ȕ��ł��ˁH"
  ��L�ȊO              �F"������1�`4�œ����Ă�������"

----------------------------------------------------*/
public class Ex1_13_2 {
	public static void main (String[] args) {
		
		int bloodType = Integer.parseInt(args[0]);
		
		switch(bloodType){
			
		case 1:
			System.out.println("���Ȃ��͙{���ʂȐ��i�̕��ł��ˁH");
			break;
		case 2:
			System.out.println("���Ȃ��̓}�C�y�[�X�Ȑ��i�̕��ł��ˁH");
			break;
		case 3:
			System.out.println("���Ȃ��͑�G�c�Ȑ��i�ł��ˁH");
			break;
		case 4:
			System.out.println("���Ȃ��͓V�˔��ȕ��ł��ˁH");
			break;
		default:
			System.out.println("������1�`4�œ����Ă�������");
			break;
		}
		
	}
}
