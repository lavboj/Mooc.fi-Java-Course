public class Hideout<T> {
    private T obj;

    public void putIntoHideout(T toHide) {
        this.obj = toHide;
    }

    public T takeFromHideout() {
        T taked = this.obj;
        this.obj = null;
        return taked;
    }

    public boolean isInHideout() {
        if (this.obj != null) {
            return true;
        }else return false;
    }
}
