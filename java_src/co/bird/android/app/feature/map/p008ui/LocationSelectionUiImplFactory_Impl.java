package co.bird.android.app.feature.map.p008ui;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImplFactory_Impl */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImplFactory_Impl implements LocationSelectionUiImplFactory {
    private final LocationSelectionUiImpl_Factory delegateFactory;

    public LocationSelectionUiImplFactory_Impl(LocationSelectionUiImpl_Factory locationSelectionUiImpl_Factory) {
        this.delegateFactory = locationSelectionUiImpl_Factory;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUiImplFactory
    public LocationSelectionUiImpl create(BaseActivity baseActivity, C33463Hx5 c33463Hx5) {
        return this.delegateFactory.get(baseActivity, c33463Hx5);
    }

    public static Y94<LocationSelectionUiImplFactory> create(LocationSelectionUiImpl_Factory locationSelectionUiImpl_Factory) {
        return C39546d52.m44621a(new LocationSelectionUiImplFactory_Impl(locationSelectionUiImpl_Factory));
    }
}
