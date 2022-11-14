//package basket;
//
//public class IteratorShablon {
//    public static void main(String[] args) {
//        ConcreteAgregate c = new ConcreteAgregate();
//        Iterator it = c.getIterator();
//        while (it.hasNext()) {
//            System.out.println((String) it.next());
//        }
//
//    }
//}
//interface Iterator{
//    boolean hasNext();
//    Object next();
//}
//interface Container{
//    Iterator getIterator();
//}
//class ConcreteAgregate implements Container{
//    String[] tasks = {"Родить сына", "Посадить дерево", "Постромть дом"};
//    @Override
//    public Iterator getIterator() {
//        return new TaskOperator();
//    }
//    private class TaskOperator implements Iterator{
//        int index = 0;
//        @Override
//        public boolean hasNext() {
//            if (index< tasks.length){
//                return true;
//            }
//            return false;
//        }
//        @Override
//        public Object next() {
//            return tasks[index++];
//        }
//    }
//}
