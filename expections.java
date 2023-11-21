class Expections {
	public Expections(){}

    public void variableExist(String _varName) {
        try {
            throw new Exception("Symbol " + _varName + " already declared");
        }catch (Exception ex) {
            System.err.println("Semantic Error - " + ex.getMessage());
            System.exit(404);
        }
    }

    public void variableNotExist(String _varName) { 
        try{
            throw new Exception("Symbol " + _varName + " not declared");
        }catch (Exception ex) {
            System.err.println("Syntax Error - " + ex.getMessage());
            System.exit(404);
        }
    }

    public void typeIncorret(String _varName, String _varNameTwo) {
        try{
            throw new Exception("Symbol " + _varName + " not designation symbol " + _varNameTwo);
        }catch(Exception ex) {
            System.err.println("Syntax Error - " + ex.getMessage());
            System.exit(404);
        }
    }

    public void typeNotExist() {
        try{
            throw new Exception("Type Unexpected ");
        }catch(Exception ex) {
            System.err.println("Syntax Error - " + ex.getMessage());
            System.exit(404);
        }
    }

    public Number converterStringForInt(String var_name) { 
        int i = 0;
        System.out.println(var_name.getClass().getSimpleName());
        try{
            i = Integer.valueOf(var_name);
            System.out.println("VEIO AQUI"+ var_name);
            return i;  
        }catch(Exception ex) {
            return null;    
         }
    }
}