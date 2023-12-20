package e2.composition.double_nodes;

import e2.Navy;
import e2.NodeComponent;
import e2.composition.DoubleNode;
import org.w3c.dom.Node;

public class BattleNode extends DoubleNode {

    final private Navy enemy;

    public BattleNode(String name, NodeComponent leftSon, NodeComponent rightSon, Navy enemy){
        super(name + " Battle", leftSon, rightSon);
        this.enemy = enemy;
    }

    @Override
    public void challenge(Navy navy) {
        int finalHP = (enemy.getFirePower() - navy.getArmor());
        if(finalHP > 0) navy.setHp(navy.getHp() - finalHP);

        if(navy.getHp() <= 0) System.out.println(result(navy.getHp()));
        else {
            int finalEnemyHP = (navy.getFirePower() - enemy.getArmor());
            enemy.setHp(enemy.getHp() - finalEnemyHP);

            if (enemy.getHp() <= 0) getSon(0).challenge(navy);
            else getSon(1).challenge(navy);
        }
    }
}
