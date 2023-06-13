package p000;

import android.view.ViewGroup;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUiImplFactory;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: hq0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42359hq0 {

    /* renamed from: a */
    public final Y94<InterfaceC12495bn> f85973a;

    /* renamed from: b */
    public final Y94<InterfaceC10636aM> f85974b;

    /* renamed from: c */
    public final Y94<LocationSelectionUiImplFactory> f85975c;

    /* renamed from: d */
    public final Y94<LocationSelectionPresenterImplFactory> f85976d;

    /* renamed from: e */
    public final Y94<InterfaceC36675Vq4> f85977e;

    public C42359hq0(Y94<InterfaceC12495bn> y94, Y94<InterfaceC10636aM> y942, Y94<LocationSelectionUiImplFactory> y943, Y94<LocationSelectionPresenterImplFactory> y944, Y94<InterfaceC36675Vq4> y945) {
        this.f85973a = y94;
        this.f85974b = y942;
        this.f85975c = y943;
        this.f85976d = y944;
        this.f85977e = y945;
    }

    /* renamed from: a */
    public static C42359hq0 m35772a(Y94<InterfaceC12495bn> y94, Y94<InterfaceC10636aM> y942, Y94<LocationSelectionUiImplFactory> y943, Y94<LocationSelectionPresenterImplFactory> y944, Y94<InterfaceC36675Vq4> y945) {
        return new C42359hq0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C40580eq0 m35770c(InterfaceC12495bn interfaceC12495bn, InterfaceC10636aM interfaceC10636aM, LocationSelectionUiImplFactory locationSelectionUiImplFactory, LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory, InterfaceC36675Vq4 interfaceC36675Vq4, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, ViewGroup viewGroup, InterfaceC40099e13 interfaceC40099e13) {
        return new C40580eq0(interfaceC12495bn, interfaceC10636aM, locationSelectionUiImplFactory, locationSelectionPresenterImplFactory, interfaceC36675Vq4, baseActivity, lifecycleScopeProvider, viewGroup, interfaceC40099e13);
    }

    /* renamed from: b */
    public C40580eq0 m35771b(BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, ViewGroup viewGroup, InterfaceC40099e13 interfaceC40099e13) {
        return m35770c(this.f85973a.get(), this.f85974b.get(), this.f85975c.get(), this.f85976d.get(), this.f85977e.get(), baseActivity, lifecycleScopeProvider, viewGroup, interfaceC40099e13);
    }
}
