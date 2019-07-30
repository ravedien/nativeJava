package Async;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

  private static Random rand = new Random();

  public static void run() {
    for (int i = 0; 3 > i; i++) {
      CompletableFuture.supplyAsync(() -> initNotif()).thenApply(e -> addMessage(e))
          .thenApply(e -> addReceiver(e)).thenAccept(System.out::println);
    }
  }

  private static Notification addReceiver(Notification e) {
    e.setReceiver("sample receiver");
    return e;
  }

  private static Notification addMessage(Notification e) {
    e.setMessage("sample message");
    return e;
  }

  private static Notification initNotif() {
    Notification ret = new CompletableFutureDemo.Notification();
    ret.setId(rand.nextInt());
    return ret;
  }

  public static void main(String[] args) {
    CompletableFutureDemo.run();
  }

  public static class Notification {

    private Integer id;
    private String message;
    private String receiver;

    public Notification() {}

    public Notification(Integer id, String message, String receiver) {
      super();
      this.id = id;
      this.message = message;
      this.receiver = receiver;
    }

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }

    public String getReceiver() {
      return receiver;
    }

    public void setReceiver(String receiver) {
      this.receiver = receiver;
    }

    @Override
    public String toString() {
      return "Notification [id=" + id + ", message=" + message + ", receiver=" + receiver + "]";
    }

  }


}
