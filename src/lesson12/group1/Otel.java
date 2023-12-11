package src.lesson12.group1;

public class Otel {

    private int otaqSayi;
    private int mertebeSayi;
    private String name;

    public Otel() {
    }

    public Otel(int otaqSayi, int mertebeSayi, String name) {
        this.otaqSayi = otaqSayi;
        this.mertebeSayi = mertebeSayi;
        this.name = name;
    }

    public int getOtaqSayi() {
        return otaqSayi;
    }

    public void setOtaqSayi(int otaqSayi) {
        this.otaqSayi = otaqSayi;
    }

    public int getMertebeSayi() {
        return mertebeSayi;
    }

    public void setMertebeSayi(int mertebeSayi) {
        this.mertebeSayi = mertebeSayi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
