package MagicStory;

public class Person {
    private final String name;
    private int height;
    private final String sex;
    private boolean VIP;
    //构造函数
    public Person(String name, int height, String sex, boolean VIP){
        this.name = name;  //名字
        this.height = height;  //身高
        this.sex = sex;  //性别
        this.VIP = VIP;  //是否为VIP身份
    }
    //其他方法
    public String GetName(){
        return this.name;
    }
    public int GetHeight(){
        return this.height;
    }
    public String GetSex(){
        return this.sex;
    }
    public boolean VIP(){
        return this.VIP;
    }
    public void ChangeHeight(int x){
        this.height += x;
    }
    public void Display(){
        System.out.println("现在，" + this.name + "的身高是:" + this.height + "厘米");
        if(this.height >= 190)
            System.out.println("太神奇了！");
    }
}