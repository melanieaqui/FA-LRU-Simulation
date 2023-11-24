public class Block{
    private int data;
    private int age;
    public Block(int data){
        this.data=data;
        this.age=0;
    }
    
    public void resetAge(){
        age=0;
    }

    public int getAge(){
        return age;
    }
    public void addAge(){
        age+=1;
    }
    public int getData(){
        return data;
    }
    public void replaceData(int data){
        this.data=data;
        age=0;
    }
}