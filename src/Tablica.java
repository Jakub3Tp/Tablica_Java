import java.util.Arrays;
import java.util.Random;

public class Tablica {
    private int[] tablica;
    private int n;

    // Konstruktor
    public Tablica(int n) {
        this.n = n;
        this.tablica = new int[n];
    }

    public void wypelnij(int a, int b) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            tablica[i] = rand.nextInt(b - a + 1) + a;
        }
    }

    public int max() {
        int max = tablica[0];
        for (int i = 1; i < n; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

    public int min() {
        int min = tablica[0];
        for (int i = 1; i < n; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }

    public int max2() {
        int max1 = tablica[0];
        int max2 = tablica[1];

        if (max2 > max1) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        for (int i = 2; i < n; i++) {
            if (tablica[i] > max1) {
                max2 = max1;
                max1 = tablica[i];
            } else if (tablica[i] > max2 && tablica[i] != max1) {
                max2 = tablica[i];
            }
        }

        return max2;
    }

    public int znajdz(int a) {
        for (int i = 0; i < n; i++) {
            if (tablica[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(tablica);
    }
}
