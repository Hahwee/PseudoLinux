import java.util.*;

//this class is used to manipulate all the data regarding directories
public class File implements fileTest{
	private String name; //name of directory
	private int folderNum;  //for setting directory location in arraylist
	private int count; //actual diretory location
	private boolean flag; //flag to display current directory
	
	//contructor
	public File(){

	}
	
	//second contructor to initialize file name and display setting
	public File(String a, boolean b){
		name = a;
		flag = b;
	}

	public void setNum(int a){
		folderNum = a;
	}

	public void setFlag(boolean a){
		flag = a;
	}

	public int getNum(){
		return folderNum;
	}

	public void setString(String a){
		name = a;
	}

	public String getString(){
		return name;
	}

	public void setCount(int a){
		count = a;
	}

	public int getCount(){
		return count;
	}

	public boolean getFlag(){
		return flag;
	}

	public void print(){
		System.out.print(" ");
	}
}