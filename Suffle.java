public class Suffle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int res[]=new int[arr.length];
        int i=0;
        int k=0;
        int j=arr.length/2;
        while(i<j&&j<arr.length)
        {
            res[k++]=arr[i];
            res[k++]=arr[j];
            i++;
            j++;
        }
        for (int sec : res) {
            System.out.println(sec);
        }
    }
}
