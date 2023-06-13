package p000;

import android.content.Context;
/* renamed from: AD4 */
/* loaded from: classes3.dex */
public final class AD4 implements InterfaceC48812sj1<C52668zD4> {

    /* renamed from: a */
    public final Y94<Context> f296a;

    public AD4(Y94<Context> y94) {
        this.f296a = y94;
    }

    /* renamed from: a */
    public static AD4 m115960a(Y94<Context> y94) {
        return new AD4(y94);
    }

    /* renamed from: c */
    public static C52668zD4 m115958c(Context context) {
        return new C52668zD4(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52668zD4 get() {
        return m115958c(this.f296a.get());
    }
}
