import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organizer organizer = (Organizer) o;
        return Objects.equals(name, organizer.name) && Objects.equals(contact, organizer.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contact);
    }
}