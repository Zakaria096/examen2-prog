import java.util.List;

public class NaturalPark {
    private String parkName;
    private List<String> hotelNear ;
    private List<Avis> avisList;

    public NaturalPark(String parkName, List<String> hotelNear, List<Avis> avis) {
        this.parkName = parkName;
        this.hotelNear = hotelNear;
        avisList = avis;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public List<String> getHotelNear() {
        return hotelNear;
    }

    public void setHotelNear(List<String> hotelNear) {
        this.hotelNear = hotelNear;
    }

    public List<Avis> getAvis() {
        return avisList;
    }

    public void setAvis(List<Avis> avis) {
        avisList = avis;
    }


}
