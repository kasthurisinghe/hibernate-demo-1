package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

    @Id // this id the key attribute name of the key attribute of hibernate is 'Id'
    @Column(name = "ID") // name of the column of the table "student"
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to auto-generate the vale of "ID"
    private Integer id;

    @Column(name = "NIC", nullable = false) // cannot be null( NOTNULL in mysql)
    private String nic;
}
