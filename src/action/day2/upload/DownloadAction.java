package action.day2.upload;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author : Waver
 * @date : 2018/3/19 20:35
 */
public class DownloadAction extends ActionSupport {

    /**
     * 接收的文件名
     */
    private String savePath;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String list() {
        File file = new File(savePath);
        String[] list = file.list();
        ActionContext context = ActionContext.getContext();
        Map<String, Object> contextMap = context.getContextMap();
        contextMap.put("list", list);
        return "list";
    }

    public InputStream getInputStream() {
        try {
            return new FileInputStream(new File(savePath + name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("下载异常!!!");
        }
    }

    public String down(){
        return "down";
    }


}
