package bhuvanesh_for_Practice;
import java.io.*;


public class File_Handling {
	
		String f1 = "F:\\File Handling\\newfile";
public void foldercreation() {
	File file = new File("F:\\File Handling");
	boolean filefolder = file.exists();
	System.out.println("folder created : "+filefolder);
	if (filefolder == false)
		file.mkdir();
	 filefolder = file.exists();
	System.out.println("folder created : "+filefolder);
}
public void newfoldercreation() {
	File file = new File("F:\\File Handling\\newfile");
    boolean newfilefolder = file.exists();
    System.out.println("file creation : "+file.exists());
   if(newfilefolder == false)
	file.mkdirs();
    newfilefolder = file.exists();
    System.out.println("file creation : "+newfilefolder);
}
public void filecreation() throws IOException {
	File file = new File("F:\\File Handling\\newfile\\test.txt");
	File file1 = new File("F:\\File Handling\\newfile\\syllabus.txt");
	File file2 = new File("F:\\File Handling\\newfile\\idle.txt");
	File file3 = new File("F:\\File Handling\\newfile\\dosa.txt");
	File file4 = new File("F:\\File Handling\\newfile\\python.html");
	File file5 = new File("F:\\File Handling\\newfile\\Restuarent.xlsx");
	boolean filefolder = file.exists();
	boolean filefolder1 = file1.exists();
	boolean filefolder2 = file2.exists();
	boolean filefolder3 = file3.exists();
	boolean filefolder4 = file4.exists();
	boolean filefolder5 = file5.exists();
	System.out.println("file creation : "+ filefolder);
	System.out.println("file creation1 : "+ filefolder1);
	System.out.println("file creation2 : "+ filefolder2);
	System.out.println("file creation3 : "+ filefolder3);
	System.out.println("file creation4 : "+ filefolder4);
	System.out.println("file creation5 : "+ filefolder5);
	if (filefolder == false) {
		file.createNewFile();
	    file.exists();
	    System.out.println("file creation : "+file.exists());
	}
	if(filefolder1 == false) {
		file1.createNewFile();
		System.out.println("file creation1 : "+file1.exists());
	}
	if(filefolder2 == false) {
		file2.createNewFile();
		System.out.println("file creation2 : "+file2.exists());
	}
	if(filefolder3 == false) {
		file3.createNewFile();
		System.out.println("file creation3 : "+file3.exists());
	}
	if(filefolder4 == false) {
		file4.createNewFile();
		System.out.println("file creation4 : "+file4.exists());
	}
	if(filefolder5 == false) {
		file5.createNewFile();
		System.out.println("file creation5 : "+file5.exists());
	}
}
public void filerename() {
	File file = new File("F:\\File Handling\\newfile\\Keyboard");
	File file1 = new File("F:\\File Handling\\newfile\\Keyboard.txt");
	System.out.println("renamed file : "+file.renameTo(file1));
//file get name
	System.out.println("newfile name : "+file1.getName());
	System.out.println("file name : "+file.getName());
}
public void filedeletion() {
	File deletion = new File("F:\\File Handling\\newfile\\test.txt");
	
	deletion.delete();
	System.out.println(deletion.exists());
}
public void listoffilesandfolder() {
	File file = new File("F:\\File Handling\\newfile");
	
//only listing files and folders
	//String[] listfilefolder = file.list();
//for loop
	/*for(int i=0;i<listfilefolder.length;i++)
		System.out.println(listfilefolder[i]);*/
	
//for each loop
	/*for(String h : listfilefolder)
		System.out.println(h);*/
	
//files and folders listed with location
	File[] filesfolders = file.listFiles();
	//for (File f : filesfolders)
//if condition listing files only with location
		//if(f.isFile())
//if condition listing folders only with location
		/*if(f.isDirectory())
		System.out.println(f);*/
	
	for(File f :filesfolders ) {
		
		if(f.isFile()) {
	 String getname = f.getName();
	 int dot = getname.lastIndexOf(".");
	 String extension = getname.substring(dot+1);
	 if(extension.equals("txt"))
//it deletes the all particular extension files, for eg.html		 
		 //f.delete();
//after f.length()">0" it shows in above "0" bytes	 
	 if(f.length()>0)
//in sysout after getname + "f.length" it shows in bytes of file		 
	 System.out.println(getname +" "+f.length());
    }
 }
}
public void filewriter() {
	File file = new File("F:\\File Handling\\newfile\\Keyboard.txt");
	file.delete();
	
	try {
		System.out.println("This file is not available : "+file.exists());
		if(file.exists() == false) {
		file.createNewFile();
		System.out.println("This file is available : "+file.exists());
		}
		
		FileWriter writer = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(writer);
		bwriter.write(50);//it is writing ASCII value
		bwriter.write(" files for testing ");//it's writing string value
		bwriter.newLine();//this method can use in bufferedWriter 
		bwriter.append((char) 90);//this "append()" also can writing data like "write()"
		bwriter.newLine();
		bwriter.append("hi");
		bwriter.newLine();
		bwriter.newLine();
		bwriter.write("file is ready to access");
		bwriter.flush();//it is confirming the data on filewriter class
		bwriter.close();//after flushing the data we have to close then only can visible on the file
		
		FileReader readfile = new FileReader(file);
		/*int i;
		while((i=readfile.read())!=-1) //this "while loop" can read(".read()") till comes -1 => "!=-1" =>it's named as not equals to -1
			
			System.out.print((char)i);*/ //here we can use "(char)" then only read in character
		char[] character = new char[(int)file.length()];//the length returns long but int stores maximum values on array
		readfile.read(character);
		for(char ch : character)
			//System.out.print((char)ch);//either this can use or
		    System.out.print(ch);//this can use
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();//it catch's all type of exception like high,mid,low extends exception
	}	
}

public void filewriting() {
	File file = new File("F:\\File Handling\\newfile\\Keyboard.txt");
	try {
		FileWriter writer = new FileWriter(file );//if after file, use this"true" it's returns appending boolean value 
		BufferedWriter bwriter = new BufferedWriter(writer);//appending means the file writer cannot removes old data 
		bwriter.newLine();
		bwriter.write(" appending newline");
		bwriter.newLine();
		bwriter.write(" hi hello");
		bwriter.flush();
		bwriter.close();
		
		FileReader fileread = new FileReader(file);
		BufferedReader breader = new BufferedReader(fileread);
		
		int i;
		while((i=breader.read())!=-1)
			//(i=Fs.read())!=-1
			System.out.print((char)i);
//		String rl = breader.readLine();
//		while(rl!=null)
//			System.out.println(rl);
//		breader.readLine();
		
	} catch (IOException e) {
		e.printStackTrace();
 }
	
}
public void excelReadandWrite () throws FileNotFoundException{
	File file  = new File("F:\\File Handling\\newfile\\new Restuarant.xlsx");
	
		FileInputStream file1 = new FileInputStream(file);
		//Workbook wb = new XSSFWorkbook (file1);
	  
}

	public static void main(String[] args) throws IOException {
		File_Handling f = new File_Handling();
		//f.foldercreation();
		//f.newfoldercreation();
		//f.filecreation();
		//f.filerename();
		//f.filedeletion();
		//f.listoffilesandfolder();
		f.filewriter();
		f.filewriting();
 }
}













