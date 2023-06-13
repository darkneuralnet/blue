package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.InterfaceC23552g;
/* renamed from: io.reactivex.internal.subscriptions.d */
/* loaded from: classes8.dex */
public enum EnumC24460d implements InterfaceC23552g<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m32301a(InterfaceC42141hT5<?> interfaceC42141hT5) {
        interfaceC42141hT5.mo31867a(INSTANCE);
        interfaceC42141hT5.onComplete();
    }

    /* renamed from: c */
    public static void m32300c(Throwable th, InterfaceC42141hT5<?> interfaceC42141hT5) {
        interfaceC42141hT5.mo31867a(INSTANCE);
        interfaceC42141hT5.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23551f
    /* renamed from: b */
    public int mo31868b(int i) {
        return i & 2;
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return true;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        EnumC24463g.m32287h(j);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
