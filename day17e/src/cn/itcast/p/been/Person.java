package cn.itcast.p.been;

public class Person implements Comparable {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return age + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			throw new ClassCastException("���ʹ���");

		Person p = (Person) obj;

		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.name.compareTo(p.name);
	}
}
