package io.reactivex.internal.disposables;

import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: io.reactivex.internal.disposables.a */
/* loaded from: classes7.dex */
public final class C23498a extends AtomicReferenceArray<InterfaceC23465c> implements InterfaceC23465c {
    private static final long serialVersionUID = 2746389416410565408L;

    public C23498a(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean m33001a(int i, InterfaceC23465c interfaceC23465c) {
        InterfaceC23465c interfaceC23465c2;
        do {
            interfaceC23465c2 = get(i);
            if (interfaceC23465c2 == EnumC23501d.DISPOSED) {
                interfaceC23465c.dispose();
                return false;
            }
        } while (!compareAndSet(i, interfaceC23465c2, interfaceC23465c));
        if (interfaceC23465c2 != null) {
            interfaceC23465c2.dispose();
            return true;
        }
        return true;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        InterfaceC23465c andSet;
        if (get(0) != EnumC23501d.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                InterfaceC23465c interfaceC23465c = get(i);
                EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
                if (interfaceC23465c != enumC23501d && (andSet = getAndSet(i, enumC23501d)) != enumC23501d && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get(0) == EnumC23501d.DISPOSED;
    }
}
