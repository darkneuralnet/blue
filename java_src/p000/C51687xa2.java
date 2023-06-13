package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: xa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51687xa2 implements InterfaceC48812sj1<C51094wa2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f117821a;

    /* renamed from: b */
    public final Y94<C10556a4> f117822b;

    public C51687xa2(Y94<BaseActivity> y94, Y94<C10556a4> y942) {
        this.f117821a = y94;
        this.f117822b = y942;
    }

    /* renamed from: a */
    public static C51687xa2 m4997a(Y94<BaseActivity> y94, Y94<C10556a4> y942) {
        return new C51687xa2(y94, y942);
    }

    /* renamed from: c */
    public static C51094wa2 m4995c(BaseActivity baseActivity, C10556a4 c10556a4) {
        return new C51094wa2(baseActivity, c10556a4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51094wa2 get() {
        return m4995c(this.f117821a.get(), this.f117822b.get());
    }
}
