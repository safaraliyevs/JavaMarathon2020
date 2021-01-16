package day12.Task4;

import java.util.List;

public class CarManufacturer2 {
    private String brandName;
    private int estabilishYear;
    private List<String> rallyParticipants;

    public List<String> getRallyMembers() {
        return rallyParticipants;
    }

    public void setRallyMembers(List<String> rallyParticipants) {
        this.rallyParticipants = rallyParticipants;
    }

    public CarManufacturer2(String brandName, int estabilishYear, List<String> rallyMembers) {
        this.brandName = brandName;
        this.estabilishYear = estabilishYear;
        this.rallyParticipants = rallyMembers;
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

    public static void transferPartcipants (CarManufacturer2 a, CarManufacturer2 b) {
        for (String participant : a.getRallyMembers())
            b.getRallyMembers().add(participant);

        a.getRallyMembers().clear();
    }
    /** public void transfer(CarManufacturer2 b) {
        for (String participant : this.rallyParticipant)
            b.getRallyParticipants().add(participant);

        this.rallyParticipants.clear();
    } **/

    public void printParticipants () {
        System.out.println(this.rallyParticipants);
    }

    @Override
    public String toString() {
        return "CarManufacturer2{" +
                "brandName='" + brandName + '\'' +
                ", estabilishYear=" + estabilishYear +
                ", rallyParticipants=" + rallyParticipants +
                '}';
    }
}
