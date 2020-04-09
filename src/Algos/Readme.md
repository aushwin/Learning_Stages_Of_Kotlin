# Algos
## The sieve of Eratosthenes
### Sudo code
        Input: an integer n > 1.

        Let A be an array of Boolean values, indexed by integers 2 to n,
        initially all set to true.

        for i = 2, 3, 4, …​, not exceeding √n:
        
          if A[i] is true:

            for j = i2, i2+i, i2+2i, i2+3i, …​, not exceeding n:

              A[j] := false.

        Output: all i such that A[i] is true.



## Segmented Sieve
### Code Description
   Now use prime numbers from SIEVE to eliminate composite numbers within the range n to m. And this is what we call as doing              Segmented Sieve of Eratosthenes. That is, applying traditional Sieve of Eratosthenes by using the prime numbers that we already          have in SIEVE.
   In our case, take the first number from SIEVE i.e 2.
   Divide n by 2 and you get 47 (round off). Now multiply 47 by 2, you get 94. 94 is the first number that is divisible by 2 before        95. So keep setting 0’s in Flag[] for every increment of index by 2. i.e from 94 you eliminate                                          96,98,100,102,104,106,108,110,112,114. Now take the next number 3.
