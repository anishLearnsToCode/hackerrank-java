public class JavaSingletonPattern {
    public static void main(String[] args) {

    }

    private static class Singleton {
        private static final Singleton SINGLETON = new Singleton();
        public String str;

        private Singleton() { }

        public static Singleton getSingleInstance() {
            return SINGLETON;
        }
    }
}
