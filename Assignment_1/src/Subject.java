
public class Subject {
	private String name;
	private String tutor;
	private String room;
	
	public Subject(String _name, String _tutor, String _room) {
		name = _name;
		tutor = _tutor;
		room = _room;
	}
	
	public Subject(String _name) {
		name = _name;
		tutor = "null";
		room = "null";
	}
	
	public Subject(Subject S) {
		name = S.name;
		tutor = S.tutor;
		room = S.room;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getTutor() {
		return tutor;
	}
	
	public String getRoom() {
		return room;
	}
	
	public void setTutor(String s) {
		tutor = s;
	}
	
	public void setRoom(String s) {
		room = s;
	}
	
	
	public boolean equals(Subject s) {
		return name.equals(s.getName());
	}
	
	public String toString() {
		return name;
	}
	
	public String getDetails() {
		return "Name : "+name+"\nTutor : "+tutor+"\nRoom : "+room;
	}
	
}
