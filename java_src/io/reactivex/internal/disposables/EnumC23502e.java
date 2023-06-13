package io.reactivex.internal.disposables;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.internal.fuseable.InterfaceC23550e;
/* renamed from: io.reactivex.internal.disposables.e */
/* loaded from: classes7.dex */
public enum EnumC23502e implements InterfaceC23550e<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m32992a(InterfaceC23476f interfaceC23476f) {
        interfaceC23476f.onSubscribe(INSTANCE);
        interfaceC23476f.onComplete();
    }

    /* renamed from: c */
    public static void m32991c(InterfaceC24541s<?> interfaceC24541s) {
        interfaceC24541s.onSubscribe(INSTANCE);
        interfaceC24541s.onComplete();
    }

    /* renamed from: d */
    public static void m32990d(InterfaceC23436D<?> interfaceC23436D) {
        interfaceC23436D.onSubscribe(INSTANCE);
        interfaceC23436D.onComplete();
    }

    /* renamed from: g */
    public static void m32989g(Throwable th, InterfaceC23476f interfaceC23476f) {
        interfaceC23476f.onSubscribe(INSTANCE);
        interfaceC23476f.onError(th);
    }

    /* renamed from: h */
    public static void m32988h(Throwable th, InterfaceC24541s<?> interfaceC24541s) {
        interfaceC24541s.onSubscribe(INSTANCE);
        interfaceC24541s.onError(th);
    }

    /* renamed from: i */
    public static void m32987i(Throwable th, InterfaceC23436D<?> interfaceC23436D) {
        interfaceC23436D.onSubscribe(INSTANCE);
        interfaceC23436D.onError(th);
    }

    /* renamed from: j */
    public static void m32986j(Throwable th, InterfaceC23445I<?> interfaceC23445I) {
        interfaceC23445I.onSubscribe(INSTANCE);
        interfaceC23445I.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23551f
    /* renamed from: b */
    public int mo31868b(int i) {
        return i & 2;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this == INSTANCE;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public Object poll() throws Exception {
        return null;
    }
}
