package edu.hitsz.prop;

public class SuperFireProp extends BaseProp{
    public SuperFireProp(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }
    @Override
    public void active(){
        System.out.println("超级火力道具生效！");
    }
}
