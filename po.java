import java.util.*;

class post {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        int arr[] = new int[n];
        int post[] = new int[n]; // Move post array declaration outside the loop

        // Read elements into arr
        for (int r = 0; r < n; r++) {
            arr[r] = s.nextInt();
        }

        post[0] = arr[n - 1];
        m--;

        // Populate the post array
        for (int i = 1; i < n; i++) {
            m--;
            post[i] = post[i - 1] + arr[m];
        }

        // Print post array for verification
        System.out.println(Arrays.toString(post));
    }
}
