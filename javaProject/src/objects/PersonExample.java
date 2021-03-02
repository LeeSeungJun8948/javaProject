package objects;

public class PersonExample {
	public static void main(String[] args) {
		new Person();
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 190.5, 76.5);
		persons[1] = new Person("김길동", 21, 171.5, 74.5);
		persons[2] = new Person("이길동", 23, 181.5, 73.5);
		persons[3] = new Person("박길동", 18, 182.5, 78.5);
		persons[4] = new Person("최길동", 19, 176.5, 72.5);
		for(Person person : persons) {
			if (person.age > 20 && person.height > 180.0) {
				person.introduce();	
			}
		}
	}
}
