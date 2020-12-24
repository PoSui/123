package Stack;

public class StackTest {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
//stack.pop();
        for (int i = 1; i <= 6; i++) {
            stack.push(i);
        }
        for (int i = 1; i <= 5; i++) {
            stack.pop();
        }
        for (int i = 1; i <= 12; i++) {
            stack.push(i);
        }
//栈的大小
        System.out.println(stack.getSize());
        stack.show();
    }
}
