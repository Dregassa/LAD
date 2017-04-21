public class Ticket implements Comparable{

    private int _id;
    private int _VIPLevel;
    private String _problem;
    private Boolean _isSolved;
    private String _name;
    private String _solution;

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

    public void setid(int x){
	_id = x;
    }
    public void setVIPLevel(){
	_VIPLevel = x;
    }
    public void setproblem(x){
	_problem = x;
    }
    public void setisSolved(x){
	_isSolved = x;
    }
    public void setname(x){
	_name = x;
    }
    public void setsolution(x){
	_solution = x;
    }

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
	if(
    }

}
