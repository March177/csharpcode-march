/package grades;

import java.util.*;

class Grades {

    private String id;
    private String Fname;
    private String Lname;
    private double Average;
    private String Status = "--------";
    private int num;

    public Grades(String id, String fname, String lname) {

        this.id = id;
        this.Fname = fname;
        this.Lname = lname;
  
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    void display() {

        System.out.format("|%-7s |%-10s |%-10s |%-8s|%-8s|%n", getId(), getFname(), getLname(), getAverage(), getStatus());

    }
    

}

public class Gradeapp {

    void display(int i, Grades[] gr) {

        System.out.println();
        String centerAlignFormat = "|%-7s |%-10s |%-10s |%-8s|%n";
        System.out.format("___________________________________________________%n");
        System.out.format("| STUDENT LIST                                     |%n");
        System.out.format("---------------------------------------------------%n");
        System.out.format("|ID      |First Name |Last Name  |Average |Status |%n");
        System.out.format("|________|___________|___________|________|________|%n");

        for (int x = 0; x < i; x++) {

            gr[x].display();
        }
        System.out.format("|________|___________|___________|________|________|%n");

    }

    public static void main(String[] args) {

        Grades[] gr = new Grades[100];
        Gradeapp grapp = new Gradeapp();
        Scanner sc = new Scanner(System.in);
       
     
        
        System.out.println("Welcome To Class App!!!");
        System.out.println();

        System.out.println("Enter number of Student: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Student " + (i + 1) + " Details ");

            System.out.print("Enter ID: ");
            String id = sc.next();

            System.out.print("Enter First Name: ");
            String fname = sc.next();

            System.out.print("Enter Last Name : ");
            String lname = sc.next();

            System.out.println();
            gr[i] = new Grades(id, fname, lname);
            gr[i].setId(id);
            gr[i].setFname(fname);
            gr[i].setLname(lname);

        }

        System.out.println("ADDEDD!!");  

        int choice,n = 0,p = 0,a = 0;
        char ans;

        do {
           
            grapp.display(num, gr);
             System.out.println();
            
             
            System.out.println("------------------------------------");
            System.out.println("|             Choices               |");
            System.out.println("|  1.View Student List              |");
            System.out.println("|  2. Add Student                   |");
            System.out.println("|  3. Update Student Details        |");
            System.out.println("|  4. Update Student Average        |");
            System.out.println("|  5. Remove Student                |");
            System.out.println("|  6. View Class Average            |");
            System.out.println("|  7. Clear and Quit                |");
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    grapp.display(num, gr);

                    break;

                case 2:
                    String id,
                     fname,
                     lname;

                    System.out.println("Enter student details to add: ");
                   System.out.print("Enter ID: ");
                    id = sc.next();

                    for (int i = 0; i < num; i++) {

             while(gr[i].getId().equals(id)){
                                 
                 System.out.println("ID already exsit!!!");
                 System.out.print("Enter Id Again: ");
                 id = sc.next();
             
            }
                    }
                            n=n+0;
                            System.out.print("Enter First Name: ");
                            fname = sc.next();

System.out.print("Enter Last Name : ");
                            lname = sc.next();

                            System.out.println();
                            gr[num] = new Grades(id, fname, lname);
                            
                            gr[num].setFname(fname);
                            gr[num].setLname(lname);
                            gr[num].setNum(n);
                            

                            num += 1;

                        
                    

            
            grapp.display(num, gr);

            break;

          case 3:

                    System.out.println("CHANGE STUDENT DETAILS.");
                    System.out.print("Enter the ID of student: ");
                    String no = sc.next();

                    for (int x = 0; x < num; x++) {

                        if (gr[x].getId().equals(no)) {
                             System.out.println("------------------------------------------------");
                            System.out.println("Selected Student: " + gr[x].getFname() + " " + gr[x].getLname());
                             System.out.println("------------------------------------------------");
                             
                             
                            System.out.print("Enter First Name: ");
                            fname = sc.next();

                            System.out.print("Enter Last Name : ");
                            lname = sc.next();

                            System.out.print("Enter Average:");
                            int avg = sc.nextInt();
                            
                          
                            System.out.println();
                            gr[x] = new Grades(gr[x].getId(), fname, lname);
                            gr[x].setAverage(avg);
                            gr[x].setFname(fname);
                            gr[x].setLname(lname);

                            if (avg >= 75) {
                                gr[x].setStatus("Passed");
                                n+=1;
                            } else {
                                gr[x].setStatus("failed");
                                 p+=1;
                            }
                          a = n + p;
                        }
                        gr[x].setNum(a); 
                    }
                    grapp.display(num, gr);
                    break;

                case 4:

                    double totalavg ;
                    int math ,science , programming, english, physic;

                    System.out.println("Update Student Average: ");
                    System.out.print("Enter student ID: ");
                    no = sc.next();
                    for (int x = 0; x < num; x++) {
                      
                        if (gr[x].getId().equals(no)) {
                            System.out.println("------------------------------------------------");  
                            System.out.println("Selected Student:" + gr[x].getFname() + " " + gr[x].getLname());
                            System.out.println("------------------------------------------------");  
                            System.out.println("Enter grades of the ff.");

                            System.out.print("Math: ");
                            math = sc.nextInt();

                            System.out.print("Science: ");
                            science = sc.nextInt();
                            
                            System.out.print("Programming: ");
                            programming = sc.nextInt();
                            System.out.print("English: ");
                            english = sc.nextInt();
                            
                            System.out.print("Physics: ");
                            physic = sc.nextInt();
                            
                         

                            totalavg = (math + science + programming + english + physic) / 5;

                            gr[x].setAverage(totalavg);
                            System.out.println("------------------------------------------------");  
                            System.out.println("Total Average:" + totalavg);
                            
                            if (totalavg >= 75) {
                                System.out.println("Status: Passed");
                                gr[x].setStatus("passed");
                             n+=1;
                            } else {
                                System.out.println("Status: Failed");
                                gr[x].setStatus("failed");
                            p+=1;
                            }
                            System.out.println("------------------------------------------------");
                            System.out.println();
                            
                          a = n + p;

}
                        
                       gr[x].setNum(a);
                    }

                    grapp.display(num, gr);
                    break;

                case 5:
     
                     
                System.out.println("REMOVE STUDENT");
                System.out.print("Enter ID to remove: ");
                    String del = sc.next();
                    
                System.out.println("------------------------------------------------");  
                
                  
                   
                    for (int i = 0; i < num; i++) {
                        
                    
                        
                        if (gr[i].getId().equals(del)) {
                         
                            System.out.print("Selected Student:" + gr[i].getFname() + " " + gr[i].getLname());
                        System.out.println();
                       
                     gr[i].setStatus("Deleted");
                    }
                    }

                    System.out.println("------------------------------------------------");   
                    System.out.println("SUCCESS!");
                    break;

                case 6:

                  double sum=0;
                     double stavg=0 ;
                   double finaltotal=0;
            
                  
                    System.out.println("CLASS AVERAGE REPORT");
                    grapp.display(num, gr);
                    System.out.println("---------------------------------------------------");
                    System.out.println("Total Students: " +num);
                     System.out.println("---------------------------------------------------");
                    for (int x = 0; x < num; x++) {

                        stavg+=gr[x].getAverage();
          
                      finaltotal = stavg/gr[x].getNum();
                    }
                      System.out.println("Class  average: "+finaltotal);
                    
                     System.out.println("---------------------------------------------------");
                    
                break;  
                
                case 7:
                    
                    System.out.println("THANK YOU FOR USING THE APP!!!");
                    break;
                
            }
             System.out.println();   
            System.out.print("Make another action?(y/n): ");
             ans = sc.next().charAt(0);
     }
            while (ans == 'y' || ans == 'Y');
        
        System.out.println("SEE YOU SOON!!!");

        }


    }