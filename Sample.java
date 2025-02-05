// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
       this.in=new Stack<Integer>();
    this.out=new Stack<Integer>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(!out.isEmpty()) return out.pop();
        else {
            while(!in.isEmpty()){
                out.push(in.pop());
            }return out.pop();
            }
    }
    
    public int peek() {
        if((out.isEmpty())==false) return out.peek();
        else{
            while((in.isEmpty())==false){
                out.push(in.pop());
            }return out.peek();
            }
    }
    
    public boolean empty() {
        return in.isEmpty()&&out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */