import java.util.LinkedList;
 class linkedlist{
    public static void main(String[]args){

        LinkedList<String>names = new LinkedList<>();

        names.add("rithu");
        names.add("rit");
        names.add("ritu");

        names.addFirst("riu");
        names.addLast("raj");

        System.out.println(names);

    }
 }