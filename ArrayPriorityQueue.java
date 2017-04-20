/*
Daniel Regassa
APCS2 pd5
HW32 -- Getting Past the Velvet Rope
2016-04-19
*/


import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    
    private ArrayList<Comparable> _data;

    public void add(Comparable item){
	_data.add(item);
    }

    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public Comparable peekMin(){

	if (isEmpty()) return null; 
	
	Comparable value = _data.get(0);
	for (int k = 1; k < _data.size(); k++){
	    if (value.compareTo(_data.get(k)) > 0) { //value greater than current object
		value = _data.get(k);
	    }
	    
	}
	return value;
    }

    public Comparable removeMin(){

	if (isEmpty()) return null; 
	
	Comparable value = _data.get(0);
	int index = 0;
	for (int k = 1; k < _data.size(); k++){
	    if (value.compareTo(_data.get(k)) > 0) { //value greater than object
		value = _data.get(k);
		index = k;
	    }
	    
	}

	_data.remove(index);
	return value;
    }

    
    public ArrayPriorityQueue(){
	_data = new ArrayList<Comparable>();
    }


    public static void main(String[] args){

	ArrayPriorityQueue daniel = new ArrayPriorityQueue();

	System.out.println(daniel.isEmpty());
	
	daniel.add(4);

	System.out.println(daniel.isEmpty());
	
	daniel.add(1);
	daniel.add(4);
	daniel.add(3);
	daniel.add(2);
	daniel.add(2);

	System.out.println(daniel.peekMin());
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());

	System.out.println(daniel.isEmpty());
	
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());

	System.out.println(daniel.isEmpty());

	System.out.println(daniel.removeMin());

	
	
    }
}


