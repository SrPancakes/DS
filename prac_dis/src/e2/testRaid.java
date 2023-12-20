package e2;

import e2.leafs.FinalNode;
import e2.composition.double_nodes.BattleNode;
import e2.composition.double_nodes.SightingNode;
import e2.composition.fixed_nodes.AirAttackNode;
import e2.composition.fixed_nodes.SeaStormNode;

public class testRaid {

    public static void main(String[] args) {
        Navy navy = new Navy("A" , 10, 20, 30, 30, 20);
        Navy enemy = new Navy("B", 50, 15, 12, 13, 10);
        NodeComponent startNode = new SightingNode("A",
                new BattleNode("B",
                        new SeaStormNode("D", new SeaStormNode("F", new FinalNode("Z324"), 15), 15),
                        new AirAttackNode("E", new SeaStormNode("F", new FinalNode("Z123"), 15), 100),
                        enemy),
                new AirAttackNode("C", new SeaStormNode("F", new SeaStormNode("F", new FinalNode("Z543"), 15), 15), 25),
                15);
        Raid raid = new Raid(startNode, navy);
        raid.start();
        System.out.println(raid.mapRaid() + "\n");
        System.out.println(raid.minNodes() + "\n"  + "\n");
        System.out.println(navy.toString());
    }

}
