package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: hM3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42076hM3 implements InterfaceC48812sj1<C41483gM3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f85037a;

    public C42076hM3(Y94<BaseActivity> y94) {
        this.f85037a = y94;
    }

    /* renamed from: a */
    public static C42076hM3 m36526a(Y94<BaseActivity> y94) {
        return new C42076hM3(y94);
    }

    /* renamed from: c */
    public static C41483gM3 m36524c(BaseActivity baseActivity) {
        return new C41483gM3(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41483gM3 get() {
        return m36524c(this.f85037a.get());
    }
}
