package aula5;
import java.util.Scanner;

public class Listas {
    private String[] v;
    private int fim;
    private int inicio;
    
    private Listas(){
        v = new String[10];
        fim = -1;
    }
    
    public void setFim(int valor){
        fim = valor;
    }
    
     public int getFim(){
        return fim;
    }
     
     public boolean ifFull(){
         if(fim == 9){
             return true;
         }
         else{
             return false;
         }
     }
     
     public boolean isEmpty(){
         if(fim == -1){
             return true;
         }
         else{
             return false;
         }
     }
     
     public void insertFim(String item){
         if(ifFull()){
             System.out.println("A lista está cheia");
         }else{
             setFim(getFim() + 1);
             v[getFim()]  = item;
         }
     }
     public void insertInicio(String item){
         if(ifFull()){
             System.out.println("A lista está cheia");
         }
         else{
             for (int i = getFim();i>=0; i--) {
                 v[i + 1] = v[i];
             }
             v[0] = item;
             setFim(getFim() +1);
         }
     }
     public void insertPos(String item, int pos){
         if(ifFull()){
             System.out.println("A lista está cheia");
         }else{
             for (int i = getFim(); i >= pos; i--) {
                 v[i + 1] = v[i];
             }
             v[pos] = item;
             setFim(getFim() +1);
         }
     }
     

     public String removePos(int pos){
        String temp;
        if(isEmpty()){
            System.out.println("A lista está vazia");
            return null;
        }
        else{
            temp = v[pos];
            for (int i = pos; i <= getFim() -1; i++) {
                v[i] = v[i + 1];
            }
            setFim(getFim() - 1);
            return temp;
        }
     
     }
     public String removeFim(){
         return removePos(getFim());
     }
     public String removeInicio(){
        return removePos(0);
     }
     public void print(){
         for (int i = 0; i < getFim(); i++) {
             System.out.println("Lista[" + (i +1) + "]=" + v[i]);
         }
     }
}
