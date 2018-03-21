package interceptor.day3;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author : Waver
 * @date : 2018/3/20 11:25
 */
public class MyIterceptor1 implements Interceptor {

    public MyIterceptor1(){
        System.out.println("构造器创建了");
    }

    @Override
    public void destroy() {
        System.out.println("拦截器销毁方法!");
    }

    @Override
    public void init() {
        System.out.println("执行了拦截器的初始化方法!");
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截器之前的语句!");
        actionInvocation.invoke();
        System.out.println("拦截器之后的语句!");
        return null;
    }
}
