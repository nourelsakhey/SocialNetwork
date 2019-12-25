package socialnetwork;
import java.util.ArrayList;
import java.util.Scanner;
import socialnetwork.Group;
import socialnetwork.Page;
import socialnetwork.Post;
import socialnetwork.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package SocialNetwork;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ControllerAll {

   static ArrayList<User> userList=new ArrayList<>();
    
   static ArrayList<Group> groupList=new ArrayList<>();
    
   static ArrayList<Post> postList=new ArrayList<>();
    
   static ArrayList<Page> pageList=new ArrayList<>();
     public static void main(String[] args) {
         
         User u=new User ();
         System.out.println("Enter 1 to create account  ");
         System.out.println("Enter 2 to login ");
         System.out.println("Enter -1 to exit ");
         Scanner sc=new Scanner(System.in);
         int c=sc.nextInt();
         while(c!=-1){
         if(c==1){
                 sc.nextLine();
                 System.out.println("Enter name");
                 String name=sc.nextLine();
                 System.out.println("Enter gender ");
                 String gender=sc.nextLine();
                 System.out.println("Enter mail");
                 String mail=sc.nextLine();
                 System.out.println("Enter password");
                 String pass=sc.nextLine();
                 //User u1=new User();
               userList.add(u.controller.create_account(name, gender, mail, pass));
         }
         else if(c==2){

                boolean check=false;
                sc.nextLine();
                System.out.println("Enter your mail");
                String email=sc.nextLine();
                System.out.println("Enter your password");
                String password=sc.nextLine();
                for(int i=0;i<userList.size();i++){
                    if(email.equals(userList.get(i).Email)&&password.equals(userList.get(i).Password)){
                        System.out.println("you are logged in successfully");
                        u=userList.get(i);
                        check=true;   
                    }
                }
                if(check){
                    while(true){
                  System.out.println("Enter 1 to send a friend request");
                  System.out.println("Enter 2 to be a premuim user");
                  System.out.println("Enter 3 to exit");
                  String choice=sc.nextLine();
                  if("1".equals(choice)){
                      System.out.println("enter the name of the user ");
                      String fname=sc.nextLine();
                      u.add_friend(fname);
                  }
                  else if("2".equals(choice)){
                      u.premium_user();
                  }
                  else if("3".equals(choice)){
                      break;
                  }
                  
                  
                    }
                }
                else{
                    System.out.println("invalid mail or password");
                }
         }
         System.out.println("Enter 1 to create account  ");
         System.out.println("Enter 2 to login ");
         System.out.println("Enter -1 to exit ");
         c=sc.nextInt();
         }
    }
    
}
