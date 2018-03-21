package action.day2.data;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Creeper
 * @date : 2018/3/18 13:34
 */
public class UserRegister extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String register(){
        return "register";
    }

}
