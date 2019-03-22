/**
 * @ClassName Array
 * @Description
 * @Author zhangzx
 * @Date 2019/3/22 11:08
 * Version 1.0
 **/
public class Array {

    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }



}
