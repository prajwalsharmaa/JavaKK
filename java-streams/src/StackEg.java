public class StackEg {
    int total;
    int [] arr;
    int top;
    public StackEg(int total) {
        this.total = total;
        arr = new int [total];
        top = -1;
    }
    public String push(int num){
        if(top> arr.length){
            return "Stack is full";
        }
        else {
            arr[++top] = num;
            return "Pushed Element = " + arr[top];
        }
    }
    public String pop(){
        return "Popped Element = " + arr[top--];
    }


}
