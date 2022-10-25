import java.util.ArrayList;
import java.util.List;
public class P1 {
 @Override
 public String toString() {
 return "Stack [elements=" + elements + "]";
 }
 private List<String> elements = new ArrayList<>();
 public String peek() {
 if (elements.isEmpty()) {
 return null;
 }
 return elements.get(elements.size() - 1);
 }
 public String pop() {
 if (elements.isEmpty()) {
 return null;
 }
 String top = elements.get(elements.size() - 1);
 elements.remove(elements.size() - 1);
 return top;
 }
 public void push(String element) {
 elements.add(element);
 }
 public int size() {
 return elements.size();
 }
 public boolean isEmpty() {
 return elements.isEmpty();
 }
 public static void main(String[] args) {
 P1 stack = new P1();
 System.out.println("Is Stack Empty:" + stack.isEmpty());
 stack.push("Mann");
 stack.push("Mann 1");
 stack.push("Mann 2");
 stack.push("Mann 3");
 System.out.println("Is Stack Empty:" + stack.isEmpty());
 System.out.println(stack);
 System.out.println("Stack Size:" + stack.size());

 System.out.println("Peek Top Element:" + stack.peek());
 System.out.println("After peek:" + stack);
 System.out.println("Pop Top Element:" + stack.pop());
 System.out.println("After pop:" + stack);
 stack.push("Tara bhai PATEL!!");
 System.out.println(stack);
 System.out.println("Stack Size:" + stack.size());
 }
}
