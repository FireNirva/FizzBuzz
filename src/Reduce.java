public class Reduce {
    public static void main(String[] args) {
        int count_steps = 0;
        int start = 100;
        while (start != 0){
            if (start % 2 == 0){
                start = start / 2;
            } else {
                start = start - 1;
            }
            count_steps += 1;
        }
        System.out.println(count_steps);
    }
}
