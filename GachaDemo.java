package git;


import java.util.Random;

public class GachaDemo {
	public static int num = 0;
	public static int stack = 0;
	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Random r = new Random();
		outerloop: //���� �����ؼ� ��ø�� �ݺ����� �������� �� �ְ� �����
		//10�� ���� �̱� ���� �̱�Ƚ���� 300������ �����Ѵ�
		while(num < 30) { //300�̱���� ���� 300�̱���� pickup�� ������ ������ 300���� pickup ȹ��
			num++;
			System.out.println("**********************��í Ȯ��ǥ***********************");
			System.out.println("1�� Ȯ�� : 79.5%");
			System.out.println("2�� Ȯ�� : 18%");
			System.out.println("3�� Ȯ�� : 1.8%");
			System.out.println("�Ⱦ�(3��) Ȯ�� : 0.7%");
			System.out.println("�Ⱦ��� Ư�� ĳ���� ���� Ȯ���� ���� ������ ��ü 3�� Ȯ���� �⺻3�� Ȯ�� + �Ⱦ�(3��)Ȯ���̴�");
			System.out.println("****************************************************");
			//10�� �̱� ������ 1~9�������� �Ϲ�Ȯ�� 10���� �̱�� 2���̻���� ������ Ȯ���� �����Ѵ�
			for(int i = 0; i < 9; i++) { //10������ 9���� �̱������ Ȯ��
				int temp = r.nextInt(1000) + 1; //1~1000������ �� �� �������� ������ int�� ����
				if(temp > 0 && temp <= 795) {
					System.out.println("1�� ĳ�� ȹ��!");
					stack++;
				}
				else if(temp > 795 && temp <= 975) {
					System.out.println("2�� ĳ�� ȹ��!!");
					stack++;
				}
				else if(temp > 975 && temp <= 993) {
					System.out.println("�ڡڡ�3�� ĳ�� ����ڡڡ�");
					stack++;
				}
				else {
					System.out.println("Pick up!");
					System.out.println("�١ڡ�[�Ⱦ� ĳ�� ����]�١ڡ�");
					System.out.println(temp);
					System.out.println("����� �̱� Ƚ�� : " + 10 * num);
					stack++;
					System.out.println("���� : " + stack);
					break outerloop; //�Ⱦ� ĳ���� �����ϸ� �̱⸦ �׸��ΰ� �ݺ����� Ż���Ѵ�
				}
			}
			int tmp = r.nextInt(1000) + 1;
			//10������ 10���� �̱�� ������ ���� 1���� ������ Ȯ���̱⸦ �����Ѵ�
			if(tmp > 0 && tmp <= 975) {
				System.out.println("2�� ĳ�� ȹ��!!");
				stack++;
			}
			else if(tmp > 975 && tmp <= 993) {
				System.out.println("�ڡڡ�3�� ĳ�� ����ڡڡ�");
				stack++;
			}
			else {
				System.out.println("Pick up!");
				System.out.println("�١ڡ�[�Ⱦ� ĳ�� ����]�١ڡ�");
				System.out.println(tmp);
				System.out.println("����� �̱� Ƚ�� : " + 10 * num);
				stack++;
				System.out.println("���� : " + stack);
				break outerloop; //�Ⱦ� ĳ���� �����ϸ� �̱⸦ �׸��ΰ� �ݺ����� Ż���Ѵ�
			}
			
			System.out.println("����� �̱� Ƚ�� : " + 10 * num);
			System.out.println("���� : " + stack);
			
		}
		if(stack == 300)
			System.out.println("õ�屳ȯ(300) -> �Ⱦ� ĳ�� ȹ��"); //300������ ���� ���ϸ� 300���� �������� �Ⱦ� ĳ���� ��ȯ���ش�
	}

}
