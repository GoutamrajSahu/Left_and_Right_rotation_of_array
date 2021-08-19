
package com.company;

import java.util.*;
class Main {
    public static int[] rotLeft(int[] numbers,int numberOfLeftRotation ){
        int[] resArr = new int[numbers.length];
        int count = 0;
        for(int i= numberOfLeftRotation; i<numbers.length; i++){
            resArr[count] = numbers[i];
            count++;
        }
        for(int i=0; i<numberOfLeftRotation; i++){
            resArr[count] = numbers[i];
            count++;
        }
        return  resArr;
    }

    public static int[] rotRight(int[] numbers,int numberOfRightRotation ){
        int[] resArr = new int[numbers.length];
        int count = 0;
        for(int i= (numbers.length-numberOfRightRotation); i<numbers.length; i++){
            resArr[count] = numbers[i];
            count++;
        }
        for(int i=0; i<numbers.length-numberOfRightRotation; i++){
            resArr[count] = numbers[i];
            count++;
        }
        return  resArr;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int length = Sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] numbers = new int[length];
        for(int i=0; i<length; i++){
            numbers[i] = Sc.nextInt();
        }

        int[] resArr = new int[numbers.length];
        while(true){
            System.out.println("If you want to stop Enter 'no' else Enter rotation direction(r/l):");
            String direction = Sc.next();

            if(direction.equals("l") || direction.equals("L")){
                System.out.println("Enter the rotate number:");
                int numberOfRotation = Sc.nextInt();
                numbers = rotLeft(numbers,numberOfRotation);
            }else if(direction.equals("r") || direction.equals("R")){
                System.out.println("Enter the rotate number:");
                int numberOfRotation = Sc.nextInt();
                numbers = rotRight(numbers,numberOfRotation);
            }else if(direction.equals("no")){
                break;
            }
        }
        System.out.println("Final arrangement is:");
        for(int i=0; i<resArr.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
