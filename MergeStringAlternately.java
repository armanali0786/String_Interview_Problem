
//Write a Program to Merge Strings Alternately
public class MergeStringAlternately {
    static int MergeString(String str1, String str2)
    {
       StringBuilder sb = new StringBuilder();
       String arr1[] = str1.split(" ");
       String arr2[] = str2.split("");       
       int len = arr1.length+ arr2.length;
       for(int i=0; i<len; i++)
       {
          if(i<str1.length())
            sb.append(str1.charAt(i));
          if(i<str2.length())
            sb.append(str2.charAt(i));
       }
       System.out.println("Output String: "+sb.toString());
       return len;
    }
    public static void main(String[] args)
    {
      String str1 = "Arman";
      String str2 ="Ali";
      System.out.println("Input String: "+str1+" "+str2);
      System.out.println(MergeString(str1, str2));
    }
}


