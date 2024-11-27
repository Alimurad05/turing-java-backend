package turing.edu.az.module02;

public class MovieApp {

    public static void main(String[] args) {
        Movie movie1=new Movie("Prestige",9.5,"Good");
        Movie movie2=new Movie("Star wars",9.6,"Good");
//        String moviename= movie1.getModel();
//        System.out.println(moviename);
        movie1.film();
        movie2.film();

    }
}
