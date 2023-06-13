package p000;

import android.content.Context;
/* renamed from: vD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50296vD4 implements InterfaceC48812sj1<C49704uD4> {

    /* renamed from: a */
    public final Y94<Context> f113709a;

    public C50296vD4(Y94<Context> y94) {
        this.f113709a = y94;
    }

    /* renamed from: a */
    public static C50296vD4 m9010a(Y94<Context> y94) {
        return new C50296vD4(y94);
    }

    /* renamed from: c */
    public static C49704uD4 m9008c(Context context) {
        return new C49704uD4(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49704uD4 get() {
        return m9008c(this.f113709a.get());
    }
}
