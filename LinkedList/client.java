public class client {
    public static void main(String[] args) throws Exception {
        LinkedList nl = new LinkedList();
        nl.addLast(10);
        nl.addLast(20);
        nl.display();
        nl.addLast(50);
        nl.addLast(60);
        nl.display();
        nl.addFirst(90);
        nl.display();
        nl.removeFirst();
        nl.display();
        System.out.println(nl.getFirst());
        System.out.println(nl.getLast());
        System.out.println(nl.getAt(2));
        System.out.println(nl.getAt(6));
        nl.addAt(2, 500);
        nl.display();
        nl.removeLast();
        nl.display();
        nl.removeAt(2);
        nl.display();
    }
}
