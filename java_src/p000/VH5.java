package p000;

import co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Presenter;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: VH5 */
/* loaded from: classes2.dex */
public final class VH5 {

    /* renamed from: a */
    public final Y94<InterfaceC5225MD> f38836a;

    /* renamed from: b */
    public final Y94<InterfaceC42042hI5> f38837b;

    /* renamed from: c */
    public final Y94<InterfaceC33939Jy4> f38838c;

    /* renamed from: d */
    public final Y94<C22454gl> f38839d;

    /* renamed from: e */
    public final Y94<InterfaceC1880Ea> f38840e;

    public VH5(Y94<InterfaceC5225MD> y94, Y94<InterfaceC42042hI5> y942, Y94<InterfaceC33939Jy4> y943, Y94<C22454gl> y944, Y94<InterfaceC1880Ea> y945) {
        this.f38836a = y94;
        this.f38837b = y942;
        this.f38838c = y943;
        this.f38839d = y944;
        this.f38840e = y945;
    }

    /* renamed from: a */
    public static VH5 m80017a(Y94<InterfaceC5225MD> y94, Y94<InterfaceC42042hI5> y942, Y94<InterfaceC33939Jy4> y943, Y94<C22454gl> y944, Y94<InterfaceC1880Ea> y945) {
        return new VH5(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static SmartlockAssociationV2Presenter m80015c(InterfaceC5225MD interfaceC5225MD, InterfaceC42042hI5 interfaceC42042hI5, InterfaceC33939Jy4 interfaceC33939Jy4, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC14174b interfaceC14174b, InterfaceC40099e13 interfaceC40099e13) {
        return new SmartlockAssociationV2Presenter(interfaceC5225MD, interfaceC42042hI5, interfaceC33939Jy4, c22454gl, interfaceC1880Ea, dq3, lifecycleScopeProvider, interfaceC14174b, interfaceC40099e13);
    }

    /* renamed from: b */
    public SmartlockAssociationV2Presenter m80016b(DQ3 dq3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC14174b interfaceC14174b, InterfaceC40099e13 interfaceC40099e13) {
        return m80015c(this.f38836a.get(), this.f38837b.get(), this.f38838c.get(), this.f38839d.get(), this.f38840e.get(), dq3, lifecycleScopeProvider, interfaceC14174b, interfaceC40099e13);
    }
}
