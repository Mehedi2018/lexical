
package lexecalanalysis;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class LexecalAnalysis {

  
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<String> KeyList=new ArrayList<>(Arrays.asList("char","double","float","if","else","do","while","break","auto","for","case","long","return"));
        ArrayList<String> OprList=new ArrayList<>(Arrays.asList("+","-","*","/","%","&","!","="));
        ArrayList<String> IdntList=new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","v","w","x","y","z"));
        ArrayList<String> OtherList=new ArrayList<>(Arrays.asList("(",")","{","}","[","]","?","."));
        ArrayList<String> NumericList=new ArrayList<>(Arrays.asList("1","2","0","3","4","5","6","7","8","9","10","11","12","13"));
        
        ArrayList<String> KeyListA=new ArrayList<>();
        ArrayList<String> OprListA=new ArrayList<>();
        ArrayList<String> IdntListA=new ArrayList<>();
        ArrayList<String> OtherListA=new ArrayList<>();
        ArrayList<String> NumericListA=new ArrayList<>();
        
        
        try {
            Scanner input= new Scanner(new File("C:\\Users\\MEHEDI\\Desktop\\mehedi.txt"));
            
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] temp= s.split(" ");
                for(String word : temp){
                 strList.add(word);
               } 
            }
            input.close();
        } catch (Exception e) {
            System.out.println("File not Found please try again ");
            
            
            
            
            
            
        }
          for(int k=0;k<strList.size();k++){
        	if(KeyList.contains(strList.get(k))) {
        		KeyListA.add(strList.get(k));
        	}
        	else if(OprList.contains(strList.get(k))) {
        		OprListA.add(strList.get(k));
        	}
        	else if(IdntList.contains(strList.get(k))) {
        		IdntListA.add(strList.get(k));
        	}
        	else if(OtherList.contains(strList.get(k))) {
        		OtherListA.add(strList.get(k));
        	}
        	else if(NumericList.contains(strList.get(k))) {
        		NumericListA.add(strList.get(k));
        	}
        }
        
        Iterator<String> itr=KeyListA.iterator();
        System.out.println("The keyword is:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        itr=OprListA.iterator();
        System.out.println("The Operators is:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        itr=IdntListA.iterator();
        System.out.println("The Identifiers is :");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        itr=OtherListA.iterator();
        System.out.println("The others value is  :");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        itr=NumericListA.iterator();
        System.out.println("The Numeric Value is :");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
    }
    
}
