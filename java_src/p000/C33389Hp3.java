package p000;

import androidx.fragment.app.FragmentManager;
/* renamed from: Hp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33389Hp3 implements InterfaceC48812sj1<C33155Gp3> {

    /* renamed from: a */
    public final Y94<FragmentManager> f13911a;

    /* renamed from: b */
    public final Y94<Integer> f13912b;

    public C33389Hp3(Y94<FragmentManager> y94, Y94<Integer> y942) {
        this.f13911a = y94;
        this.f13912b = y942;
    }

    /* renamed from: a */
    public static C33389Hp3 m103414a(Y94<FragmentManager> y94, Y94<Integer> y942) {
        return new C33389Hp3(y94, y942);
    }

    /* renamed from: c */
    public static C33155Gp3 m103412c(FragmentManager fragmentManager, int i) {
        return new C33155Gp3(fragmentManager, i);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33155Gp3 get() {
        return m103412c(this.f13911a.get(), this.f13912b.get().intValue());
    }
}
