
package contactmanager;



public class Contact {
    private int  id ;
    private String name ;
    private String firstName ;
    private String lastName ;
    private String group ;
    private String address;
    private String phone ;

    public Contact() {
    }

    public Contact(int id, String name, String firstName, String lastName, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-5s%-17s%-17s%-17s%-17s%-17s%-17s\n", id, name,
                firstName, lastName,group, address, phone);
    }
    

    
    
}
