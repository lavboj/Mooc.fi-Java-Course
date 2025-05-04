public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
    
    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }else if (!(compare instanceof Item)) {
            return false;
        }

        Item comparable = (Item) compare;

        if (this.id.equals(comparable.id)) {
            return true;
        }

        return false;
    }
}
