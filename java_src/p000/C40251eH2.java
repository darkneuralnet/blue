package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: eH2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40251eH2 implements InterfaceC48812sj1<C39659dH2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f78188a;

    public C40251eH2(Y94<BaseActivity> y94) {
        this.f78188a = y94;
    }

    /* renamed from: a */
    public static C40251eH2 m43058a(Y94<BaseActivity> y94) {
        return new C40251eH2(y94);
    }

    /* renamed from: c */
    public static C39659dH2 m43056c(BaseActivity baseActivity) {
        return new C39659dH2(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39659dH2 get() {
        return m43056c(this.f78188a.get());
    }
}
