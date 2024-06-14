package objetos;

public class Pelicula {
    private String id;
    private String titulo;
    private Genero genero;
    private Integer anyoLanzamiento;
    private double calificacion;
    private Integer numeroTemporada;
    private String edadRecomendada;
    private Integer duracion;

    public Pelicula(String id, String titulo, Genero genero, Integer anyoLanzamiento, double calificacion,
            String edadRecomendada, Integer duracion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anyoLanzamiento = anyoLanzamiento;
        this.calificacion = calificacion;
        this.edadRecomendada = edadRecomendada;
        this.duracion = duracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Integer getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(Integer anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(Integer numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public String getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(String edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
}
