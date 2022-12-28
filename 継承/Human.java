// スーパークラス Mammal サブクラス Human
class Human extends Mammal{
	
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void selfIntroduction(){					// 自己紹介  継承を使用すれば、スーパークラスのメゾットやフィールド情報も使える
		System.out.println("初めまして" + name + "です。" + "今年で" + age + "です。/" + getLungBreathing() + "です。");
	}
	
}