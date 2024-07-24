package com.maxwell.internship;

public class Main {
    public static void main(String[] args){
        var sample = new LinkedList<>("Vince", "Elroy");
        sample.addFirst("Maxwell");
        System.out.println(sample);
        LinkedList<String> friends = new LinkedList<>("Sukuna", "Mahito", "Nanami", "Fushiguro", "Yuji");
        LinkedList<String> enemies = new LinkedList<>("Jack", "Jill", "John", "Jason", "Jackson");
        LinkedList<String> family = new LinkedList<>("Mansu", "Abidine", "Nathan", "Abdel", "Alilu");
        
        var list = new LinkedList<>(family, enemies, friends);

        list.show();

    }
}