public class Exercise01 {
  public static void main(String[] args) {
    int num = 5, count = 1;
do {
    num += count;  // num = num + count
    System.out.println(num);
    count++;  // Incrementa count (sem esse contador vira um loog infinito)
} while (count <= 3);
  }
}
