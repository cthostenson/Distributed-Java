package springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springxml.beans.movie;

public class SpringApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("movieContext.xml");

        springxml.beans.movie movie = context.getBean("myMovie", movie.class);

        System.out.println(movie.getMovieID());
        System.out.println(movie.getTitle());
        System.out.println(movie.getDescription());
        System.out.println(movie.getDirector());
        System.out.println(movie.getCriticScore());
        System.out.println(movie.getUserScore());

        context.close();


    }
}
