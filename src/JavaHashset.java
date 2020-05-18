// https://www.hackerrank.com/challenges/java-hashset/problem

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        Set<Pair> set = new HashSet<>();

        while (queries-- > 0) {
            String first = scanner.next();
            String second = scanner.next();
            Pair pair = new Pair(first, second);
            set.add(pair);
            System.out.println(set.size());
        }
    }

    private static class Pair {
        private final String first;
        private final String second;

        Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(first, pair.first) &&
                    Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
