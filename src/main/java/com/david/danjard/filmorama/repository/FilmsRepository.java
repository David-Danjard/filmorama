package com.david.danjard.filmorama.repository;

import com.david.danjard.filmorama.exceptions.FilmNotFoundException;
import com.david.danjard.filmorama.model.Film;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmsRepository {

    private static List<Film> films = new ArrayList<>();

    public static List<Film> getFilms() {
        return films;
    }

    public static Film getFilm(long id) throws FilmNotFoundException {
        return films.stream().filter(film -> film.getId() == id)
                             .findFirst()
                             .orElseThrow(() -> new FilmNotFoundException("Film " + id + " was not found."));
    }

    public static Film addFilm(Film film) {
        film.setId(films.size() + 1L);
        films.add(film);
        return film;
    }

    public static Film updateFilm(Film film) throws FilmNotFoundException {
        Film toBeUpdated = films.stream().filter(film1 -> film1.getId() == film.getId())
                                         .findFirst()
                                         .orElseThrow(() -> new FilmNotFoundException("Film " + film.getId() + " was not found."));
        toBeUpdated.setTitle(film.getTitle());
        toBeUpdated.setSynopsis(film.getSynopsis());
        return toBeUpdated;
    }

    public static void deleteFilm(long id) {
        films = films.stream().filter(film -> film.getId() != id).collect(Collectors.toList());
    }
}
