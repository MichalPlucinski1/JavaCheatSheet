package OOP.POJOandRecord;

public class POJO {
    //plain old java objects

    //used to house data and pass between functional classes.

    //mostly getters and setters

    //usage with databases, files or streams

    //may be called JavaBean/Bean

    //also entity

    //data transfer object


    public class Student{
        private String id;
        private String name;
        private String classList;
    }

    public static void main(String[] args) {
        LPAStudent recordStudent = new LPAStudent("111333", "Michael", "Java");
        System.out.println(recordStudent);
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
