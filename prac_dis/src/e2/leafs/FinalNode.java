package e2.leafs;

import e2.Navy;
import e2.NodeComponent;

public class FinalNode implements NodeComponent {

    final private String name;
    public FinalNode(String name){
        this.name = name;
    }
    public String name(){return this.name;}
    @Override
    public String result(int finalHp){
        return "Sortie Result:\n\tSUCCESS:\n\tLast Visited Node: " + name.split(" ")[0] + "\n\tFinal HP: " + finalHp;
    }
    public int minNodes(){ return 1; }
    @Override
    public void challenge(Navy navy) {
        System.out.println(result(navy.getHp()));
    }

    @Override
    public String toString(){
        return "(" + name + " End)";
    }
}
