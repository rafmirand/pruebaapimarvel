package mx.com.marvel.common.model;

import java.util.ArrayList;

public class Series{
    int available;
    String collectionURI;
    ArrayList<Item> items;
    int returned;
	/**
	 * @return the available
	 */
	public int getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(int available) {
		this.available = available;
	}
	/**
	 * @return the collectionURI
	 */
	public String getCollectionURI() {
		return collectionURI;
	}
	/**
	 * @param collectionURI the collectionURI to set
	 */
	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}
	/**
	 * @return the items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	/**
	 * @return the returned
	 */
	public int getReturned() {
		return returned;
	}
	/**
	 * @param returned the returned to set
	 */
	public void setReturned(int returned) {
		this.returned = returned;
	}
    
}