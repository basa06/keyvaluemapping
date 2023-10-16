
        public class Main {
            public static void main(String[] args) {
                int []vals ={-2,9,11,12,13,14,15,22,142};
                int key = 15;
                int lo = 0;
                int hi = vals.length-1;
                boolean found= false;
                while ( lo <= hi)
                {
                    int mid = (lo+hi)/2;
                    int v = vals[mid];
                    System.out.println(v );
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