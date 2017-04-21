public interface PriorityQueue<T>{

    //add item to the end of the Queue
    public void add(T item);
    
    //checks to see if the queue is empty, returns true if so
    public boolean isEmpty();
    
    //returns the highest priority item in the Queue
    public T peekMin();
    
    //removes and the returns the highest priority item in the Queue
    public T removeMin();


}
