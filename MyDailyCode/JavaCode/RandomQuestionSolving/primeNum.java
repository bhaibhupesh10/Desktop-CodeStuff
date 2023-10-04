package RandomQuestionSolving;

public class primeNum {
    public static void main(String[] args) {
        int start = 2;
        int end = 100;
        for(int num =start;num<=end;num++){
            if(isPrime(num)){
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        if(number <=3){
            return true;
        }
        if(number%2==0 || number%3==0){
            return false;
        }

        for(int i=5;i*i<=number;i+=6){
            if(number%i==0 || number%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
