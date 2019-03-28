package pojo;

public class EasyUITree {
    private int id;
    private  String text;
    private  String state;

    public EasyUITree(int id, String text, String state) {
        this.id = id;
        this.text = text;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
