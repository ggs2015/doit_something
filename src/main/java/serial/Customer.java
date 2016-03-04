package serial;

import java.io.Serializable;

public class Customer implements Serializable {

	private String name;
	private Integer age;
	private String sex;
	private String test;
	
	public Customer(String name, Integer age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
