package e2.composition;

import e2.Navy;
import e2.NodeComponent;

import java.util.List;

public abstract class FixedNode implements NodeComponent{

    final private String name;
    final private NodeComponent son;

    public String name(){
        return this.name;
    }
    public NodeComponent getSon(){ return this.son; }

    public abstract void challenge(Navy navy);

    public int minNodes(){
        return 1 + son.minNodes();
    }

    public FixedNode(String name, NodeComponent son){
        this.name = name;
        this.son = son;
    }

    @Override
    public String toString(){
        return "(" + name + ", " + son.toString() + ")";
    }

}
