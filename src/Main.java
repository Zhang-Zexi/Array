/**
 * @ClassName Main
 * @Description
 * @Author zhangzx
 * @Date 2019/3/22 10:45
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        int[] arr  = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[]{100, 99, 98};
        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        scores[0] = 98;
        for (int score : scores) {
            System.out.println(score);
        }

    }

}
