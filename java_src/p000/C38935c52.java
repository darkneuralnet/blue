package p000;
/* renamed from: c52  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38935c52<T> implements InterfaceC48220rj1<T> {

    /* renamed from: b */
    public static final C38935c52<Object> f60065b = new C38935c52<>(null);

    /* renamed from: a */
    public final T f60066a;

    public C38935c52(T t) {
        this.f60066a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC48220rj1<T> m61946a(T t) {
        return new C38935c52(CZ3.m112115c(t, "instance cannot be null"));
    }

    @Override // p000.Y94
    public T get() {
        return this.f60066a;
    }
}
