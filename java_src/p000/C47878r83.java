package p000;

import android.content.Context;
/* renamed from: r83  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47878r83 implements InterfaceC48812sj1<C47285q83> {

    /* renamed from: a */
    public final Y94<Context> f106520a;

    public C47878r83(Y94<Context> y94) {
        this.f106520a = y94;
    }

    /* renamed from: a */
    public static C47878r83 m16445a(Y94<Context> y94) {
        return new C47878r83(y94);
    }

    /* renamed from: c */
    public static C47285q83 m16443c(Context context) {
        return new C47285q83(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C47285q83 get() {
        return m16443c(this.f106520a.get());
    }
}
