package hw10Abstraction;

public interface University extends College, Hospital {
	// Interface can't have constructor
	/*
	 * public University() {
	 * 
	 * }
	 */

	public void classSize();

	public abstract void playGround();

	public abstract void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}
	/*
	 * Extends keyword is used for the inheritance in Interface. 
	 * Interface can inherit other Interface by extends key word. 
	 * Interface can't inherit regular class by extends key word. 
	 * Interface can't inherit abstract class by extends key word. 
	 * Interface can inherit multiple Interfaces by extends key word.
	 */

}
