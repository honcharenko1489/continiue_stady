package alishev.interfases;

public class Animal implements ShowInfo{
    public int id;
    public void sleep(){
        System.out.println("I`m sleeping");

    }
public Animal(int id){
        this.id=id;
}

    @Override
    public void infoShow() {
        System.out.println("id is : "+id);
    }
}
