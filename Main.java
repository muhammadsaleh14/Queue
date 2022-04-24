package oop;

public class Main {
    public static void main(String[] args) {
        Queue test = new Queue();//creating new object
        System.out.println(test.getSize());
        //adding elements to array
        for(int i = 1;i<=10;i++){
            test.enqueue(i);
        }
        //testing if array is empty
        System.out.println(test.empty());
        //getting size
        System.out.println(test.getSize());
        //dequeue
        for(int i = 1; i<=20; i++){
            System.out.print(test.dequeue()+ " ");
        }
        //test empty
        System.out.println(test.empty());
    }
}

