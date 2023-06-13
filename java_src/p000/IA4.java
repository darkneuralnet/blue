package p000;

import android.content.Context;
/* renamed from: IA4 */
/* loaded from: classes3.dex */
public final class IA4 implements InterfaceC48812sj1<HA4> {

    /* renamed from: a */
    public final Y94<Context> f14627a;

    public IA4(Y94<Context> y94) {
        this.f14627a = y94;
    }

    /* renamed from: a */
    public static IA4 m102825a(Y94<Context> y94) {
        return new IA4(y94);
    }

    /* renamed from: c */
    public static HA4 m102823c(Context context) {
        return new HA4(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HA4 get() {
        return m102823c(this.f14627a.get());
    }
}
