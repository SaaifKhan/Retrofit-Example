package app.dotinfiny.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Post {
    private int userId;
    private Integer id;
    private String title;
    @SerializedName("body")
    private String text;


    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    public Post(Map<String, String> fields) {
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
