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

    // Metoda do wypełniania tablicy wartościami losowymi z zakresu [a, b]
    public void wypelnij(int a, int b) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            tablica[i] = rand.nextInt(b - a + 1) + a;
        }
    }

    // Metoda zwracająca maksymalną wartość w tablicy
    public int maksimum() {
        return Arrays.stream(tablica).max().getAsInt();
    }

    // Metoda zwracająca minimalną wartość w tablicy
    public int minimum() {
        return Arrays.stream(tablica).min().getAsInt();
    }

    // Metoda zwracająca drugą maksymalną wartość w tablicy
    public int maksimum2() {
        int max = maksimum();
        return Arrays.stream(tablica).filter(x -> x != max).max().orElse(max);
    }

    // Metoda zwracająca indeks podanej wartości a lub -1, jeśli nie istnieje
    public int znajdz(int a) {
        for (int i = 0; i < n; i++) {
            if (tablica[i] == a) {
                return i;
            }
        }
        return -1;
    }

    // Metoda pomocnicza do zwrócenia tablicy jako string
    public String toString() {
        return Arrays.toString(tablica);
    }
}
