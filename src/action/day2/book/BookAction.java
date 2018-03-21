package action.day2.book;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Creeper
 * @date : 2018/3/17 8:38
 */
public class BookAction extends ActionSupport {

    public String add(){
        return "add";
    }

    public String list() {
        return "list";
    }
}
