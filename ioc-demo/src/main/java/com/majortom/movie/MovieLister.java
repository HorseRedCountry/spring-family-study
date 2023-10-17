package com.majortom.movie;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/10/17 13:44
 **/
public class MovieLister {

    private MovieFinder finder;

    public MovieLister() {
        finder = new ColonDelimitedMovieFinder();
    }

    public String[] moviesDirectedBy(String args) {
        List<String> allMovies = finder.findAll();
        for (Iterator<String> it = allMovies.iterator(); it.hasNext(); ) {
            String movie = (String) it.next();
            if (!movie.equals(args)) {
                it.remove();
            }
        }
        return (String[]) allMovies.toArray();
    }

}
