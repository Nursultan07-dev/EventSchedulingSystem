import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventName;
    private String date;
    private String description;
    private List<Participant> participants;

    public Event(String eventName, String date, String description) {
        this.eventName = eventName;
        this.date = date;
        this.description = description;
        this.participants = new ArrayList<>();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", participants=" + participants +
                '}';
    }
}
