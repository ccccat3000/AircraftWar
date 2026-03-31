package edu.hitsz.prop;

public class BloodProp extends BaseProp{
    public BloodProp(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }
    @Override
    public void active(){
        System.out.println("加血道具生效！");
    }
}
