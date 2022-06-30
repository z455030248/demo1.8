package demo.iterator;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName AggregateArrayImpl
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 15:12
 * @Version 1.0
 */
@Setter
@Getter
public class AggregateArrayImpl implements Aggregate {


    private String[] item;

    public AggregateArrayImpl(String[] item) {
        this.item = item;
    }

    public String get(int index) {
        return item[index];
    }


    public int getSize() {
        return item.length;
    }


    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }
}
