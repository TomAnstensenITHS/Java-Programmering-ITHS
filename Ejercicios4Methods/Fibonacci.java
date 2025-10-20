package Ejercicios4Methods;

public class Fibonacci {
    public static void main(String[] args) {
      int n = 0;
      int p= 0;
      int s =1;
        public int calculateFibonacci(int position ){
            if (position==0){
                return 0;
            }else if (position==1){
                return 1;
            }else { 
                for (int=2; i=<position; i++){
                    n=p+s;
                    p=s;
                    s=n;
                }
            }
          

        }
    }

}

