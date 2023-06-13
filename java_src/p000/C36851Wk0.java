package p000;

import android.content.Context;
/* renamed from: Wk0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36851Wk0 implements InterfaceC48812sj1<C36617Vk0> {

    /* renamed from: a */
    public final Y94<Context> f41872a;

    public C36851Wk0(Y94<Context> y94) {
        this.f41872a = y94;
    }

    /* renamed from: a */
    public static C36851Wk0 m77898a(Y94<Context> y94) {
        return new C36851Wk0(y94);
    }

    /* renamed from: c */
    public static C36617Vk0 m77896c(Context context) {
        return new C36617Vk0(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36617Vk0 get() {
        return m77896c(this.f41872a.get());
    }
}
