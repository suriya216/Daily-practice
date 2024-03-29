import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static int timeToBuy(int[] nums, int K) {
        int n = nums.length;
        int res = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(nums[i]);
        }
        while (l.get(K)==0) {
            for(int i=0;i<n;i++){
                if(l.get(i)>0){
                    res++;
                    l.add(l.get(i)-1);
                }
                if(l.get(K)==0){
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(1, s.length() - 1);
        String[] str = s.split(",");
        sc.nextLine();
        int K = sc.nextInt();
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        System.out.print(timeToBuy(nums, K));
        sc.close();
    }
}