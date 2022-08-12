public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Node<Integer> neew = new Node<>();
        neew.data = 6;

        list.addData(6);
        list.addData(16);
        list.addData(26);
        list.addData(36);
        list.addNode(neew);
        list.addData(46);
        list.addData(56);
        //list.addNode(neew);
        list.infinit();
    }
}