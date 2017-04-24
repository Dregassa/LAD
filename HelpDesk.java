import cs1.Keyboard.*; // user input

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> _queue;
    private int _nextID;

    HelpDesk(){
	_queue = new ArrayPriorityQueue<Ticket>();
	_nextID = 0;
    }
    //-------------------------------
    public void add(Ticket foo){
	foo.setid(_nextID);
	nextID++;
	_queue.add(foo);
    }

    public Ticket peekMin(){
	return _queue.peekMin()
    }

    public boolean isEmpty(){
	return _queue.isEmpty();
    }

    public Ticket removeMin(){
	return _queue.removeMin();
    }
    //----------------------------------

    public void solveTicket(Ticket foo, String solution){
	foo.setisSolved(True);
	foo.setsolution(solution);
    }
    
    public Ticket inputTicket(){// for command line input
	System.out.println("Enter your problem");
	String problem = readString();
	System.out.println("Enter your VIP Level");
	String vip = readString();
	return; // not complete
	
    }

    
    /*
      0. method for getting usr input -- 90%
      1. push ticket to priority queue -- 100%
      2. write function that will solve ticket when given solution -- 100%
      3. pop ticket off of queue -- 100%
     */
    public static void main(String[] args){

	

    }

}
