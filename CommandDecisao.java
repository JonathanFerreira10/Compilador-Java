import java.util.ArrayList;
class CommandDecisao extends AbastractCommand {

    private ArrayList<AbastractCommand> listaFalse; 

    public CommandDecisao(ArrayList<AbastractCommand> lf) { 
        this.listaFalse = lf;
    }

    @Override
    public String generateCodeJava() {
        StringBuilder str = new StringBuilder();
        str.append("else {\n"); 
        for (AbastractCommand cmd : listaFalse) {
            str.append(cmd.generateCodeJava() + "\n");
        }
        str.append("}");
        return str.toString(); 
    }

    @Override
    public String toString() {
        return "CommandDecisionFalse [listaFalse" + listaFalse + "]";
    }
}