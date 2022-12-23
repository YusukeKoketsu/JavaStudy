class Cake {

	public static void main(String[] args){
		
// -----------定数-------------------------------------
		
		final String cake1Name = "ショートケーキ";
		final String cake2Name = "モンブラン";
		final String cake3Name = "チョコレートケーキ";
		final String cake4Name = "いちごのタルト";
		final String cake5Name = "チーズケーキ";
		
		final int cake1Price = 320;
		final int cake2Price = 350;
		final int cake3Price = 370;
		final int cake4Price = 400;
		final int cake5Price = 300;
		
		final double taxPrice = 1.08;  // 消費税
// -----------変数-------------------------------------
		
		int totalPrice = 0;         // 合計金額
		int total = 0;
		
		String item = "";
		int amount = 0;
// -----------------------------------------------------
		
/*		
		if文でエラー
		
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
					System.out.println("商品が見つかりません");
					}
				}
				
				totalPrice = total * (int)taxPrice;
			
		}
		System.out.println(item);System.out.println(amount + amount);
		
		
		
		if(totalPrice > 1000){
			totalPrice /= 2;
			System.out.println("合計金額は" + totalPrice + "円です");
		}else{
			System.out.println("合計金額は" + totalPrice + "円です");
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
				System.out.println("商品が見つかりません");
			}
			
			totalPrice += total;
			
		}
		
		totalPrice = (int)(totalPrice * taxPrice);
		
		if(totalPrice > 1000){
			totalPrice *= 0.8;
			System.out.println("合計金額は" + totalPrice + "円です");
		}else{
			System.out.println("合計金額は" + totalPrice + "円です");
		}
		
		
	}
}