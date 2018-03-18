package action.data;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Creeper
 * @date : 2018/3/18 12:54
 */
public class UserLogin extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;

    }


    public String login(){
        System.out.println(user);
        return SUCCESS;
    }

}
