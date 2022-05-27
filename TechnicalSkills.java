
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class TechnicalSkills {
	
	static ArrayList<String> techskills = new ArrayList<String>();
	static ArrayList<String> data = new ArrayList<String>();
	static ArrayList<String> hardskills = new ArrayList<String>();

	
	
	
	
    static int isSubstring(
        String first, String second)
    {
        int M = first.length();
        int N = second.length();
 
        
        for (int i = 0; i <= N - M; i++) {
            int j;
 
           
            for (j = 0; j < M; j++)
                if (second.charAt(i + j)
                    != first.charAt(j))
                    break;
 
            if (j == M)
                return i;
        }
 
        return -1;
    }
    
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
  
        
        ArrayList<T> newarr = new ArrayList<T>();
  
      
        for (T element : list) {
  
            if (!newarr.contains(element)) {
  
                newarr.add(element);
            }
        }
  
        return newarr;
    }
	
	public static void main(String[] args) {
		String dataset ="C:\\Users\\15147\\Downloads\\Raw_Skills_Dataset.csv"; //Configure path
		String techSkills ="C:\\Users\\15147\\Downloads\\Example_Technical_Skills.csv"; //Configure path
		String line = "";
		String line2 = "";
		
		try {
		BufferedReader br = new BufferedReader(new FileReader(techSkills));
		
		while((line = br.readLine()) != null) {
			techskills.add(line);
		
		}
		
		br.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader br2 = new BufferedReader(new FileReader(dataset));
			
			while((line2 = br2.readLine()) != null) {
				data.add(line2);
			}
			br2.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		for (String arg : techskills) {
			for( String dt: data) {
				if (isSubstring(arg,dt)!= -1) {
					hardskills.add(dt);
			}
		}
		
		
		try {
			
			 File file = new File("HardSkills.csv");
		     FileWriter fw = new FileWriter(file);
		     BufferedWriter bw = new BufferedWriter(fw);
		     
		     bw.newLine();
		     
		 //   hardskills = removeDuplicates(hardskills);
		        for(int i=0;i<hardskills.size();i++)
		        {
		        	bw.write(hardskills.get(i));
		            bw.newLine();
		        }
		        
		     bw.close();
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
}
	

