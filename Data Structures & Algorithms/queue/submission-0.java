class Deque {
    Node head, tail;
    int size;
    class Node {
        int value;
        Node next, prev;
        Node(int value) {
            this.value = value;
        }
    }

    public Deque() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
       size++;
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
       size++;
    }

    public int pop() {
        if (size==0) {
            return -1;
        }

        int value = tail.value;
        tail = tail.prev;
        if (tail==null) {
            head = null;
        } else {
            tail.next = null;
        }
        
        size--;

        return value;
    }

    public int popleft() {
        if (size==0) {
            return -1;
        }
        int value = head.value;
        head = head.next;
        if (head==null) {
            tail = null;
        } else {
            head.prev = null;
        }
        
        size--;

        return value;
    }
}
