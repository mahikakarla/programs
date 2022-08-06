package linked_lists;

public class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        this.data = data;
    }

    public void display (){
        Node current = head;

        if(head == null){
            System.out.println("Empty LinkedList.");
            return;
        }
        System.out.println("\nNodes of a SinglyLinkedList: ");
        while (current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Done.");
    }

    public void delete(int data){
        if(head == null) return;
        Node current = head;
        while (current.next != null)
        {
            if (current.next.data == data)
                current.next = current.next.next;
                return;
        }
    }

    public static void main(String[] args) {    
        
        Node nodes = new Node(-1);
            
        //Add nodes to the list    
        nodes.addNode(77);    
        nodes.addNode(22);    
        nodes.addNode(33);    
        nodes.addNode(55);    
            
        //Displays the nodes present in the list    
        nodes.display();    

        nodes.delete(22);
        nodes.display();    

        nodes.addNode(25);
        nodes.display();    

    }


}
