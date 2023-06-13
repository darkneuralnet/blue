package p000;

import android.content.Context;
import p000.InterfaceC41706gk0;
/* renamed from: Ek0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32639Ek0 implements InterfaceC49405tj1<Integer> {

    /* renamed from: a */
    public final Z94<Context> f7997a;

    public C32639Ek0(Z94<Context> z94) {
        this.f7997a = z94;
    }

    /* renamed from: a */
    public static C32639Ek0 m108543a(Z94<Context> z94) {
        return new C32639Ek0(z94);
    }

    /* renamed from: c */
    public static int m108541c(Context context) {
        return InterfaceC41706gk0.AbstractC22421c.m37837x(context);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public Integer get() {
        return Integer.valueOf(m108541c(this.f7997a.get()));
    }
}
