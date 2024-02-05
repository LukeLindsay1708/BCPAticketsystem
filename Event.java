import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventName;
    private String eventDate;
    private String eventLocation;

    private static List<Event> allEvents;

  
    static {
        allEvents = new ArrayList<>();
        allEvents.add(new Event("Dance", "15-05-2024", "Bucks SU"));
        allEvents.add(new Event("Theatre", "01-08-2024", "Bucks SU"));
        allEvents.add(new Event("Cheer", "03-01-2025", "High Wycombe Hall"));
    }

    public Event(String name, String date, String location) {
        this.eventName = name;
        this.eventDate = date;
        this.eventLocation = location;
    }

    
    public Event() {

        this.eventName = "Default Event";
        this.eventDate = "01-01-2023";
        this.eventLocation = "Default Location";
    }

    public String getEventName() {
        return eventName;
    }


    public void displayEventDetails() {
        System.out.println("Event Name: " + this.eventName);
        System.out.println("Event Date: " + this.eventDate);
        System.out.println("Event Location: " + this.eventLocation);
        System.out.println();
    }

    public static void displayAllEvents() {
        System.out.println("All Events:");
        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println((i + 1) + ". " + allEvents.get(i).getEventName());
        }
    }

    public static Event getEventByNumber(int number) {
        if (number >= 1 && number <= allEvents.size()) {
            return allEvents.get(number - 1);
        }
        return null;
    }
}
