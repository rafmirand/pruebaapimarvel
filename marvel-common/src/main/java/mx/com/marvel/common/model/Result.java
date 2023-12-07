package mx.com.marvel.common.model;

import java.util.ArrayList;
import java.util.Date;

public class Result{
    int id;
    String name;
    String description;
    Date modified;
    Thumbnail thumbnail;
    String resourceURI;
    Comics comics;
    Series series;
    Stories stories;
    Events events;
    ArrayList<Url> urls;
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
	 * @return the modified
	 */
	public Date getModified() {
		return modified;
	}
	/**
	 * @param modified the modified to set
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}
	/**
	 * @return the thumbnail
	 */
	public Thumbnail getThumbnail() {
		return thumbnail;
	}
	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
	/**
	 * @return the resourceURI
	 */
	public String getResourceURI() {
		return resourceURI;
	}
	/**
	 * @param resourceURI the resourceURI to set
	 */
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
	/**
	 * @return the comics
	 */
	public Comics getComics() {
		return comics;
	}
	/**
	 * @param comics the comics to set
	 */
	public void setComics(Comics comics) {
		this.comics = comics;
	}
	/**
	 * @return the series
	 */
	public Series getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(Series series) {
		this.series = series;
	}
	/**
	 * @return the stories
	 */
	public Stories getStories() {
		return stories;
	}
	/**
	 * @param stories the stories to set
	 */
	public void setStories(Stories stories) {
		this.stories = stories;
	}
	/**
	 * @return the events
	 */
	public Events getEvents() {
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(Events events) {
		this.events = events;
	}
	/**
	 * @return the urls
	 */
	public ArrayList<Url> getUrls() {
		return urls;
	}
	/**
	 * @param urls the urls to set
	 */
	public void setUrls(ArrayList<Url> urls) {
		this.urls = urls;
	}
    
}