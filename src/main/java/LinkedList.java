public class LinkedList<T> {
    private Node<T> root;

    public void addData(T data){
        Node<T> n= new Node<>();
        n.data=data;
        Node<T> current = root;
        if(root==null){
            root=n;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next= n;
        }
    }
    public void addNode(Node<T> a){
        Node<T> current = root;
        if(root==null){
            root=a;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next= a;
        }
    }
    public String toString(){
        return root + " ";
    }
    public void infinit(){
        Node<T> n1 = new Node<>();
        Node<T> n2 = new Node<>();
        n1=root;
        n2=root.next;
        while(n2.next!=null){
            if(n2.next.next==null){
                System.out.println("Ez ! végtelen");
                break;
            }
            else {
                if (n1 != n2) {
                    n1 = n1.next;
                    n2 = n2.next.next;
                } else {
                    System.out.println("Ez végtelen");
                    break;
                }
            }
        }
    }
}
