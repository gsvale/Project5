package com.example.project5.objects;

/**
 * The type Location.
 */
public class Location {

    private String name;
    private String openingTime;
    private int imageResourceId = -1;

    /**
     * Instantiates a new Location.
     *
     * @param name        the name
     * @param openingTime the opening time
     */
    public Location(String name, String openingTime) {
        this.name = name;
        this.openingTime = openingTime;
    }

    /**
     * Instantiates a new Location.
     *
     * @param name            the name
     * @param openingTime     the opening time
     * @param imageResourceId the image resource id
     */
    public Location(String name, String openingTime, int imageResourceId) {
        this.name = name;
        this.openingTime = openingTime;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets opening time.
     *
     * @return the opening time
     */
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * Gets image resource id.
     *
     * @return the image resource id
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Has image boolean.
     *
     * @return the boolean
     */
    public boolean hasImage(){
        return imageResourceId != -1;
    }

}
