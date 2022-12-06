class Jihan2{

	public static void main(String[] args){
	
		int entryAmount = 0;   // “Š“ü‹àŠz
		
		int changeAmount = 0;  // ‚¨’Þ‚è‚Ì‹àŠz
		
		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("Œx : " + args[i] + "‰~‹Ê‚ÍŽg‚¦‚Ü‚¹‚ñ");
				}else if(Integer.parseInt(args[i]) == 777){
					System.out.println("Œx : " + args[i] + "‚Íd‰Ý‚Æ‚µ‚Ä“KØ‚È’l‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
				}else{
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}
			
			changeAmount = entryAmount - (Integer.parseInt(args[i]) * 2);
			
		}
		
		System.out.println(changeAmount + "‰~‚Ì‚¨’Þ‚è‚Å‚·B‚ ‚è‚ª‚Æ‚¤‚²‚´‚¢‚Ü‚µ‚½B");
	
	}

}