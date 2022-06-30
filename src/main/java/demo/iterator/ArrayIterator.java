package demo.iterator;

/**
 * @ClassName ArrayIterator
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 15:10
 * @Version 1.0
 */
public class ArrayIterator implements Iterator {

    private AggregateArrayImpl aggregate;


    private int index=0;

    public ArrayIterator(AggregateArrayImpl aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index<aggregate.getSize()){
            index += 1;
        };
    }

    @Override
    public boolean isDone() {
        return index==aggregate.getSize()-1;
    }

    @Override
    public Object current() {
        return aggregate.get(index);
    }
}
