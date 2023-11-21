import java.util.ArrayList;
class CommandDecisaoSe extends AbastractCommand {

    private String condision;;
    private ArrayList<AbastractCommand> listaTrue;

    public CommandDecisaoSe(String condision, ArrayList<AbastractCommand> lt) {
        this.condision = condision; 
        this.listaTrue = lt;
    }

    @Override
    public String generateCodeJava() {
        StringBuilder str = new StringBuilder();
        str.append("if ("+condision+") {\n"); 
        for (AbastractCommand cmd : listaTrue) {
            str.append(cmd.generateCodeJava() + "\n");
        }
        str.append("}");
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandDecision [Decision=" + condision + ", listaTrue=" + listaTrue +  "]";
    }
}