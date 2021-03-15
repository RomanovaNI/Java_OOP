package items;

public class WebSite extends MassMedia {
    String urlField, author;

    public WebSite(String name, String urlField, String author) {
        super(name);
        if (urlField == null)
            this.urlField = "no url";
        else
            this.urlField = urlField;
        if (author == null)
            this.author = "no author";
        else
            this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null)
            System.out.println("wrong author");
        else
            this.author = author;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", urlField='" + urlField + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
