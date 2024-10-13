public static void main(String[] args) {
    // Tworzenie nowego obiektu klasy Tablica z rozmiarem 10
    Tablica tablica = new Tablica(10);

    // Wypełnianie tablicy losowymi wartościami z zakresu od 1 do 100
    tablica.wypelnij(1, 100);

    // Wyświetlenie tablicy
    System.out.println("Tablica: " + tablica);

    // Wyświetlenie maksimum
    System.out.println("Maksimum: " + tablica.maksimum());

    // Wyświetlenie minimum
    System.out.println("Minimum: " + tablica.minimum());

    // Wyświetlenie drugiej maksymalnej wartości
    System.out.println("Drugie maksimum: " + tablica.maksimum2());

    // Wyszukanie indeksu elementu 50
    System.out.println("Indeks elementu 50: " + tablica.znajdz(50));
}
