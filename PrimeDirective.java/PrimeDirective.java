import java.util.ArrayList;

public class PrimeDirective {

    public boolean isPrime(int number) {
        int divisores = 0 ;
        for ( int i =1; i<= number; i++){
            if(number % i == 0){
                divisores++;
            }
        }
        if (divisores==2){
            return true;
        } else{
            return false;
        }
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList();
        for (int number : numbers) {
            if (isPrime (number)) {
            primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        PrimeDirective prime = new PrimeDirective();
        int[] numbers = {1, 3, 8, 5, 7, 6};
        boolean result = prime.isPrime(5);
        ArrayList<Integer> primeNumbers = prime.onlyPrimes(numbers);
        System.out.println(primeNumbers);
    }
}