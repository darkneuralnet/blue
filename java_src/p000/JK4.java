package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: JK4 */
/* loaded from: classes2.dex */
public final class JK4 {

    /* renamed from: a */
    public final Y94<MK4> f17355a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f17356b;

    public JK4(Y94<MK4> y94, Y94<InterfaceC1880Ea> y942) {
        this.f17355a = y94;
        this.f17356b = y942;
    }

    /* renamed from: a */
    public static JK4 m100703a(Y94<MK4> y94, Y94<InterfaceC1880Ea> y942) {
        return new JK4(y94, y942);
    }

    /* renamed from: c */
    public static GK4 m100701c(MK4 mk4, InterfaceC1880Ea interfaceC1880Ea, BaseActivity baseActivity, ScopeProvider scopeProvider, KK4 kk4, InterfaceC40099e13 interfaceC40099e13) {
        return new GK4(mk4, interfaceC1880Ea, baseActivity, scopeProvider, kk4, interfaceC40099e13);
    }

    /* renamed from: b */
    public GK4 m100702b(BaseActivity baseActivity, ScopeProvider scopeProvider, KK4 kk4, InterfaceC40099e13 interfaceC40099e13) {
        return m100701c(this.f17355a.get(), this.f17356b.get(), baseActivity, scopeProvider, kk4, interfaceC40099e13);
    }
}
