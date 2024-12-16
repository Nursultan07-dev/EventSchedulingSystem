public class Organizer {
    private String name;
    private String contact;

    public Organizer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Event createEvent(String eventName, String date, String description) {
        return new Event(eventName, date, description);
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}