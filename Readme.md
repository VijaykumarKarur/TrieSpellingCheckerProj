<h4>Spelling Checker</h5>
<hr/>

<b>Problem Description</b>

Given an array of words A (dictionary) and another array B (which contain some words).

You have to return the binary array (of length |B|) as the answer where 1 denotes that the word is present in the dictionary and 0 denotes it is not present.

Formally, for each word in B, you need to return 1 if it is present in Dictionary and 0 if it is not.

Such problems can be seen in real life when we work on any online editor (like Google Documnet), if the word is not valid it is underlined by a red line.

NOTE: Try to do this in O(n) time complexity.

<hr/>

<b>Problem Constraints</b>

1 <= |A| <= 1000

1 <= sum of all strings in A <= 50000

1 <= |B| <= 1000

<hr/>

<b>Input Format</b>

First argument is array of strings A.

First argument is array of strings B.

<hr/>

<b>Output Format</b>

Return the binary array of integers according to the given format.

<hr/>

<b>Example Input</b>

Input 1:

A = [ "hat", "cat", "rat" ]
B = [ "cat", "ball" ]
Input 2:

A = [ "tape", "bcci" ]
B = [ "table", "cci" ]

<hr/>

<b>Example Output</b>

Output 1:

[1, 0]
Output 2:

[0, 0]
<hr/>

<b>Example Explanation</b>

Explanation 1:

Only "cat" is present in the dictionary.
Explanation 2:

None of the words are present in the dictionary.