package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: wR2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51013wR2 implements InterfaceC48812sj1<C50420vR2> {

    /* renamed from: a */
    public final Y94<BaseActivity> f115953a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f115954b;

    public C51013wR2(Y94<BaseActivity> y94, Y94<InterfaceC40001dr4> y942) {
        this.f115953a = y94;
        this.f115954b = y942;
    }

    /* renamed from: a */
    public static C51013wR2 m6839a(Y94<BaseActivity> y94, Y94<InterfaceC40001dr4> y942) {
        return new C51013wR2(y94, y942);
    }

    /* renamed from: c */
    public static C50420vR2 m6837c(BaseActivity baseActivity, InterfaceC40001dr4 interfaceC40001dr4) {
        return new C50420vR2(baseActivity, interfaceC40001dr4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50420vR2 get() {
        return m6837c(this.f115953a.get(), this.f115954b.get());
    }
}
