package test.Datvesukien;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public abstract class AbstractEvent implements Event {
    private String name;
    private LocalDateTime dateEvent;
    private double basePrice;

    public AbstractEvent(String name, LocalDateTime dateEvent, double basePrice) {
        this.name = name;
        this.dateEvent = dateEvent;
        this.basePrice = basePrice;
    }
    public String getName() {return name;}

    public LocalDateTime getEventDate() {return dateEvent;}

    public double getBasePrice() {return basePrice;}

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }
    public void setEventDate(LocalDateTime dateEvent) {
        if (dateEvent == null){
            throw new IllegalArgumentException("Date cannot be null");
        }
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0){
            throw new IllegalArgumentException("Base price cannot be negative");
        }
        this.basePrice = basePrice;}

    @Override
    public boolean isUpcomming() {
        return dateEvent.isAfter(LocalDateTime.now());
    }

    public abstract void getEventType();
}
