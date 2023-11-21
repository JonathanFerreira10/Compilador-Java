class CommandAtribuicao extends AbastractCommand {
    private String id;
    private String expr; 

    public CommandAtribuicao(String id, String expr) {
        this.id = id; 
        this.expr = expr; 
    }

    @Override
    public String generateCodeJava() {
        return id + " = " + expr + ";";
    }

    @Override
    public String toString() {
        return "CommandAtribuic [id=" + id + ", expr=" + expr + "]";
    }
}