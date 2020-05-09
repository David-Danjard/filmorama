package com.david.danjard.filmorama.resources;

import com.david.danjard.filmorama.FilmServices;
import com.david.danjard.filmorama.exceptions.FilmNotFoundException;
import com.david.danjard.filmorama.model.Film;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api/films")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FilmsResource {

    @Inject
    FilmServices filmServices;

    @GET
    public List<Film> getFilms() {
        return filmServices.getFilms();
    }

    @GET
    @Path("/{id}")
    public Film getFilm(@PathParam("id") long filmId) throws FilmNotFoundException {
        return filmServices.getFilm(filmId);
    }

    @POST
    public Film createFilm(Film film) {
        return filmServices.addFilm(film);
    }

    @PUT
    public Film updateFilm(Film film) throws FilmNotFoundException {
        return filmServices.updateFilm(film);
    }

    @DELETE
    @Path("/{id}")
    public Response deleteFilm(@PathParam("id") long filmId) {
        filmServices.deleteFilm(filmId);
        return Response.noContent().build();
    }

}
