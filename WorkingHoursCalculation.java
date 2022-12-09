import java.sql.Time;
import java.math.RoundingMode;  // �����_�ȉ��̐؂�̂āA�l�̌ܓ�����ׂ̃C���|�[�g
import java.math.BigDecimal;    // �����_�ȉ��̌v�Z������P�O�i���ōs���ׂ̃C���|�[�g

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
		final int  HOURLY_SALARY = 900;                    // ����
		final int  MINUTES_SALARY = HOURLY_SALARY / 60;    // ����
		final int  REST_TIME_MINUTES = 45;                 // 45���x�e
		final int  REST_TIME_HOUR = 1;                     // 1���ԋx�e
		final double  OVERTIME_WORKING = 1.25;             // �c�Ƒ�{��
		int dailySalary = 0;                               // ����
		int excessTime  = 0;                               // ���ߎ���
		
		
// ----------------------�J�����Ԍv�Z--------------------------------------------------------
	
		Time startTime = Time.valueOf(args[0]);            // �Ɩ��J�n���Ԃ��R�}���h���C����������󂯎��
		Time finishTime = Time.valueOf(args[1]);           // �Ɩ��I�����Ԃ��R�}���h���C����������󂯎��
		
		long workingTime = finishTime.getTime() - startTime.getTime();       // getTime���\�b�h���g���ĘJ�����Ԃ��~���b�i0.001�b�P�ʁj�Ŏ擾����
		
		int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // workingTime�̃~���b�����ԒP�ʂɊ��Z
		int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // workingTime�̃~���b�𕪒P�ʂɊ��Z   ��) 80�� -> 1���ԗ]��20��
		
		System.out.println("�{���̘J�����Ԃ�" + workingHour + "����" + workingMin + "���ł��B");
		
//-----------------------�����v�Z--------------------------------------------------------------
		if(workingHour > 6 && workingHour <= 8){
			
			dailySalary = (HOURLY_SALARY * workingHour) + (MINUTES_SALARY * (workingMin - REST_TIME_MINUTES));  // 45���x�e�̓����v�Z
			
		}else if(workingHour > 8){
			
			excessTime = workingHour - 8;
			
			dailySalary = (HOURLY_SALARY * 7) + (int)(((excessTime * HOURLY_SALARY) * OVERTIME_WORKING) + (workingMin * OVERTIME_WORKING));
			
		}else{
			
			dailySalary = (HOURLY_SALARY * workingHour) + (MINUTES_SALARY * workingMin);
			
		}
		
		if(excessTime != 0){
			System.out.println("�c�Ǝ��Ԃ�" + excessTime + "���Ԃł����B");
		}
		
		System.out.println("�����̓����́A" + dailySalary + "�~�ł��B����ꂳ�܂ł����B");
		
		
	}

}