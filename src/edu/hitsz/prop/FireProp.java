package edu.hitsz.prop;

public class FireProp extends BaseProp{
    public FireProp(int locationX, int locationY, int speedX, int speedY)
    {
        super(locationX, locationY, speedX, speedY);
    }
    @Override
    public void active(){
        System.out.println("火力道具生效！");
    }
}
