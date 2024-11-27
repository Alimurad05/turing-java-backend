package turing.edu.az.module02;
public class Movie {
   private String name;
    double rating;
    String comments;
    public Movie(String name,double rating,String comments){
        this.name=name;
        this.rating=rating;
        this.comments=comments;
    }
//    public String getModel(){
//        return name;
//    }
    void film(){
        System.out.println(name + "in raitingi " + rating +" dir" +" " + comments);
    }
}