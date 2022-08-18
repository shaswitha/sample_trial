import java.io.File;

public class WriteToFile {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		   
			   String path = "C: ";
			   File file = new File(path);
			   
			   int fileCounter=0;
			   int dirCounter=0;
			   
			   String str[]=file.list();
			   for(String s:str)
			   {
				 File fls = new File(file,s);
				 if(fls.isFile())
				 {
					fileCounter++; 
					if(fls.isDirectory())
					{
						dirCounter++;
					}
					System.out.println(fls);
				 }
				 System.out.println("Total Files:"+fileCounter+"Total Directory:"+dirCounter++);
			   }
				   
		   }
		   
		

	}


