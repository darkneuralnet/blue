package p000;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory;
import com.uber.autodispose.ScopeProvider;
/* renamed from: JA2 */
/* loaded from: classes2.dex */
public final class JA2 {

    /* renamed from: a */
    public final Y94<InterfaceC32292Cx4> f16956a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f16957b;

    /* renamed from: c */
    public final Y94<LocationSelectionPresenterImplFactory> f16958c;

    public JA2(Y94<InterfaceC32292Cx4> y94, Y94<InterfaceC1880Ea> y942, Y94<LocationSelectionPresenterImplFactory> y943) {
        this.f16956a = y94;
        this.f16957b = y942;
        this.f16958c = y943;
    }

    /* renamed from: a */
    public static JA2 m101055a(Y94<InterfaceC32292Cx4> y94, Y94<InterfaceC1880Ea> y942, Y94<LocationSelectionPresenterImplFactory> y943) {
        return new JA2(y94, y942, y943);
    }

    /* renamed from: c */
    public static CA2 m101053c(InterfaceC32292Cx4 interfaceC32292Cx4, InterfaceC1880Ea interfaceC1880Ea, LocationSelectionPresenterImplFactory locationSelectionPresenterImplFactory, QA2 qa2, ScopeProvider scopeProvider, LocationSelectionUi locationSelectionUi) {
        return new CA2(interfaceC32292Cx4, interfaceC1880Ea, locationSelectionPresenterImplFactory, qa2, scopeProvider, locationSelectionUi);
    }

    /* renamed from: b */
    public CA2 m101054b(QA2 qa2, ScopeProvider scopeProvider, LocationSelectionUi locationSelectionUi) {
        return m101053c(this.f16956a.get(), this.f16957b.get(), this.f16958c.get(), qa2, scopeProvider, locationSelectionUi);
    }
}
