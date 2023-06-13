package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Xs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37158Xs1 implements InterfaceC48812sj1<C36690Vs1> {

    /* renamed from: a */
    public final Y94<BaseActivity> f44076a;

    public C37158Xs1(Y94<BaseActivity> y94) {
        this.f44076a = y94;
    }

    /* renamed from: a */
    public static C37158Xs1 m76195a(Y94<BaseActivity> y94) {
        return new C37158Xs1(y94);
    }

    /* renamed from: c */
    public static C36690Vs1 m76193c(BaseActivity baseActivity) {
        return new C36690Vs1(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36690Vs1 get() {
        return m76193c(this.f44076a.get());
    }
}
