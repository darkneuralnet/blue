package io.reactivex.internal.observers;

import io.reactivex.internal.fuseable.InterfaceC23550e;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.observers.b */
/* loaded from: classes6.dex */
public abstract class AbstractC23557b<T> extends AtomicInteger implements InterfaceC23550e<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
