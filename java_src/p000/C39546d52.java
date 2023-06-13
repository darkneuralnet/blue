package p000;

import dagger.Lazy;
/* renamed from: d52  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39546d52<T> implements InterfaceC48812sj1<T>, Lazy<T> {

    /* renamed from: b */
    public static final C39546d52<Object> f76109b = new C39546d52<>(null);

    /* renamed from: a */
    public final T f76110a;

    public C39546d52(T t) {
        this.f76110a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC48812sj1<T> m44621a(T t) {
        return new C39546d52(C51679xZ3.m5004c(t, "instance cannot be null"));
    }

    /* renamed from: b */
    public static <T> InterfaceC48812sj1<T> m44620b(T t) {
        if (t == null) {
            return m44619c();
        }
        return new C39546d52(t);
    }

    /* renamed from: c */
    public static <T> C39546d52<T> m44619c() {
        return (C39546d52<T>) f76109b;
    }

    @Override // p000.Y94
    public T get() {
        return this.f76110a;
    }
}
