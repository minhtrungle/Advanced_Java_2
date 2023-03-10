package Day2.Example_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /*Giả sử có 10 tin nhắn cùng gửi vào hệ thống
        * Hệ thống chỉ có thể xử lí 3s/1tim
        * Để lưu trữ các tin nhắn đưa vào hàng đợi*/
        Queue<Message> messageQueue = new PriorityQueue<>();
        messageQueue.add(new Message(1, "ms1"));
        messageQueue.add(new Message(2, "ms2"));
        messageQueue.add(new Message(3, "ms3"));
        messageQueue.add(new Message(4, "ms4"));
        messageQueue.add(new Message(5, "ms5"));
        messageQueue.add(new Message(6, "ms6"));
        messageQueue.add(new Message(7, "ms7"));

        while (!messageQueue.isEmpty() ) {
            Message ms = messageQueue.poll();
            System.out.println(ms);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
