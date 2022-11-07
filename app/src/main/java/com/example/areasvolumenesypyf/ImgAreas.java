package com.example.areasvolumenesypyf;

public class ImgAreas
{
    private String nActivity;
    private String nombreFigura;
    private int imgArea;

    public ImgAreas()
    {
    }

    public ImgAreas(String nActivity,String nombreFigura, int imgArea)
    {
        this.nActivity = nActivity;
        this.nombreFigura = nombreFigura;
        this.imgArea = imgArea;
    }

    public String getnActivity()
    {
        return nActivity;
    }

    public void setnActivity(String nActivity)
    {
        this.nActivity = nActivity;
    }

    public String getNombreFigura()
    {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura)
    {
        this.nombreFigura = nombreFigura;
    }

    public int getImgArea()
    {
        return imgArea;
    }

    public void setImgArea(int imgArea)
    {
        this.imgArea = imgArea;
    }
}
