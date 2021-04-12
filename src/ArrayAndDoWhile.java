import java.util.Arrays;
public class ArrayAndDoWhile
{
//================================================Program:1=============================================================
//Program to check the equality of two arrays

    public static void checkArrayEquality()
    {
        int a[] = {40, 50, 85};//initialising first array
        int b[] = {40, 50, 75};//initialising second array

        boolean result = Arrays.equals(a,b);//Array.equal(a,b) function is to check 2 arrays are equal or not

        if (result == true)//condition to check whether the result is true or false
        {
            System.out.println("Both Arrays are Equal");//print the result
        }
        else
            {
                System.out.println("Both Arrays are not Equal");//print the result
                System.out.println();
            }
    }

//==================================================Project:2===========================================================
//Program to enter array and sort the values in ascending order

public static void ascending_Order()
     {
       int arr[] = {88, 67, 8, -2, 0, 9, 5, 100};//initialising array
       int b= 0;// initialising array

         //Displaying elements of given array
         System.out.println("Elements of original array: ");
         for (int i = 0; i < arr.length; i++)
         {
             System.out.println(arr[i]+"");
         }
         //sort the array in ascending order
         for (int i = 0; i < arr.length ; i++)
         {
             for (int j = i+1; j < arr.length; j++)
             {
                 if (arr[i] > arr[j])
                 {
                     b = arr[i];
                     arr[i] = arr[j];
                     arr[j] = b;
                 }
             }
         }
         System.out.println();

         //Display of array after sorting
         System.out.println("Elements of sorted array in ascending order: ");
         for (int i = 0; i < arr.length ; i++)
         {
             System.out.println(arr[i]+ "");
         }
     }

//===============================================Project:3==============================================================
//Program to enter any string and count the total number of 'a' in that String

    public static void countNumberOf_a()
    {
        //Declaring variables
       String str= "My name is Khevna Patel";
       char ch = 'a';
       int count = 0;
        int i = 0;
        //condition of while loop
        //if following condition will be true then if condition will apply
       while (str.length()>i)

           if (str.charAt(i++)==ch)//if condition to count 'a'
           {
               count++;
           }
           System.out.println("Character " + ch + " appeared " + count + " times in the string");
           System.out.println();
    }

//================================================Program:4=============================================================
//Program to Print multiplication table using do while loop

    public static void multiplication_table()
    {
        //declaration of variables
        int num1 = 3;
        int i=1;
        //do statement will execute at least once
        do
            {
            System.out.println( num1 * i);
             i++;
        }
        //while condition how many times loop will repeat
        while (i<=10);
        System.out.println("");
    }


    //=================================================Project:5========================================================
// Java program to find the common elements between two arrays (string value)

public static void find_Common_Elements_String_Value()
{
    //Initiating array
    String[] array1 = {"Blue", "Pink", "Red", "Purple", "Black"};

    String[] array2 = {"White", "Black", "Silver", "Red", "Golden", "Yellow"};


    System.out.println("Common Elements: ");
    //for loop to find common elements
    for (int i = 0; i < array1.length; i++)
    {
        for (int j = 0; j < array2.length; j++)
        {
            if(array1[i]==(array2[j]))//condition to print the common elements
            {
                System.out.println(array1[i]);
            }
        }
    }
}




public static void main(String[] args)//main method
{
    System.out.println("------------------------Ans:1 Check Equality of two arrays------------------------------------");
    checkArrayEquality();

    System.out.println("------------------------Ans:2 Enter array and sort in ascending order-------------------------");
    ascending_Order();

    System.out.println("------------------------Ans:3 Count occurrence of 'a' in a string---------------------------- ");
    countNumberOf_a();

    System.out.println("------------------------Ans:4 Printing multiplication table-----------------------------------");
    multiplication_table();

    System.out.println("------------------------Ans:5 Find Common elements from string value--------------------------");
    find_Common_Elements_String_Value();
}

}
