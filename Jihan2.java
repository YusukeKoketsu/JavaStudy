class Jihan2{

	public static void main(String[] args){
	
		int entryAmount = 0;   // �������z
		
		int changeAmount = 0;  // ���ނ�̋��z
		
		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("�x�� : " + args[i] + "�~�ʂ͎g���܂���");
				}else if(Integer.parseInt(args[i]) == 777){
					System.out.println("�x�� : " + args[i] + "�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���");
				}else{
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}
			
			changeAmount = entryAmount - (Integer.parseInt(args[i]) * 2);
			
		}
		
		System.out.println(changeAmount + "�~�̂��ނ�ł��B���肪�Ƃ��������܂����B");
	
	}

}