/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnetwork;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;
import static socialnetwork.ControllerAll.userList;

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
    Controller controller=new Controller();
    boolean PermiumUser = false;

    void login(String mail, String pass) {

    }

    void logout() {

    }

    void add_info(String school, String college, String work_space) {

    }

    void change_pp(Image profilepicture) {

    }

    User search_friend(String fname) {

        for (int i = 0; i < userList.size(); i++) {
            if (fname.equals(userList.get(i).Name)) {
                return userList.get(i);
            }

        }
        return null;
    }

    void add_friend(String name) {
        User u = new User();
        u = search_friend(name);
        if (u == null) {
            System.out.println("there is no friend with this name");
        } else {
            FriendList.add(u);
            System.out.println("successful addFriend");
        }
    }

    void remove_friend(String name) {

    }

    void accept_friend(String fname) {
        System.out.println(fname + " sent you a friend request\n1-accept\n2-reject");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if ("1".equals(str)) {
            User u = search_friend(fname);
            FriendList.add(u);
        }
    }

    void premium_user() {
        System.out.println("Do you want to be a premuim user");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if ("yes".equals(str)) {
            System.out.println(" pay 99$ for a year\n1-by credit card\n2-byPayPal\n3-exit");
            str = s.nextLine();
            if ("3".equals(str)) {
                this.PermiumUser = false;
            } else {
                this.PermiumUser = true;
                 System.out.println(" you are a premuim user");
            }
        } else {
            this.PermiumUser = false;
        }
    }

    User[] view_friends() {
        return null;
    }

    boolean checkAvailability() {
        return false;
    }

    void cancelAdd() {

    }

}
