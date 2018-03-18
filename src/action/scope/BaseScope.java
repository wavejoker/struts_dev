package action.scope;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.Map;

/**
 * @author : Creeper
 * @date : 2018/3/18 11:42
 */
public class BaseScope extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    protected Map<String, Object> requestMap;
    protected Map<String, Object> sessionMap;
    protected Map<String, Object> contextMap;
    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.contextMap = map;
    }
}
