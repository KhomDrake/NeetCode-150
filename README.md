# NeetCode-150

Hi, my name is Vinicius and in this repository i'm doing the Neetcode 150: https://neetcode.io/roadmap
I will put in this documentation all the information about every single code.

# Code Challenges

## Array and Hashing

### 1) Constains Duplicate

In this challenge, given an integer array, we have to return true if any value appears at least twice in the array.
Exist many solutions that we can find, like:<br>
1) Brute forcing the array, for every position check if exist the same number in any other position<br> 
2) Sorting the array first and checking if a position have neighbor with the same value.

Probably the best way is: pass the array one time using something to kept track of every number until you find a number
that already has pass. The method of keeping track of the numbers can be a HashSet.

### 2) Is Anagram

