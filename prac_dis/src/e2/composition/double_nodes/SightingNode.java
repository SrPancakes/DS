package e2.composition.double_nodes;

import e2.Navy;
import e2.NodeComponent;
import e2.composition.DoubleNode;

public class SightingNode extends DoubleNode {

    final private int refPoint;

    public SightingNode(String name, NodeComponent leftSon, NodeComponent rightSon, int refPoint){
        super(name + " Sighting", leftSon, rightSon);
        this.refPoint = refPoint;
    }

    @Override
    public void challenge(Navy navy) {
        if(navy.getViewLine() >= refPoint) getSon(0).challenge(navy);
        else getSon(1).challenge(navy);
    }
}
