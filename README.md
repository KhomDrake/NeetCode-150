# NeetCode-150

Hi, my name is Vinicius and in this repository i'm doing the 150 neetcode: https://neetcode.io/roadmap
I will put in this documentation all the information about every single code.

# Code Challenges

## Array and Hashing

### 1) Constains Duplicate

In this challenge, given an integer array, we have to return true if any value appears at least twice in the array.
Exist many solutions that we can find, like:<br>
1) Brute forcing the array, for every position check if exist the same number in any other position<br> 
2) Sorting the array first and checking if a position have neighbor with the same value.

Probably the best way is: iterate the array one time using something to kept track of every number until you find a number
that already has pass. The method of keeping track of the numbers can be a HashSet.

### 2) Is Anagram

In this challenge, given two strings, string t and string s, you have to return true if t is an anagram of s.<br>
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

For example, given the strings s = "anagram" and t = "nagaram", you can see that the two strings have the same length and
if you count every time a distinct character appear in the word, you find that they have the same character:
aaangrm. <br>
To count this in the code you can use the solution of the previous code, using hash to keep track of every character in the
string and how many times already appeared. 
You do this for the two strings and with the result, you check if the result hash of s is equal to the result hash of t.

This is a good solution, but using this you have to iterate for the two strings. The second solution that is very simple is
to simple sort both the strings and check is they are the same.<br>
Using the previous example, the sorted strings would be like sSorted = aaangrm and tSorted = aaangrm. 
And using simple sSorted == tSorted we check if they are the same and if they are, then t is an anagram of s.

