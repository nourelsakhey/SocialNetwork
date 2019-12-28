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
public class Controller {
    
  User owner;
  User create_account(String name,String gender,String mail,String pass){
      owner=new User();
      owner.Name=name;
      owner.Gender=gender;
      owner.Email=mail;
      owner.Password=pass;
      return owner;
  }
  void deactivate_account(User profile ,String reason){
      
  }
}