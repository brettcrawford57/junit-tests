import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class StudentTest {

    @Test

    public void checkStudentCreation(){
        Student meStudent = new Student(1, "Brett");
        Student nStudent = null;
        assertNotNull(meStudent);
        assertNull(nStudent);

    }

    @Test

    public void fieldSet(){

    }

}
