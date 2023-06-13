package zendesk.support.suas;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes8.dex */
public class Action<E> {
    private final String actionType;
    private final E data;

    public Action(String str, E e) {
        this.actionType = str;
        this.data = e;
    }

    public String getActionType() {
        return this.actionType;
    }

    public <F> F getData(Class<F> cls) {
        if (cls.isInstance(this.data)) {
            return cls.cast(this.data);
        }
        return null;
    }

    public E getRawData() {
        return this.data;
    }

    public String toString() {
        return "Action{actionType='" + this.actionType + CoreConstants.SINGLE_QUOTE_CHAR + ", data=" + this.data + CoreConstants.CURLY_RIGHT;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E, F] */
    public <F> F getData() {
        return this.data;
    }

    public Action(String str) {
        this.actionType = str;
        this.data = null;
    }
}
