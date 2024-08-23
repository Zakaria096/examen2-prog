import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName;
    private List<HotelCoo> hotelCoo;
    private List<Avis> avisList ;
    private List <ChamberList> chamberList;
    private double longitudeMax;
    private double latitudeMax;
    private List<String> inside;


    public Hotel(String hotelName, List<HotelCoo> hotelCoo, List<Avis> avisList, List<ChamberList> chamberList) {
        this.hotelName = hotelName;
        this.hotelCoo = hotelCoo;
        this.avisList = avisList;
        this.chamberList = chamberList;

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<HotelCoo> getHotelCoo() {
        return hotelCoo;
    }

    public void setHotelCoo(List<HotelCoo> hotelCoo) {
        this.hotelCoo = hotelCoo;
    }

    public List<Avis> getAvisList() {
        return avisList;
    }

    public void setAvisList(List<Avis> avisList) {
        this.avisList = avisList;
    }

    public List<ChamberList> getChamberList() {
        return chamberList;
    }

    public void setChamberList(List<ChamberList> chamberList) {
        this.chamberList = chamberList;
    }

    public void main(String[] args) {

        public void addReview(avisList Avis){
            this.avisList.add(Avis);
        }
        public void getAllReview(){
            System.out.println(avisList);
        }
        public void findBestHotel(){
            if
        }
        public void getAllPlaceInside{
            if(HotelCoo.longitude < longitudeMax || HotelCoo.latitude< latitudeMax){
                inside.add(hotelName);
            }
        }
    }
}
