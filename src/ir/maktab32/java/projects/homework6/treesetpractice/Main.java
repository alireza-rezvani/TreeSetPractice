package ir.maktab32.java.projects.homework6.treesetpractice;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //*********************************creating treeSets*********************************
        Set<Character> treeSet1 = new TreeSet<>();
        Set<Character> treeSet2 = new TreeSet<>();
        System.out.println("\u29bf Creating TreeSets:");
        System.out.println("\t\u2705 treeSet1: " + treeSet1);
        System.out.println("\t\u2705 treeSet2: " + treeSet2);

        //*************************adding 10 random characters a-z***************************
        treeSetRandomFiller(treeSet1, 10);
        treeSetRandomFiller(treeSet2, 10);
        System.out.println("\n\u29bf Adding Elements:");
        System.out.println("\t\u2705 treeSet1: " + treeSet1);
        System.out.println("\t\u2705 treeSet2: " + treeSet2);

        System.out.println("\n\u29bf Union & Intersection:");
        //***************************************union***************************************
        System.out.println("\t\u2705 Union: " + union(treeSet1, treeSet2));

        //***********************************intersection************************************
        System.out.println("\t\u2705 Intersection: " + intersection(treeSet1, treeSet2));
    }

    public static void treeSetRandomFiller(Set<Character> treeSet, int finalTreeSetSize){
        Random random = new Random();
        while (treeSet.size() < finalTreeSetSize){
            treeSet.add((char) (random.nextInt(26) + 'a'));
        }
    }

    public static Set<Character> union(Set<Character> treeSet1, Set<Character> treeSet2){
        Set<Character> result = new TreeSet<>(treeSet1);
        result.addAll(treeSet2);
        return result;
    }

    public static Set<Character> intersection(Set<Character> treeSet1, Set<Character> treeSet2){
        Set<Character> result = new TreeSet<>(treeSet1);
        result.retainAll(treeSet2);
        return result;
    }

}
