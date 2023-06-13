package io.reactivex.internal.disposables;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.disposables.b */
/* loaded from: classes7.dex */
public final class C23499b extends AtomicReference<InterfaceC23483f> implements InterfaceC23465c {
    private static final long serialVersionUID = 5718521705281392066L;

    public C23499b(InterfaceC23483f interfaceC23483f) {
        super(interfaceC23483f);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        InterfaceC23483f andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Exception e) {
                C23475a.m33009b(e);
                C24508a.m31988u(e);
            }
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == null;
    }
}
