public class Water {
  static int maxWater(int arr[])
  {
    int l=0;
    int r=arr.length-1;
    int max=0;
    while(l<r)
    {
      int height=Math.min(arr[l],arr[r]);
      int width=r-l;
      int area=width*height;
      max=Math.max(max,area);
      if(arr[l]<arr[r])
      {
        l++;
      }
      else{
        r--;
      }

    }
    System.out.println(max);
    return max;
  }
  public static void main(String[] args) {
    int arr[]={2,1,3,8,4,3};
    maxWater(arr);
  }
}

