public class Main {
    public static void main(String[] args) {
        Organizer organizer = new Organizer("Nursultan", "nursultan@agmail.com");

        Participant participant1 = new Participant("Erzhan", "erzhan@gmail.com");
        Participant participant2 = new Participant("Marat", "marat@gmail.com");

        Event event = organizer.createEvent("Tech Conference", "2024-05-15", "A conference on the latest in technology.");

        event.addParticipant(participant1);
        event.addParticipant(participant2);

        System.out.println(event);

        System.out.println("Are the participants the same? " + participant1.equals(participant2));
    }
}