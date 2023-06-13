package p000;

import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationPresenter;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: FG5 */
/* loaded from: classes2.dex */
public final class FG5 {

    /* renamed from: a */
    public final Y94<InterfaceC5225MD> f9115a;

    /* renamed from: b */
    public final Y94<InterfaceC42042hI5> f9116b;

    /* renamed from: c */
    public final Y94<InterfaceC33939Jy4> f9117c;

    /* renamed from: d */
    public final Y94<C22454gl> f9118d;

    public FG5(Y94<InterfaceC5225MD> y94, Y94<InterfaceC42042hI5> y942, Y94<InterfaceC33939Jy4> y943, Y94<C22454gl> y944) {
        this.f9115a = y94;
        this.f9116b = y942;
        this.f9117c = y943;
        this.f9118d = y944;
    }

    /* renamed from: a */
    public static FG5 m107368a(Y94<InterfaceC5225MD> y94, Y94<InterfaceC42042hI5> y942, Y94<InterfaceC33939Jy4> y943, Y94<C22454gl> y944) {
        return new FG5(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static SmartlockAssociationPresenter m107366c(InterfaceC5225MD interfaceC5225MD, InterfaceC42042hI5 interfaceC42042hI5, InterfaceC33939Jy4 interfaceC33939Jy4, C22454gl c22454gl, DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, FF5 ff5, InterfaceC40099e13 interfaceC40099e13) {
        return new SmartlockAssociationPresenter(interfaceC5225MD, interfaceC42042hI5, interfaceC33939Jy4, c22454gl, dq3, lifecycleScopeProvider, ff5, interfaceC40099e13);
    }

    /* renamed from: b */
    public SmartlockAssociationPresenter m107367b(DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, FF5 ff5, InterfaceC40099e13 interfaceC40099e13) {
        return m107366c(this.f9115a.get(), this.f9116b.get(), this.f9117c.get(), this.f9118d.get(), dq3, lifecycleScopeProvider, ff5, interfaceC40099e13);
    }
}
