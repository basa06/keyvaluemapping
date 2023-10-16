public class Main {
    public static void main(String[] args) {
        int []vals ={-65,-54, -5,16, 78, 1998};
        int key = 78;
        int lo = 0;
        int hi = vals.length-1;
        boolean found= false;
        while ( lo <= hi)
        {
            int mid = (lo+hi)/2;
            int v = vals[mid];
            if (v==key)
            {
                found=true;
                break;
            }
            else if (v<key)
                lo=mid+1;
            else
                hi = mid-1;

        }
        System.out.println(found);
    }
}