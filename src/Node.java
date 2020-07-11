import java.util.ArrayList;
import java.util.List;

public class Node {
    public static Node ground;
    public boolean isAdded = false;
    public Node parentNode = null;
    public double voltage;
    public int union;
    boolean internal = true;

    public List<Element> elementList = new ArrayList<Element>();
    public List<Node> adjacentNodes = new ArrayList<Node>();
    public List<Double> voltageList = new ArrayList<Double>();

    public String name;
    public Union belongUnion;

    Node(String givenName) {
        name = givenName;
        voltage = 0;
    }

    Node() {
    }

    // public double getVoltage() {
    // return (voltageList.get(voltageList.size() - 1));
    // }

}
