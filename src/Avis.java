import java.sql.Time;
import java.util.Date;

public class Avis  {
    private String avis;
    private double note;
    private Date date;
    private String critiquerMail;

    public Avis(String avis, double note, Date date, String critiquerMail) {
        this.avis = avis;
        this.note = note;
        this.date = date;
        this.critiquerMail = critiquerMail;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCritiquerMail() {
        return critiquerMail;
    }

    public void setCritiquerMail(String critiquerMail) {
        this.critiquerMail = critiquerMail;
    }
}
