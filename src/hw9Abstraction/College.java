package hw9Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void langageClub();

	public default int dorm() {
		return 0;
	}

	public static String studyRoom() {
		return null;
	}

}
