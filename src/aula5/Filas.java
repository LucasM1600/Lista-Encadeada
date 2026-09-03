package aula5;

public class Filas {
    
    private String[] v;
    private int fim;
   
    public Filas(){
        v = new String[10];
        fim = -1;
    }
    
    private void setFim(int valor){
        fim = valor;
    }
    private int getFim(){
        return fim;
    }
    
    private boolean isFull(){
        if(getFim() > 9){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isEmpty(){
        if(fim == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertFim(String valor){
        if(isFull()){
            System.out.println("Não foi possivel");
        }
        else{
            setFim(getFim() + 1);
            v[getFim()] = valor;
        }
    }
    private void insertInicio(String valor){
        if(isFull()){
            System.out.println("Não foi possivel");
        }
        else{
            for (int i = getFim(); i >= 0; i--) {
                v[i + 1] = v[i];
            }
            v[0] = valor;
            setFim(getFim() +1);
        }
    }
    private void insertPos(int pos, String valor){
        if(isFull()){
            System.out.println("Não foi possivel");
        }
        else{
            for (int i = getFim(); i >= pos; i--) {
                v[i + 1] = v[i];
            }
            v[pos] = valor;
            setFim(getFim() +1);
        }
    }
    private String removePos(int pos){
        String tmp;
        if(isFull() || isEmpty()){
            System.out.println("Não foi possivel");
            return null;
        }
        else{
            tmp = v[pos];
            for (int i = pos; i < getFim() -1; i++) {
                v[i] = v[i + 1];
            }
            setFim(getFim() -1);
            return tmp;
        }
    }
    private String removeFim(){
        return removePos(getFim());
    }
    
    public String removeInicio(){
        return removePos(0);
    }
    public void print(){
        System.out.println();
        for (int i = 0; i <= getFim(); i++) {
            System.out.println("Lista[" + (i +1)  + "]=" + v[i]);
        }
    }
}