/**
 * Created with IntelliJ IDEA.
 * User: Zeyad
 * Date: 9/20/14
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DataStructure<E, T extends DataStructure> {

    public void add();

    public void remove();

    public void addFirst();

    public void addLast();

    public void addAll(T structure);

    public void removeAll(T structure);


}
