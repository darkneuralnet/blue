package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.InterfaceC23552g;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.subscriptions.a */
/* loaded from: classes8.dex */
public abstract class AbstractC24457a<T> extends AtomicInteger implements InterfaceC23552g<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
