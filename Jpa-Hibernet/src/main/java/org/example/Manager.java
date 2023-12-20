package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.example.entity.Person;
import org.example.entity.PersonEmbedd;
import org.example.entity.Student;
import org.example.entity.StudentEmbedd;
import org.example.util.Utility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Manager
{
    public static void main(String[] args)
    {

        Session session = Utility.getSession();
        Transaction tx=session.beginTransaction();
        Person p1=new Person();
        p1.setId(3);
        p1.setAge("23");
        p1.setName("abc");
        session.save(p1);

//        Student s = session.get(Student.class,1);
//        s.setStudentNameLastName("Accolite");
//        session.update(s);


        StudentEmbedd stu = new StudentEmbedd(2,"Student-1", new PersonEmbedd("person-name", "person1@gmail.com"));
        session.save(stu);

//        getById(2);

//        List<Student> studentList = getAllStudent();
//        studentList.forEach(System.out::println);


//        Student s1 = new Student(1,"Student", "One", 23);
//        session.save(s1);
        tx.commit();
        session.flush();
        session.close();
        System.out.println("done");
    }




    public static void getById(int i){
        Session session = Utility.getSession();
        Student s = session.get(Student.class,i);
        System.out.println(s);
        session.flush();
        session.close();

    }

    public static List<Student> getAllStudent(){
        Session session = Utility.getSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
        query.from(Student.class);
        List<Student> studentList = session.createQuery(query).getResultList();
        session.flush();
        session.close();
        return studentList;
    }
}