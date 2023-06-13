package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.LocationSelectionModel;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl_Factory {
    private final Y94<InterfaceC40001dr4> reactiveLocationManagerProvider;

    public LocationSelectionPresenterImpl_Factory(Y94<InterfaceC40001dr4> y94) {
        this.reactiveLocationManagerProvider = y94;
    }

    public static LocationSelectionPresenterImpl_Factory create(Y94<InterfaceC40001dr4> y94) {
        return new LocationSelectionPresenterImpl_Factory(y94);
    }

    public static LocationSelectionPresenterImpl newInstance(InterfaceC40001dr4 interfaceC40001dr4, LocationSelectionUi locationSelectionUi, ScopeProvider scopeProvider, double d, LocationSelectionModel locationSelectionModel, AbstractC23461c abstractC23461c) {
        return new LocationSelectionPresenterImpl(interfaceC40001dr4, locationSelectionUi, scopeProvider, d, locationSelectionModel, abstractC23461c);
    }

    public LocationSelectionPresenterImpl get(LocationSelectionUi locationSelectionUi, ScopeProvider scopeProvider, double d, LocationSelectionModel locationSelectionModel, AbstractC23461c abstractC23461c) {
        return newInstance(this.reactiveLocationManagerProvider.get(), locationSelectionUi, scopeProvider, d, locationSelectionModel, abstractC23461c);
    }
}
