package Test;

public class Array implements IsStackQueue{
    private int[]array;
    private int Size;
    private int topIndex;
    Array(int size){
        Size=size;
        array=new int[Size];
        topIndex=-1;
    }
    Array() {

    }
    @Override
    public boolean push(int value) {
        if (isFull()){
            topIndex++;
            array[topIndex]=value;
            return true;
        }
        return false;

    }

    @Override
    public int pop() {
        if (isEmpty()){
            int value =array[topIndex];
            topIndex--;
            return value;
        }
        return 0;
    }

    @Override
    public boolean isFull() {
        return topIndex ==Size-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex<0;
    }
}
