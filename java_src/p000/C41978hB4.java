package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: hB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41978hB4 implements InterfaceC48812sj1<C41385gB4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f84840a;

    /* renamed from: b */
    public final Y94<C19960e5> f84841b;

    public C41978hB4(Y94<BaseActivity> y94, Y94<C19960e5> y942) {
        this.f84840a = y94;
        this.f84841b = y942;
    }

    /* renamed from: a */
    public static C41978hB4 m36644a(Y94<BaseActivity> y94, Y94<C19960e5> y942) {
        return new C41978hB4(y94, y942);
    }

    /* renamed from: c */
    public static C41385gB4 m36642c(BaseActivity baseActivity, C19960e5 c19960e5) {
        return new C41385gB4(baseActivity, c19960e5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41385gB4 get() {
        return m36642c(this.f84840a.get(), this.f84841b.get());
    }
}
