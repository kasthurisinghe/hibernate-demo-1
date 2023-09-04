import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository repo=new StudentRepository();
        StudentEntity entity=new StudentEntity();
        entity.setNic("9216115356v");
        StudentName studentName=new StudentName("stu 1", "stu_last 1");
        entity.setName(studentName);
        List <String> mobiles=new ArrayList<>();
        mobiles.add("0767295590");
        mobiles.add("0766617139");
        entity.setMobiles(mobiles);

        repo.saveStudent(entity);
    }
}
