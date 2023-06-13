package p000;

import android.content.Context;
/* renamed from: Lw2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34387Lw2 implements InterfaceC49405tj1<C34153Kw2> {

    /* renamed from: a */
    public final Z94<Context> f22310a;

    /* renamed from: b */
    public final Z94<InterfaceC34855Nw2> f22311b;

    public C34387Lw2(Z94<Context> z94, Z94<InterfaceC34855Nw2> z942) {
        this.f22310a = z94;
        this.f22311b = z942;
    }

    /* renamed from: a */
    public static C34387Lw2 m96103a(Z94<Context> z94, Z94<InterfaceC34855Nw2> z942) {
        return new C34387Lw2(z94, z942);
    }

    /* renamed from: c */
    public static C34153Kw2 m96101c(Context context, InterfaceC34855Nw2 interfaceC34855Nw2) {
        return new C34153Kw2(context, interfaceC34855Nw2);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C34153Kw2 get() {
        return m96101c(this.f22310a.get(), this.f22311b.get());
    }
}
