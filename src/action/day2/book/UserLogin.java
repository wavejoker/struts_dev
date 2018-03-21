package action.day2.book;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Creeper
 * @date : 2018/3/16 23:32
 */
public class UserLogin extends ActionSupport {
    public String login(){
        return "login";
    }
    public String register(){
        return "register";
    }
}
