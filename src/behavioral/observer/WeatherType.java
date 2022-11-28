package behavioral.observer;

public enum WeatherType {

    SUNNY("sunny"),
    CLOUDY("cloudy");

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
