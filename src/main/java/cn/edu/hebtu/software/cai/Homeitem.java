package cn.edu.hebtu.software.cai;

//定义list类
public class Homeitem{
    private String hname;
    private String htext;
    private String img1;
    private String img2;

    public Homeitem(String hname, String htext, String img1, String img2) {
        this.hname = hname;
        this.htext = htext;
        this.img1 = img1;
        this.img2 = img2;
    }

    public Homeitem(String hname, String htext, String img1) {
        this.hname = hname;
        this.htext = htext;
        this.img1 = img1;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public void setHtext(String htext) {
        this.htext = htext;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getHname() {
        return hname;
    }

    public String getHtext() {
        return htext;
    }

    public String getImg1() {
        return img1;
    }

    public String getImg2() {
        return img2;
    }
}
