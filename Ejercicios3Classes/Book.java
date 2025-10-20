package Ejercicios3;

public class Book {
    
    String title;
    String author;
    int year;

        public Book() {
            title = "Desconocido";
            author = "Desconocido";
            year = 0;
    }

        public void printDetalles(){
        System.out.println("title= " + title + "author= " + author + "year=  " + year);
    }
}

