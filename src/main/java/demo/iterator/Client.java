package demo.iterator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 15:24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        String[] strings={"111","222","333","444"};

        AggregateArrayImpl aggregateArray = new AggregateArrayImpl(strings);
        Iterator iterator = aggregateArray.createIterator();

        while (!iterator.isDone()){
            Object current = iterator.current();
            System.out.println(current);
            iterator.next();
        }
    }
}
