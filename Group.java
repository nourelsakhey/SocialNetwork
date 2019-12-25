/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

/**
 *
 * @author lenovo
 */
public class Group {
    
String name;
User owner;
User [] joined;
Post [] posts; 
boolean isprivate;



ControllerAll groupController;



Group(){
    
}

Group(boolean type){
    
}

void createGroup(String name){
    
}

void joinGroup(String joined){

}

void remove(User person){

}
    
void change_privacy (String privacy){
    
}
void delete(User admin){

}

boolean checkPrivacy(){
    return true;
}

boolean accept(User person){
    return true;
} 

void addPost(Post p){
System.out.println("KK");
     
 }

void addUser(User u){
    
}


}
