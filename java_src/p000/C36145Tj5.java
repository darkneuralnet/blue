package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Tj5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36145Tj5 implements InterfaceC48812sj1<C35911Sj5> {

    /* renamed from: a */
    public final Y94<BaseActivity> f35988a;

    /* renamed from: b */
    public final Y94<C8191U5> f35989b;

    public C36145Tj5(Y94<BaseActivity> y94, Y94<C8191U5> y942) {
        this.f35988a = y94;
        this.f35989b = y942;
    }

    /* renamed from: a */
    public static C36145Tj5 m83064a(Y94<BaseActivity> y94, Y94<C8191U5> y942) {
        return new C36145Tj5(y94, y942);
    }

    /* renamed from: c */
    public static C35911Sj5 m83062c(BaseActivity baseActivity, C8191U5 c8191u5) {
        return new C35911Sj5(baseActivity, c8191u5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35911Sj5 get() {
        return m83062c(this.f35988a.get(), this.f35989b.get());
    }
}
