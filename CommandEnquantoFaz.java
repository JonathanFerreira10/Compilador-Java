import java.util.ArrayList;

class CommandEquantoFaz extends AbastractCommand {
    private String expr;
    private ArrayList<AbastractCommand> content;

    public CommandEquantoFaz (String expr, ArrayList<AbastractCommand> new_content) {
        this.expr = expr;
        this.content = new_content;
    }
    
    @Override
    public String generateCodeJava() {
        StringBuilder str = new StringBuilder();
        str.append("do{\n");
        for (AbastractCommand cmd : content) {
            str.append(cmd.generateCodeJava() + "\n");
        }
        str.append("}");
        str.append("while(" + expr + ");");
        return str.toString();
    }

    @Override
    public String toString() {
    return "CommandEnquantoFaz";
    }
}