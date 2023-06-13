package io.reactivex.disposables;

import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.disposables.e */
/* loaded from: classes6.dex */
public abstract class AbstractC23467e<T> extends AtomicReference<T> implements InterfaceC23465c {
    private static final long serialVersionUID = 6537757548749041217L;

    public AbstractC23467e(T t) {
        super(C23544b.m32923e(t, "value is null"));
    }

    /* renamed from: a */
    public abstract void mo33019a(T t);

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            mo33019a(andSet);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return get() == null;
    }
}
