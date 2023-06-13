package com.uber.autodispose;

import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
enum AutoDisposableHelper implements InterfaceC23465c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m45240a(AtomicReference<InterfaceC23465c> atomicReference) {
        InterfaceC23465c andSet;
        InterfaceC23465c interfaceC23465c = atomicReference.get();
        AutoDisposableHelper autoDisposableHelper = DISPOSED;
        if (interfaceC23465c != autoDisposableHelper && (andSet = atomicReference.getAndSet(autoDisposableHelper)) != autoDisposableHelper) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return true;
    }
}
