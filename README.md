# LinkedListandSorting
Linked Lists and Sorting

The goal of this assignment is to write a Java program that arranges a list of words into separate lists of anagrams. The input is a text file that contains a list of words, each word on its own line.  The number of words in the input is arbitrary and could be very large.

The program should print to an output file the lists of anagrams in the following way:

•	All the words that are anagrams of each other are displayed together on a single line; any word without any corresponding anagrams is displayed alone on a line.
•	The words on each line should be in alphabetic order.
•	Lines of words are sorted into ascending alphabetic order according to the first word of a line.
•	Words in a line should be separated by a single space.

For example, this input:

car
dog
bed
stop
god
pots
arc
tops

should yield the output:

arc car
bed
dog god
pots stop tops

You must use linked lists to deal with the arbitrary number of anagrams in a line, and use an array of references to keep track of all the linked lists. For example:


![image](https://user-images.githubusercontent.com/100167361/155615163-0f70cd2b-bc4b-41dd-b6dd-6d86f6b4d642.png)



An acceptable alternative to using an array is to use a vector, provided you program your own vector class (i.e. you cannot use a class such as Vector or ArrayList from the Java libraries for this).

Adapt the insertion sort given in class so that it works on the items in the linked lists, and adapt the quick sort so that it sorts the array of references. Be sure to cite the sources of any code you use or adapt. You must write your own implementation of linked lists and sorting algorithms rather than using calls to a Java library.

Your program should read and store all the words in the file to your data structure first, and then sort as a second step, applying the insertion sort to each row of words, and then the quick sort to the array, using the first word in the list as the sort key. An acceptable alternative to the insertion sort is to insert each word in its row in ascending order as you read it from file. Your program must also print out to the screen the time in seconds it takes to process an input file.

One way to determine if two words are anagrams is to sort the letters in both words. If the sorted words are the same, then the original two words are anagrams of each other. For example, “dog” and “god” are both sorted into “dgo”, so they are anagrams.

Write a program in Java to implement the above requirements. Your program will be invoked from the command line as follows:

	java Assign2 inputfile outputfile

where Assign2 is the name of the file containing executable bytecode for your program, inputfile is the name of the input file, and outputfile is the name of the output file.


