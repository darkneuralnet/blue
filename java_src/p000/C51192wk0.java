package p000;

import android.content.Context;
import p000.InterfaceC41706gk0;
/* renamed from: wk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51192wk0 implements InterfaceC49405tj1<Boolean> {

    /* renamed from: a */
    public final Z94<Context> f116414a;

    public C51192wk0(Z94<Context> z94) {
        this.f116414a = z94;
    }

    /* renamed from: a */
    public static C51192wk0 m6426a(Z94<Context> z94) {
        return new C51192wk0(z94);
    }

    /* renamed from: c */
    public static boolean m6424c(Context context) {
        return InterfaceC41706gk0.AbstractC22421c.m37845p(context);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public Boolean get() {
        return Boolean.valueOf(m6424c(this.f116414a.get()));
    }
}
