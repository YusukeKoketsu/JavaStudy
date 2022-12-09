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
		final String WORKING_RESULT_FILE_PATH = "C:\\Users\\81804\\OneDrive\\デスクトップ\\WorkingResult.csv";  // エスケープシーケンスの為、\\と二回入力する
		final String COMMA = ",";         // コンマ
		
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1時間のミリ秒換算   データ量が多い為、Long型
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1分のミリ秒換算   データ量が多い為、Long型
		final int  ONE_HOUR_BY_MIN       = 60;             // 1時間の分換算
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
			Time startTime   = Time.valueOf(forSplitRecode[1]); // 出勤時間
			Time finishTime  = Time.valueOf(forSplitRecode[2]); // 退勤時間
			
			long workingTime = finishTime.getTime() - startTime.getTime();
			
			int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // 時間に換算
			int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // 分に換算
			
			System.out.println( "【日付】"     + workingDate + " / " +
			                    "【勤務時間】" + startTime + "～" + finishTime + " / " +
			                    "【労働時間】" + workingHour + "時間" + workingMin + "分"
			                  );
		}
	
	}

}