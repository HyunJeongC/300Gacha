package git;


import java.util.Random;

public class GachaDemo {
	public static int num = 0;
	public static int stack = 0;
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Random r = new Random();
		outerloop: //라벨을 지정해서 중첩된 반복문을 빠져나갈 수 있게 만든다
		//10번 연속 뽑기 실행 뽑기횟수는 300번으로 제한한다
		while(num < 30) { //300뽑기까지 실행 300뽑기까지 pickup이 나오지 않으면 300뽑후 pickup 획득
			num++;
			System.out.println("**********************가챠 확률표***********************");
			System.out.println("1성 확률 : 79.5%");
			System.out.println("2성 확률 : 18%");
			System.out.println("3성 확률 : 1.8%");
			System.out.println("픽업(3성) 확률 : 0.7%");
			System.out.println("픽업은 특정 캐릭을 뽑을 확률을 높인 것으로 전체 3성 확률은 기본3성 확률 + 픽업(3성)확률이다");
			System.out.println("****************************************************");
			//10번 뽑기 실행중 1~9번까지는 일반확률 10번쨰 뽑기는 2성이상부터 나오는 확률을 적용한다
			for(int i = 0; i < 9; i++) { //10연차중 9번쨰 뽑기까지의 확률
				int temp = r.nextInt(1000) + 1; //1~1000까지의 수 중 랜덤값을 저장한 int형 변수
				if(temp > 0 && temp <= 795) {
					System.out.println("1성 캐릭 획득!");
					stack++;
				}
				else if(temp > 795 && temp <= 975) {
					System.out.println("2성 캐릭 획득!!");
					stack++;
				}
				else if(temp > 975 && temp <= 993) {
					System.out.println("★★★3성 캐릭 등장★★★");
					stack++;
				}
				else {
					System.out.println("Pick up!");
					System.out.println("☆★☆[픽업 캐릭 등장]☆★☆");
					System.out.println(temp);
					System.out.println("당신의 뽑기 횟수 : " + 10 * num);
					stack++;
					System.out.println("스택 : " + stack);
					break outerloop; //픽업 캐릭이 등장하면 뽑기를 그만두고 반복문을 탈출한다
				}
			}
			int tmp = r.nextInt(1000) + 1;
			//10연차중 10번쨰 뽑기는 다음과 같이 1성을 제외한 확률뽑기를 실행한다
			if(tmp > 0 && tmp <= 975) {
				System.out.println("2성 캐릭 획득!!");
				stack++;
			}
			else if(tmp > 975 && tmp <= 993) {
				System.out.println("★★★3성 캐릭 등장★★★");
				stack++;
			}
			else {
				System.out.println("Pick up!");
				System.out.println("☆★☆[픽업 캐릭 등장]☆★☆");
				System.out.println(tmp);
				System.out.println("당신의 뽑기 횟수 : " + 10 * num);
				stack++;
				System.out.println("스택 : " + stack);
				break outerloop; //픽업 캐릭이 등장하면 뽑기를 그만두고 반복문을 탈출한다
			}
			
			System.out.println("당신의 뽑기 횟수 : " + 10 * num);
			System.out.println("스택 : " + stack);
			
		}
		if(stack == 300)
			System.out.println("천장교환(300) -> 픽업 캐릭 획득"); //300번동안 뽑지 못하면 300개의 스택으로 픽업 캐릭을 교환해준다
	}

}
