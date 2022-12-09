import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

class MonthWorkingTimes {

	public static void main(String[] args) {
	
//--------------------�萔�錾---------------------------------
		final String WORKING_RESULT_FILE_PATH = "C:\\Users\\81804\\OneDrive\\�f�X�N�g�b�v\\Udemy\\�Ζ������\\WorkingResult.csv";  // �G�X�P�[�v�V�[�P���X�ׁ̈A\\�Ɠ����͂���
		final String COMMA = ",";         // �R���}
		int attendanceDays = 0;                            // �o�Γ���
		int payAmount = 0;                                // ���v�x���z

//---------------------------------------------------------------

		List<String> workingResults = new ArrayList<String>();   // �t�@�C������ǂݍ��񂾏����i�[����ׂ̔z��
		
		try{
			File workingResultFile = new File(WORKING_RESULT_FILE_PATH);      // �t�@�C���̃p�X���m�F���Đڑ�����
			BufferedReader br = new BufferedReader(new FileReader(workingResultFile));  // FileReader��workingResultFile�̂P������ǂݎ��ABufferedReader�͂�����P�s�ɂ��ăf�[�^�ɂ���
			
			String recode = br.readLine();   // �P�s��ǂݍ���
			
				while(recode != null){
					workingResults.add(recode);   // �P�s��workingResults�ɒǉ�
					recode = br.readLine();       // �P�s��ǂݍ���
				}
			br.close();                       // �ǂݍ��ݏI���A�t�@�C���Ƃ̐ڑ����Ւf����
			
			} catch (IOException e){
				System.out.println(e);
			}
		
		// workingResults����1�s�����o���ē��t/�o�Ύ���/�ދΎ��ԂɐU�蕪��
		for (int i = 0; i < workingResults.size() ; i++) {
			
			String workingRecode    = workingResults.get(i);      // 1�s������������o��
			String[] forSplitRecode = workingRecode.split(COMMA); // split���\�b�h��p���ăJ���}��؂�ŕ�����𕪉����z��ɂ���forSplitRecode�z��Ɋi�[
			
			Date workingDate = Date.valueOf(forSplitRecode[0]); // �o�Γ�
			
			attendanceDays++;
			
			payAmount += dailyAllowanceCalculation(forSplitRecode[1], forSplitRecode[2]);
			
		}
		
		System.out.println("�o�Γ�����" + attendanceDays + "���ł��B");
		System.out.println("�����̋����́A" + payAmount + "�~�ł��B");
		
	}
		
		public static int dailyAllowanceCalculation(String st, String ft){
			
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1���Ԃ̃~���b���Z   �f�[�^�ʂ������ׁALong�^
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1���̃~���b���Z   �f�[�^�ʂ������ׁALong�^
		final int  ONE_HOUR_BY_MIN       = 60;             // 1���Ԃ̕����Z
		final int  HOURLY_SALARY = 900;                    // ����
		final int  MINUTES_SALARY = HOURLY_SALARY / 60;    // ����
		final int  REST_TIME_MINUTES = 45;                 // 45���x�e
		final int  REST_TIME_HOUR = 1;                     // 1���ԋx�e
		final double  OVERTIME_WORKING = 1.25;             // �c�Ƒ�{��
		int excessTime  = 0;                               // ���ߎ���
		int monthlyPay = 0;                                // ����
		int dailySalary = 0;                               // ����
			
		Time startTime   = Time.valueOf(st); // �o�Ύ���
		Time finishTime  = Time.valueOf(ft); // �ދΎ���
		long workingTime = finishTime.getTime() - startTime.getTime();
			
		int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // ���ԂɊ��Z
		int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // ���Ɋ��Z
			
		
		if(workingHour > 6 && workingHour <= 8){
			
			dailySalary = (HOURLY_SALARY * workingHour) + (MINUTES_SALARY * (workingMin - REST_TIME_MINUTES));  // 45���x�e�̓����v�Z
			monthlyPay += dailySalary;
			
		}else if(workingHour > 8){
			
			excessTime = workingHour - (8 + REST_TIME_HOUR);           // �c�Ǝ��Ԃ́A�u�J������ - (8���� + �x�e����)�v
			
			dailySalary = (HOURLY_SALARY * 8) + (int)(((excessTime * HOURLY_SALARY) * OVERTIME_WORKING) + (workingMin * OVERTIME_WORKING));  // 1���ԋx�e�̓����v�Z
			monthlyPay += dailySalary;
			
		}else{
			
			dailySalary = (HOURLY_SALARY * workingHour) + (MINUTES_SALARY * workingMin);             // �x�e�Ȃ��̓����v�Z
			monthlyPay += dailySalary;
			
		}
			
			return monthlyPay;
		
		}

}