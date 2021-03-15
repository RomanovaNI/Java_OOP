package items;

public abstract class MassMedia {
    String name;

    public MassMedia(String name) {
        if (name==null) {
            this.name="no name";
        } else {
            this.name = name;
        }
    }

    public MassMedia() {
        this.name="no name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null) {
            System.out.println("wrong name");
        } else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "MassMedia{" +
                "name='" + name + '\'' +
                '}';
    }
}
