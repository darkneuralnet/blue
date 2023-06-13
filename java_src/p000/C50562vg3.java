package p000;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import com.uber.autodispose.ScopeProvider;
/* renamed from: vg3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50562vg3 {

    /* renamed from: a */
    public final Y94<InterfaceC32292Cx4> f114489a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f114490b;

    /* renamed from: c */
    public final Y94<LocationSelectionPresenterImplFactory> f114491c;

    public C50562vg3(Y94<InterfaceC32292Cx4> y94, Y94<InterfaceC1880Ea> y942, Y94<LocationSelectionPresenterImplFactory> y943) {
        this.f114489a = y94;
        this.f114490b = y942;
        this.f114491c = y943;
    }

    /* renamed from: a */
    public static C50562vg3 m8267a(Y94<InterfaceC32292Cx4> y94, Y94<InterfaceC1880Ea> y942, Y94<LocationSelectionPresenterImplFactory> y943) {
        return new C50562vg3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C46413og3 m8265c(InterfaceC32292Cx4 interfaceC32292Cx4, InterfaceC1880Ea interfaceC1880Ea, LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory, QA2 qa2, ScopeProvider scopeProvider, LocationSelectionUi locationSelectionUi) {
        return new C46413og3(interfaceC32292Cx4, interfaceC1880Ea, locationSelectionPresenterImplFactory, qa2, scopeProvider, locationSelectionUi);
    }

    /* renamed from: b */
    public C46413og3 m8266b(QA2 qa2, ScopeProvider scopeProvider, LocationSelectionUi locationSelectionUi) {
        return m8265c(this.f114489a.get(), this.f114490b.get(), this.f114491c.get(), qa2, scopeProvider, locationSelectionUi);
    }
}
