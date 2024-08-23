public class ChamberList {
    private double number;
    private double chamberPrice;

    public ChamberList(double number, double chamberPrice) {
        this.number = number;
        this.chamberPrice = chamberPrice;

    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getChamberPrice() {
        return chamberPrice;
    }

    public void setChamberPrice(double chamberPrice) {
        this.chamberPrice = chamberPrice;
    }
}
