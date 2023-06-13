package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes8.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {
    private final int index;
    private final T value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(T value, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.index = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i) {
        if (i == this.index) {
            return this.value;
        }
        return null;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new OneElementArrayMap$iterator$1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }
}