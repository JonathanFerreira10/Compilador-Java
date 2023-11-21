class CommandLeitura extends AbastractCommand {
    private String id;
    private String var;

    public CommandLeitura (String id, String var){
        this.id = id;
        this.var = var;
    }
    @Override
    public String generateCodeJava() {
        String type = "";
        if (var == "numero") { 
            type = "nextDouble();";
        }else if (var == "float") {
            type = "nextFloat();";
        }else {
            type = "nextLine();";
        }
        
        return "Scanner " + id + " = new Scanner(System.in);\n" + id + "." + type;
    }

    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }
}