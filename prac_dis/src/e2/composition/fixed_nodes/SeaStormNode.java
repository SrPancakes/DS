package e2.composition.fixed_nodes;

import e2.Navy;
import e2.NodeComponent;
import e2.composition.FixedNode;

public class SeaStormNode extends FixedNode {

    final private int stormPower;

    public SeaStormNode(String name, NodeComponent son, int stormPower) {
        super(name + " SeaStorm", son);
        this.stormPower = stormPower;
    }

    @Override
    public void challenge(Navy navy) {
        if(navy.getViewLine() < stormPower) navy.setHp(navy.getHp() - 10);
        if(navy.getHp() <= 0) System.out.println(result(navy.getHp()));
        else getSon().challenge(navy);
    }
}
