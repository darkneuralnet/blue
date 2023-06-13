package p000;

import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import com.uber.autodispose.ScopeProvider;
/* renamed from: iR2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42713iR2 implements InterfaceC48812sj1<C42120hR2> {

    /* renamed from: a */
    public final Y94<InterfaceC37961aS2> f87329a;

    /* renamed from: b */
    public final Y94<LocationSelectionPresenterImplFactory> f87330b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f87331c;

    /* renamed from: d */
    public final Y94<C50420vR2> f87332d;

    public C42713iR2(Y94<InterfaceC37961aS2> y94, Y94<LocationSelectionPresenterImplFactory> y942, Y94<ScopeProvider> y943, Y94<C50420vR2> y944) {
        this.f87329a = y94;
        this.f87330b = y942;
        this.f87331c = y943;
        this.f87332d = y944;
    }

    /* renamed from: a */
    public static C42713iR2 m33929a(Y94<InterfaceC37961aS2> y94, Y94<LocationSelectionPresenterImplFactory> y942, Y94<ScopeProvider> y943, Y94<C50420vR2> y944) {
        return new C42713iR2(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C42120hR2 m33927c(InterfaceC37961aS2 interfaceC37961aS2, LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory, ScopeProvider scopeProvider, C50420vR2 c50420vR2) {
        return new C42120hR2(interfaceC37961aS2, locationSelectionPresenterImplFactory, scopeProvider, c50420vR2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42120hR2 get() {
        return m33927c(this.f87329a.get(), this.f87330b.get(), this.f87331c.get(), this.f87332d.get());
    }
}
