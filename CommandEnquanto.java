import java.util.ArrayList;

class CommandEquanto extends AbastractCommand {
    private String expr;
    private ArrayList<AbastractCommand> content;

    public CommandEquanto (String expr, ArrayList<AbastractCommand> new_content) {
        this.expr = expr;
        this.content = new_content;
    }
    
    @Override
    public String generateCodeJava() {
        StringBuilder str = new StringBuilder();
        str.append("while(" + expr +") { \n");
        for (AbastractCommand cmd : content) {
            str.append(cmd.generateCodeJava() + "\n");
        }
        str.append("}");
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandEnquanto [id=" + expr + "]";
    }
}