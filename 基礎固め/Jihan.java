class Jihan{

	public static void main(String[] args){
		
		int entryAmount = 0;
		
		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("�x�� : " + args[i] + "�~�ʂ͎g���܂���");
				}else if(Integer.parseInt(args[i]) == 10 || Integer.parseInt(args[i]) == 50 || Integer.parseInt(args[i]) == 100 || Integer.parseInt(args[i]) == 500){
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}else{
					System.out.println("�x�� : " + args[i] + "�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���");
				}
		}
		
		System.out.println("�������܂̓������z��" + entryAmount + "�~�ł�");
		
	}

}