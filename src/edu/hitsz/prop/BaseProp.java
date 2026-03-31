package edu.hitsz.prop;

import edu.hitsz.basic.AbstractFlyingObject;

public abstract class BaseProp extends AbstractFlyingObject {
    public BaseProp(int locationX, int locationY, int speedY, int speedX){
        super(locationX, locationY, speedX, speedY);
    }
    public abstract void active();
}
