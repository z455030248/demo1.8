package demo.iterator;

/**
 * @ClassName Iterator
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 15:08
 * @Version 1.0
 */
public interface Iterator {

    void first();

    void next();

    boolean isDone();

    Object current();

}
