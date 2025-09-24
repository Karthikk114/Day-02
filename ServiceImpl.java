package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Model.Students;

public class ServiceImpl implements Service {
    List<Students> studentList=new ArrayList<>();

    @Override
    public String add(Students students) {
        studentList.add(students);
        return "Added Successfully ";
    }

    @Override
    public void  view() {
        System.out.println("id "+" | " +"Name"+" | "+" Marks");
        for(Students list:studentList){
            System.err.println(list.getId()+" "+list.getName()+" "+list.getMarks());
        }
    }

    @Override
    public String update(int id, Students student) {
        // // Optional<Students> studentopt=studentList.stream().filter(s->s.getid()==id).findAny();
        // // if(studentopt.isPresent()){
            
        // }
        for(Students std:studentList){
            if(std.getId()==id){
                std.setId(student.getId());
                std.setName(student.getName());
                std.setMarks(student.getMarks());
                return "Updated Successfully";
            }
        }
        return "Student not found";
    }

    @Override
    public String delete(int id) {
        for (Students std : studentList) {
            if (std.getId() == id) {
                studentList.remove(std);
                return "Deleted Successfully";
            }
        }
        return "Student not found";
    }

}
