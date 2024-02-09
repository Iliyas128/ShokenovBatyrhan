package Models;

public class Car {
    private int id;

    private int year;

    private String brand;

    private String quality;

    private boolean roadAccident;

    private Shop shop;



    public Car(){

    }

    public Car(int id, int year, String brand, String quality,boolean roadAccident,Shop shop){

        this.id = id;
        this.year = year;
        this.brand = brand;
        this.quality = quality;
        this.roadAccident=roadAccident;
        this.shop=shop;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public boolean isRoadAccident() {
        return roadAccident;
    }

    public void setRoadAccident(boolean roadAccident) {
        this.roadAccident = roadAccident;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString(){
        return "Car{" + "id = " +id+" , year = "+" , brand = "+ brand + " , quality = "+quality+",roadAccident " + roadAccident + ", shop" + shop + '}';
    }
    }

