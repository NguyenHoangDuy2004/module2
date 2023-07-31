package ss11_DSA_Stack_Queue.baitap;

public class TrienKhaiQueueXoayVong {

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }


    class Queue {
        Node front;
        Node rear;

        public Queue() {
            this.front = null;
            this.rear = null;
        }

        public void enQueue(int data) {
            Node newNode = new Node(data);

            if (front == null) {
                front = rear = newNode;
                rear.link = front;
            } else {
                rear.link = newNode;
                rear = newNode;
                rear.link = front;
            }
        }

        public void deQueue() {

            if (front == null) {
                System.out.println("Queue is empty!");
                return;
            }
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.link;
                rear.link = front;
            }
        }

        public void displayQueue() {
            if (front == null) {
                System.out.println("Queue is empty!");
                return;
            }

            Node temp = front;
            System.out.print("Queue: ");
            do {
                System.out.print(temp.data + " ");
                temp = temp.link;
            } while (temp != front);
            System.out.println();
        }
    }

    public class Solution {
        public  void main(String[] args) {
            Queue queue = new Queue();

            // Thêm phần tử vào hàng đợi
            queue.enQueue(10);
            queue.enQueue(20);
            queue.enQueue(30);
            queue.enQueue(40);
            queue.displayQueue();
            queue.deQueue();
            queue.deQueue();
            queue.displayQueue();
        }
    }

}
