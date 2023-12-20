package e2.composition;

import e2.Navy;
import e2.NodeComponent;

import java.util.ArrayList;
import java.util.List;

public abstract class DoubleNode implements NodeComponent{

    final private String name;
    final public List<NodeComponent> children;
    public String name(){ return this.name; }
    public void addSon(NodeComponent node){ if(children.size() < 2) children.add(node); }
    public void delSon(int i){ children.remove(i); }
    public NodeComponent getSon(int i){ return children.get(i); }
    public abstract void challenge(Navy navy);

    public int minNodes(){
        int optionA = 1 + getSon(0).minNodes();
        int optionB = 1 + getSon(1).minNodes();
        return Math.min(optionA, optionB);
    }

    public DoubleNode(String name, NodeComponent leftSon, NodeComponent rightSon){
        this.name = name;
        children = new ArrayList<>();
        addSon(leftSon); addSon(rightSon);
    }

    @Override
    public String toString(){
        return "(" + name + ", " + getSon(0).toString() + ", " + getSon(1).toString() + ")";
    }

}
