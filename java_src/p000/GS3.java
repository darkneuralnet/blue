package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: GS3 */
/* loaded from: classes2.dex */
public final class GS3 implements InterfaceC48812sj1<InterfaceC41546gT3> {

    /* renamed from: a */
    public final FS3 f11945a;

    /* renamed from: b */
    public final Y94<BaseActivity> f11946b;

    public GS3(FS3 fs3, Y94<BaseActivity> y94) {
        this.f11945a = fs3;
        this.f11946b = y94;
    }

    /* renamed from: a */
    public static GS3 m105082a(FS3 fs3, Y94<BaseActivity> y94) {
        return new GS3(fs3, y94);
    }

    /* renamed from: c */
    public static InterfaceC41546gT3 m105080c(FS3 fs3, BaseActivity baseActivity) {
        return (InterfaceC41546gT3) C51679xZ3.m5002e(fs3.m107133a(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41546gT3 get() {
        return m105080c(this.f11945a, this.f11946b.get());
    }
}
