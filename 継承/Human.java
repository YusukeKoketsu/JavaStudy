// �X�[�p�[�N���X Mammal �T�u�N���X Human
class Human extends Mammal{
	
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void selfIntroduction(){					// ���ȏЉ�  �p�����g�p����΁A�X�[�p�[�N���X�̃��]�b�g��t�B�[���h�����g����
		System.out.println("���߂܂���" + name + "�ł��B" + "���N��" + age + "�ł��B/" + getLungBreathing() + "�ł��B");
	}
	
}