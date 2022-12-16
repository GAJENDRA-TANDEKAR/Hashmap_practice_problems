package AppSprots;

public class Players {

    String name;
    String sportname;
    String status;

    public Players(String name, String sportname, String status) {
        this.name = name;
        this.sportname = sportname;
        this.status = status;
    }

    public Players() {

    }




    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", sportname='" + sportname + '\'' +
                ", currentstatus='" + status + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSportname() {
        return sportname;
    }

    public void setSportname(String sportname) {
        this.sportname = sportname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
