package day6;

public class Lamp2 {
	private Boolean status = false;
	
	public Boolean getStatus() {
		return status;
	}
	
	public void switchStatus() {
		status = !status;
	}
}
