import java.io.*;
import java.util.*;

public class Solution
{
    public static void run(BufferedReader in, PrintWriter out)   throws IOException
    {
        runOperations(in, out);
    }

    public static void runOperations(BufferedReader in, PrintWriter out) throws IOException
    {
        ArrayList startList = new ArrayList();
        ArrayList endList = new ArrayList();
        Scanner sc = new Scanner(in.readLine()).useDelimiter("\\s*,\\s*");

        try{
         while(sc!=null)
         {
             while(sc.hasNext())
                endList.add(sc.next());

                createPermutations(startList,  endList, out);

                 startList.clear();
                 endList.clear();

                out.println();
                out.flush();

                sc = new Scanner(in.readLine()).useDelimiter("\\s*,\\s*");
            }
        }catch(Exception e){}
    }

    public static void copyListElements(ArrayList list1, int start, int end, ArrayList list2)
    {
        for(int i=start; i<end; i++)
            list1.add(list2.get(i));
    }

    public static void copyListElements(ArrayList list1, int start, ArrayList list2)
    {
        for(int i=start; i<list2.size(); i++)
            list1.add(list2.get(i));
    }
    public static ArrayList combineElements(ArrayList list1, ArrayList list2,  PrintWriter out)
    {
        ArrayList <String>combinedList = new ArrayList<String>(list1);
        list1.addAll(list2);
        return combinedList;
    }
    public static ArrayList addElement(ArrayList list1, String item)
    {
        ArrayList combinedList = new ArrayList(list1);
        combinedList.add(item);
        return combinedList;
    }
    public static void formatandPrint(ArrayList list1, ArrayList list2, PrintWriter out)
    {
        String a = list1.toString().replace(" ", "");
        a= a.substring(1, a.length()-1);

        String b = list2.toString().replace(" ", "");
        b= b.substring(1, b.length()-1).trim();

        if(a.length()<1)
            out.println(b);
        else if(b.length()<1)
            out.println(a);
        else
            out.println(a + "," + b);
    }

    public static void createPermutations(ArrayList startList, ArrayList <String>endList, PrintWriter out)
    {
        if(endList.size()>1)
            for(int i = 0; i<endList.size(); i++)
            {
                ArrayList <String>newList = new ArrayList<String>();
                copyListElements(newList,0,i,endList);
                copyListElements(newList,i+1,endList);
                createPermutations(addElement(startList, endList.get(i)), newList, out);
            }
        else
             formatandPrint(startList, endList, out);        
    }
}


