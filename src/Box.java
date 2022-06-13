import java.util.ArrayList;
import java.util.List;

    public class Box<T extends Fruit> {
        public List<T> getList() {
            return list;
        }

        private final List<T> list; // final

        public Box() {
            list = new ArrayList<>(); // <T>
        }

        void add(T obj) {
            list.add(obj);
        }

        void move(Box<T> box) {
            box.getList().addAll(list);
            list.clear();
        }

        void info() {
            if (list.isEmpty()) {
                System.out.println("Empty box");
            } else {
                System.out.println("In the box: " + list.get(0).toString() + " " + list.size() + " pcs.");
            }
        }

        float getWeight() {
            if (list.isEmpty()) {
                return 0;
            } else {
                return list.size() * list.get(0).getWeight();
            }
        }

        boolean compare(Box<? extends Fruit> box) {
            return this.getWeight() == box.getWeight();
        }
}
