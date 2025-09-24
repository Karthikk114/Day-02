
import Service.ServiceImpl;
import java.util.Scanner;

import Model.Students;
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ServiceImpl service=new ServiceImpl();
        // Students students=new Students();
        int type=1;
        System.out.print("Welcome to Student portal.\n");
        while(type==1){
            System.out.print(
                " 1.Add Student Details. \n 2. View All students. \n 3.Update Student Details . \n 4.Delete the Students Details.\n 5. Stop. \n"
            );
            int operation=sc.nextInt();
            sc.nextLine();
            switch(operation){
                case 1:
                System.out.println("enter the details formate id name marks");
                    String [] parts=sc.nextLine().split("\\s+");
                    int id=Integer.parseInt(parts[0]);
                    String name=parts[1];
                    double marks=Double.parseDouble(parts[2]);
                    System.out.println(service.add( new Students(id,name,marks)));
                    break;
                case 2:
                    service.view();
                    break;
                case 3:
                    
                    System.out.println("enter the id which u need update :");
                    int Id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the updated details formate id name marks");
                    String [] upparts=sc.nextLine().split("\\s+");//up= update parts=parts
                    int upid=Integer.parseInt(upparts[0]);
                    String upname=upparts[1];
                    double upmarks=Double.parseDouble(upparts[2]);
                    System.out.println(service.update(Id, new Students(upid,upname,upmarks)));
                    break;
                case 4:
                    System.out.println("enter the id which u need to delete :");
                    int delId=sc.nextInt();
                    System.out.println(service.delete(delId));
                    break;
                case 5:
                    type=-1;
                    System.err.println("Thank You !");
                    break;
                default :
                    System.out.println("enter the id of the operation present above");
                    break;
            }
        }

    }

    
}
