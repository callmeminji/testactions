package itm;

public class Calculator {
    public ind add ( int a, int b){
        return a + b ;
    
    }
    public int subtract (int a, int b){
        return a - b ;
    
    }
    public boolean isPrime(int number){
        for (int i -0; i<number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}