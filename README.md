# MachineLearningChallenge

Programming language: Java

How the program works:

1-	First of all, the code will parse all the data in the two given files and store them in 2 arraylists.

2-	Then, it will iterate through each word in the technical skills document which is now stored in an arraylist. It will check for the occurrence of that word in the dataset and when it finds it, it will copy the line associated with it into another arraylist called “hardskills”

3-	At the end, the hardskill arraylist will be converted into a csv file.

The method isSubstring takes as input 2 strings and will check if the first string is present in the second and if so it will return the index of the string. Otherwise it returns -1.

The method removeDuplicates will take as input an arraylist and will remove all duplicates in this arraylist by creating a new array list and pasting in all the elements without duplicates. It will return the new arraylist without duplicates.

How to use the program:
To use the program write the path of the dataset to filter in the dataset string variable and the technical skills to be filtered in the “techSkills” string variable. Then, run the code and the output is in the the workspace under the name “HardSkills.csv”. If you don’t want duplicates in the file you can enable line 115.
