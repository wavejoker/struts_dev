package action.day2.convert;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * <p>自定义日期转换类</p>
 *
 * @author : Creeper
 * @date : 2018/3/18 16:14
 */
public class MyDateConvert extends StrutsTypeConverter {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

    /**
     * 从页面的数据到服务器的类型转换
     * 参数一： context： 值栈上下文对象
     * 参数二： values:  从页面传递过来的参数值
     * 参数三： toClass: 转换到的类型。String->java.util.Date
     */

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        if (null == strings || 0 == strings.length) {
            return null;
        }
        Date[] dates = new Date[strings.length];
        if (strings.length > 1) {
            try {
                for (int i = 0; i < dates.length; i++) {
                    dates[i] = simpleDateFormat.parse(strings[i]);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return dates;
        }else {
            Date date = null;
            try {
                date = simpleDateFormat.parse(strings[0]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date;
        }
    }

    @Override
    public String convertToString(Map map, Object o) {
        return null;
    }
}
