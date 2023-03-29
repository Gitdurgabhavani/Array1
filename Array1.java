1.What do you mean by an Array?
Ans.An array is a collection of similar data elements stored at contiguous memory locations.

2.How to creat an array?
Ans.To create an array first we have to declare a variable with an array type and the create the array itself. 

3.Can we change the size of an array at the run time?
Ans.No, we cannot change the size of an array at the run time.

4.Can we declare an array without assigning the size of an array?
Ans. Yes. We can declare an array without size but before using it needs to be initialized.

5.What is the default value of an array?
Ans. java will assign the default value 0 to each element of the array in the case of an int array.
 Similarly, in the case of a boolean array, it will be false,
 in the case of a String array the default value is null in java. 

6.What is a 1D array with an example?
Ans.A One-Dimensional Array is a group of elements having the same data type which are stored in a linear arrangement under a single variable name.
    Ex:int[] a;
        a=new int[5];

7.Write a program on a 2D array. 
Ans.class Twodimensional
     {
       public static void main(String args[]) {
            int[][] a={{10,20},{30,40}};
            System. out. println("Two dimensional array elements are");
            System. out. println(a[0][0]); 
            System. out. println(a[1][0]);
      }
}


