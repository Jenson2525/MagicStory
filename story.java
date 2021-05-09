//魔法屋的故事
import MagicStory.*;

public class story {
    public static void main(String[] args){
        Person ming;
        Bread bread;
        MagicHouse magichouse;
        MagicMechine magicmechine;
        //初始化
        ming = new Person("小明", 140, "male", false);
        bread = new Bread(1); 
        magicmechine = new MagicMechine(50);
        magichouse = new MagicHouse(bread, magicmechine);
        //进入魔法屋前
        System.out.println("进入魔法屋前。");
        System.out.println("小明的身高是" + ming.GetHeight() + "厘米。");
        //进入魔法屋
        System.out.println("==========");
        System.out.println("小明吃面包长高");
        System.out. println("小明吃了一片面包。");
        magichouse.EatBread(ming, 1);
        ming.Display();
        System.out. println("小明吃了一片面包。");
        magichouse.EatBread(ming, 1);
        ming.Display();
        System.out.println("==========");
        System.out.println("太慢了，小明尝试魔法机器。");
        magichouse.UseMagicMechine(ming);
        ming.Display();

        //魔法屋故事续集
        Person fang, zhang;
        System.out.println("###########################");
        System.out.println("魔法屋故事续集1--VIP会员真不错");
        System.out.println("###########################");
        System.out.println("老板：欢迎光临魔法屋！");
        System.out.println("老板：同学，现在注册会员免费喔。。。");
        System.out.println("老板：走过路过，不要错过。。。");  
        System.out.println("小芳：这不是霸王条款吗？"); 
        System.out.println("小张：为了圆梦，忍忍吧！反正又不是咱们花钱！");
        //初始化
        fang = new Person("小芳", 130, "female", true);
        zhang = new Person("小张", 145, "male", true);
        //进入魔法屋前
        System.out.println("==========");
        System.out.println("进入魔法屋前");
        System.out.println("小芳的身高是: " + fang.GetHeight() + "厘米");
        System.out.println("小张的身高是: " + zhang.GetHeight() + "厘米");
        System.out.println("==========");
        //小芳使用魔法机器
        System.out.println("小芳使用魔法机器。。。");
        System.out.println("***************************");
        magichouse.VIPJudge(fang);
        magichouse.SexJudge(fang);
        magichouse.UseMagicMechine(fang);
        System.out.println("***************************");
        fang.Display();
        System.out.println("==========");
        //小张使用魔法机器
        System.out.println("小张使用魔法机器。。。");
        System.out.println("***************************");
        magichouse.VIPJudge(zhang);
        magichouse.SexJudge(zhang);
        magichouse.UseMagicMechine(zhang);
        System.out.println("***************************");
        zhang.Display();
        System.out.println("==========");
        System.out.println("小张：嘻。。。嘻嘻嘻。。。");
        System.out.println("小张：嘿。。。嘿嘿嘿。。。");
        System.out.println("老板：哈哈哈哈。。。。。。");

        //魔法屋故事续集2
        System.out.println("###########################");
        System.out.println("魔法屋故事续2--魔法机器里的惊魂一刻");
        System.out.println("###########################");
        System.out.println("老板：欢迎光临魔法屋！");
        System.out.println("老板：好久不见，有什么能帮您的吗？");
        System.out.println("小明：我想要变矮一点点，请问你们提供变矮服务吗？");
        System.out.println("老板：您真幸运，我们刚推出了超级VIP会员！");
        System.out.println("老板：超级VIP会员，可变高，可变矮，任君选择。");
        System.out.println("老板：注册就送50元账户充值红包两个。");
        System.out.println("小明：变矮多少钱？");
        System.out.println("老板：高矮一个价：男生每厘米10元，女生每厘米5元");
        System.out.println("小明：有点贵啊，试试吧，反正送了100元，我就减10厘米！");
        //进入魔法屋前
        System.out.println("==========");
        System.out.println("进入魔法屋前");
        System.out.println("小明的身高是: " + ming.GetHeight() + "厘米");
        System.out.println("==========");
        //创建新的对象
        SVIP_Account mingSVIP;
        mingSVIP = new SVIP_Account(ming.GetName(), ming.GetHeight(), ming.GetSex(), ming.VIP());  //升级账户
        //开始使用魔法机器
        System.out.println("小明使用魔法机器。。。");
        magichouse.GetDiscription(mingSVIP, 2, 10);
        magichouse.ServiceChoose(2);
        System.out.println("==========");
        System.out.println("紧急呼叫老板，魔法机器里面卡人了。。。");
        System.out.println("小明：救命啊！！！！！！！我被卡在机器里了！！！");
        System.out.println("==========");
        System.out.println("老板打开机器，把小明拽了出来。");
        System.out.println("小明：吓坏我了，什么破机器啊这是。");
        System.out.println("老板拿出尺子量了量，小明的身高是：" + mingSVIP.GetHeight() + "厘米");
        System.out.println("老板：还好身高没变，实在是抱歉。。。");
        System.out.println("小明：麻烦您查看一下账户余额，谢谢。");
        System.out.println("小明：好。");
        //重新使用魔法机器
        mingSVIP.DisPlayBalance();
        System.out.println("老板：啊，没钱你变个啥");
        System.out.println("小明：哦，我忘记把红包充值进去了。。。");
        System.out.println("老板：原来是这样，不好意思，让您受惊了。");
        System.out.println("老板：为了表示我们的歉意，我再送你5个50元红包吧。");
        System.out.println("老板：这次不要再忘了充值啊。");
        System.out.println("小明：谢谢老板。。。");
        System.out.println("小明往SVIP账户上充值350元。");
        mingSVIP.AddBalance(350);
        mingSVIP.DisPlayBalance();
        System.out.println("==========");
        System.out.println("小明使用魔法机器。。。");
        magichouse.GetDiscription(mingSVIP, 2, 10);
        magichouse.UseMagicMechineForSVIP(mingSVIP, 10);
        mingSVIP.Display();
        System.out.println("==========");
        System.out.println("小明查看账户。");
        mingSVIP.DisPlayBalance();
        System.out.println("小明：哈哈哈。。。今天真是太开心了，还赚了250元");
        System.out.println("老板：欢迎下次光临。不要忘了多介绍几个同学来啊，我给打折");
        System.out.println("老板：哈哈哈哈。。。。。。");
    }
}