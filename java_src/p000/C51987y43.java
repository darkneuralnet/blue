package p000;
/* renamed from: y43  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51987y43 implements InterfaceC48812sj1<C51394x43> {

    /* renamed from: a */
    public final Y94<Boolean> f118711a;

    public C51987y43(Y94<Boolean> y94) {
        this.f118711a = y94;
    }

    /* renamed from: a */
    public static C51987y43 m4178a(Y94<Boolean> y94) {
        return new C51987y43(y94);
    }

    /* renamed from: c */
    public static C51394x43 m4176c(boolean z) {
        return new C51394x43(z);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51394x43 get() {
        return m4176c(this.f118711a.get().booleanValue());
    }
}
