package ImmutableProcess;

public class Main {

  public static void main(String[] args) {
    User user = new User.Builder("Niyank Bam")
        .age(28)
        .email("jainniyank@gmail.com")
        .build();

    user.display();
  }
}
