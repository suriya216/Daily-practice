import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question1 {
    public static int timeToBuy(int[] nums, int K) {
        int n = nums.length;
        int res = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(nums[i]);
        }
        while (!q.isEmpty()) {
            int currentItem = q.poll();
            res++;
            K--;
            if (K == 0) {
                break;
            }
            if (currentItem > 1) {
                q.add(currentItem - 1);
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