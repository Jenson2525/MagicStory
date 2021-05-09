package MagicStory;

public class MagicMechine {
    private int power;  //每次长高的厘米数
    public MagicMechine(int power){
        this.power = power;
    }
    public int GetPower(){
        return this.power;
    }
    public void Change(int x){
        this.power = x;
    }
}