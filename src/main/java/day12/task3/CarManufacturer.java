package day12.Task3;

public class CarManufacturer {
    private String brandName;
    private int estabilishYear;

    public CarManufacturer(String brandName, int estabilishYear) {
        this.brandName = brandName;
        this.estabilishYear = estabilishYear;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setEstabilishYear(int estabilishYear) {
        this.estabilishYear = estabilishYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getEstabilishYear() {
        return estabilishYear;
    }

    @Override
    public String toString() {
        return "CarManufacturer{" +
                "brandName='" + brandName + '\'' +
                ", estabilishYear=" + estabilishYear +
                '}';
    }
}
