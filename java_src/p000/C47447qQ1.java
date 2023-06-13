package p000;

import android.content.Context;
/* renamed from: qQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47447qQ1 implements InterfaceC48812sj1<C46854pQ1> {

    /* renamed from: a */
    public final Y94<Context> f105285a;

    public C47447qQ1(Y94<Context> y94) {
        this.f105285a = y94;
    }

    /* renamed from: a */
    public static C47447qQ1 m17530a(Y94<Context> y94) {
        return new C47447qQ1(y94);
    }

    /* renamed from: c */
    public static C46854pQ1 m17528c(Context context) {
        return new C46854pQ1(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46854pQ1 get() {
        return m17528c(this.f105285a.get());
    }
}
