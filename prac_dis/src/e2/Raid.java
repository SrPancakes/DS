package e2;

public class Raid {

    final private NodeComponent startNode;
    final private Navy navy;

    public Raid(NodeComponent startNode, Navy navy){
        this.startNode = startNode;
        this.navy = navy;
    }

    public void start(){
        startNode.challenge(navy);
    }

    public String mapRaid(){
        return startNode.toString();
    }

    public int minNodes(){
        return startNode.minNodes();
    }

}
