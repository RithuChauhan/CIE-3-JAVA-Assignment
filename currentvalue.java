public class currentvalue {
    int id;String name;
    currentvalue(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("id:" + id);
        System.out.println("name:" + name);

    }
    
}

 class Main{
    public static void main(String [] args){
        currentvalue v = new currentvalue(101, "rithu");
    v.display();
}
}