package action.day2.scope;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Creeper
 * @date : 2018/3/17 16:19
 */
public class ScopeAction extends BaseScope {
    public String scope() {
        List<String> list = new ArrayList<>();
        list.add("OJBK");
        list.add("NB");
        list.add("hello Thank you");


        requestMap.put("requestMap", list);
        sessionMap.put("sessionMap", list);
        contextMap.put("contextMap", list);
     /*   HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list", list);

        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("sessionList", list);

        ServletContext servletContext = ServletActionContext.getServletContext();
        servletContext.setAttribute("contextList", list);*/
//


		/*2)strus2提供的第二种使用域对象的方法(Action对象方法少的时候,可以使用这种方式)
              ActionContext对象: action的上下文对象,在这个ActionContext对象中提供操作不同域对象数据的Map集合
		      特点：
		     1) 不依赖servlet原生的api,方便测试
             2)只能在action的某个业务方法中使用
            */
//        得到操作request域的map集合(操作这个Map集合就等同于操作了request域的数据)
//        ActionContext context = ServletActionContext.getContext();
//        Map<String, Object> contextMap = context.getContextMap();
//        contextMap.put("list", list);
//
//        Map<String, Object> session = context.getSession();
//        session.put("sessionList", list);
//
//        Map<String, Object> applicationMap = context.getApplication();
//        applicationMap.put("contextList", list);
//

        return SUCCESS;
    }

}
