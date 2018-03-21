package action.day3;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Set;

/**
 * @author : Waver
 * @date : 2018/3/20 11:33
 */
public class UserAction extends ActionSupport{

    public UserAction(){
        System.out.println("创建了UserAction对象");

    }

    public String register(){
        System.out.println("调用了UserAction的方法");
        return SUCCESS;
    }


}
