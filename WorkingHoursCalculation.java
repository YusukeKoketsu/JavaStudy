import java.sql.Time;

/* １日の給付計算
＜仕様＞
・時給は900円とし、給与は1分単位で支払われます。
・小数点以下の給与は切り捨てて算出されます。
・労働時間が6時間超～8時間以下の場合は45分の休憩を、8時間を超える場合は1時間の休憩をとるものとします。
  なお、休憩時間において給与は発生しません。
・休憩時間を差し引いた労働時間（実労働時間）が8時間を超える場合、超過分に限り残業代として1.25倍の給与が支払われるものとします。
*/
class WorkingHoursCalculation {

	public static void main(String[] args) {
		
// ----------------------定数宣言-----------------------------------------------------------
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1時間のミリ秒換算   データ量が多い為、Long型
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1分のミリ秒換算   データ量が多い為、Long型
		final int  ONE_HOUR_BY_MIN       = 60;             // 1時間の分換算
// -----------------------労働時間計算-------------------------------------------------------
	
		Time startTime = Time.valueOf(args[0]);            // 業務開始時間をコマンドライン引数から受け取る
		Time finishTime = Time.valueOf(args[1]);           // 業務終了時間をコマンドライン引数から受け取る
		
		long workingTime = finishTime.getTime() - startTime.getTime();       // getTimeメソッドを使って労働時間をミリ秒（0.001秒単位）で取得する
		
		int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // workingTimeのミリ秒を時間単位に換算
		int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // workingTimeのミリ秒を分単位に換算   例) 80分 -> 1時間余り20分
		
		System.out.println("本日の労働時間は" + workingHour + "時間" + workingMin + "分です。");
		
//-----------------------------------------------------------------------------------------------
		
	}

}