package co.bird.android.app.feature.map.cluster.zonemarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterManager_Factory {
    private final Y94<ZoneMarkerClusterRendererFactory> rendererFactoryProvider;

    public ZoneMarkerClusterManager_Factory(Y94<ZoneMarkerClusterRendererFactory> y94) {
        this.rendererFactoryProvider = y94;
    }

    public static ZoneMarkerClusterManager_Factory create(Y94<ZoneMarkerClusterRendererFactory> y94) {
        return new ZoneMarkerClusterManager_Factory(y94);
    }

    public static ZoneMarkerClusterManager newInstance(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, ZoneMarkerClusterRendererFactory zoneMarkerClusterRendererFactory) {
        return new ZoneMarkerClusterManager(baseActivity, c39011cD1, reactiveMapEvent, zoneMarkerClusterRendererFactory);
    }

    public ZoneMarkerClusterManager get(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return newInstance(baseActivity, c39011cD1, reactiveMapEvent, this.rendererFactoryProvider.get());
    }
}
