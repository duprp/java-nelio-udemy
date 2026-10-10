package entities;

import java.util.Objects;

public class course {
   private Integer codCourse;
   private Integer codStudent;

    public course(Integer codCourse, Integer codStudent) {
        this.codCourse = codCourse;
        this.codStudent = codStudent;
    }

    public Integer getCodCourse() {
        return codCourse;
    }

    public void setCodCourse(Integer codCourse) {
        this.codCourse = codCourse;
    }

    public Integer getCodStudent() {
        return codStudent;
    }

    public void setCodStudent(Integer codStudent) {
        this.codStudent = codStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        course course = (course) o;
        return Objects.equals(codStudent, course.codStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codStudent);
    }
}
