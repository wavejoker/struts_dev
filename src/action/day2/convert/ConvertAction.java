package action.day2.convert;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Creeper
 * @date : 2018/3/18 15:53
 */
public class ConvertAction extends ActionSupport{

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String register(){
        System.out.println(user);
        return SUCCESS;
    }
}
