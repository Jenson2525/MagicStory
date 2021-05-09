package MagicStory;

public class SVIP_Account extends Person{
    private int balance;  //账户余额
    private int price;  //每增高或变矮1厘米的单价
    //构造函数
    public SVIP_Account(String name, int height, String sex, boolean VIP, int balance){
        super(name, height, sex, VIP);
        this.balance = balance;
        //确定单价
        if(this.GetSex() == "male")
            this.price = 10;
        else if(this.GetSex() == "female")
            this.price = 5;
    }
    //重载
    public SVIP_Account(String name, int height, String sex, boolean VIP){
        super(name, height, sex, VIP);
        this.balance = 0;
        //确定单价
        if(this.GetSex() == "male")
            this.price = 10;
        else if(this.GetSex() == "female")
            this.price = 5;
    }

    //其他方法
    //获取账户余额
    public int GetBalance(){
        return this.balance;
    }
    //显示余额
    public void DisPlayBalance(){
        System.out.println("账户余额：" + this.balance + "元");
    }
    //充值
    public void AddBalance(int money){
        this.balance += money;
    }
    //收费
    public void ReduceBalance(int money){
        this.balance -= money;
    }
    //获取单价
    public int GetSetPrice(){
        return this.price;
    }
}