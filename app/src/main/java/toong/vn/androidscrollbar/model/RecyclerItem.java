package toong.vn.androidscrollbar.model;

/**
 * Created by PhanVanLinh on 02/02/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class RecyclerItem {
    private String title;
    private String message;

    public RecyclerItem(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
