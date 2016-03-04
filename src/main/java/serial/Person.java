package serial;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -5318741826690505232L;
	
	private Integer age;
	private String name;
	private String sex;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
