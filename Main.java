import java.util.*;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Integer> arrayData = new ArrayList<>();
    private static final ArrayStack stack = new ArrayStack();
    private static final ArrayQueue queue = new ArrayQueue();
    private static final SimpleLinkedList linkedList = new SimpleLinkedList();
    private static final Graph graph = new Graph();
    private static final ArrayList<String> results = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n=============================================");
            System.out.println("     DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("=============================================");
            System.out.println("1. Array Operations\n2. Stack Operations\n3. Queue Operations\n4. Linked List Operations\n5. Searching Operations\n6. Graph Operations\n7. Performance Comparison\n8. Display All Results\n9. Exit");
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1 -> arrayMenu(); case 2 -> stackMenu(); case 3 -> queueMenu();
                case 4 -> linkedListMenu(); case 5 -> searchingMenu(); case 6 -> graphMenu();
                case 7 -> performanceMenu(); case 8 -> showResults();
                case 9 -> { running = false; System.out.println("Thank you for using the analyzer."); }
                default -> System.out.println("Invalid choice. Please enter a number from 1 to 9.");
            }
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = input.nextLine().trim();
            try { return Integer.parseInt(line); }
            catch (NumberFormatException e) { System.out.println("Invalid input. Please enter a whole number."); }
        }
    }
    private static String readText(String prompt) {
        System.out.print(prompt);
        return input.nextLine().trim();
    }
    private static void arrayMenu() {
        while (true) {
            System.out.println("\n--- ARRAY OPERATIONS ---\n1. Insert\n2. Delete by value\n3. Search\n4. Display\n5. Back");
            int c = readInt("Choice: ");
            if (c == 1) { int v = readInt("Value to insert: "); arrayData.add(v); System.out.println("Inserted."); }
            else if (c == 2) { int v = readInt("Value to delete: "); if (arrayData.remove(Integer.valueOf(v))) System.out.println("Deleted."); else System.out.println("Value not found."); }
            else if (c == 3) { int v = readInt("Value to search: "); int idx = arrayData.indexOf(v); record("Array search for " + v + ": " + (idx >= 0 ? "found at index " + idx : "not found")); System.out.println(results.get(results.size()-1)); }
            else if (c == 4) System.out.println("Array values: " + arrayData);
            else if (c == 5) return; else System.out.println("Invalid choice.");
        }
    }
    private static void stackMenu() {
        while (true) {
            System.out.println("\n--- STACK (LIFO) ---\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Back");
            int c = readInt("Choice: ");
            if (c == 1) { stack.push(readInt("Value to push: ")); System.out.println("Pushed."); }
            else if (c == 2) { Integer v = stack.pop(); System.out.println(v == null ? "Stack is empty; cannot pop." : "Popped: " + v); }
            else if (c == 3) { Integer v = stack.peek(); System.out.println(v == null ? "Stack is empty." : "Top value: " + v); }
            else if (c == 4) System.out.println("Top -> " + stack.display());
            else if (c == 5) return; else System.out.println("Invalid choice.");
        }
    }
    private static void queueMenu() {
        while (true) {
            System.out.println("\n--- QUEUE (FIFO) ---\n1. Enqueue\n2. Dequeue\n3. Front\n4. Display\n5. Back");
            int c = readInt("Choice: ");
            if (c == 1) { queue.enqueue(readInt("Value to enqueue: ")); System.out.println("Enqueued."); }
            else if (c == 2) { Integer v = queue.dequeue(); System.out.println(v == null ? "Queue is empty; cannot dequeue." : "Dequeued: " + v); }
            else if (c == 3) { Integer v = queue.peek(); System.out.println(v == null ? "Queue is empty." : "Front value: " + v); }
            else if (c == 4) System.out.println("Front -> " + queue.display());
            else if (c == 5) return; else System.out.println("Invalid choice.");
        }
    }
    private static void linkedListMenu() {
        while (true) {
            System.out.println("\n--- LINKED LIST ---\n1. Insert at end\n2. Delete by value\n3. Search\n4. Display\n5. Back");
            int c = readInt("Choice: ");
            if (c == 1) { linkedList.add(readInt("Value to insert: ")); System.out.println("Inserted."); }
            else if (c == 2) { int v = readInt("Value to delete: "); System.out.println(linkedList.delete(v) ? "Deleted." : "Value not found."); }
            else if (c == 3) { int v = readInt("Value to search: "); System.out.println(linkedList.contains(v) ? "Value found." : "Value not found."); }
            else if (c == 4) System.out.println(linkedList.display());
            else if (c == 5) return; else System.out.println("Invalid choice.");
        }
    }
    private static void searchingMenu() {
        while (true) {
            System.out.println("\n--- SEARCHING ---\nCurrent array: " + arrayData + "\n1. Linear Search\n2. Binary Search (sorts a copy)\n3. Back");
            int c = readInt("Choice: ");
            if (c == 1 || c == 2) {
                int target = readInt("Value to find: ");
                ArrayList<Integer> data = new ArrayList<>(arrayData);
                long start = System.nanoTime(); int steps = 0; int found = -1;
                if (c == 1) {
                    for (int i = 0; i < data.size(); i++) { steps++; if (data.get(i) == target) { found = i; break; } }
                    long elapsed = System.nanoTime() - start;
                    String msg = "Linear Search: " + (found >= 0 ? "found at index " + found : "not found") + "; steps=" + steps + "; time=" + elapsed + " ns";
                    record(msg); System.out.println(msg);
                } else {
                    Collections.sort(data); start = System.nanoTime(); int low = 0, high = data.size()-1;
                    while (low <= high) { steps++; int mid = low + (high-low)/2; if (data.get(mid) == target) { found = mid; break; } if (data.get(mid) < target) low = mid+1; else high = mid-1; }
                    long elapsed = System.nanoTime() - start;
                    String msg = "Binary Search on sorted copy: " + (found >= 0 ? "found at sorted index " + found : "not found") + "; steps=" + steps + "; time=" + elapsed + " ns";
                    record(msg); System.out.println(msg);
                }
            } else if (c == 3) return; else System.out.println("Invalid choice.");
        }
    }
    private static void graphMenu() {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS (undirected) ---\n1. Add vertex\n2. Add edge\n3. Display graph\n4. BFS traversal\n5. DFS traversal\n6. Back");
            int c = readInt("Choice: ");
            if (c == 1) { String v = readText("Vertex label: "); graph.addVertex(v); System.out.println("Vertex added (or already existed)."); }
else if (c == 2) {
    String a = readText("First vertex: ");
    String b = readText("Second vertex: ");

    if (a.isBlank() || b.isBlank()) {
        System.out.println("Vertex labels cannot be empty.");
    } else if (graph.addEdge(a, b)) {
        System.out.println("Edge added. Vertices are created if needed.");
    } else {
        System.out.println("Edge already exists.");
    }
}            else if (c == 3) System.out.println(graph.display());
            else if (c == 4 || c == 5) { String start = readText("Start vertex: "); List<String> order = c == 4 ? graph.bfs(start) : graph.dfs(start); String msg = (c == 4 ? "BFS" : "DFS") + " from " + start + ": " + (order.isEmpty() ? "vertex not found" : order); record(msg); System.out.println(msg); }
            else if (c == 6) return; else System.out.println("Invalid choice.");
        }
    }
    private static void performanceMenu() {
        System.out.println("\n--- PERFORMANCE / COMPLEXITY COMPARISON ---");
        System.out.println("Linear Search: worst-case O(n); checks values one by one.");
        System.out.println("Binary Search: worst-case O(log n) after sorting; requires sorted data.");
        System.out.println("Stack push/pop/peek: O(1) average with ArrayList end operations.");
        System.out.println("Queue enqueue/dequeue: O(1) using ArrayDeque.");
        System.out.println("Linked-list search/delete: O(n); traversal may inspect each node.");
        System.out.println("BFS and DFS: O(V + E) with adjacency lists.");
        System.out.println("\nRecorded measurements:"); showResults();
    }
    private static void record(String s) { results.add(s); }
    private static void showResults() {
        if (results.isEmpty()) System.out.println("No search/traversal results recorded yet.");
        else { System.out.println("--- Recorded Results ---"); for (String r : results) System.out.println("- " + r); }
    }

    private static class ArrayStack {
        private final ArrayList<Integer> values = new ArrayList<>();
        void push(int v) { values.add(v); }
        Integer pop() { return values.isEmpty() ? null : values.remove(values.size()-1); }
        Integer peek() { return values.isEmpty() ? null : values.get(values.size()-1); }
        String display() { ArrayList<Integer> copy = new ArrayList<>(values); Collections.reverse(copy); return copy.toString(); }
    }
    private static class ArrayQueue {
        private final Queue<Integer> values = new ArrayDeque<>();
        void enqueue(int v) { values.offer(v); }
        Integer dequeue() { return values.poll(); }
        Integer peek() { return values.peek(); }
        String display() { return values.toString(); }
    }
    private static class SimpleLinkedList {
        private Node head;
        void add(int value) { Node n = new Node(value); if (head == null) { head = n; return; } Node cur = head; while (cur.next != null) cur = cur.next; cur.next = n; }
        boolean delete(int value) { if (head == null) return false; if (head.value == value) { head = head.next; return true; } Node cur = head; while (cur.next != null) { if (cur.next.value == value) { cur.next = cur.next.next; return true; } cur = cur.next; } return false; }
        boolean contains(int value) { Node cur = head; while (cur != null) { if (cur.value == value) return true; cur = cur.next; } return false; }
        String display() { StringBuilder b = new StringBuilder(); Node cur = head; while (cur != null) { b.append(cur.value).append(" -> "); cur = cur.next; } return b.length() == 0 ? "Empty list" : b.append("null").toString(); }
        private static class Node { int value; Node next; Node(int v) { value = v; } }
    }
    private static class Graph {
        private final Map<String, LinkedHashSet<String>> adjacency = new LinkedHashMap<>();
        void addVertex(String v) { if (!v.isBlank()) adjacency.putIfAbsent(v, new LinkedHashSet<>()); }
boolean addEdge(String a, String b) {
    if (a.isBlank() || b.isBlank()) {
        return false;
    }

    addVertex(a);
    addVertex(b);

    boolean added = adjacency.get(a).add(b);
    adjacency.get(b).add(a);

    return added;
}        String display() { if (adjacency.isEmpty()) return "Graph is empty."; StringBuilder s = new StringBuilder(); for (String v : adjacency.keySet()) s.append(v).append(" -> ").append(adjacency.get(v)).append(System.lineSeparator()); return s.toString(); }
        List<String> bfs(String start) { if (!adjacency.containsKey(start)) return Collections.emptyList(); List<String> order = new ArrayList<>(); Set<String> visited = new LinkedHashSet<>(); Queue<String> q = new ArrayDeque<>(); q.offer(start); visited.add(start); while (!q.isEmpty()) { String v = q.poll(); order.add(v); for (String next : adjacency.get(v)) if (visited.add(next)) q.offer(next); } return order; }
        List<String> dfs(String start) { if (!adjacency.containsKey(start)) return Collections.emptyList(); List<String> order = new ArrayList<>(); Set<String> visited = new LinkedHashSet<>(); dfsVisit(start, visited, order); return order; }
        private void dfsVisit(String v, Set<String> visited, List<String> order) { visited.add(v); order.add(v); for (String next : adjacency.get(v)) if (!visited.contains(next)) dfsVisit(next, visited, order); }
    }
}
