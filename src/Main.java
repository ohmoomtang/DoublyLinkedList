public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
    }
}
