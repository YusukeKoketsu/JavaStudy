import java.sql.Time;

/* �P���̋��t�v�Z
���d�l��
�E������900�~�Ƃ��A���^��1���P�ʂŎx�����܂��B
�E�����_�ȉ��̋��^�͐؂�̂ĂĎZ�o����܂��B
�E�J�����Ԃ�6���Ԓ��`8���Ԉȉ��̏ꍇ��45���̋x�e���A8���Ԃ𒴂���ꍇ��1���Ԃ̋x�e���Ƃ���̂Ƃ��܂��B
  �Ȃ��A�x�e���Ԃɂ����ċ��^�͔������܂���B
�E�x�e���Ԃ������������J�����ԁi���J�����ԁj��8���Ԃ𒴂���ꍇ�A���ߕ��Ɍ���c�Ƒ�Ƃ���1.25�{�̋��^���x��������̂Ƃ��܂��B
*/
class WorkingHoursCalculation {

	public static void main(String[] args) {
		
// ----------------------�萔�錾-----------------------------------------------------------
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1���Ԃ̃~���b���Z   �f�[�^�ʂ������ׁALong�^
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1���̃~���b���Z   �f�[�^�ʂ������ׁALong�^
		final int  ONE_HOUR_BY_MIN       = 60;             // 1���Ԃ̕����Z
// -----------------------�J�����Ԍv�Z-------------------------------------------------------
	
		Time startTime = Time.valueOf(args[0]);            // �Ɩ��J�n���Ԃ��R�}���h���C����������󂯎��
		Time finishTime = Time.valueOf(args[1]);           // �Ɩ��I�����Ԃ��R�}���h���C����������󂯎��
		
		long workingTime = finishTime.getTime() - startTime.getTime();       // getTime���\�b�h���g���ĘJ�����Ԃ��~���b�i0.001�b�P�ʁj�Ŏ擾����
		
		int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // workingTime�̃~���b�����ԒP�ʂɊ��Z
		int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // workingTime�̃~���b�𕪒P�ʂɊ��Z   ��) 80�� -> 1���ԗ]��20��
		
		System.out.println("�{���̘J�����Ԃ�" + workingHour + "����" + workingMin + "���ł��B");
		
//-----------------------------------------------------------------------------------------------
		
	}

}