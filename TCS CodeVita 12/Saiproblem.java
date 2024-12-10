import java.util.*;

public class Saiproblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial balance and number of operations
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int cb = 0; // Current commit index
        List<Integer> transactions = new ArrayList<>();
        List<Integer> commitStates = new ArrayList<>();
        commitStates.add(b); // Initial balance as the first commit state

        for (int i = 0; i < n; i++) {
            String operation = scanner.next();

            if (operation.equals("read")) {
                System.out.println(commitStates.get(cb));
            } else if (operation.equals("credit") || operation.equals("debit")) {
                int x = scanner.nextInt();
                if (operation.equals("credit")) {
                    commitStates.set(cb, commitStates.get(cb) + x);
                } else {
                    commitStates.set(cb, commitStates.get(cb) - x);
                }
                transactions.add(operation.equals("credit") ? x : -x);
            } else if (operation.equals("abort")) {
                int x = scanner.nextInt();
                if (x <= transactions.size()) {
                    int valueToAbort = transactions.get(x - 1);
                    commitStates.set(cb, commitStates.get(cb) - valueToAbort);
                    transactions.set(x - 1, 0); // Mark as aborted
                }
            } else if (operation.equals("rollback")) {
                int x = scanner.nextInt();
                cb = x - 1;
                // Resize commitStates to discard states after the rollback point
                while (commitStates.size() > cb + 1) {
                    commitStates.remove(commitStates.size() - 1);
                }
            } else if (operation.equals("commit")) {
                commitStates.add(commitStates.get(cb));
                cb++;
            }
        }

        scanner.close();
    }
}