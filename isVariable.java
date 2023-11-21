class IsVariable extends IsSymbol {
    public static final Number NUMBER=0;
    public static final Number TEXT=1;
    public static final Number FLOAT=2;
    public static final Number INPUT=3;

    private Number type; 
    private String value;

    public IsVariable(String name, Number type, String value) {
        super(name, type, value); 
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Number getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "IsSymbol [name=" + name + ", type=" + type + ", value=" + value + "]";
    }

    public String generateCodeJava() {
        String str = "";
        String point = ";";

        if (type == NUMBER) {
            str = "int";
        }else if (type == FLOAT){
            str = "Double";
        }else if (type == TEXT){
            str = "String";
        }else if (str == "") {
            super.name = "";
            point = "";
        }
        return str + " " + super.name + point;
    }; 
}