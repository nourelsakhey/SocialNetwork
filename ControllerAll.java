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
         System.out.println("Enter 3 to add Friend ");
         System.out.println("Enter 4 to accept friend");
         Scanner sc=new Scanner(System.in);
         int c=sc.nextInt();
         
         switch (c) {
             
             case 1:
                 System.out.println("Enter name , gender ,mail , password");
                 String name=sc.nextLine();
                 String gender=sc.nextLine();
                 String mail=sc.nextLine();
                 String pass=sc.nextLine();
               userList.add(u.controller.create_account(name, gender, mail, pass));

            case 2:
                System.out.println("Enter name");
                String addname=sc.nextLine();
                u.add_friend(addname);
                
            case 3:
                System.out.println("Enter name");
                String acceptname=sc.nextLine();
                u.accept_friend(acceptname);
         }
    }
    
}
