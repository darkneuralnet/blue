package p000;

import android.content.Context;
/* renamed from: Kc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33975Kc4 implements InterfaceC48812sj1<C33741Jc4> {

    /* renamed from: a */
    public final Y94<Context> f19942a;

    public C33975Kc4(Y94<Context> y94) {
        this.f19942a = y94;
    }

    /* renamed from: a */
    public static C33975Kc4 m98663a(Y94<Context> y94) {
        return new C33975Kc4(y94);
    }

    /* renamed from: c */
    public static C33741Jc4 m98661c(Context context) {
        return new C33741Jc4(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33741Jc4 get() {
        return m98661c(this.f19942a.get());
    }
}
