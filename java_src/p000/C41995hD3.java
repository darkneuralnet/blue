package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: hD3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41995hD3 implements InterfaceC48812sj1<C41402gD3> {

    /* renamed from: a */
    public final Y94<BaseActivity> f84867a;

    /* renamed from: b */
    public final Y94<C2624G4> f84868b;

    public C41995hD3(Y94<BaseActivity> y94, Y94<C2624G4> y942) {
        this.f84867a = y94;
        this.f84868b = y942;
    }

    /* renamed from: a */
    public static C41995hD3 m36601a(Y94<BaseActivity> y94, Y94<C2624G4> y942) {
        return new C41995hD3(y94, y942);
    }

    /* renamed from: c */
    public static C41402gD3 m36599c(BaseActivity baseActivity, C2624G4 c2624g4) {
        return new C41402gD3(baseActivity, c2624g4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41402gD3 get() {
        return m36599c(this.f84867a.get(), this.f84868b.get());
    }
}
