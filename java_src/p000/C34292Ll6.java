package p000;

import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Ll6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34292Ll6 implements InterfaceC48812sj1<C34058Kl6> {

    /* renamed from: a */
    public final Y94<BaseActivity> f22028a;

    /* renamed from: b */
    public final Y94<RecyclerView> f22029b;

    public C34292Ll6(Y94<BaseActivity> y94, Y94<RecyclerView> y942) {
        this.f22028a = y94;
        this.f22029b = y942;
    }

    /* renamed from: a */
    public static C34292Ll6 m96375a(Y94<BaseActivity> y94, Y94<RecyclerView> y942) {
        return new C34292Ll6(y94, y942);
    }

    /* renamed from: c */
    public static C34058Kl6 m96373c(BaseActivity baseActivity, RecyclerView recyclerView) {
        return new C34058Kl6(baseActivity, recyclerView);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34058Kl6 get() {
        return m96373c(this.f22028a.get(), this.f22029b.get());
    }
}
