package com.globalurban.website.domain;

import javax.persistence.*;

@Entity
@Table(name = "information")
public class Information{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idinfo")
    private Long idinfo;

    @Column(name = "dvbe")
    private String dvbe;

    @Column(name = "welcome")
    private String welcome;

    @Column(name = "aboutus")
    private String aboutus;

    @Column(name = "introservice")
    private String introservice;

    @Column(name = "grantwriadmin")
    private String grantwriadmin;

    @Column(name = "graphicdesign")
    private String graphicdesign;

    @Column(name = "goverenti")
    private String goverenti;

    @Column(name = "outeducation")
    private String outeducation;

    @Column(name = "introportfolio")
    private String introportfolio;

    @Column(name = "infoclient")
    private String infoclient;

    @Column(name = "graphicdesigntwo")
    private String graphicdesignTwo;

    @Column(name = "goverti2")
    private String goverti2;

    @Column(name = "gwawwu")
    private String gwawwwu;

    @Column(name = "gaewwu")
    private String gaewwwu;

    @Column(name = "gdmwwu")
    private String gdmwwwu;

    @Column(name = "seewwu")
    private String seewwwu;

    protected Information() {
    }

    public Long getIdinfo() {
        return idinfo;
    }

    public String getGraphicdesignTwo() {
        return graphicdesignTwo;
    }

    public void setGraphicdesignTwo(String graphicdesignTwo) {
        this.graphicdesignTwo = graphicdesignTwo;
    }

    public void setIdinfo(Long idinfo) {
        this.idinfo = idinfo;
    }

    public String getDvbe() {
        return dvbe;
    }

    public void setDvbe(String dvbe) {
        this.dvbe = dvbe;
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
    }

    public String getIntroservice() {
        return introservice;
    }

    public void setIntroservice(String introservice) {
        this.introservice = introservice;
    }

    public String getGrantwriadmin() {
        return grantwriadmin;
    }

    public void setGrantwriadmin(String grantwriadmin) {
        this.grantwriadmin = grantwriadmin;
    }

    public String getGraphicdesign() {
        return graphicdesign;
    }

    public void setGraphicdesign(String graphicdesign) {
        this.graphicdesign = graphicdesign;
    }

    public String getGoverenti() {
        return goverenti;
    }

    public void setGoverenti(String goverenti) {
        this.goverenti = goverenti;
    }

    public String getGoverti2() {
        return goverti2;
    }

    public void setGoverti2(String goverti2) {
        this.goverti2 = goverti2;
    }

    public String getOuteducation() {
        return outeducation;
    }

    public void setOuteducation(String outeducation) {
        this.outeducation = outeducation;
    }

    public String getIntroportfolio() {
        return introportfolio;
    }

    public void setIntroportfolio(String introportfolio) {
        this.introportfolio = introportfolio;
    }

    public String getInfoclient() {
        return infoclient;
    }

    public void setInfoclient(String infoclient) {
        this.infoclient = infoclient;
    }

    public String getGwawwwu() {
        return gwawwwu;
    }

    public void setGwawwwu(String gwawwwu) {
        this.gwawwwu = gwawwwu;
    }

    public String getGaewwwu() {
        return gaewwwu;
    }

    public void setGaewwwu(String gaewwwu) {
        this.gaewwwu = gaewwwu;
    }

    public String getGdmwwwu() {
        return gdmwwwu;
    }

    public void setGdmwwwu(String gdmwwwu) {
        this.gdmwwwu = gdmwwwu;
    }

    public String getSeewwwu() {
        return seewwwu;
    }

    public void setSeewwwu(String seewwwu) {
        this.seewwwu = seewwwu;
    }
}