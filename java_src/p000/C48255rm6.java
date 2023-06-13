package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: rm6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48255rm6 implements InterfaceC48812sj1<C47662qm6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f107608a;

    /* renamed from: b */
    public final Y94<C27137p4> f107609b;

    /* renamed from: c */
    public final Y94<C51394x43> f107610c;

    public C48255rm6(Y94<BaseActivity> y94, Y94<C27137p4> y942, Y94<C51394x43> y943) {
        this.f107608a = y94;
        this.f107609b = y942;
        this.f107610c = y943;
    }

    /* renamed from: a */
    public static C48255rm6 m15401a(Y94<BaseActivity> y94, Y94<C27137p4> y942, Y94<C51394x43> y943) {
        return new C48255rm6(y94, y942, y943);
    }

    /* renamed from: c */
    public static C47662qm6 m15399c(BaseActivity baseActivity, C27137p4 c27137p4, C51394x43 c51394x43) {
        return new C47662qm6(baseActivity, c27137p4, c51394x43);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C47662qm6 get() {
        return m15399c(this.f107608a.get(), this.f107609b.get(), this.f107610c.get());
    }
}
