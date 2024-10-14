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
        return Arrays.stream(tablica).max().getAsInt();
    }

    public int min() {
        return Arrays.stream(tablica).min().getAsInt();
    }

    public int max2() {
        int max = max();
        return Arrays.stream(tablica).filter(x -> x != max).max().orElse(max);
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
