import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository repo = new StudentRepository();

        // =====================================================
        // student save
        // =====================================================
        // normal attribute;
        /* 
        StudentEntity entity = new StudentEntity();
        entity.setNic("5689555656v");

        // composite attribute;
        StudentName studentName = new StudentName("stu 3", "stu_last 3");
        entity.setName(studentName);

        // multivalued attribute;
        List<String> mobiles = new ArrayList<>();
        mobiles.add("0745412590");
        mobiles.add("0224156139");
        entity.setMobiles(mobiles);

        repo.saveStudent(entity);
        */

        // =====================================================
        // student get
        // =====================================================
        StudentEntity studentEntity=repo.getStudent(4);
        System.out.println(studentEntity.toString());

        studentEntity.setNic("0000000v");
        studentEntity.getName().setFirstName("sara");

        repo.updateStudent(studentEntity);

        studentEntity=repo.getStudent(4);
        System.out.println(studentEntity.toString());

        repo.deleteStudent(studentEntity);
    }
}
