package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: pA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46710pA1 implements InterfaceC48812sj1<C46117oA1> {

    /* renamed from: a */
    public final Y94<BaseActivity> f103221a;

    public C46710pA1(Y94<BaseActivity> y94) {
        this.f103221a = y94;
    }

    /* renamed from: a */
    public static C46710pA1 m19853a(Y94<BaseActivity> y94) {
        return new C46710pA1(y94);
    }

    /* renamed from: c */
    public static C46117oA1 m19851c(BaseActivity baseActivity) {
        return new C46117oA1(baseActivity);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46117oA1 get() {
        return m19851c(this.f103221a.get());
    }
}
