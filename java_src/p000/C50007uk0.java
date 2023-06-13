package p000;

import android.content.Context;
import p000.InterfaceC41706gk0;
/* renamed from: uk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50007uk0 implements InterfaceC49405tj1<Boolean> {

    /* renamed from: a */
    public final Z94<Context> f112824a;

    /* renamed from: b */
    public final Z94<Integer> f112825b;

    public C50007uk0(Z94<Context> z94, Z94<Integer> z942) {
        this.f112824a = z94;
        this.f112825b = z942;
    }

    /* renamed from: a */
    public static C50007uk0 m9820a(Z94<Context> z94, Z94<Integer> z942) {
        return new C50007uk0(z94, z942);
    }

    /* renamed from: c */
    public static boolean m9818c(Context context, int i) {
        return InterfaceC41706gk0.AbstractC22421c.m37847n(context, i);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public Boolean get() {
        return Boolean.valueOf(m9818c(this.f112824a.get(), this.f112825b.get().intValue()));
    }
}
