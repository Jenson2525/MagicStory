package MagicStory;

public class MagicHouse implements MagicHouseVIP_Interface, MagicHouse_Interface, MagicHouseSVIP_Interface{
    private final Bread bread;
    private final MagicMechine magicmechine;
    //构造函数
    public MagicHouse(Bread bread, MagicMechine magicmechine){
        this.bread = bread;
        this.magicmechine = magicmechine;
    }

    //普通服务
    //使用MagicMechine_Interface接口
    //吃面包
    public void EatBread(Person person, int number){
        int x;
        x = this.bread.GetEnergy() * number;
        person.ChangeHeight(x);
    }
    //使用魔法机器
    public void UseMagicMechine(Person person){
        int x;
        x = this.magicmechine.GetPower();
        person.ChangeHeight(x); 
    }

    //VIP服务
    //使用MagicMechineVIP_Interface接口
    //VIP识别
    public void VIPJudge(Person person){
        if(person.VIP() == true)
            System.out.println("魔法机器：尊贵的VIP，感谢您体验魔法机器");
        else{
            System.out.println("对不起，您还不是VIP会员，不能使用VIP服务！");
        }
    }
    //性别判断
    public void SexJudge(Person person){
        if(person.VIP() == true){
            if(person.GetSex() == "male"){
                magicmechine.Change(40);
                System.out.println("魔法机器：系统识别出您是：男生");
                System.out.println("魔法机器：机器将使您增高：40厘米");
            }
        else if(person.GetSex() == "female"){
                magicmechine.Change(30);
                System.out.println("魔法机器：系统识别出您是：女生");
                System.out.println("魔法机器：机器将使您增高：30厘米");
            }
        }
        else{
            System.out.println("对不起，您还不是VIP会员，不能使用VIP服务！");
        }
    }

    //SVIP服务
    //使用MagicHouseVIP_Interface接口
    //性别判断
    public void SexJudgeForSVIP(SVIP_Account person){
        if(person.GetSex() == "male"){
            System.out.println("机器将识别出您是：男生");
        }
        else if(person.GetSex() == "female"){
            System.out.println("机器将识别出您是：女生");
        }
    }
    //服务选择
    public void ServiceChoose(int choose){
        //变高
        if(choose == 1)
            magicmechine.Change(1);
        //变矮
        else if(choose == 2)
            magicmechine.Change(-1);
    }
    //服务价格
    public int Price(SVIP_Account person, int change){
        int sum = person.GetSetPrice() * change;
        return sum;
    }
    //服务内容
    public void Service(int choose, int change){
        if(choose == 1)
            System.out.println("魔法机器：机器将使您增高：" + change + "厘米");
        else if(choose == 2)
            System.out.println("魔法机器：机器将使您降低：" + change + "厘米");
    }
    //账户余额查询
    public boolean BalanceCheck(SVIP_Account person, int change){
        //账户余额不足
        if(person.GetBalance() < Price(person, change))
            return false;
        else
            return true;
    }
    //开头描述
    public void GetDiscription(SVIP_Account person, int choose, int change){
        System.out.println("***************************");
        System.out.println("魔法机器：尊贵的超级VIP，感谢您体验魔法机器");
        System.out.println("魔法机器：超级VIP可以享受定制的增高或降低服务");
        System.out.println("魔法机器：本次服务将收取费用：" + Price(person, change) + "元");
        if(BalanceCheck(person, change) == false)
            System.out.println("魔法机器：错误：账户余额不足，机器停止工作！！！");
        else{
            SexJudgeForSVIP(person);
            Service(choose, change);
            System.out.println("***************************");
        }
    } 
    //使用魔法机器
    public void UseMagicMechineForSVIP(SVIP_Account person, int change){
        int x;
        int sum;
        x = magicmechine.GetPower();
        sum = Price(person, change);
        person.ChangeHeight(x * change); 
        person.ReduceBalance(sum);
    }
}