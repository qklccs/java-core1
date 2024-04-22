package lr3;
class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node2 head;

    public void createHead(int data) {
        Node2 newNode2 = new Node2(data);
        if (head == null) {
            head = newNode2;
        } else {
            newNode2.next = head;
            head = newNode2;
        }
    }

    public void createTail(int data) {
        Node2 newNode2 = new Node2(data);
        if (head == null) {
            head = newNode2;
        } else {
            Node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node2 current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public void insert(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            createHead(data);
            return;
        }
        Node2 newNode2 = new Node2(data);
        Node2 current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Invalid index");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid index");
            return;
        }
        newNode2.next = current.next;
        current.next = newNode2;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node2 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node2 current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Invalid index");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Invalid index");
        return;
        }
        current.next = current.next.next;
        }
        }

class fvd {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.createHead(3);
        list.createTail(5);
        list.addFirst(1);
        list.addLast(7);
        list.insert(2, 4);
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        System.out.println("List: " + list.toString());
    }
}