public class DoublyLinkedList<T>{

    private Node first;
    private Node last;

    public <T> DoublyLinkedList(){
        this.first=null;
        this.last=null;
    }

    public void push(T value){
        Node n = new Node(value);

        //First
        if(this.first==null && this.last==null){
            this.first=n;
            this.last=n;
        }
        //Second
        else if(this.first==this.last && this.first!=null && this.last !=null){
            this.last=n;
            this.first.setNext(this.last);
            this.last.setPrevious(this.first);
        }
        //n elements
        else{
            this.last.setNext(n);
            n.setPrevious(this.last);
            this.last=n;
        }
    }

    public T pop(){
        T returnedVal = this.last.getValue();
        if(this.first == this.last){
            return returnedVal;
        }
        this.last=this.last.getPrevious();
        this.last.setNext(null);
        return returnedVal;
    }

    public T shift(){
        T returnedVal = this.first.getValue();
        if(this.first == this.last){
            return returnedVal;
        }
        this.first=this.first.getNext();
        this.first.setPrevious(null);
        return returnedVal;
    }

    public void unshift(T value){
        Node n = new Node(value);

        //First
        if(this.first==null && this.last==null){
            this.first=n;
            this.last=n;
        }
        //Second
        else if(this.first==this.last && this.first!=null && this.last !=null){
            this.first.setPrevious(n);
            n.setNext(this.first);
            this.first=n;
        }
        //n elements
        else{
            this.first.setPrevious(n);
            n.setNext(this.first);
            this.first=n;
        }
    }

    class Node{
        private Node previous=null;
        private T current;
        private Node next=null;

        public Node(T val){
            this.current=val;
        }

        public Node getNext(){
            return this.next;
        }

        public Node getPrevious(){
            return this.previous;
        }

        public void setNext(Node n){
            this.next=n;
        }

        public void setPrevious(Node n){
            this.previous=n;
        }

        public T getValue(){
            return this.current;
        }

        public void setValue(T val){
            this.current=val;
        }
    }
}