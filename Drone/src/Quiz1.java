public class Quiz1 {
	public static void main(String[] args) {
		int num = 1000;
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
