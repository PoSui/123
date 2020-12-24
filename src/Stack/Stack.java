package Stack;

import java.util.Arrays;

public class Stack {
    int size=13;//总长度
    int length=0;//当前已用长度
    int[] stack=new int[size];
    public boolean isFull(){
        return size-1==length;
    }
//    private void dilatancy() {
//        if (isFull()) {
//            // 扩容一倍
//            stack = Arrays.copyOf(stack, length << 1);
//            length = length << 1;
//        }
//    }

    public void push(int i){
//        if(isFull()){
//            dilatancy();
//        }
        stack[length]=i;
        length++;
    }
    public void pop(){
        if(length>=0) {
            System.out.println(stack[length]);//return stack[length];
            length--;
        }else {
            System.out.println("空栈");
        }

    }
    public int getSize(){
        return size;
    }
    public void show(){
        System.out.println(Arrays.toString(stack));
    }

}
