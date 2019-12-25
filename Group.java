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
String [] joined;
Post [] posts; 
boolean isprivate;



ControllerAll groupController;



Group(){
    
}

Group(boolean type){
    
}

Group createGroup(String name){
    return new Group();
}

void joinGroup(String joined){

}

void remove(User person){

}
    
void change_privacy (String privacy){
    
}
void delete(){
//owner.CreatedGroups.remove(this);
}

boolean checkPrivacy(){
    return true;
}

boolean accept(User person){
    return true;
} 

void addPost(Post p){
     
 }

void addUser(User u){
    
}

}
