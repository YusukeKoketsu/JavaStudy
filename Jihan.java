class Jihan{

	public static void main(String[] args){
		
		int entryAmount = 0;
		
		for(int i = 0; i < args.length; i++){
			
				if(Integer.parseInt(args[i]) == 1 || Integer.parseInt(args[i]) == 5){
					System.out.println("Œx : " + args[i] + "‰~‹Ê‚ÍŽg‚¦‚Ü‚¹‚ñ");
				}else if(Integer.parseInt(args[i]) == 777){
					System.out.println("Œx : " + args[i] + "‚Íd‰Ý‚Æ‚µ‚Ä“KØ‚È’l‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
				}else{
					entryAmount = entryAmount + Integer.parseInt(args[i]);
				}
		}
		
		System.out.println("‚½‚¾‚¢‚Ü‚Ì“Š“ü‹àŠz‚Í" + entryAmount + "‰~‚Å‚·");
		
	}

}