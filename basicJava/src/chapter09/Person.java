package chapter09;

public class Person {

	// 필드
	private long id;
	
	// 생성자
	public Person(long id) {
		this.id = id;
	}
	
	// 메서드
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return this.id == ((Person)obj).getId();
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Person: " + this.id;
	}
	
	//// getter, setter
	public long getId() {
		return this.id;
	}
	
}





