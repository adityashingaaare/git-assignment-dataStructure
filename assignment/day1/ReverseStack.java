package assignment.day1;

import java.util.Scanner;

class Stack {

    int tos,maxSize;
    char stack[];

    void createStack(int size){
        stack = new char[size];


        maxSize = size;
        tos = -1;

    }

    void push(char e){
        tos ++;
        stack[tos] = e;
    }

    char pop(){

        char temp = stack[tos];
        tos --;
        return temp;
    }

    boolean isEmpty(){
        if(tos == -1)
            return true;
        else
            return false;
    }
}

 public class ReverseStack{

     void reverseStack(StringBuffer str){

         int n = str.length();
         Stack stack = new Stack();
         stack.createStack(n);


         for (int i = 0;i<n;i++){
             stack.push(str.charAt(i));
         }

         for(int i =0; i< n;i++){
             char ch = stack.pop();
             str.setCharAt(i,ch);
         }
     }

     public static void main(String[] args) {

         StringBuffer strBuffer = new StringBuffer();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string");
         strBuffer.append(sc.nextLine());

         ReverseStack reverseStack = new ReverseStack();

         reverseStack.reverseStack(strBuffer.append(sc.nextLine()));


//         StringBuffer s = new StringBuffer("Aditya");
//
//         ReverseStack reverseStack = new ReverseStack();
//
//         reverseStack.reverseStack(s);
//
         System.out.println("Reversed String is: " +strBuffer.append(sc.nextLine()));
     }
}
