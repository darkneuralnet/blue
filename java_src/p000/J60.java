package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: J60 */
/* loaded from: classes3.dex */
public final class J60 implements InterfaceC48812sj1<I60> {

    /* renamed from: a */
    public final Y94<BaseActivity> f16842a;

    /* renamed from: b */
    public final Y94<C20179f3> f16843b;

    /* renamed from: c */
    public final Y94<C52379yk1> f16844c;

    public J60(Y94<BaseActivity> y94, Y94<C20179f3> y942, Y94<C52379yk1> y943) {
        this.f16842a = y94;
        this.f16843b = y942;
        this.f16844c = y943;
    }

    /* renamed from: a */
    public static J60 m101149a(Y94<BaseActivity> y94, Y94<C20179f3> y942, Y94<C52379yk1> y943) {
        return new J60(y94, y942, y943);
    }

    /* renamed from: c */
    public static I60 m101147c(BaseActivity baseActivity, C20179f3 c20179f3, C52379yk1 c52379yk1) {
        return new I60(baseActivity, c20179f3, c52379yk1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public I60 get() {
        return m101147c(this.f16842a.get(), this.f16843b.get(), this.f16844c.get());
    }
}
