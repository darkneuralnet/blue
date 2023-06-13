package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: P92 */
/* loaded from: classes3.dex */
public final class P92 implements InterfaceC48812sj1<M92> {

    /* renamed from: a */
    public final Y94<BaseActivity> f28028a;

    public P92(Y94<BaseActivity> y94) {
        this.f28028a = y94;
    }

    /* renamed from: a */
    public static P92 m90630a(Y94<BaseActivity> y94) {
        return new P92(y94);
    }

    /* renamed from: c */
    public static M92 m90628c(BaseActivity baseActivity) {
        return new M92(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public M92 get() {
        return m90628c(this.f28028a.get());
    }
}
