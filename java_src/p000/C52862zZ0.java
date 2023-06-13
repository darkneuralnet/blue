package p000;
/* renamed from: zZ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52862zZ0<T> implements InterfaceC49405tj1<T> {

    /* renamed from: a */
    public Z94<T> f121524a;

    /* renamed from: a */
    public static <T> void m1115a(Z94<T> z94, Z94<T> z942) {
        C52272yZ3.m3259b(z942);
        C52862zZ0 c52862zZ0 = (C52862zZ0) z94;
        if (c52862zZ0.f121524a == null) {
            c52862zZ0.f121524a = z942;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // p000.Z94
    public T get() {
        Z94<T> z94 = this.f121524a;
        if (z94 != null) {
            return z94.get();
        }
        throw new IllegalStateException();
    }
}
