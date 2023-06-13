package p000;

import android.content.Context;
/* renamed from: Ga6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33023Ga6 implements InterfaceC48812sj1<C32789Fa6> {

    /* renamed from: a */
    public final Y94<Context> f12117a;

    public C33023Ga6(Y94<Context> y94) {
        this.f12117a = y94;
    }

    /* renamed from: a */
    public static C33023Ga6 m104997a(Y94<Context> y94) {
        return new C33023Ga6(y94);
    }

    /* renamed from: c */
    public static C32789Fa6 m104995c(Context context) {
        return new C32789Fa6(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32789Fa6 get() {
        return m104995c(this.f12117a.get());
    }
}
