package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: nE */
/* loaded from: classes3.dex */
public final class C26447nE implements InterfaceC48812sj1<C26017mE> {

    /* renamed from: a */
    public final Y94<BaseActivity> f99652a;

    /* renamed from: b */
    public final Y94<C12291b6> f99653b;

    public C26447nE(Y94<BaseActivity> y94, Y94<C12291b6> y942) {
        this.f99652a = y94;
        this.f99653b = y942;
    }

    /* renamed from: a */
    public static C26447nE m24136a(Y94<BaseActivity> y94, Y94<C12291b6> y942) {
        return new C26447nE(y94, y942);
    }

    /* renamed from: c */
    public static C26017mE m24134c(BaseActivity baseActivity, C12291b6 c12291b6) {
        return new C26017mE(baseActivity, c12291b6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C26017mE get() {
        return m24134c(this.f99652a.get(), this.f99653b.get());
    }
}
