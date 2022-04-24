package oop;

public class Queue {
    private int[] elements;//creating array
    private int indexNo = -1;//index number or number of inserts - 1
    private int size = 8;//initial array size is 8
    //creating a new array of size 8
    public Queue() {
        elements = new int[size];
    }
    //all happens here
    public void enqueue(int v) {
        indexNo++;
        //when there are nine inserts the array size is doubled before inserting the ninth value
        if (size == indexNo) {
            size = size * 2;
            int[] temp = elements;
            this.elements = new int[size];
            System.arraycopy(temp, 0, elements, 0, indexNo);
            temp = null;
        }
        elements[indexNo] = v;//assigning value to array
    }
    public int dequeue () {
        int FirstElement = elements[0];//return first element from the array
        //moving back elements by one
        if (indexNo>= 0) System.arraycopy(elements, 1, elements, 0, indexNo);
        //value of indexNo doesn't go below -1
        if(indexNo-1 >= -1) {
            indexNo--;
            return FirstElement;
        }
        else return -1;
    }
    public boolean empty () {
        return indexNo == -1;
    }
    public int getSize() {
        return indexNo+1;//returns number of elements in array
    }
}
