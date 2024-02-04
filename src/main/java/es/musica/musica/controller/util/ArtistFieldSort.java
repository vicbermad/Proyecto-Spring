package es.musica.musica.controller.util;

public enum ArtistFieldSort {
    NAME("name"),
    ACTIVE_YEARS("activeYears");
    private String field;
    private ArtistFieldSort(String field){
        this.field = field;
    }

    public String getField(){
        return field;
    }
}
