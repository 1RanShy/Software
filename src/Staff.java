public class Staff {
    private String staffID;
    private String staffName;
    private String email;
    // private Date birthday;

    //Constructor
    public Staff(String staffID, String staffName, String email) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.email = email;
    }


    public void setter_staffID(String staffID) {
        this.staffID = staffID;
    }

    public String getter_staffID() {
        return this.staffID;
    }

    public void setter_staffName(String staffName) {
        this.staffName = staffName;
    }

    public String getter_staffName() {
        return this.staffName;
    }

    public void setter_email(String email) {
        this.email = email;
    }

    public String getter_email() {
        return this.email;
    }
}
