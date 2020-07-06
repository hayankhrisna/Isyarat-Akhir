package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi1;

public class Tema1Materi1 {

    private String Title1;
    private int Thumbnail1;
    private String Video1;

    public Tema1Materi1(){

    }

    public Tema1Materi1(String title1, int thumbnail1, String video1) {

        Title1 = title1;
        Thumbnail1 = thumbnail1;
        Video1 = video1;
    }

    public String getTitle1() {

        return Title1;
    }

    public void setTitle1(String title1) {

        Title1 = title1;
    }

    public int getThumbnail1() {
        return Thumbnail1;
    }

    public void setThumbnail1(int thumbnail1) {
        Thumbnail1 = thumbnail1;
    }

    public String getVideo1() {
        return Video1;
    }

    public void setVideo1(String video1) {
        Video1 = video1;
    }
}
