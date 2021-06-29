import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MainListas {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("Daniel");
    names.add("Mayara");
    List<String> dNames = names.parallelStream().
    filter(name -> name.startsWith("D")).collect(Collectors.toList());
    dNames.forEach(System.out::println);
  }
  
}