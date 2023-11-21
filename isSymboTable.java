import java.util.HashMap;
import java.util.ArrayList;

class isSymboTable {
    private HashMap<String, IsSymbol> map;
    private IsSymbol var1, var2;
    private IsSymbol type;
    private Expections exception = new Expections();

    public isSymboTable() {
        map = new HashMap<String, IsSymbol>();
    }

    public void add(IsSymbol symbol) {
        map.put(symbol.getName(), symbol); 
    }

    public boolean exist(String symbolName) {
        return map.get(symbolName) != null;
    }

    public boolean typeInvalid(String symboOne, String symboTwo) {
        this.var1 = map.get(symboOne);
        this.var2 = map.get(symboTwo);
        
        if (this.var1.getType() == this.var2.getType()) {
            return true;
        }else {
            return false;
        }
    }

    public String getTypes(String symboOne) {
        IsSymbol type; 
        int new_type_new;
        type = map.get(symboOne);
        
        Number new_type = type.getType();

        String target_type = "";

        new_type_new = new_type.intValue();

        if (new_type_new == 0) {
            target_type = "numero";
        } else if (new_type_new == 1) {
            target_type = "texto";
        }else if (new_type_new == 2){
            target_type = "float";
        }else {
            this.exception.typeNotExist();
        }
        return target_type;
    }

    public void setValue(String symboOne, String value){ 
        this.type = map.get(symboOne);
        this.type.setValue(value);    
    }

    public void getValue(String id) {
        IsSymbol type;
        type = map.get(id);        
        String new_type = type.getValue();
        System.out.println(new_type);
    }

    public IsSymbol get(String symbolName) {
        return map.get(symbolName);
    }

    public ArrayList<IsSymbol> getAllSymbols() {  
        ArrayList<IsSymbol> lista = new ArrayList<IsSymbol>(); 
        for (IsSymbol symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }
}