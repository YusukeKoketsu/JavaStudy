class Jihan2{

	public static void main(String[] args){
		
	
		int entryAmount = 0;   // �������z
		
		int purchasePrice = 0; // �w�����z
		
		int changeAmount = 0;  // ���ނ�̋��z
		
		
// ���̃v���O�������Ə��i���z��10,50,100,500�̏ꍇ�ɂ��܂��@�\���Ȃ��B
		
/*		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("�x�� : " + args[i] + "�~�ʂ͎g���܂���");
				}else if(Integer.parseInt(args[i]) == 10 || Integer.parseInt(args[i]) == 50 || Integer.parseInt(args[i]) == 100 || Integer.parseInt(args[i]) == 500){
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}else{
					if((i + 1) == args.length){
						purchasePrice = Integer.parseInt(args[i]);
					}else{
						System.out.println("�x�� : " + args[i] + "�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���");
					}
				}
			
			changeAmount = entryAmount - purchasePrice;
			
		}
		
		System.out.println(changeAmount + "�~�̂��ނ�ł��B���肪�Ƃ��������܂����B");
*/	
		
		for(int i = 0; i < args.length - 1; i++){
			
			if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("�x�� : " + args[i] + "�~�ʂ͎g���܂���");
				}else if(Integer.parseInt(args[i]) == 10 || Integer.parseInt(args[i]) == 50 || Integer.parseInt(args[i]) == 100 || Integer.parseInt(args[i]) == 500){
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}else{
					if((i + 1) == args.length){
						purchasePrice = Integer.parseInt(args[i]);
					}else{
						System.out.println("�x�� : " + args[i] + "�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���");
					}
				}
			
			purchasePrice = Integer.parseInt(args[args.length - 1]);  // [�v�f�� - 1]�ōŌ�̃C���f�b�N�X�ԍ��̗v�f�����o����
			
		}
		
		changeAmount = entryAmount - purchasePrice;
		
		System.out.println(changeAmount + "�~�̂��ނ�ł��B���肪�Ƃ��������܂����B");
		
	}

}