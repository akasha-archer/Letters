package nyc.c4q.akashaarcher.majorkeys.model;

/**
 * Created by akashaarcher on 1/11/17.
 */

public class Key {

    private String name;
    private String textColor;
    private String url;

    public Key(String name, String textColor, String url) {
        this.name = name;
        this.textColor = textColor;
        this.url = url;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
