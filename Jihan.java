class Jihan{

	public static void main(String[] args){
		
		int entryAmount = 0;
		
		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("警告 : " + args[i] + "円玉は使えません");
				}else if(Integer.parseInt(args[i]) == 777){
					System.out.println("警告 : " + args[i] + "は硬貨として適切な値ではありません");
				}else{
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}
		}
		
		System.out.println("ただいまの投入金額は" + entryAmount + "円です");
		
	}

}