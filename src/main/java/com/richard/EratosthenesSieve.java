package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public class EratosthenesSieve implements PrimesAlgorithm {
    @Override
    public long[] getPrimes(int n) {

        long[] primes = new long[n];
        //primes[0] = 2;

        boolean[] primesBool = new boolean[n +1];
        for(boolean primebool : primesBool){
            primebool = true;
        }
        primesBool[0] = false;
        primesBool[1] = false;
        int primesIndex = 0;
        for (int i = (int)primes[primesIndex]; i < n; i++ ){
           if(primesBool[i]){
               for(int j =(int)primes[i]; i*j <= n; j++ ){
                   primesBool[i*j]=false;
               }
           }
            primes[primesIndex + 1] = i;
        }

        return primes;
    }

}
