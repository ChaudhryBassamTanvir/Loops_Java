package Loops;

import java.util.Scanner;

public class loops {

public static int askAgain(Scanner sc){
System.out.println("Please Press 1 to enter Marks and 0 to Exit");
    int input = sc.nextInt();
    return input;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
// Print all even  numbers
 int n= 20;
 for (int i =0; i<=n; i++){
    // System.out.println(i+2);
if (i%2==0) {
    System.out.println(i);
    
}

 }

// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.


String[] subjectar ={"English", "Urdu", "Math"};
int[] marks = new int[subjectar.length];



switch (askAgain(sc)) {
    case 1:

    for (int i = 0; i < subjectar.length; i++) {
        System.out.println("Please enter the marks " + subjectar[i]);

        marks[i] = sc.nextInt();

        if(marks[i]>100){
            System.out.println("You enter number greater then 100 enter marks till 100 for " + subjectar[i]);
            marks[i] = sc.nextInt();
        }
    }


    for (int i = 0; i < subjectar.length; i++) {
         System.out.println(subjectar[i] + " "+ marks[i]);
    }

int percentage;
int sumPercen = 0 ;
for (int i = 0; i < marks.length; i++) {

    sumPercen += marks[i];
    
}
percentage = (sumPercen/marks.length*100)*100;
System.out.println("The percentage of candidate is " + String.format( "2",percentage)  + "%");






        break;
case 2:
 break;
    default:
        break;
}







    }
}
