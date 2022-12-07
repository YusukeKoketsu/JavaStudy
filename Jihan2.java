class Jihan2{

	public static void main(String[] args){
		
	
		int entryAmount = 0;   // 投入金額
		
		int purchasePrice = 0; // 購入金額
		
		int changeAmount = 0;  // お釣りの金額
		
		
// このプログラムだと商品金額が10,50,100,500の場合にうまく機能しない。
		
/*		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("警告 : " + args[i] + "円玉は使えません");
				}else if(Integer.parseInt(args[i]) == 10 || Integer.parseInt(args[i]) == 50 || Integer.parseInt(args[i]) == 100 || Integer.parseInt(args[i]) == 500){
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}else{
					if((i + 1) == args.length){
						purchasePrice = Integer.parseInt(args[i]);
					}else{
						System.out.println("警告 : " + args[i] + "は硬貨として適切な値ではありません");
					}
				}
			
			changeAmount = entryAmount - purchasePrice;
			
		}
		
		System.out.println(changeAmount + "円のお釣りです。ありがとうございました。");
*/	
		
		for(int i = 0; i < args.length - 1; i++){
			
			if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("警告 : " + args[i] + "円玉は使えません");
				}else if(Integer.parseInt(args[i]) == 10 || Integer.parseInt(args[i]) == 50 || Integer.parseInt(args[i]) == 100 || Integer.parseInt(args[i]) == 500){
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}else{
					if((i + 1) == args.length){
						purchasePrice = Integer.parseInt(args[i]);
					}else{
						System.out.println("警告 : " + args[i] + "は硬貨として適切な値ではありません");
					}
				}
			
			purchasePrice = Integer.parseInt(args[args.length - 1]);  // [要素数 - 1]で最後のインデックス番号の要素を取り出せる
			
		}
		
		changeAmount = entryAmount - purchasePrice;
		
		System.out.println(changeAmount + "円のお釣りです。ありがとうございました。");
		
	}

}