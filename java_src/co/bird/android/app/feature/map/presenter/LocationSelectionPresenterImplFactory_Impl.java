package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.LocationSelectionModel;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImplFactory_Impl implements LocationSelectionPresenterImplFactory {
    private final LocationSelectionPresenterImpl_Factory delegateFactory;

    public LocationSelectionPresenterImplFactory_Impl(LocationSelectionPresenterImpl_Factory locationSelectionPresenterImpl_Factory) {
        this.delegateFactory = locationSelectionPresenterImpl_Factory;
    }

    @Override // co.bird.android.app.feature.map.presenter.LocationSelectionPresenterImplFactory
    public LocationSelectionPresenterImpl create(LocationSelectionUi locationSelectionUi, ScopeProvider scopeProvider, double d, LocationSelectionModel locationSelectionModel, AbstractC23461c abstractC23461c) {
        return this.delegateFactory.get(locationSelectionUi, scopeProvider, d, locationSelectionModel, abstractC23461c);
    }

    public static Y94<LocationSelectionPresenterImplFactory> create(LocationSelectionPresenterImpl_Factory locationSelectionPresenterImpl_Factory) {
        return C39546d52.m44621a(new LocationSelectionPresenterImplFactory_Impl(locationSelectionPresenterImpl_Factory));
    }
}
