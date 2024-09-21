

//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739


/***************************************************************************************/


package school;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    
    
/***************************************************************************************/
   
    
    
    static  ArrayList <Student>   List  = new ArrayList<>();
    static  ArrayList <Subject>   List1 = new ArrayList<>();
    static  ArrayList <Teacher>   List2 = new ArrayList<>();
    static  ArrayList <Principal> List3 = new ArrayList<>();
   // static Principal Principal;

    public static Principal Pr;
    public static Teacher T;
    public static Student S;

    
    
/***************************************************************************************/
       
    
    
    public static void read() throws IOException, ClassNotFoundException{
        
        Scanner in = new Scanner(System.in);
        
        FileInputStream inputFile = new FileInputStream("project.txt");
        ObjectInputStream Input   = new ObjectInputStream(inputFile);
     
        ArrayList<Student> s = (ArrayList)Input.readObject();
        
        for(Student s1 :s){
         
            List.add(s1);
        }
       
        ArrayList<Teacher> t = (ArrayList)Input.readObject();
        for(Teacher t1 :t){
            List2.add(t1);
        }
        
        ArrayList<Subject> sb = (ArrayList)Input.readObject();
        for(Subject sb1 :sb){
            List1.add(sb1);
        }
       
        inputFile.close();
            }
    
    
    

/***************************************************************************************/    
    
    
    
    public static void main(String[] args) throws IOException , ClassNotFoundException{
 
        
        
   
        System.out.println("---------------------------------------------");
        System.out.println("                   Welcome                   ");
        System.out.println("---------------------------------------------");
       


        Scanner in = new Scanner(System.in);
        boolean str = true;
 
        
        while (str) {
            System.out.println("*************************");
            System.out.println("1- Add Employee");
            System.out.println("2- Add Student");
            System.out.println("3- Add Subject");
            System.out.println("4- Show Subjects");
            System.out.println("5- Show Employees Salaries");
            System.out.println("6- Count of student in any subject");
            System.out.println("7- Save data in file");
            System.out.println("8- Exit");
            System.out.println("Enter your choice : ");
            System.out.println("*************************");


             
            
/***************************************************************************************/



           int Choose = in.nextInt();
            System.out.println("---------------------------------------------");
            switch (Choose) {
                case 1:
                    System.out.println("Choose Type Of Employee");
                    boolean st = true;
                   
                    while (st) {
            System.out.println("---------------------------------------------");       
                        System.out.println("Choose...");
                        System.out.println("1- Principal");
                        System.out.println("2- Teacher");
                        System.out.println("3- Exit");
            System.out.println("---------------------------------------------");
            
                        int cho = in.nextInt();

                        switch (cho) {

                            
                            case 1:
                               
                                System.out.println("{ Add Name , Add Id , Add Address , Add PhoneNumber , Add Email , Add BasicSalary  , Add BasicSalary, Add PrincipalBonus }");
                                Pr =new Principal (in.next(),in.nextInt(),in.next(),in.nextInt(),in.next(),in.nextDouble(),in.nextDouble(),in.nextDouble());
                                List3.add(Pr);
                                
                                 
                                break;
                                

                            
                            /**************************************************/
                             
                                
                            case 2:
                                
                                System.out.println("{ Add Name , Add Id , Add Address , Add PhoneNumber , Add Email , Add BasicSalary , Add LiveExpensive , Add ClassNo }");
                                T =new Teacher (in.next(),in.nextInt(),in.next(),in.nextInt(),in.next(),in.nextDouble(),in.nextDouble(),in.nextInt());
                                List2.add(T);
                                
                                
                                break;
                             
                                
                            /**************************************************/
                           
                            
                            case 3:
                              
                            st = false;
                            break;
                           
                            default:
                                System.out.println("Please , Enter a vaild value");
                        
                            /**************************************************/
                        } 
                    }
                    break;
        
          
                    
                    
/***************************************************************************************/
               
                    
                
                case 2:
                    
                    System.out.println("Add Student");
                    System.out.println("{ Add Id , Add Name , Add Level }");
                    S = new Student(in.nextInt(),in.next(),in.nextInt());
                    List.add(S);
                    System.out.println(S.toString());
                     
                    break;
                    
                    
                    
/***************************************************************************************/
                
                    
                    
                    
                case 3:
                    
                    System.out.println("Add Subject");
                    System.out.println("{ Subject Name , Subject Student , Subject Teacher }"); 
                                String SubjectName;
                                SubjectName = in.next();
                                Subject w = new Subject();
                                w.setName(SubjectName);
                                
                            
                                System.out.println("list Student Name ");//يعرض اسماء الطلاب كلهم
                                for (int i = 0; i < List.size(); i++) {
                                    System.out.println(List.get(i).getName());
                                    }
                                
                                
                                
                                
                            /**************************************************/  
                                
                                
                                
                               System.out.println("Enter Student name ");
                               String SubjectStudent = in.next();//اسم الطالب 
                               System.out.println("**************************");
                               boolean flag=false;
                                Student t1=null;
                                
                                for(int i= 0 ; i < List.size();i++){
                                    
                                    if (SubjectStudent.equals(List.get(i).getName())){
                                       t1=List.get(i);
                                        flag=true;
                                    }
                                }
                               
                                
                                
                            /**************************************************/   
                               
                               
                               
                               System.out.println("list Teacher Name ");
                               for (int i = 0; i < List2.size(); i++) {
                                   System.out.println(List2.get(i).getName());
                               }
                               
                                System.out.println("Enter Teacher name");
                                String SubjectTeacher = in.next();//اسم المعلم 
                                boolean flag1=false;
                                Teacher tt=null; 
                                 
                                for (int j = 0; j < List2.size(); j++) {
                                     
                                 if (SubjectTeacher.equals(List2.get(j).getName())) {
                                         tt= List2.get(j);
                                         flag1=true;
                                          
                                      }
                                }
                                
                                
                                
                            /**************************************************/

                                
                                  
                                  if(flag1&&flag){
                                     Subject S = new Subject(SubjectName ,tt,t1);
                                    
                                     List1.add(S);

                                  }else{
                                      System.out.println("No subject added, wrong inputs");
                                  }
                
                    
                                  
                            break;
  
                                       
        
/***************************************************************************************/

                     
                                  
                case 4:
                   
                    System.out.println("Show Subjects");
                   
                    
                    for (int i = 0; i < List1.size(); i++) {
                    System.out.println(List1.get(i).getName()
                    +"\n"+List1.get(i).getStudent().toString()
                    +"\n"+List1.get(i).getTeacher().toString());
                    
                    }
            
                    break;
                    
                    
                    
                 
/***************************************************************************************/
                    
                    
 
                case 5:
                    
                    System.out.println("Show Employees Salaries");
                    System.out.println("1- Principal Salary");
                    System.out.println("2- Teacher Salary");
                    int stt = in.nextInt();
                    switch (stt) {
                        
                        case 1:
                           
                             
                            for (int j = 0; j < List3.size(); j++) {
                                
                              System.out.println("Name   : "+List3.get(j).getName());
                              System.out.println("Salary :"+List3.get(j).getSalary());
                              
                            }
                  
                                 //  System.out.println(Pr.toString());
                                   
                                   
                              break;
                              
                              
                              
                            /**************************************************/  
                              
                        case 2:
                            for (int i = 0; i < List2.size(); i++) {
                                
                            System.out.println("Name:"  +List2.get(i).getName());
                            System.out.println("Salary:"+List2.get(i).getSalary());
                            
                            break;
                            }
                    }
                    break;
                    
                    
                    
                    
//                    RandomAccessFile monFichier = new RandomAccessFile("project.txt", "rw");
//                             for (int j= 0;j< List2.size(); i++) {   
//                       System.out.println(monFichier.readInt());      }    
//    
//                         monFichier.close();
//                         break;
//                          
//                      
//                         
                         
//                    
//                    BufferedReader br = new BufferedReader(new FileReader("project.txt"));
//                    String line;
//                    while ((line = br.readLine().toString()) != null) {
//                     System.out.println(line);
//                        
//                    }
//                    br.close();
//                    
//                    
//                    
//                    
//                    
//                    
//                    
//                    
//                    break;
                    
                    //System.out.println("******************************************");
//                   
//                    String path = "project.txt"; 
//                    File file = new File(path); 	
//                    FileWriter writer; 	
//                    
//                    try { 			 
//                        writer = new FileWriter(file, true);
////                    //True = Append to file, false = Overwrite 
////                    writer.write("Welcome thaicreate.com 1\""); 	
////                    writer.write("Welcome thaicreate.com 2\""); 
//                    writer.close(); 			 
////                    System.out.println("Write success!"); 	
//                     } catch (IOException e) { 			
//                // TODO Auto-generated catch block 
//                                     e.printStackTrace();
//
//                     		}
//                    break;
//                    
//                    
//                    File file = new File("project.txt"); 	
//                    FileWriter writer; 		
//                    try { 			 
//                        writer = new FileWriter(file, true);
//                     //True = Append to file, false = Overwrite
// 
//                    writer.write(List2.get(stt).getName());
//                    writer.write(""+List2.get(stt).getSalary());
//                    
//                   	    writer.write("Welcome thaicreate.com 2\""); 	
//                            writer.close(); 			 	
//                            System.out.println("Write success!"); 	
//            } catch (IOException e) { 		
//                // TODO Auto-generated catch block 		
//                    e.printStackTrace(); 	
//                    }
//                    break;
                    
                    
                    
//                    
                    
                    
                    
                    /*
                    String path = "project.dat"; 	
                    File file = new File(path); 	
                    FileWriter writer; 		
                    try { 			 	
                        writer = new FileWriter(file, true); 		
                        writer.write("Welcome thaicreate.com 1", "UTF_8"  ) ;	
                        writer.write("Welcome thaicreate.com 2" ,"UTF_8" ) ;	
                        writer.close(); 			 	
                        System.out.println("Write success!", "UTF_8"); 		
                    } catch (IOException e) { 			
                        e.printStackTrace(); 		}
                    
                    
                    
                    
                    
                  String path = "project.dat"; 	
                  File file = new File(path); 	
                  FileWriter writer; 		
                  try { 	
                      writer = new FileWriter(file, true);
                   	
                  writer.write("Welcome thaicreate.com 1/" + StandardCharsets.UTF_8); 		
                        writer.write("Welcome thaicreate.com 2/"+ StandardCharsets.UTF_8); 	
                        writer.close(); 			 		
                        System.out.println("Write success!", StandardCharsets.UTF_8); 		
                      } catch (IOException e) { 			
                         		
                          e.printStackTrace(); 		}
                    
                    
                   */ 
                    
                    
                    
                    
                    
                    /*  
                    BufferedReader br = new BufferedReader(new FileReader("project.dat")); 	
                    String line; 			
                    while ((line = br.readLine()) != null) { 		
                        System.out.println(line); 			
                    
                    }
                    
                    */
                    
                    /*
                    String path = "project.dat"; 	
                    File file = new File(path); 		
                    FileWriter writer; 		
                    try { 	
                        writer = new FileWriter(file, true);
                        
                     //True = Append to file, false = Overwrite 	
                    writer.write("Welcome thaicreate.com 1\\"); 	
                    writer.write("Welcome thaicreate.com 2\\"); 	
                    writer.close(); 			 
                    System.out.println("Write success!"); 	
                  } catch (IOException e) { 			
            // TODO Auto-generated catch block 			
                    e.printStackTrace(); 	
                    
                    
                    
                    }
                    break;
            */
            /*
                     File F=new File("project.dat");
                    if (F.exists()) {
                        
                     
                        
                        read();
                    }
                        
                    
                   */
                    
                    
                    
                    
//                        
//                     RandomAccessFile monfichie = new RandomAccessFile("project.dat", "rw"); 
//                       // for(int i=0;i < 10  ;i++){
//                     
//                      File f=new File("project.dat");
//                      
//                      
                      
                      
                      
                     
//                          do {
//                                System.out.println(monfichie.read() ) ;
//                                   
//                          } 
//                          while(monfichie.length())
//                    
//                
//                          
//                     

                      
//                            while (f.exists()) {
//                             System.out.println(monfichie.read());
//                          }
//                      
//                                    monfichie.close();    
//         
                          
                                
/***************************************************************************************/
                        
                   
                                
                case 6:

                            
                    int count = 0;    
                    System.out.println("Count of student in any subject");
                    System.out.println("Enter name if subject ");
                    SubjectName = in.next();
                    for (int i = 0; i < List1.size(); i++) {
//                      for (int j = 0; j < List.size(); j++) {
                        if (SubjectName.equals(List1.get(i).getName())) {
//                          System.out.println(List1.get(i).getName());
                            System.out.println(List1.get(i).getStudent().getName());
                            System.out.println("Number of students is: 1") ;
                       }else{
                            System.out.println("wrong inputs");  
                            
                        }
                        break;
                    }
                           
                        
                   break;
                      
                   
                   
/***************************************************************************************/
                       
                   
                    
                case 7:
                    
                
                    
                    System.out.println("Save Data...");
                    
                    try {

                        BufferedWriter output = new BufferedWriter(new FileWriter("project.txt"));
                        
                        
                        
                        output.write("Total Principal : \n");

                        for (Principal principal : List3) {

                        output.write(principal.toString());

                        output.write("\n");
                        
                        }
                        
                        

                        output.write("Total Students : \n");

                        for (Student student : List) {

                        output.write(student.toString());

                        output.write("\n");

                        }

                        output.write("Total Teachers : \n");

                        for (Teacher teacher : List2) {

                        output.write(teacher.toString());

                        output.write(":\n");

                        }

                        output.write("Total Subjects : \n");

                        for (Subject subject : List1) {

                        output.write(subject.toString());

                        output.write("\n");

                        }

                        output.close();

                        } catch (IOException e) {

                        System.out.println("An error occurred.");

                        e.printStackTrace();

                        
                        in.close();

                        return;
                                       
                        }
                        break;
                 

                    
                    
                    
//                    
//                    FileOutputStream OutputFile = new FileOutputStream("project.txt");
//                    ObjectOutputStream output = new ObjectOutputStream(OutputFile);
//                  
//                    output.writeObject(List);
//                    output.writeObject(List1);
//                    output.writeObject(List2);
//                     
//                    
//                   
//                    OutputFile.close();
//                    
            
                    
                        
/***************************************************************************************/
                         
                        
                    
                case 8:
                    System.out.println("Exit");
                    System.exit(0);
                    break; 
                    
                    
                default :
                    System.out.println("Please , Enter a vaild value");
                    
            }
        }
    }}

  
    
/***************************************************************************************/
//  My name : Mahmoud Riyad Mahmoud Dawoud
//  ID : 1301200739