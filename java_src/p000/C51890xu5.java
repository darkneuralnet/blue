package p000;

import android.content.Context;
/* renamed from: xu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51890xu5 implements InterfaceC48812sj1<C51297wu5> {

    /* renamed from: a */
    public final Y94<Context> f118320a;

    public C51890xu5(Y94<Context> y94) {
        this.f118320a = y94;
    }

    /* renamed from: a */
    public static C51890xu5 m4477a(Y94<Context> y94) {
        return new C51890xu5(y94);
    }

    /* renamed from: c */
    public static C51297wu5 m4475c(Context context) {
        return new C51297wu5(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51297wu5 get() {
        return m4475c(this.f118320a.get());
    }
}
