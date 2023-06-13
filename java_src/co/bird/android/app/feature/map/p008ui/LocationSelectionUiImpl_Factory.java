package co.bird.android.app.feature.map.p008ui;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl_Factory */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl_Factory {
    private final Y94<InterfaceC40001dr4> locationManagerProvider;

    public LocationSelectionUiImpl_Factory(Y94<InterfaceC40001dr4> y94) {
        this.locationManagerProvider = y94;
    }

    public static LocationSelectionUiImpl_Factory create(Y94<InterfaceC40001dr4> y94) {
        return new LocationSelectionUiImpl_Factory(y94);
    }

    public static LocationSelectionUiImpl newInstance(BaseActivity baseActivity, C33463Hx5 c33463Hx5, InterfaceC40001dr4 interfaceC40001dr4) {
        return new LocationSelectionUiImpl(baseActivity, c33463Hx5, interfaceC40001dr4);
    }

    public LocationSelectionUiImpl get(BaseActivity baseActivity, C33463Hx5 c33463Hx5) {
        return newInstance(baseActivity, c33463Hx5, this.locationManagerProvider.get());
    }
}
