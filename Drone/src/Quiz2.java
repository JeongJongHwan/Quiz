public class Quiz2 {
 
    public static void main(String[] args) {
        
    	int num = 55;
        int a = 1;
        int b = 1;
        int fibo = 0;
        int sum = 0;
        
        for(int i=1; i<=num; i++){
            while(sum<=4000000) {
            	fibo=a+b;
                System.out.println(fibo);
                a=b;
                b=fibo;
                if(fibo%2==0) {
                	sum = sum + fibo;
                }
            }
        	
        }
        System.out.println(sum);
    }
}