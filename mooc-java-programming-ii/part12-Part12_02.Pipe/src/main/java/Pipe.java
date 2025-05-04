import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pipe<T> {
    private List<T> obj;

    public Pipe() {
        this.obj = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.obj.add(value);
        this.obj = this.obj.stream().sorted().collect(Collectors.toList());
    }

    public T takeFromPipe() {
        try {
            T taked = this.obj.get(this.obj.size() - 1);
            this.obj.remove(this.obj.size() - 1);
            return taked;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean isInPipe() {
        return !this.obj.isEmpty();
    }
}
