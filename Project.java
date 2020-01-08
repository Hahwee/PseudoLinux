/*
Team Name: temp_Name.java
Members: Huy Le, Sola Takahashi, Julie Han
Class: CSE 11
*/

//import java packages
import java.util.*;
import java.io.*;

public class Project{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		ArrayList<File> list = new ArrayList<File>();
		String msg = new String();
		boolean flag = true;
		File myfile = new File("", false);
		File myfile2 = new File("", false);
		myfile.setNum(1);
		list.add(myfile);




		while(flag == true){
			System.out.print("root@Fake_Linux:/home");
			for (int i = 0; i < list.size(); i++){
				File temp = list.get(i);
				if(temp.getFlag() == true) {
					System.out.print("/" + temp.getString());
				}
			}
			System.out.print("# ");
			
			try{
				msg = input.next();
			}catch(InputMismatchException e){
				System.out.print("\n");
			}



			if (msg.equals("exit")){
				flag = false;
			}
			else if(msg.equals("mkdir")){
				msg = input.next();
				File temp = new File(msg, false);
				temp.setCount(count);
				list.add(temp);

			}
			else if(msg.equals("cd")){
				String tempS = new String();
				tempS = input.next();
				if (tempS.equals("..")){
					count--;
					File temp = list.get(myfile2.getNum());
					temp.setFlag(false); 
					//System.out.println(count);
				}
				else {
					for (int i = 0; i < list.size(); i++){
						File temp = list.get(i);
						myfile2.setNum(i);
						if (temp.getString().equals(tempS)){
							temp.setFlag(true);
							list.set(i,temp);
							count++;
							//System.out.println(count);
						}
					}
				}
			}


/*
			else if(msg.equals("cd..")){
				count--;
				File temp = list.get(myfile2.getNum());
				temp.setFlag(false); 
				//System.out.println(count);
			}
*/


			else if(msg.equals("ls")){
				//System.out.print("\n");
				for (int i = 0; i < list.size(); i++){
					File temp = list.get(i);
					if(temp.getCount() == count){
						System.out.print(temp.getString() + "   ");
					}
				}
				System.out.print("\n");
			}
			else if(msg.equals("rm")){
				String tempS2 = new String();
				tempS2 = input.next();
				for (int i = 0; i < list.size(); i++){
					File temp = list.get(i);
					if(temp.getString().equals(tempS2)){
		 				list.remove(i);
					}
				}
			}
			else if (msg.equals("cp")){
				String tempS3 = new String();
				String tempS4 = new String();
				tempS3 = input.next(); //file to copy
				tempS4 = input.next(); //file destination
				int tempInt = -1;
				int tempInt2 = -1;
				File temp = new File("", false);
				list.add(temp);

				for(int i = 0; i < list.size(); i++){
					File dontUseTemp = list.get(i);
					if(dontUseTemp.getString().equals(tempS3)){
						tempInt = i;
						list.remove(i);
					}
					if(dontUseTemp.getString().equals(tempS4)){
						tempInt2 = dontUseTemp.getCount() + 1;
					}
				}
			
				
				file_Two temp2 = new file_Two("", false);
				temp2.setCount(tempInt2);
				temp2.setString(tempS3);
				list.set(list.size()-1, temp2);
				
			}
			
			
		}
	}

	//method used to create a new file/directory for arraylist
	public static File newFile(){
		Scanner input = new Scanner(System.in);
		String name = new String();
		name = input.next(); //user inputs name of file
		File temp = new File(name, false); //file is initialized
		
		return temp;
	}

	
}
