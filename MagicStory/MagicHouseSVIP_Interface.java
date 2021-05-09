package MagicStory;

public interface MagicHouseSVIP_Interface {
    public int Price(SVIP_Account person, int change);
    public void GetDiscription(SVIP_Account person, int choose, int change);
    public void SexJudgeForSVIP(SVIP_Account person);
    public void ServiceChoose(int choose);
    public boolean BalanceCheck(SVIP_Account person, int change);
    public void Service(int choose, int change);
}
