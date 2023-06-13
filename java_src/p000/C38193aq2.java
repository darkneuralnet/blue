package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: aq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38193aq2 implements InterfaceC48812sj1<C37132Xp2> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f56395a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f56396b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f56397c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f56398d;

    /* renamed from: e */
    public final Y94<InterfaceC10636aM> f56399e;

    /* renamed from: f */
    public final Y94<GI3> f56400f;

    /* renamed from: g */
    public final Y94<InterfaceC37857aG6> f56401g;

    /* renamed from: h */
    public final Y94<InterfaceC38786bq2> f56402h;

    /* renamed from: i */
    public final Y94<InterfaceC40821fE6> f56403i;

    /* renamed from: j */
    public final Y94<InterfaceC46692p83> f56404j;

    public C38193aq2(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC40099e13> y943, Y94<ScopeProvider> y944, Y94<InterfaceC10636aM> y945, Y94<GI3> y946, Y94<InterfaceC37857aG6> y947, Y94<InterfaceC38786bq2> y948, Y94<InterfaceC40821fE6> y949, Y94<InterfaceC46692p83> y9410) {
        this.f56395a = y94;
        this.f56396b = y942;
        this.f56397c = y943;
        this.f56398d = y944;
        this.f56399e = y945;
        this.f56400f = y946;
        this.f56401g = y947;
        this.f56402h = y948;
        this.f56403i = y949;
        this.f56404j = y9410;
    }

    /* renamed from: a */
    public static C38193aq2 m65396a(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC40099e13> y943, Y94<ScopeProvider> y944, Y94<InterfaceC10636aM> y945, Y94<GI3> y946, Y94<InterfaceC37857aG6> y947, Y94<InterfaceC38786bq2> y948, Y94<InterfaceC40821fE6> y949, Y94<InterfaceC46692p83> y9410) {
        return new C38193aq2(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    /* renamed from: c */
    public static C37132Xp2 m65394c(InterfaceC44647lh6 interfaceC44647lh6, InterfaceC1880Ea interfaceC1880Ea, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC10636aM interfaceC10636aM, GI3 gi3, InterfaceC37857aG6 interfaceC37857aG6, InterfaceC38786bq2 interfaceC38786bq2, InterfaceC40821fE6 interfaceC40821fE6, InterfaceC46692p83 interfaceC46692p83) {
        return new C37132Xp2(interfaceC44647lh6, interfaceC1880Ea, interfaceC40099e13, scopeProvider, interfaceC10636aM, gi3, interfaceC37857aG6, interfaceC38786bq2, interfaceC40821fE6, interfaceC46692p83);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37132Xp2 get() {
        return m65394c(this.f56395a.get(), this.f56396b.get(), this.f56397c.get(), this.f56398d.get(), this.f56399e.get(), this.f56400f.get(), this.f56401g.get(), this.f56402h.get(), this.f56403i.get(), this.f56404j.get());
    }
}
