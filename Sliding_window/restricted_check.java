import java.util.*;

class restricted_check{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] resarr=new int[m];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            resarr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> m1=new HashMap<>();
        int l=0;
        int max_sum=-1;
        int sum=0;

        HashSet<Integer> s1=new HashSet<>();
        for(int x:resarr){
            s1.add(x);
        }

        for(int i=0;i<n;i++){
            
            m1.put(arr[i],m1.getOrDefault(arr[i], 0)+1);
            sum+=arr[i];
            if((i-l+1)>k){
                int rem=arr[l++];
                sum-=rem;
                m1.put(rem,m1.get(rem)-1);
                if(m1.get(rem)==0){
                    m1.remove(rem);
                }
            }
            if((l-i+1)==k){
                if(m1.size()==k){
                    if(s1.contains(arr[i])){
                        max_sum=Math.max(max_sum,sum);
                    }
                    else{
                        System.out.println("-1");
                    }

                }
            }

        }
        System.out.println(max_sum);
        


    }
}