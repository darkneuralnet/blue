package p000;

import android.content.Context;
/* renamed from: w53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50811w53 implements InterfaceC48812sj1<C45254mj0> {

    /* renamed from: a */
    public final P43 f115254a;

    /* renamed from: b */
    public final Y94<Context> f115255b;

    public C50811w53(P43 p43, Y94<Context> y94) {
        this.f115254a = p43;
        this.f115255b = y94;
    }

    /* renamed from: a */
    public static C50811w53 m7452a(P43 p43, Y94<Context> y94) {
        return new C50811w53(p43, y94);
    }

    /* renamed from: c */
    public static C45254mj0 m7450c(P43 p43, Context context) {
        return (C45254mj0) C51679xZ3.m5002e(p43.m90999H(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45254mj0 get() {
        return m7450c(this.f115254a, this.f115255b.get());
    }
}
