package co.bird.android.app.feature.map.cluster.nestmarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class NestMarkerClusterManagerFactory_Impl implements NestMarkerClusterManagerFactory {
    private final NestMarkerClusterManager_Factory delegateFactory;

    public NestMarkerClusterManagerFactory_Impl(NestMarkerClusterManager_Factory nestMarkerClusterManager_Factory) {
        this.delegateFactory = nestMarkerClusterManager_Factory;
    }

    @Override // co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManagerFactory
    public NestMarkerClusterManager create(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return this.delegateFactory.get(baseActivity, c39011cD1, reactiveMapEvent);
    }

    public static Y94<NestMarkerClusterManagerFactory> create(NestMarkerClusterManager_Factory nestMarkerClusterManager_Factory) {
        return C39546d52.m44621a(new NestMarkerClusterManagerFactory_Impl(nestMarkerClusterManager_Factory));
    }
}
