package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: w76  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50834w76 implements InterfaceC48812sj1<C50241v76> {

    /* renamed from: a */
    public final Y94<BaseActivity> f115388a;

    /* renamed from: b */
    public final Y94<C25594l4> f115389b;

    public C50834w76(Y94<BaseActivity> y94, Y94<C25594l4> y942) {
        this.f115388a = y94;
        this.f115389b = y942;
    }

    /* renamed from: a */
    public static C50834w76 m7389a(Y94<BaseActivity> y94, Y94<C25594l4> y942) {
        return new C50834w76(y94, y942);
    }

    /* renamed from: c */
    public static C50241v76 m7387c(BaseActivity baseActivity, C25594l4 c25594l4) {
        return new C50241v76(baseActivity, c25594l4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50241v76 get() {
        return m7387c(this.f115388a.get(), this.f115389b.get());
    }
}
