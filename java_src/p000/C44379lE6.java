package p000;

import android.content.Context;
/* renamed from: lE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44379lE6 implements InterfaceC48812sj1<C43786kE6> {

    /* renamed from: a */
    public final Y94<Context> f95757a;

    public C44379lE6(Y94<Context> y94) {
        this.f95757a = y94;
    }

    /* renamed from: a */
    public static C44379lE6 m27639a(Y94<Context> y94) {
        return new C44379lE6(y94);
    }

    /* renamed from: c */
    public static C43786kE6 m27637c(Context context) {
        return new C43786kE6(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43786kE6 get() {
        return m27637c(this.f95757a.get());
    }
}
