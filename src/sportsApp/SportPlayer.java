package sportsApp;

public class SportPlayer {
    private String name;
    private String sportName;
    private String currentStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "SportPlayer{" +
                "name='" + name + '\'' +
                ", sportName='" + sportName + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}
