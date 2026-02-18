import java.util.Stack;

public class ParantesSjekker<T> {
    public boolean sjekkParantes(String s) {

        Stack<Character> stabel = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stabel.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stabel.empty()) {
                    return false;
                }
                char topp = stabel.pop();

                if (!erMatchendeParantes(topp, c)) {
                    return false;
                }

            }
        }
        return stabel.isEmpty();
    }

    boolean erMatchendeParantes(char start, char slutt){
        return (start == '(' && slutt==')') || (start == '[' && slutt ==']') || (start == '{' && slutt == '}');
    }

}
