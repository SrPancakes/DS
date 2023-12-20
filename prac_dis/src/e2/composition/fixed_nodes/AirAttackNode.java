package e2.composition.fixed_nodes;

import e2.Navy;
import e2.NodeComponent;
import e2.composition.FixedNode;

public class AirAttackNode extends FixedNode {

    final private int airPower;

    public AirAttackNode(String name, NodeComponent son, int airPower){
        super(name + " AirAttack", son);
        this.airPower = airPower;
    }

    @Override
    public void challenge(Navy navy) {
        int finalHP = airPower - (2*navy.getAntiAircraft() + navy.getArmor());
        if(finalHP > 0) navy.setHp(navy.getHp() - finalHP);
        if(navy.getHp() <= 0) System.out.println(result(navy.getHp()));
        else getSon().challenge(navy);
    }
}
