package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.constant.MapMode;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* loaded from: classes2.dex */
public final class MapPresenterImplFactory_Impl implements MapPresenterImplFactory {
    private final MapPresenterImpl_Factory delegateFactory;

    public MapPresenterImplFactory_Impl(MapPresenterImpl_Factory mapPresenterImpl_Factory) {
        this.delegateFactory = mapPresenterImpl_Factory;
    }

    @Override // co.bird.android.app.feature.map.presenter.MapPresenterImplFactory
    public MapPresenterImpl create(LifecycleScopeProvider<?> lifecycleScopeProvider, MapUi mapUi, MapMode mapMode, boolean z) {
        return this.delegateFactory.get(lifecycleScopeProvider, mapUi, mapMode, z);
    }

    public static Y94<MapPresenterImplFactory> create(MapPresenterImpl_Factory mapPresenterImpl_Factory) {
        return C39546d52.m44621a(new MapPresenterImplFactory_Impl(mapPresenterImpl_Factory));
    }
}
