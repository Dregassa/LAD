public class Ticket implements Comparable{

    private int _id;
    private int _VIPLevel;
    private String _problem;
    private Boolean _isSolved;
    private String _name;
    private String _solution;

    //-------------------------------
    public int getid(){
	return _id;
    }
    public int getVIPLevel(){
	return _VIPLevel;
    }
    public String getproblem(){
	return _problem;
    }
    public Boolean getisSolved(){
	return _isSolved;
    }
    public String getname(){
	return _name;
    }
    public String getsolution(){
	return _solution;
    }
    //-------------------------------
	
    //-------------------------------
    public void setid(int x){
	_id = x;
    }
    public void setVIPLevel(int x){
	_VIPLevel = x;
    }
    public void setproblem(String x){
	_problem = x;
    }
    public void setisSolved(Boolean x){
	_isSolved = x;
    }
    public void setname(String x){
	_name = x;
    }
    public void setsolution(String x){
	_solution = x;
    }
    //-------------------------------
	
    //overloaded constructor
    Ticket(String problem, int VIPLevel, String name){
	_id = 0;
	_VIPLevel = VIPLevel;
	_problem = problem;
	_isSolved = false;
	_name = name;
	_solution = "";
    }

    //default constructor
    Ticket(){
	_id = 0;
	_VIPLevel = 0;
	_problem = "Problem";
	_isSolved = false;
	_name = "Name";
	_solution = "Solution";
    }

    //overwritten compareTo() method
    public int compareTo(Ticket other){
	if (this.getVIPLevel() > other.getVIPLevel() ) return 1;
	else if (this.getVIPLevel() < other.getVIPLevel() ) return -1;
	else return 0;
    }

}
