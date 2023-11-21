import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;

class Mylanguage { 
    private isSymboTable varTable;
    private ArrayList<AbastractCommand> comandos;
    private String programName;

    public isSymboTable getVarTable () {
        return varTable;
    }


    public void setVarTable(isSymboTable varTable) {
        this.varTable = varTable;
    }

    public ArrayList<AbastractCommand> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<AbastractCommand> comandos) {
        this.comandos = comandos;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
    public void generateTarget(){ 
        StringBuilder str = new StringBuilder();
        str.append("import java.util.Scanner;\n"); 
        str.append("public class MainClass{ \n");
        str.append("    public static void main(String args[]) {\n");
        for (IsSymbol symbol : varTable.getAllSymbols()) {
            str.append(" " + symbol.generateCodeJava() + "\n");
        }
        for (AbastractCommand command : comandos) {
            str.append(command.generateCodeJava() + "\n");
        }
        str.append("    }\n"); 
        str.append("}");

        try {
            FileWriter fr = new FileWriter(new File("MainClass.java")); 
            fr.write(str.toString());
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}