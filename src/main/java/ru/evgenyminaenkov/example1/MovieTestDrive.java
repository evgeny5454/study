package ru.evgenyminaenkov.example1;

public class MovieTestDrive {
    public static void main(String[] args) {
        Move one = new Move();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Move two = new Move();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        Move three = new Move();
        three.title = "Байт-Клуб";
        three.genre = "Комедия, но в целом веселая";
        three.rating = 127;

        System.out.println();
    }
}
