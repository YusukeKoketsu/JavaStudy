/*-< ���K�FEx1_15_1 >---------------------------------
BigDecimal�̈����ɂ���API�h�L�������g�ȂǂŒ��ׂȂ���
�ȉ��̌��ʂ��\�������v���O����������Ă݂܂��傤�I
----------------------------------------------------*/
import java.math.RoundingMode;
import java.math.BigDecimal;           // BigDecimal���g�p����ׂ̃C���|�[�g

class Ex1_15_1{
	public static void main (String[] args) {
		
		//(1) 0.2 * 83 - 10.6
		
		BigDecimal num1 = new BigDecimal("0.2");
		BigDecimal num2 = new BigDecimal("83");
		BigDecimal num3 = new BigDecimal("10.6");
		BigDecimal num4 = new BigDecimal(3);
		
		BigDecimal calculationResult1 = (num1.multiply(num2)).subtract(num3);
		
		System.out.println(calculationResult1);
		
		
		
		//(2) 0.2 * 83 - 10.6 / 3�@��������4�ʂ܂łŕ\���i������5�ʈȉ��͎l�̌ܓ��j
		//<�⑫>
		// BigDecimal�ɂ�銄��Z�͊ۂ߂̎w�肪�K�v�ł��I
		// XXX �� YYY�����ď�����2�ʂŕ\���i������3�ʈȉ��͐؂�̂āj
		// XXX.divide(YYY, 2, RoundingMode.DOWN);
		
		
		BigDecimal calculationResult2 = (num1.multiply(num2)).subtract((num3.divide(num4, 4, RoundingMode.HALF_UP)));
		
		System.out.println(calculationResult2);
		
	}
}
