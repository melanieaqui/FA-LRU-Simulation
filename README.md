# FA-LRU-Simulation

### Authors
- AQUINO, Melanie 
- KHO, John 
- PALAFOX, Luis
- SANTOS, Jose

To run the fapp open the FA-LRU-Simulator.jar file. Alternatively you may run the java source codes from your console by typing 'javac Main.java' then 'java Main'. 

### Project specifications
The group was tasked to develop a simulation of full associative mapping using the Least Recently Used replacement algorithm (FA-LRU). The simulation consists of 32 blocks, with the number of memory blocks determined by the user. 

  
### Detailed Analysis of the Test Cases.

Detailed Analysis of the Test Cases.

a.) Sequential sequence: up to 2n cache block. Repeat the sequence four times. Example: 0,1,2,3,...,2n-1 {4x}

This sequence involves accessing cache blocks in a sequential order from 0 to 2n - 1.
Since n = 32, 2n - 1 equals 63.
This sequence is repeated four times.

Input:

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63


Output:


Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 64

Cache Hit Count: 0

Cache Miss Count: 64

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 768.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 64

Cache Hit Count: 0

Cache Miss Count: 64

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 768.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 128

Cache Hit Count: 0

Cache Miss Count: 128

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 1536.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 128

Cache Hit Count: 0

Cache Miss Count: 128

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 1536.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 192

Cache Hit Count: 0

Cache Miss Count: 192

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 2304.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 192

Cache Hit Count: 0

Cache Miss Count: 192

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 2304.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 256

Cache Hit Count: 0

Cache Miss Count: 256

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 3072.0

  

----------------------------------------

Block: 0 |Age: 31 |Data: 32

Block: 1 |Age: 30 |Data: 33

Block: 2 |Age: 29 |Data: 34

Block: 3 |Age: 28 |Data: 35

Block: 4 |Age: 27 |Data: 36

Block: 5 |Age: 26 |Data: 37

Block: 6 |Age: 25 |Data: 38

Block: 7 |Age: 24 |Data: 39

Block: 8 |Age: 23 |Data: 40

Block: 9 |Age: 22 |Data: 41

Block: 10 |Age: 21 |Data: 42

Block: 11 |Age: 20 |Data: 43

Block: 12 |Age: 19 |Data: 44

Block: 13 |Age: 18 |Data: 45

Block: 14 |Age: 17 |Data: 46

Block: 15 |Age: 16 |Data: 47

Block: 16 |Age: 15 |Data: 48

Block: 17 |Age: 14 |Data: 49

Block: 18 |Age: 13 |Data: 50

Block: 19 |Age: 12 |Data: 51

Block: 20 |Age: 11 |Data: 52

Block: 21 |Age: 10 |Data: 53

Block: 22 |Age: 9 |Data: 54

Block: 23 |Age: 8 |Data: 55

Block: 24 |Age: 7 |Data: 56

Block: 25 |Age: 6 |Data: 57

Block: 26 |Age: 5 |Data: 58

Block: 27 |Age: 4 |Data: 59

Block: 28 |Age: 3 |Data: 60

Block: 29 |Age: 2 |Data: 61

Block: 30 |Age: 1 |Data: 62

Block: 31 |Age: 0 |Data: 63

  

Memory Access Count: 256

Cache Hit Count: 0

Cache Miss Count: 256

Cache Hit Rate: 0.0

Cache Miss Rate: 1.0

Average Memory Access Time:12.0

Total Memory Access Time: 3072.0

  

----------------------------------------

Explanation: 


Cache Behavior:
The cache can store only 32 blocks at a time.
As the sequence accesses 64 unique blocks sequentially, each block will be a miss when first accessed.
Once the cache is full (after the first 32 accesses), each new block will replace the oldest block in the cache (LRU policy).

Analysis:
Cache Hits and Misses:

There are no cache hits since each block number is only accessed once.
Every access results in a cache miss.

Memory Access Time:
The average memory access time includes the miss penalty.
The total memory access time is a multiplication of the number of memory accesses and the average access time.
Aging of Blocks:

As new blocks are added, the existing blocks age (increase in age value).
The age helps determine which block is the oldest for replacement under the LRU policy.

This output indicates the expected behavior of a cache under the given test conditions. The lack of cache hits is due to the nature of the sequential access pattern and the single access of each block, which does not leverage the benefit of a cache designed to improve performance for repeated accesses of the same data.

b.) Random sequence: containing 4n blocks.

Input: 

54 12 27 41 5 62 30 18 8 47 55 9 34 59 38 16 42 29 25 49 45 23 6 7 50 56 51 53 28 35 0 11 60 61 33 37 19 44 22 15 46 26 40 31 39 2 21 1 10 17 58 4 48 3 14 36 57 52 32 24 20 43 63

Output:

Block: 0 |Age: 29 |Data: 61
Block: 1 |Age: 28 |Data: 33
Block: 2 |Age: 27 |Data: 37
Block: 3 |Age: 26 |Data: 19
Block: 4 |Age: 25 |Data: 44
Block: 5 |Age: 24 |Data: 22
Block: 6 |Age: 23 |Data: 15
Block: 7 |Age: 22 |Data: 46
Block: 8 |Age: 21 |Data: 26
Block: 9 |Age: 20 |Data: 40
Block: 10 |Age: 19 |Data: 31
Block: 11 |Age: 18 |Data: 39
Block: 12 |Age: 17 |Data: 2
Block: 13 |Age: 16 |Data: 21
Block: 14 |Age: 0 |Data: 1
Block: 15 |Age: 31 |Data: 11
Block: 16 |Age: 15 |Data: 10
Block: 17 |Age: 14 |Data: 17
Block: 18 |Age: 13 |Data: 58
Block: 19 |Age: 12 |Data: 4
Block: 20 |Age: 11 |Data: 48
Block: 21 |Age: 10 |Data: 3
Block: 22 |Age: 9 |Data: 14
Block: 23 |Age: 8 |Data: 36
Block: 24 |Age: 7 |Data: 57
Block: 25 |Age: 6 |Data: 52
Block: 26 |Age: 5 |Data: 32
Block: 27 |Age: 4 |Data: 24
Block: 28 |Age: 3 |Data: 20
Block: 29 |Age: 2 |Data: 43
Block: 30 |Age: 1 |Data: 63
Block: 31 |Age: 30 |Data: 60

Memory Access Count: 128
Cache Hit Count: 2
Cache Miss Count: 126
Cache Hit Rate: 0.015625
Cache Miss Rate: 0.984375
Average Memory Access Time:11.828125
Total Memory Access Time: 1514.0

----------------------------------------
Block: 0 |Age: 29 |Data: 61
Block: 1 |Age: 28 |Data: 33
Block: 2 |Age: 27 |Data: 37
Block: 3 |Age: 26 |Data: 19
Block: 4 |Age: 25 |Data: 44
Block: 5 |Age: 24 |Data: 22
Block: 6 |Age: 23 |Data: 15
Block: 7 |Age: 22 |Data: 46
Block: 8 |Age: 21 |Data: 26
Block: 9 |Age: 20 |Data: 40
Block: 10 |Age: 19 |Data: 31
Block: 11 |Age: 18 |Data: 39
Block: 12 |Age: 17 |Data: 2
Block: 13 |Age: 16 |Data: 21
Block: 14 |Age: 0 |Data: 1
Block: 15 |Age: 31 |Data: 11
Block: 16 |Age: 15 |Data: 10
Block: 17 |Age: 14 |Data: 17
Block: 18 |Age: 13 |Data: 58
Block: 19 |Age: 12 |Data: 4
Block: 20 |Age: 11 |Data: 48
Block: 21 |Age: 10 |Data: 3
Block: 22 |Age: 9 |Data: 14
Block: 23 |Age: 8 |Data: 36
Block: 24 |Age: 7 |Data: 57
Block: 25 |Age: 6 |Data: 52
Block: 26 |Age: 5 |Data: 32
Block: 27 |Age: 4 |Data: 24
Block: 28 |Age: 3 |Data: 20
Block: 29 |Age: 2 |Data: 43
Block: 30 |Age: 1 |Data: 63
Block: 31 |Age: 30 |Data: 60

Memory Access Count: 128
Cache Hit Count: 2
Cache Miss Count: 126
Cache Hit Rate: 0.015625
Cache Miss Rate: 0.984375
Average Memory Access Time:11.828125
Total Memory Access Time: 1514.0

----------------------------------------

Explanation: 


Cache Behavior:

The test case involves a random sequence of data accesses.
The cache has 32 blocks (n = 32), and the test involves 4n (128) random accesses.
FA + LRU Load-Through Read Policy is applied.

Output:

Blocks Status: Shows the content of each block with their ages after processing the sequence.
Memory Access Count: 128 (4n, as there are 128 accesses).
Cache Hit Count: 2 (only two accesses were hits).
Cache Miss Count: 126 (all other accesses were misses).
Cache Hit Rate: 0.015625 (2/128).
Cache Miss Rate: 0.984375 (126/128).
Average Memory Access Time: 11.828125 (calculated based on hit rate, miss rate, and miss penalty).
Total Memory Access Time: 1514.0 (128 * 11.828125).

Analysis:

Random Nature: Unlike sequential access, a random sequence does not guarantee any pattern. Hence, the cache cannot effectively predict and retain frequently used data.

Cache Hits: The low number of cache hits (2 in 128) indicates that the sequence didn't often revisit the same data blocks within a short period, making the cache less effective.

Cache Misses: High number of misses suggests most data accesses were unique within the tested sequence, leading to frequent cache replacements.

Hit and Miss Rates: Reflect the inefficiency of the cache in this random access pattern.

Memory Access Time: Higher than ideal due to the high number of misses.

Total Memory Access Time: Sums up the total time taken for all accesses. The high value indicates inefficiency in handling random data sequences.

LRU Limitation: Demonstrates the limitation of LRU (Least Recently Used) policy in handling random data accesses.


c.) Mid-repeat blocks: Start at block 0, repeat the sequence in the middle two times up to n-1 blocks, after
which continue up to 2n. Then, repeat the sequence four times. Example: if n=8, sequence=0, 1,2,3,4,5,6,
1,2,3,4,5,6, 7,8,9,10,11,12,13,14,15 {4x}


Input:

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63

Output:

Block: 0 |Age: 31 |Data: 32
Block: 1 |Age: 30 |Data: 33
Block: 2 |Age: 29 |Data: 34
Block: 3 |Age: 28 |Data: 35
Block: 4 |Age: 27 |Data: 36
Block: 5 |Age: 26 |Data: 37
Block: 6 |Age: 25 |Data: 38
Block: 7 |Age: 24 |Data: 39
Block: 8 |Age: 23 |Data: 40
Block: 9 |Age: 22 |Data: 41
Block: 10 |Age: 21 |Data: 42
Block: 11 |Age: 20 |Data: 43
Block: 12 |Age: 19 |Data: 44
Block: 13 |Age: 18 |Data: 45
Block: 14 |Age: 17 |Data: 46
Block: 15 |Age: 16 |Data: 47
Block: 16 |Age: 15 |Data: 48
Block: 17 |Age: 14 |Data: 49
Block: 18 |Age: 13 |Data: 50
Block: 19 |Age: 12 |Data: 51
Block: 20 |Age: 11 |Data: 52
Block: 21 |Age: 10 |Data: 53
Block: 22 |Age: 9 |Data: 54
Block: 23 |Age: 8 |Data: 55
Block: 24 |Age: 7 |Data: 56
Block: 25 |Age: 6 |Data: 57
Block: 26 |Age: 5 |Data: 58
Block: 27 |Age: 4 |Data: 59
Block: 28 |Age: 3 |Data: 60
Block: 29 |Age: 2 |Data: 61
Block: 30 |Age: 1 |Data: 62
Block: 31 |Age: 0 |Data: 63

Memory Access Count: 126
Cache Hit Count: 62
Cache Miss Count: 64
Cache Hit Rate: 0.4920635
Cache Miss Rate: 0.50793654
Average Memory Access Time:6.587302
Total Memory Access Time: 830.00006

----------------------------------------
Block: 0 |Age: 31 |Data: 32
Block: 1 |Age: 30 |Data: 33
Block: 2 |Age: 29 |Data: 34
Block: 3 |Age: 28 |Data: 35
Block: 4 |Age: 27 |Data: 36
Block: 5 |Age: 26 |Data: 37
Block: 6 |Age: 25 |Data: 38
Block: 7 |Age: 24 |Data: 39
Block: 8 |Age: 23 |Data: 40
Block: 9 |Age: 22 |Data: 41
Block: 10 |Age: 21 |Data: 42
Block: 11 |Age: 20 |Data: 43
Block: 12 |Age: 19 |Data: 44
Block: 13 |Age: 18 |Data: 45
Block: 14 |Age: 17 |Data: 46
Block: 15 |Age: 16 |Data: 47
Block: 16 |Age: 15 |Data: 48
Block: 17 |Age: 14 |Data: 49
Block: 18 |Age: 13 |Data: 50
Block: 19 |Age: 12 |Data: 51
Block: 20 |Age: 11 |Data: 52
Block: 21 |Age: 10 |Data: 53
Block: 22 |Age: 9 |Data: 54
Block: 23 |Age: 8 |Data: 55
Block: 24 |Age: 7 |Data: 56
Block: 25 |Age: 6 |Data: 57
Block: 26 |Age: 5 |Data: 58
Block: 27 |Age: 4 |Data: 59
Block: 28 |Age: 3 |Data: 60
Block: 29 |Age: 2 |Data: 61
Block: 30 |Age: 1 |Data: 62
Block: 31 |Age: 0 |Data: 63

Memory Access Count: 126
Cache Hit Count: 62
Cache Miss Count: 64
Cache Hit Rate: 0.4920635
Cache Miss Rate: 0.50793654
Average Memory Access Time:6.587302
Total Memory Access Time: 830.00006

----------------------------------------

Explanation: 


Context:

This test case involves a sequence that starts at block 0, repeats a part of the sequence in the middle, and then continues up to 2n blocks.
The cache has 32 blocks (n = 32).
The sequence repeats four times.
FA + LRU Load-Through Read Policy is applied.

Output:

Blocks Status: Displays the current data in each cache block along with their ages.

Memory Access Count: 126 (each block is accessed once, and the middle sequence repeats twice).

Cache Hit Count: 62 (hits occur during the mid-sequence repetition).

Cache Miss Count: 64 (initial accesses and accesses after the mid-sequence repetition).

Cache Hit Rate: 0.4920635 (62 hits out of 126 accesses).

Cache Miss Rate: 0.50793654 (64 misses out of 126 accesses).

Average Memory Access Time: 6.587302 (calculated based on hit and miss rates, and miss penalty).

Total Memory Access Time: 830.00006 (126 * 6.587302).

Analysis:

Mid-Sequence Repetition: The test case is designed to test the effectiveness of the cache in handling partial sequence repetitions.

Cache Hits: Occur during the repeated mid-sequence, suggesting the cache successfully retains frequently accessed data for some time.

Cache Misses: High at the beginning and after the mid-sequence repetition, indicating new data accesses replace older ones.

Hit and Miss Rates: More balanced compared to the random sequence, showing better cache performance due to repetition.



