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
		final String WORKING_RESULT_FILE_PATH = "C:\\Users\\81804\\OneDrive\\�f�X�N�g�b�v\\WorkingResult.csv";  // �G�X�P�[�v�V�[�P���X�ׁ̈A\\�Ɠ����͂���
		final String COMMA = ",";         // �R���}
		
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1���Ԃ̃~���b���Z   �f�[�^�ʂ������ׁALong�^
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1���̃~���b���Z   �f�[�^�ʂ������ׁALong�^
		final int  ONE_HOUR_BY_MIN       = 60;             // 1���Ԃ̕����Z
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
			Time startTime   = Time.valueOf(forSplitRecode[1]); // �o�Ύ���
			Time finishTime  = Time.valueOf(forSplitRecode[2]); // �ދΎ���
			
			long workingTime = finishTime.getTime() - startTime.getTime();
			
			int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // ���ԂɊ��Z
			int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // ���Ɋ��Z
			
			System.out.println( "�y���t�z"     + workingDate + " / " +
			                    "�y�Ζ����ԁz" + startTime + "�`" + finishTime + " / " +
			                    "�y�J�����ԁz" + workingHour + "����" + workingMin + "��"
			                  );
		}
	
	}

}