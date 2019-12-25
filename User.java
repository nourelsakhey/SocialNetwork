/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class User {

    String Name;
    String Email;
    String Password;
    String Gender;
    Image ProfilePicture;
    String School;
    String workPlace;
    String college;
    ArrayList<User> FriendList = new ArrayList<User>();
    ArrayList<Page> FollowPages = new ArrayList<Page>();
    ArrayList<Post> Posts = new ArrayList<Post>();
    ArrayList<Page> CreatedPages = new ArrayList<Page>();
    ArrayList<Message> Messages = new ArrayList<Message>();
    ArrayList<Group> CreatedGroups = new ArrayList<Group>();
    ArrayList<Group> FollowGroups = new ArrayList<Group>();
    Controller controller;
void login(String mail,String pass){
    
}

void logout(){
    
}
void add_info(String school,String college,String work_space){
    
}
void change_pp(Image profilepicture){
    
}
User search_friend(String fname){
    ControllerAll ca=new ControllerAll();
    for(int i=0; i<ca.userList.size();i++){
        if(ca.userList.get(i).equals(fname)){
            return ca.userList.get(i);
        }
    }
    return null;
}
void add_friend(String name){
    Scanner s=new Scanner(System.in);
    System.out.println("Do you want to be a premium User?");
    String in=s.nextLine();
    if(in.equals("yes")){
        System.out.println("pay 99$ ...by credit card or payPal?");
    }
    String pay=s.nextLine();
    search_friend(name);
    System.out.println("successful addFriend");
}
void remove_friend(String name){
    
}
void accept_friend(String fname){
    User u=search_friend(fname);
    Scanner s=new Scanner(System.in);
    System.out.println("Do you want to be a premium User?");
    String in=s.nextLine();
    if(in.equals("yes")){
        System.out.println("pay 99$ ...by credit card or payPal?");
    }
    String pay=s.nextLine();
    FriendList.add(u);
    
}

 User[] view_friends(){
    return null;
}
boolean checkAvailability(){
    return false;
}
void cancelAdd(){
    
}


}
