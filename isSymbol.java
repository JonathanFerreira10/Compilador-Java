abstract class IsSymbol {
    protected String name;
    protected Number type;
    protected String value;

    public abstract String generateCodeJava(); 

    public IsSymbol(String name, Number type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Number getType() {
        return type;
    }

    public void setValue(String new_value) {
        this.value = new_value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "IsSymbol [name=" + name + "]";
    }
}