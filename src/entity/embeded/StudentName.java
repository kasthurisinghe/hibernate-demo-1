package entity.embeded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable  // because of composite column
public class StudentName {
    @Column(name ="First_Name",nullable = false, length =100)
    private String firstName;
    @Column(name ="Last_Name",nullable = false, length =100)
    private String lastName;
}
