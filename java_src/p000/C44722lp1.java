package p000;

import androidx.fragment.app.FragmentManager;
/* renamed from: lp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44722lp1 implements InterfaceC48812sj1<C44129kp1> {

    /* renamed from: a */
    public final Y94<FragmentManager> f96773a;

    /* renamed from: b */
    public final Y94<Integer> f96774b;

    public C44722lp1(Y94<FragmentManager> y94, Y94<Integer> y942) {
        this.f96773a = y94;
        this.f96774b = y942;
    }

    /* renamed from: a */
    public static C44722lp1 m26768a(Y94<FragmentManager> y94, Y94<Integer> y942) {
        return new C44722lp1(y94, y942);
    }

    /* renamed from: c */
    public static C44129kp1 m26766c(FragmentManager fragmentManager, int i) {
        return new C44129kp1(fragmentManager, i);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44129kp1 get() {
        return m26766c(this.f96773a.get(), this.f96774b.get().intValue());
    }
}
