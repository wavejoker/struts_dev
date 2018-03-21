package action.day2.upload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @author : Waver
 * @date : 2018/3/18 20:25
 */
public class UploadAction extends ActionSupport {

    private File attach;
    private String attachContentType;
    private String attachFileName;
    private String info;


    private String savePath;

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public File getAttach() {
        return attach;
    }

    public void setAttach(File attach) {
        this.attach = attach;
    }

    public String getAttachContentType() {
        return attachContentType;
    }

    public void setAttachContentType(String attachContentType) {
        this.attachContentType = attachContentType;
    }

    public String getAttachFileName() {
        return attachFileName;
    }

    public void setAttachFileName(String attachFileName) {
        this.attachFileName = attachFileName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(attach);
        System.out.println(attachContentType);
        System.out.println(attachFileName);
        System.out.println(info);

        FileUtils.copyFile(attach, new File(savePath + attachFileName));
        return super.execute();
    }
}
