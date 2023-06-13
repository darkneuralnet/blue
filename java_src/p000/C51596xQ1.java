package p000;

import android.content.Context;
/* renamed from: xQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51596xQ1 implements InterfaceC48812sj1<C51003wQ1> {

    /* renamed from: a */
    public final Y94<Context> f117587a;

    public C51596xQ1(Y94<Context> y94) {
        this.f117587a = y94;
    }

    /* renamed from: a */
    public static C51596xQ1 m5284a(Y94<Context> y94) {
        return new C51596xQ1(y94);
    }

    /* renamed from: c */
    public static C51003wQ1 m5282c(Context context) {
        return new C51003wQ1(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51003wQ1 get() {
        return m5282c(this.f117587a.get());
    }
}
