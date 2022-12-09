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
	
//--------------------定数宣言---------------------------------
		final String WORKING_RESULT_FILE_PATH = "C:\\Users\\81804\\OneDrive\\デスクトップ\\Udemy\\勤務問題例題\\WorkingResult.csv";  // エスケープシーケンスの為、\\と二回入力する
		final String COMMA = ",";         // コンマ
		int attendanceDays = 0;                            // 出勤日数
		int payAmount = 0;                                // 合計支給額

//---------------------------------------------------------------

		List<String> workingResults = new ArrayList<String>();   // ファイルから読み込んだ情報を格納する為の配列
		
		try{
			File workingResultFile = new File(WORKING_RESULT_FILE_PATH);      // ファイルのパスを確認して接続する
			BufferedReader br = new BufferedReader(new FileReader(workingResultFile));  // FileReaderはworkingResultFileの１文字を読み取り、BufferedReaderはそれを１行にしてデータにする
			
			String recode = br.readLine();   // １行を読み込み
			
				while(recode != null){
					workingResults.add(recode);   // １行をworkingResultsに追加
					recode = br.readLine();       // １行を読み込み
				}
			br.close();                       // 読み込み終了、ファイルとの接続を遮断する
			
			} catch (IOException e){
				System.out.println(e);
			}
		
		// workingResultsから1行ずつ取り出して日付/出勤時間/退勤時間に振り分け
		for (int i = 0; i < workingResults.size() ; i++) {
			
			String workingRecode    = workingResults.get(i);      // 1行ずつ文字列を取り出す
			String[] forSplitRecode = workingRecode.split(COMMA); // splitメソッドを用いてカンマ区切りで文字列を分解＆配列にしてforSplitRecode配列に格納
			
			Date workingDate = Date.valueOf(forSplitRecode[0]); // 出勤日
			
			attendanceDays++;
			
			payAmount += dailyAllowanceCalculation(forSplitRecode[1], forSplitRecode[2]);
			
		}
		
		System.out.println("出勤日数は" + attendanceDays + "日です。");
		System.out.println("今月の給料は、" + payAmount + "円です。");
		
	}
		
		public static int dailyAllowanceCalculation(String st, String ft){
			
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1時間のミリ秒換算   データ量が多い為、Long型
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1分のミリ秒換算   データ量が多い為、Long型
		final int  ONE_HOUR_BY_MIN       = 60;             // 1時間の分換算
		final int  HOURLY_SALARY = 900;                    // 時給
		final int  MINUTES_SALARY = HOURLY_SALARY / 60;    // 分給
		final int  REST_TIME_MINUTES = 45;                 // 45分休憩
		final int  REST_TIME_HOUR = 1;                     // 1時間休憩
		final double  OVERTIME_WORKING = 1.25;             // 残業代倍率
		int excessTime  = 0;                               // 超過時間
		int monthlyPay = 0;                                // 月給
		int dailySalary = 0;                               // 日給
			
		Time startTime   = Time.valueOf(st); // 出勤時間
		Time finishTime  = Time.valueOf(ft); // 退勤時間
		long workingTime = finishTime.getTime() - startTime.getTime();
			
		int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // 時間に換算
		int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // 分に換算
			
		
		if(workingHour > 6 && workingHour <= 8){
			
			dailySalary = (HOURLY_SALARY * workingHour) + (MINUTES_SALARY * (workingMin - REST_TIME_MINUTES));  // 45分休憩の日給計算
			monthlyPay += dailySalary;
			
		}else if(workingHour > 8){
			
			excessTime = workingHour - (8 + REST_TIME_HOUR);           // 残業時間は、「労働時間 - (8時間 + 休憩時間)」
			
			dailySalary = (HOURLY_SALARY * 8) + (int)(((excessTime * HOURLY_SALARY) * OVERTIME_WORKING) + (workingMin * OVERTIME_WORKING));  // 1時間休憩の日給計算
			monthlyPay += dailySalary;
			
		}else{
			
			dailySalary = (HOURLY_SALARY * workingHour) + (MINUTES_SALARY * workingMin);             // 休憩なしの日給計算
			monthlyPay += dailySalary;
			
		}
			
			return monthlyPay;
		
		}

}