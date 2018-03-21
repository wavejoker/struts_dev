package action.day2.ioc;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author : Creeper
 * @date : 2018/3/17 15:39
 */
public class IocAction extends ActionSupport {

    private String savePath;



    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getSavePath() {
        return savePath;
    }

    public String ioc(){
        File file = new File("F:/Wallpaper/949.jpg");
        System.out.println(savePath);
        try {
            File file1 = new File(savePath + "copy" + file.getName());
            FileUtils.copyFile(file, file1);
            FileUtils.moveFile(file1, new File("D:/test.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
