import java.util.Date;

public class LogEntry {


    Date createdAT;

    Date updatedAT;

    String message;

    public LogEntry(String message) {
        this.message = message;

        createdAT = new Date ();
        updatedAT = new Date ();
    }

    public LogEntry(Date createdAT) {
        this.createdAT = createdAT;
    }

}


