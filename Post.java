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
public class Post {
    
User owner;
String content;
String privacy;
int likes_no;
int share_no;
boolean isHash;
Group group;
Page page;
Controller account; 


int likes_no(){
    return 0;
}

int shares_no(){
    return 0;
} 
void share(User owner){
    
} 
void deletePost(User owner ){
    
} 
void like(User owner){
    
} 
void change_privacy(String privacy){
    
}
Hashtag setHash(Post p,boolean isHah){
    return new Hashtag();
}







    
}
