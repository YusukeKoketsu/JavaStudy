class Cake {

	public static void main(String[] args){
		
// -----------�萔-------------------------------------
		
		final String cake1Name = "�V���[�g�P�[�L";
		final String cake2Name = "�����u����";
		final String cake3Name = "�`���R���[�g�P�[�L";
		final String cake4Name = "�������̃^���g";
		final String cake5Name = "�`�[�Y�P�[�L";
		
		final int cake1Price = 320;
		final int cake2Price = 350;
		final int cake3Price = 370;
		final int cake4Price = 400;
		final int cake5Price = 300;
		
		final double taxPrice = 1.08;  // �����
// -----------�ϐ�-------------------------------------
		
		int totalPrice = 0;         // ���v���z
		int total = 0;
		
		String item = "";
		int amount = 0;
// -----------------------------------------------------
		
/*		
		if���ŃG���[
		
		for(int i = 0; i < args.length; i++){
			
			item = "";
			total = 0;
			
				if((i + 1) / 2 != 0){
					item = item + args[i];
				}else{
					amount = amount + Integer.parseInt(args[i]);
					
					if(item.equals(cake1Name)){
					total = cake1Price * amount;
					}else if(item.equals(cake2Name)){
						total = cake2Price * amount;
					}else if(item.equals(cake3Name)){
						total = cake3Price * amount;
					}else if(item.equals(cake4Name)){
						total = cake4Price * amount;
					}else if(item.equals(cake5Name)){
						total = cake5Price * amount;
					}else{
					System.out.println("���i��������܂���");
					}
				}
				
				totalPrice = total * (int)taxPrice;
			
		}
		System.out.println(item);System.out.println(amount + amount);
		
		
		
		if(totalPrice > 1000){
			totalPrice /= 2;
			System.out.println("���v���z��" + totalPrice + "�~�ł�");
		}else{
			System.out.println("���v���z��" + totalPrice + "�~�ł�");
		}
*/
		
		for(int i = 0; i < args.length; i = i + 2){
			
			item = "";
			amount = 0;
			total = 0;
			
			item = item + args[i];
			amount = amount + Integer.parseInt(args[i+1]);
			
			if(item.equals(cake1Name)){
				total = cake1Price * amount;
				
			}else if(item.equals(cake2Name)){
				total = cake2Price * amount;
				
			}else if(item.equals(cake3Name)){
				total = cake3Price * amount;
				
			}else if(item.equals(cake4Name)){
				total = cake4Price * amount;
				
			}else if(item.equals(cake5Name)){
				total = cake5Price * amount;
				
			}else{
				System.out.println("���i��������܂���");
			}
			
			totalPrice += total;
			
		}
		
		totalPrice = (int)(totalPrice * taxPrice);
		
		if(totalPrice > 1000){
			totalPrice *= 0.8;
			System.out.println("���v���z��" + totalPrice + "�~�ł�");
		}else{
			System.out.println("���v���z��" + totalPrice + "�~�ł�");
		}
		
		
	}
}