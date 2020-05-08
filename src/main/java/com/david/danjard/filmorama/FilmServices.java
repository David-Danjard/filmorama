package com.david.danjard.filmorama;

import com.david.danjard.filmorama.exceptions.FilmNotFoundException;
import com.david.danjard.filmorama.model.Film;
import com.david.danjard.filmorama.repository.FilmsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class FilmServices {

    private static final Logger LOGGER = LoggerFactory.getLogger(FilmServices.class);

    @PostConstruct
    public void init() {
        // Code executé à chaque instanciation du service
        LOGGER.info("Une nouvelle instance de FilmServices");
    }

    public List<Film> getFilms(){
        return FilmsRepository.getFilms();
    }

    public Film addFilm(Film film) {
        return FilmsRepository.addFilm(film);
    }

    public Film updateFilm(Film film) throws FilmNotFoundException {
        return FilmsRepository.updateFilm(film);
    }

    public Film getFilm(long id) throws FilmNotFoundException {
        return FilmsRepository.getFilm(id);
    }

    public void deleteFilm(long id) {
        FilmsRepository.deleteFilm(id);
    }

}
