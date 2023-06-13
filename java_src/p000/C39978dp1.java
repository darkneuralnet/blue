package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: dp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39978dp1 implements InterfaceC48812sj1<C39386cp1> {

    /* renamed from: a */
    public final Y94<BaseActivity> f77252a;

    /* renamed from: b */
    public final Y94<C0846C3> f77253b;

    public C39978dp1(Y94<BaseActivity> y94, Y94<C0846C3> y942) {
        this.f77252a = y94;
        this.f77253b = y942;
    }

    /* renamed from: a */
    public static C39978dp1 m43685a(Y94<BaseActivity> y94, Y94<C0846C3> y942) {
        return new C39978dp1(y94, y942);
    }

    /* renamed from: c */
    public static C39386cp1 m43683c(BaseActivity baseActivity, C0846C3 c0846c3) {
        return new C39386cp1(baseActivity, c0846c3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39386cp1 get() {
        return m43683c(this.f77252a.get(), this.f77253b.get());
    }
}
