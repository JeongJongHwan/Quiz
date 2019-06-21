public class Quiz3 {
    public static void main(String[] args){
        long num = 600851475143L;
 
        while(num!=1){
            for(int i=2; i<=num; i++){
                if(num%i==0){
                    num /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}