package items;

public class NewsPortal extends MassMedia {
    String urlField;

    public NewsPortal(String name, String urlField) {
        super(name);
        if (urlField == null)
            this.urlField = "no url";
        else
            this.urlField = urlField;
    }

    public NewsPortal() {
        this.urlField = "no url";
    }

    public String getUrlField() {
        return urlField;
    }

    public void setUrlField(String urlField) {
        if (urlField == null)
            System.out.println("wrong url");
        else
            this.urlField = urlField;
    }

    @Override
    public String toString() {
        return "NewsPortal{" +
                "name='" + name + '\'' +
                ", urlField='" + urlField + '\'' +
                '}';
    }
}
