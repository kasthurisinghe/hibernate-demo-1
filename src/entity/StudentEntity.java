package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import entity.embeded.StudentName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // entity of the "Student" table
@Table(name = "Student") // name of the table

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// lombok is for the above method generations

public class StudentEntity {
    // ID attribute;
    @Id // this id the key attribute name of the key attribute of hibernate is 'Id'
    @Column(name = "ID") // name of the column of the table "student"
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to auto-generate the vale of "ID"
    private Integer id;

    // attribute | derived attribute;
    @Column(name = "NIC", nullable = false) // cannot be null( NOTNULL in mysql)
    private String nic;

    private StudentName name;
    @ElementCollection
    @CollectionTable(
        name="student_Mobile",
        joinColumns = @JoinColumn(name="Student_ID")
    )
    private List<String>mobiles;

    @CreationTimestamp
    @Column(name = "Create_date",nullable = false)
    private Date createDate;
}
