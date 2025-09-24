package Service;

import Model.Students;

public interface Service {
    public String add(Students student);
    public void  view();
    public String update(int Id, Students students);
    public String delete(int id);

}
