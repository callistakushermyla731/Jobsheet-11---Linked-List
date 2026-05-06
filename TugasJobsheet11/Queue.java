package TugasJobsheet11;

public class Queue {
    Node front, rear;
    int size = 0;
    int max = 10; 

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node newNode = new Node(mhs);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node temp = front;
            System.out.println("\nIsi Antrian:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }
}
