package com.externalization;

import java.io.*;
//basically the main difference is that here i dont want to use transient keyword for unless
//as i can do simply manually control it inside the methods which provides manual implementation
class Student implements Externalizable {

	private static final long serialVersionUID=1L; //we can provide here also consider as best practice.
	private int id;
	private String name;
	private String password;
	
	public Student() {
		System.out.println("Default constructor called");
	}

	public Student(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeUTF(name);
		out.writeUTF(password);
		}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = in.readUTF();
		//password = in.readUTF(); //here i comment out this so it gives null value when deserialised
		//in normal serialization we have to use transient and static keyword for this.
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "', password='" + password + "'}";
	}
}
public class ExternalisationDemo {
    public static void main(String[] args) {
        String filename = "student.ser";

        Student student1 = new Student(101, "Alice", "secret123");

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student1);
            System.out.println("Object has been serialized: " + student1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student student2 = (Student) ois.readObject();
            System.out.println("Object has been deserialized: " + student2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
