/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import java.awt.Image;
import java.util.ArrayList;

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
void add_friend(String name){
    
}
void remove_friend(String name){
    
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
