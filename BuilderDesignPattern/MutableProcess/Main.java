package MutableProcess;

public class Main {
  public static void main(String[] args) {
    User user = new User.Builder()
        .name("Niyank Bam")
        .age(28)
        .email("jainniyank@gmail.com")
        .build();

    user.display();
  }
}
