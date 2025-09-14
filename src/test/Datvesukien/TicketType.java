package test.Datvesukien;

public enum TicketType {
    STANDARD(1.0, "Vé tiêu chuẩn"),
    VIP(1.5, "Vé VIP"),
    PREMIUM(2.0, "Vé cao cấp");

    private final double priceMultiplier;
    private final String description;

    TicketType(double priceMultiplier, String description) {
        this.priceMultiplier = priceMultiplier;
        this.description = description;
    }
    public double getPrice(double basePrice) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("basePrice cannot be negative");
        }
        return basePrice * priceMultiplier;
    }
    public String getDescription() {
        return description;
    }
}
