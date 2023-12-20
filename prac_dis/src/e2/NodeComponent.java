package e2;

public interface NodeComponent {

    String name();
    void challenge(Navy navy);
    int minNodes();
    default String result(int finalHp){
        return "Sortie Result:\n\tFAIL:\n\tLast Visited Node: " + name().split(" ")[0] + "\n\tFinal HP: " + finalHp;
    }
}
