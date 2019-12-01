package com.example.jjis;

public class PDF {
    String mpdf, material;

    public PDF() {
    }

    public PDF(String mpdf, String material) {
        this.mpdf = mpdf;
        this.material = material;
    }

    public String getMpdf() {
        return mpdf;
    }

    public void setMpdf(String mpdf) {
        this.mpdf = mpdf;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
