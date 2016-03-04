package serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;

import com.alibaba.fastjson.JSON;

public class TestObjSerializeAndDeserialize {

	public static void main(String[] args) {
		try {
			SerializePerson();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//序列化Person对象
		Person p = null;
		try {
			p = DeserializePerson();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//反序列Perons对象
		if(p != null){
			System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
					p.getName(), p.getAge(), p.getSex()));
			System.out.println(JSON.toJSON(p));
		}
	}

	
	/**
	 * MethodName: SerializePerson 
     * Description: 序列化Person对象
     * @author xudp
     * @throws FileNotFoundException
     * @throws IOException
     */
	private static void SerializePerson() throws FileNotFoundException, IOException {
		Person person = new Person();
        person.setName("gacl");
        person.setAge(25);
        person.setSex("男");
        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                 new File("/Users/liujun-elm/Downloads/abcd/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }
	 
	     /**
	      * MethodName: DeserializePerson 
	      * Description: 反序列Perons对象
	      * @author xudp
	      * @return
	      * @throws Exception
	      * @throws IOException
	      */
	     private static Person DeserializePerson() throws Exception, IOException {
	         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
	                 new File("/Users/liujun-elm/Downloads/abcd/Person.txt")));
	         Person person = (Person) ois.readObject();
	         System.out.println("Person对象反序列化成功！");
	         return person;
	     }
}
