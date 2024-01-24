import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
        String[] names = {"Sakshi","Kalyani","Samiksha","Anita","Shree","Piya","neha","aditya","piyush","Shreyas","parag","Pankaj","pushkar","sahil","Jivesh","tanmay","rushi","atharva","Akansha","kartik"};
        int[][] marks = {
                {90, 94, 95, 89, 90},
                {90, 94, 95, 89, 68},
                {90, 94, 99, 89, 68},
                {90, 96, 95, 89, 68},
                {90, 94, 95, 89, 68},
                {90, 94, 95, 58, 68},
                {90, 67, 95, 89, 68},
                {90, 94, 90, 89, 68},
                {90, 94, 85, 89, 68},
                {90, 94, 65, 89, 68},
                {90, 94, 95, 79, 68},
                {90, 94, 95, 86, 68},
                {90, 94, 67, 89, 68},
                {90, 94, 95, 89, 68},
                {90, 94, 78, 89, 68},
                {90, 94, 95, 89, 68},
                {60, 94, 95, 89, 68},
                {90, 94, 45, 89, 68},
                {90, 94, 75, 89, 68},
                {90, 94, 55, 89, 68}
        };

        int[] sum = new int[20];

        for (int i = 0; i < marks.length; i++) {
            sum[i] = marks[i][0] + marks[i][1] + marks[i][2] + marks[i][3] + marks[i][4];
            System.out.println(names[i] + ": " + sum[i]);
        }

        Integer[] indexes = new Integer[20];
        for (int i = 0; i < 20; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, (a, b) -> Integer.compare(sum[b], sum[a]));

        System.out.println("Top 5 students Are :");

        for (int i = 0; i < 5; i++) {
            int topIndex = indexes[i];
            System.out.println(names[topIndex] + ": " + sum[topIndex]);
        }
    }
}
