package com.example.areasvolumenesypyf;

public class ImgVolumenes
{
    private String nActivity;
    private String nombrePoliedro;
    private int imgVolumen;

    public ImgVolumenes()
    {
    }

    public ImgVolumenes(String nActivity ,String nombrePoliedro, int imgVolumen)
    {
        this.nActivity = nActivity;
        this.nombrePoliedro = nombrePoliedro;
        this.imgVolumen = imgVolumen;
    }

    public String getnActivity()
    {
        return nActivity;
    }

    public void setnActivity(String nActivity)
    {
        this.nActivity = nActivity;
    }

    public String getNombrePoliedro()
    {
        return nombrePoliedro;
    }

    public void setNombrePoliedro(String nombrePoliedro)
    {
        this.nombrePoliedro = nombrePoliedro;
    }

    public int getImgVolumen()
    {
        return imgVolumen;
    }

    public void setImgVolumen(int imgArea)
    {
        this.imgVolumen = imgVolumen;
    }
}
