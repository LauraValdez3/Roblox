/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.roblox.entities;

/**
 *
 * @author laura
 */
public class Movie {
    
    private int id;
    private String name;
    private String description;
    private int duration;
    private String classification;
    private String actors;
    private String language;

    public Movie(int id, String name, String description, int duration, String classification, String actors, String language) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.classification = classification;
        this.actors = actors;
        this.language = language;
    }

    public Movie() {
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * @return the actors
     */
    public String getActors() {
        return actors;
    }

    /**
     * @param actors the actors to set
     */
    public void setActors(String actors) {
        this.actors = actors;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    
    
    
    
}
