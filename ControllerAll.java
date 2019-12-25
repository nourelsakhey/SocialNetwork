/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ControllerAll {
      ArrayList<User> userLisl=new ArrayList<>();
      ArrayList<User> userList=new ArrayList<>();
    
    ArrayList<Group> groupList=new ArrayList<>();
    
    ArrayList<Post> postLisl=new ArrayList<>();
    ArrayList<Post> postList=new ArrayList<>();
    
    ArrayList<Page> pageLisl=new ArrayList<>();
    ArrayList<Page> pageList=new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        User u=new User();
        System.out.println("Enter 1 to create accout");
        System.out.println("Enter 2 to login");
        System.out.println("Enter 3 to Add friend");
        System.out.println("Enter 4 to Accept friend");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        switch (c){
            case 1:
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
