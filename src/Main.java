public static void main(String[] args) {
    Tablica tablica = new Tablica(10);

    tablica.wypelnij(1, 100);

    System.out.println("Tablica: " + tablica);

    System.out.println("Maksimum: " + tablica.max());

    System.out.println("Minimum: " + tablica.min());

    System.out.println("Drugie maksimum: " + tablica.max2());

    System.out.println("Indeks elementu 50: " + tablica.znajdz(50));
}
