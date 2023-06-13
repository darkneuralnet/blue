package p000;

import android.content.Context;
/* renamed from: it1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42983it1 implements InterfaceC48812sj1<C42390ht1> {

    /* renamed from: a */
    public final Y94<Context> f91649a;

    public C42983it1(Y94<Context> y94) {
        this.f91649a = y94;
    }

    /* renamed from: a */
    public static C42983it1 m31684a(Y94<Context> y94) {
        return new C42983it1(y94);
    }

    /* renamed from: c */
    public static C42390ht1 m31682c(Context context) {
        return new C42390ht1(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42390ht1 get() {
        return m31682c(this.f91649a.get());
    }
}
