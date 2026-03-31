package edu.hitsz.prop;

public class BombProp extends BaseProp{
    public BombProp(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }
    @Override
    public void active(){
        System.out.println("炸弹道具生效！");
    }
}
