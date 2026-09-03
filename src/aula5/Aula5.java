package aula5;

public class Aula5 { 
    
    public static void main(String[] args) {
        Listas l = new Listas();
        Filas f = new Filas();
        Pilhas p = new Pilhas();
        
        p.insertFim("A");
        p.insertFim("B");
        p.insertFim("C");
        p.insertFim("D");
        p.insertFim("E");
        p.insertFim("F");
        
        p.removeFim();
        p.removeFim();
        p.removeFim();
        p.print();
    }
}
