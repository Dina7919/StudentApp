package Services;

import java.util.List;

import Domen.Emploee;
import Domen.Student;
import Domen.Teacher;

public interface iPersonService<T> {
    List<Emploee> getAll();
    void create(String firstName, int age); 
}