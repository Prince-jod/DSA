import java.util.Arrays;
public class MinimumPalindrome {
  public static void Extract(String str)
  {
     char []word=str.toCharArray();
     Arrays.sort(word);
     
  }
  public static  int MinimumString(String str)
  {
    int count =0;
    int i=0;
    int j=str.length()-1;
    while(i<=j)
    {
      if(str.charAt(i)==str.charAt(j))
      {
        i++;
        j--;
      }
      else{
        count++;
        j--;
      }
    }
    System.out.println(count);
    return count;
  }
  public static void main(String []args){
     MinimumString("letelt");
  }
}
