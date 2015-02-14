package cn.itcast.p.bean;


public class Person {
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
		
	} 
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
		
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
}