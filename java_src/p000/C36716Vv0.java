package p000;

import dagger.MembersInjector;
/* renamed from: Vv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36716Vv0 implements MembersInjector<C36248Tv0> {

    /* renamed from: a */
    public final Y94<C32513Dw0> f39983a;

    /* renamed from: b */
    public final Y94<C35312Pv0> f39984b;

    /* renamed from: c */
    public final Y94<C34142Kv0> f39985c;

    /* renamed from: a */
    public static void m79234a(C36248Tv0 c36248Tv0, C34142Kv0 c34142Kv0) {
        c36248Tv0.f36450d = c34142Kv0;
    }

    /* renamed from: b */
    public static void m79233b(C36248Tv0 c36248Tv0, C35312Pv0 c35312Pv0) {
        c36248Tv0.f36449c = c35312Pv0;
    }

    /* renamed from: d */
    public static void m79231d(C36248Tv0 c36248Tv0, C32513Dw0 c32513Dw0) {
        c36248Tv0.f36448b = c32513Dw0;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(C36248Tv0 c36248Tv0) {
        m79231d(c36248Tv0, this.f39983a.get());
        m79233b(c36248Tv0, this.f39984b.get());
        m79234a(c36248Tv0, this.f39985c.get());
    }
}
