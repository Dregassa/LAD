public class Ticket implements Comparable{

    private int _id;
    private int _VIPLevel;
    private String _problem;
    private Boolean _isSolved;
    private String _name;
    private String _solution;

    //public set

    Ticket(String problem, int VIPLevel, String name){
	_id = 0;
	_VIPLevel = VIPLevel;
	_problem = problem;
	_issolved = false;
	_name = name;
	_solution = "";
    }

    Ticket(){
	_id = 0;
	_VIPLevel = 0;
	_problem = "Problem";
	_issolved = false;
	_name = "Name";
	_solution = "Solution";
    }

    public int compareTo(Ticket other){
	return this.
    }

}
