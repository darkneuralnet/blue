package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Wy3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36980Wy3 implements InterfaceC48812sj1<C36746Vy3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f42420a;

    /* renamed from: b */
    public final Y94<C39011cD1> f42421b;

    /* renamed from: c */
    public final Y94<C0384B4> f42422c;

    public C36980Wy3(Y94<BaseActivity> y94, Y94<C39011cD1> y942, Y94<C0384B4> y943) {
        this.f42420a = y94;
        this.f42421b = y942;
        this.f42422c = y943;
    }

    /* renamed from: a */
    public static C36980Wy3 m77598a(Y94<BaseActivity> y94, Y94<C39011cD1> y942, Y94<C0384B4> y943) {
        return new C36980Wy3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C36746Vy3 m77596c(BaseActivity baseActivity, C39011cD1 c39011cD1, C0384B4 c0384b4) {
        return new C36746Vy3(baseActivity, c39011cD1, c0384b4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36746Vy3 get() {
        return m77596c(this.f42420a.get(), this.f42421b.get(), this.f42422c.get());
    }
}
