package Question2;


import java.util.*;
public class CustomerStringTokenizer
{

    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), final_Count=0;
        String a;
        boolean flag;
        double abc;

        for(int i=0;i<count;i++){
            flag=true;
            a=s.nextToken();

            try{
                abc = Double.parseDouble(a);
            }
            catch(NumberFormatException e){
                flag=false;
            }

            if(!flag)
                final_Count++;
        }
        return final_Count;
    }
    public static void main(String[] args) {

        StringTokenizer d = new StringTokenizer("There are 2 lions in this jungle");
        StringTokenizer e = new StringTokenizer("There are two lions in this jungle");

        int count = countTokens(d);
        System.out.println("Total number of Tokens in first string are  : "+ count);
        count = countTokens(e);
        System.out.println("Total number of Tokens in second string are : "+ count);
    }

}
