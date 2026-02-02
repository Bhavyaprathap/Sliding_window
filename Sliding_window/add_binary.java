import java.util.*;
public class add_binary {
    static List<Integer> calculate_binary(String a,String b){
        int l=a.length()-1;
        int m=b.length()-1;
        List<Integer> l1=new ArrayList<>();
        int carry=0;
        
        while(l>=0 || m>=0 || carry==1 ){
            if((a.charAt(l)=='0') && (b.charAt(m)=='0')){
                l1.add(0);
            }
            if((a.charAt(l)=='1') || (b.charAt(m)=='1')){
                l1.add(1);
            }
            if((a.charAt(l)=='1') && (b.charAt(m)=='1')){
                l1.add(0);
                carry=1;
                calculate_binary(a, b);
            }
            l--;
            m--;


        }
        return l1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        


    }

    
}
