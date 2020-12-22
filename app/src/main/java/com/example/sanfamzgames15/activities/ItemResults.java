package com.example.sanfamzgames15.activities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemResults {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("genres")
    private List<Object> genres;

    @SerializedName("saturated_color")
    private String saturatedColor;


    @SerializedName("added_by_status")
    private AddedByStatus addedByStatus;

    @SerializedName("parent_platforms")
    private List<Object> parentPlatforms;

    @SerializedName("ratings_count")
    private int ratingsCount;

    @SerializedName("slug")
    private String slug;

    @SerializedName("released")
    private String released;

    @SerializedName("suggestions_count")
    private int suggestionsCount;

    @SerializedName("stores")
    private List<Object> stores;

    @SerializedName("tags")
    private List<Object> tags;

    @SerializedName("background_image")
    private String backgroundImage;

    @SerializedName("tba")
    private boolean tba;

    @SerializedName("dominant_color")
    private String dominantColor;


    @SerializedName("clip")
    private Clip clip;

    @SerializedName("reviews_count")
    private int reviewsCount;

    @SerializedName("added")
    private int added;

    @SerializedName("rating")
    private double rating;

    @SerializedName("metacritic")
    private int metacritic;

    @SerializedName("playtime")
    private int playtime;

    @SerializedName("short_screenshots")
    private List<Object> shortScreenshots;

    @SerializedName("platforms")
    private List<Object> platforms;

    @SerializedName("user_game")
    private Object userGame;

    @SerializedName("rating_top")
    private int ratingTop;

    @SerializedName("reviews_text_count")
    private int reviewsTextCount;

    @SerializedName("ratings")
    private List<Object> ratings;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public List<Object> getGenres(){
        return genres;
    }
    public void setGenres(List<Object> genres){
        this.genres = genres;
    }

    public String getSaturatedColor(){
        return saturatedColor;
    }
    public void setSaturatedColor(String saturatedColor){
        this.saturatedColor = saturatedColor;
    }

    public AddedByStatus getAddedByStatus(){
        return addedByStatus;
    }
    public void setAddedByStatus(AddedByStatus addedByStatus){
        this.addedByStatus = addedByStatus;
    }

    public List<Object> getParentPlatforms(){
        return parentPlatforms;
    }
    public void setParentPlatforms(List<Object> parentPlatforms){
        this.parentPlatforms = parentPlatforms;
    }

    public int getRatingsCount(){
        return ratingsCount;
    }
    public void setRatingsCount(int ratingsCount){
        this.ratingsCount = ratingsCount;
    }


    public void setSlug(String slug){
        this.slug = slug;
    }
    public String getSlug(){
        return slug;
    }

    public void setReleased(String released){
        this.released = released;
    }
    public String getReleased(){
        return released;
    }

    public void setSuggestionsCount(int suggestionsCount){
        this.suggestionsCount = suggestionsCount;
    }
    public int getSuggestionsCount(){
        return suggestionsCount;
    }

    public void setStores(List<Object> stores){
        this.stores = stores;
    }
    public List<Object> getStores(){
        return stores;
    }

    public void setTags(List<Object> tags){
        this.tags = tags;
    }
    public List<Object> getTags(){
        return tags;
    }

    public void setBackgroundImage(String backgroundImage){
        this.backgroundImage = backgroundImage;
    }
    public String getBackgroundImage(){
        return backgroundImage;
    }

    public void setTba(boolean tba){
        this.tba = tba;
    }
    public boolean isTba(){
        return tba;
    }

    public void setDominantColor(String dominantColor){
        this.dominantColor = dominantColor;
    }
    public String getDominantColor(){
        return dominantColor;
    }

    public void setClip(Clip clip){
        this.clip = clip;
    }

    public Clip getClip(){
        return clip;
    }
    public void setReviewsCount(int reviewsCount){
        this.reviewsCount = reviewsCount;
    }

    public int getReviewsCount(){
        return reviewsCount;
    }

    public int getAdded(){
        return added;
    }
    public void setAdded(int added){
        this.added = added;
    }

    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public int getMetacritic(){
        return metacritic;
    }
    public void setMetacritic(int metacritic){
        this.metacritic = metacritic;
    }


    public int getPlaytime()
    {
        return playtime;
    }
    public void setPlaytime(int playtime)
    {
        this.playtime = playtime;
    }

    public List<Object> getShortScreenshots()
    {
        return shortScreenshots;
    }
    public void setShortScreenshots(List<Object> shortScreenshots){
        this.shortScreenshots = shortScreenshots;
    }

    public List<Object> getPlatforms(){
        return platforms;
    }
    public void setPlatforms(List<Object> platforms){
        this.platforms = platforms;
    }

    public Object getUserGame(){
        return userGame;
    }
    public void setUserGame(Object userGame){
        this.userGame = userGame;
    }

    public int getRatingTop(){
        return ratingTop;
    }
    public void setRatingTop(int ratingTop){
        this.ratingTop = ratingTop;
    }

    public int getReviewsTextCount(){
        return reviewsTextCount;
    }
    public void setReviewsTextCount(int reviewsTextCount){
        this.reviewsTextCount = reviewsTextCount;
    }

    public List<Object> getRatings(){
        return ratings;
    }
    public void setRatings(List<Object> ratings){
        this.ratings = ratings;
    }

    @Override
    public String toString(){
        return
                "ItemResults{" +
                        ",id = '" + id + '\'' +
                        ",name = '" + name + '\'' +
                        ",genres = '" + genres + '\'' +
                        ",saturated_color = '" + saturatedColor + '\'' +
                        ",added_by_status = '" + addedByStatus + '\'' +
                        ",parent_platforms = '" + parentPlatforms + '\'' +
                        ",ratings_count = '" + ratingsCount + '\'' +
                        ",slug = '" + slug + '\'' +
                        ",released = '" + released + '\'' +
                        ",suggestions_count = '" + suggestionsCount + '\'' +
                        ",stores = '" + stores + '\'' +
                        ",tags = '" + tags + '\'' +
                        ",background_image = '" + backgroundImage + '\'' +
                        ",tba = '" + tba + '\'' +
                        ",dominant_color = '" + dominantColor + '\'' +
                        ",clip = '" + clip + '\'' +
                        ",reviews_count = '" + reviewsCount + '\'' +
                        ",added = '" + added + '\'' +
                        ",rating = '" + rating + '\'' +
                        ",metacritic = '" + metacritic + '\'' +
                        ",playtime = '" + playtime + '\'' +
                        ",short_screenshots = '" + shortScreenshots + '\'' +
                        ",platforms = '" + platforms + '\'' +
                        ",user_game = '" + userGame + '\'' +
                        ",rating_top = '" + ratingTop + '\'' +
                        ",reviews_text_count = '" + reviewsTextCount + '\'' +
                        ",ratings = '" + ratings + '\'' +
                        "}";
    }
}
