package zendesk.support.suas;
/* loaded from: classes8.dex */
public abstract class Reducer<E> {
    public abstract E getInitialState();

    public String getStateKey() {
        return State.keyForClass(getInitialState().getClass());
    }

    public abstract E reduce(E e, Action<?> action);
}
