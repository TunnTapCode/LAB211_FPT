
package doctormanager;


public class Doctor {
    private String name ;
    private String code ;
    private String Specialization ;
    private int Availability ;

    public Doctor() {
    }

    public Doctor(String code, String name, String Specialization, int Availability) {
        this.name = name;
        this.code = code;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-15s%-25s%-20d",code,name,Specialization,Availability);
    }
    

 
    
}
