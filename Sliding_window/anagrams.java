import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String p=sc.next();
        int k=p.length();
        int l=0;
        int r=0;
        HashMap<Character,Integer> s1=new HashMap<>();
        for(char ch:p.toCharArray()){
            s1.put(ch,s1.getOrDefault(ch, 0)+1);
        }
        int sum=0;
        HashMap<Character,Integer> h=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<a.length();i++){
            h.put(a.charAt(i),h.getOrDefault(a.charAt(i), 0)+1);
            sum+=a.charAt(i);
            if(i-l+1>k){

                char rem=a.charAt(l);
                sum-=rem;
                h.put(rem,h.get(rem)-1);
                if(h.get(rem)==0){
                    h.remove(rem);
                }
                l++;
            }
            if(i-l+1==k){
                if(s1.equals(h)){
                    li.add(l);
                }
            }
        }
        for(int x:li){
            System.out.println(x);

        }
        


    }
    
}
