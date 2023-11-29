# FA-LRU-Simulation
To run the file open the FA-LRU-Simulator.jar file or run the java program from your console by typing 'javac Main.java' then 'java Main'
### Authors
- AQUINO, Melanie 
- KHO, John 
- PALAFOX, Luis
- SANTOS, Jose
  
Detailed Analysis of the Test Cases.

a.) Sequential sequence: up to 2n cache block. Repeat the sequence four times. Example: 0,1,2,3,...,2n-1 {4x}

Input:
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63

Output:

Explanation: 

b.) Random sequence: containing 4n blocks.
Input: 
54 12 27 41 5 62 30 18 8 47 55 9 34 59 38 16 42 29 25 49 45 23 6 7 50 56 51 53 28 35 0 11 60 61 33 37 19 44 22 15 46 26 40 31 39 2 21 1 10 17 58 4 48 3 14 36 57 52 32 24 20 43 63

Output:


Explanation: 


c.) Mid-repeat blocks: Start at block 0, repeat the sequence in the middle two times up to n-1 blocks, after
which continue up to 2n. Then, repeat the sequence four times. Example: if n=8, sequence=0, 1,2,3,4,5,6,
1,2,3,4,5,6, 7,8,9,10,11,12,13,14,15 {4x}

Input:
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63

Output:


Explanation: 

