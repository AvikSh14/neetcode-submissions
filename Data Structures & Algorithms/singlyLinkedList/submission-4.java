class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;
    public LinkedList() {
        // head = new Node();
        // tail = new Node()''
    }

    public int get(int index) {
        System.out.println("Index: " + index +",size: " + size);
        if (index>=size) {
            System.out.println("Index: " + index);
            return -1;
        }
        Node runner = head;
        for(int i=0; i<index; i++) {
            runner = runner.next;
        }

        System.out.println("Printing get value");
        System.out.println("value: " + runner.value);

        return runner.value;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if (head==null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (tail==null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index>=size) {
            return false;
        }
        if (index == 0) {
            Node prev = head;
            head = head.next;
            prev.next = null;
            size--;
            return true;
        }

        Node runner = head;
        Node prev = null;
        for(int i=0; i<index; i++) {
            prev = runner;
            runner = runner.next;
        }
        
        prev.next = runner.next;
        if (index == size-1) {
            tail = prev;
        }
        size--;
        System.out.println("Tail value:" + tail.value);
        return true;

    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList();
        Node runner = head;

        while(runner!=null) {
            list.add(runner.value);
            runner = runner.next;
        }

        return list;
    }
}

class Node {
    int value;
    Node next;

    public Node() {

    } 

    public Node(int value) {
        this.value = value;
    }
    
}
