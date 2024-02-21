import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Q1

//           try{
//
//               System.out.println("enter first number");
//               int fNum = s.nextInt();
//
//               System.out.println("enter second number");
//               int sNum = s.nextInt();
//
//               int sum = fNum+sNum;
//               int mult = fNum*sNum;
//               int sub = fNum - sNum;
//               int div = fNum/sNum;
//               int mod = fNum%sNum;
//
//               System.out.println(fNum + " + " + sNum + " = " + sum);
//               System.out.println(fNum + " - " + sNum + " = " + sub);
//               System.out.println(fNum + " * " + sNum + " = " + mult);
//               System.out.println(fNum + " / " + sNum + " = " + div);
//               System.out.println(fNum + " mod " + sNum + " = " +mod);
//
//
//           }catch(InputMismatchException e){
//               System.out.println("input mismatch");
//           }catch(ArithmeticException e){
//               System.out.println(e.getMessage());
//           }catch(Exception e){
//               System.out.println(e.getMessage());
//           }


//Q2
//--------------------------------------------------------------------------

//        int num = 0;
//
//        try{
//            System.out.println("enter a number");
//            num = s.nextInt();
//
//            for (int i = 1; i<=10 ; i++) {
//
//                int temp = num * i;
//                System.out.println(num + " x " + i + " = " + temp);
//
//            }
//        }catch(InputMismatchException e){
//            System.out.println("user didn't enter a number // input mismatch");
//
//        }


        //Q3 fixed data doesn't need handling
        //------------------------------------------------------------------------

//        double radius = 7.5;
//
//        double pi = 3.14159265358979;
//
//        double perimeter = (2*pi)*radius;
//        double area = pi*(radius*radius);
//        System.out.println(perimeter);
//        System.out.println(area);

           //Q4
//        //---------------------------------------------------------------

//        try{
//
//            System.out.println("Enter the count of numbers:");
//            int num = s.nextInt();
//            int[] numbers = new int[num];
//            for(int i = 0; i<=num-1; i++ ){
//                System.out.println("Enter an integer:");
//                int temp = s.nextInt();
//                numbers[i] = temp;
//
//            }
//            double avg = 0;
//            double sum = 0;
//            for(int number : numbers) {
//
//                sum = sum + number;
//                avg = sum / numbers.length;
//            }
//            System.out.println("the average is: " + avg);
//
//
//        }catch(InputMismatchException e){
//            System.out.println("user didn't enter a number");
//        }catch(NegativeArraySizeException e){
//            System.out.println(e.getMessage() + " entered a negative array size");
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        //Q5
        //-----------------------------------------------------------------------


//        try{
//            System.out.println("enter the first number");
//            int num1 = s.nextInt();
//
//            System.out.println("enter the second number");
//            int num2 = s.nextInt();
//
//            System.out.println("enter the second number");
//            int num3 = s.nextInt();
//
//
//            int sum = num1+num2;
//            isEqual(sum, num3);
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        //Q6 user input is StringBuilder doesn't need handling
        //--------------------------------------------------------------

//        System.out.println("enter a word");
//        StringBuilder word = new StringBuilder(s.nextLine());
//
//        StringBuilder reversedWord = new StringBuilder();
//
//        for (int i = word.length()-1; i >=0; i--) {
//
//            char tempChar = word.charAt(i);
//            reversedWord.append(tempChar);
//        }
//        System.out.println(reversedWord);

        //Q7 //used throw
        //------------------------------------------------------------------

//        try{
//            System.out.println("enter a number:");
//            int num = s.nextInt();
//            isEven(num);
//
//            System.out.println("the number is odd");
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }




        //Q8
        //-------------------------------------------------------------------

//        try{
//            System.out.println("enter temperature in Centigrade");
//            int c = s.nextInt();
//
//            double f = (c*1.8)+32;
//            System.out.println("Temperature in Fahrenheit is: " + f);
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }




        //Q9
        //------------------------------------------------------------------

//        try{
//            System.out.println("enter a String");
//            String sentence = s.nextLine();
//
//            System.out.println("enter a number");
//            int num = s.nextInt();
//
//            char test = sentence.charAt(num);
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }catch(StringIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }


        //Q10 fixed value doesn't need handling
        //-------------------------------------------------------------------



//        double width = 5.5;
//        double height = 8.5;
//        double area = height*width;
//        double perimeter = 2*(height+width+0.1);
//
//        System.out.println("area is " + (width+0.1) + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2 * (" + (width+0.1) + " + " + height + ")= " + perimeter);


        //Q11
        //------------------------------------------------------------------

//        try{
//            System.out.println("enter first number");
//            int fNum = s.nextInt();
//
//            System.out.println("enter second number");
//            int sNum = s.nextInt();
//
//            boolean isEqual = fNum==sNum;
//            boolean isGreater = fNum>sNum;
//            boolean isLesser = fNum<sNum;
//
//
//            if(isEqual){
//                System.out.println(fNum + " == " + sNum);
//            }else if(isLesser){
//                System.out.println(fNum+ " < " + sNum);
//            }else if(isGreater){
//                System.out.println(fNum+ " > " + sNum);
//            }else if (isGreater || isEqual) {
//                System.out.println(fNum+ " >= " + sNum);
//            }else if(isLesser || isEqual){
//                System.out.println(fNum + " <= " + sNum);
//            }else System.out.println(fNum + " != " +sNum);
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }




        //Q12
        //---------------------------------------------------------------------------
//
//        try{
//
//            System.out.println("input seconds");
//            int sec = s.nextInt();
//            double hours = sec * (1.0/3600.0);
//            int temp = (int) hours;
//            double minute = (hours-temp)*60;
//            temp = (int)minute;
//            double seconds = (minute - temp) * 60;
//            System.out.println((int)hours + ":" + (int)minute + ":" + (int)seconds);
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }



        //Q13 //*
        //---------------------------------------------------------------------------

//        try{
//            System.out.println("enter first number");
//            int num1 = s.nextInt();
//            System.out.println("enter second number");
//            int num2 = s.nextInt();
//            System.out.println("enter third number");
//            int num3 = s.nextInt();
//            System.out.println("enter fourth number");
//            int num4 = s.nextInt();
//            boolean group1 = num1==num2;
//            boolean group2 = num2==num3;
//            boolean group3 = num4==num1;
//
//            if(group1==group2 && group1==group3){
//                System.out.println("numbers are equal!");
//            }else System.out.println("numbers are not equal!");
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }




        //Q14 //*
        //-------------------------------------------------------------------

//        try{
//            System.out.println("enter a number");
//            int num = s.nextInt();
//            isPositive(num);
//            isNegative(num);
//            System.out.println("number is zero");
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }



        //Q15
        //-----------------------------------------------------------------------

//        try{
//            int nSum=0;
//            int pSum=0;
//            int zSum=0;
//            do{
//                System.out.println("enter a number: ");
//                int num = s.nextInt();
//
//
//
//                if(num<0){
//                    nSum = nSum+1;
//                }else if(num>0){
//                    pSum = pSum+1;
//
//                }else zSum = zSum +1;
//
//                if(num == -1)
//                    break;
//
//            }while(true);
//
//            System.out.println(pSum + " positives");
//            System.out.println(zSum + " zero");
//            System.out.println(nSum + " negatives");
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }




        //Q16
        //------------------------------------------------------------------

//        try{
//            System.out.println("enter a number");
//            int num = s.nextInt();
//
//            StringBuilder temp = new StringBuilder(String.valueOf(num));
//            StringBuilder rev = new StringBuilder();
//            for (int i = temp.length()-1; i >=0 ; i--) {
//
//                char tempCh = temp.charAt(i);
//                rev.append(tempCh);
//
//            }
//            int revNum = Integer.parseInt(String.valueOf(rev));
//            System.out.println(revNum);
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }




        //Q17
        //-----------------------------------------------------------------------------


//        try{
//            int largeNum=0;
//            int smallNum=0;
//            do{
//                System.out.println("enter the number, enter 0 to exit");
//                int num = s.nextInt();
//
//                if (num == 0)
//                    break;
//
//                if(num>largeNum || largeNum==0)
//                    largeNum=num;
//
//                if(num<smallNum || smallNum==0)
//                    smallNum=num;
//
//
//            }while(true);
//
//            System.out.println("the large number: " + largeNum);
//            System.out.println("the small number: "+ smallNum);
//
//        }catch(InputMismatchException e){
//            System.out.println("input mismatch");
//        }





        //Q18 user input is StringBuilder doesn't need handling
        //-------------------------------------------------------------------------

//        try{
//            System.out.println("enter a string");
//            StringBuilder str = new StringBuilder(s.nextLine());
//
//            numbersOfA(str);
//
//
//
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }




    }

    public static void isEqual(int num1, int num2) throws Exception{

        if(num1!=num2){
            throw new Exception("doesn't match");
        }else throw new Exception("the result is : " + true);

    }

    public static void isEven(int num) throws Exception{

        if((num%2)==0)
            throw new Exception("number is even");
    }

    public static void isNegative(int num)throws Exception{
        if(num<0)
            throw new Exception("number is negative");
    }
    public static void isPositive(int num)throws Exception{
        if(num>0)
            throw new Exception("number is Positive");
    }

    public static void numbersOfA(StringBuilder str) throws Exception{

        int sum = 0;
        for(int i=0; i<str.length();i++){

            char temp = str.charAt(i);

            boolean isEqual = temp == 'a' || temp == 'A';
            if(isEqual){
                sum = sum+1;
            }
        }
        if(sum>0) {
            throw new Exception("number of a's is: " + sum);
        }else throw new Exception("there is no a's in the given String");
    }
}