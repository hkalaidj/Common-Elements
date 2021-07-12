package commonElements;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElements {

	public static void findCommonElements() {
		 List Teams = new ArrayList();
		 //col_1 will be query collection
		Comparable[] col_1 = {"Baltimore Ravens","Seattle Seahawks","Indianapolis Colts","Houston Texans",
				"Tennessee Titans","Jacksonville Jaguars","Arizona Cardinals","New England Patriots","Baltimore Ravens"	,
				"Cincinnati Bengals","Kansas City Chiefs","Cincinnati Bengals","Cleveland Browns",
				"San Francisco 49ers","St. Louis Rams","Cleveland Browns"};
		if (col_1.length==0)
		{System.out.println("QUERY ARRAY IS EMPTY THERE IS NOTHING TO CHECK");
		}
		Comparable[] col_2 = {"Baltimore Ravens","Pittsburgh Steelers","Tennessee Titans",
        		"St. Louis Rams","New York Jets","Houston Texans","Jacksonville Jaguars",
        		 "Arizona Cardinals","Seattle Seahawks","Pittsburgh Steelers","Cincinnati Bengals",
        		"San Francisco 49ers","Cleveland Browns","Indianapolis Colts","San Diego Chargers",
        		"Cleveland Browns", "Cincinnati Bengals"};
		
		
        
        //col_3 empty array
        Comparable[] col_3= {"Cincinnati Bengals"};
        //col_4 one element array
        Comparable[] col_4= {"Cincinnati Bengals"};
        
        List<Comparable> c = Arrays.asList(col_3);
        List<Comparable> d = Arrays.asList(col_4);

      
        List Something = new ArrayList();
      
        		 Arrays.sort(col_1);
        		 for (int k=0;k<col_1.length;k++)
        	       Something.add(col_1[k]);  
        	       
        	         
        	        Set<String> s1 = new LinkedHashSet<String>(Something);  
        	        System.out.println("DUPLICATES REMOVED FROM QUERY ARRAY COL_1");  
        	        System.out.println(s1);  
        	        System.out.println(""); 
        	        Comparable[] col_a = s1.toArray(new String[0]); 
        	       
            	 Arrays.sort(col_2);
            	 
            	
            	 Arrays.sort(col_3);
            	 Arrays.sort(col_4);
            	
            	
            	 int counter=0;
            	      		Comparable[][] collections = {{"Baltimore Ravens","Pittsburgh Steelers","Tennessee Titans",
            	        		"St. Louis Rams","New York Jets","Houston Texans","Jacksonville Jaguars",
            	        		 "Arizona Cardinals","Seattle Seahawks","Pittsburgh Steelers","Cincinnati Bengals",
            	        		"San Francisco 49ers","Cleveland Browns","Indianapolis Colts","San Diego Chargers",
            	        		"Cleveland Browns", "Cincinnati Bengals"},{"Cincinnati Bengals"},{}};
            	      	//	for(int row=0;row<collections.length;row++)
            	      			//for (int x=0;x<collections.length;x++)
            	      	
            	      		
            	      		
            	      		
  {for (int i=0;i<col_a.length;i++)
  {	   
	  {
	  int l = 0, r = col_2.length ; 
  while (l <= r) { 
      int m = l + (r - l) / 2; 
      
         	
    	   int res= col_a[i].compareTo(col_2[m]); 
                
      if (res == 0) 
          Teams.add(col_a[i]); 
     
     
      if (res > 0) 
          l = m + 1; 

     
      else
          r = m - 1; 
      Teams.retainAll(c);  
      Teams.retainAll(d); 
      counter++;}
  } }}
	 
		  
  System.out.println("Total comparisons performed " + counter);
    System.out.println("")  ;      
   
  Teams.forEach(name -> {  
  	System.out.println(name);
  	
  });
}
       
        //System.out.println("NUMBER OF COMPARISONS= "+compare);
		
		public static void main(String[] args) {
			
		

		 findCommonElements();
		}
		}