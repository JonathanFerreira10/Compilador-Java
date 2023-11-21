class CommandEscrita extends AbastractCommand {
    private String id;

    public CommandEscrita (String id){
        this.id = id;
    }
    
    @Override
    public String generateCodeJava() {
        return "System.out.println("+id+");";
    }

    @Override
    public String toString() {
        return "CommandEscrit [id=" + id + "]";
    }
}