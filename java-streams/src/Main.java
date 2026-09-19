public class Main{
    static void main() {
        StackEg stack = new StackEg(5);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        System.out.println(stack.pop());
        stack.push(32);
        System.out.println(stack.pop());
    }
}