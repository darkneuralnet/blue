package co.bird.android.app.feature.map.cluster.nestmarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
/* loaded from: classes2.dex */
public final class NestMarkerClusterManager_Factory {
    private final Y94<C36207Tq4> reactiveConfigProvider;
    private final Y94<NestMarkerClusterRendererFactory> rendererFactoryProvider;

    public NestMarkerClusterManager_Factory(Y94<C36207Tq4> y94, Y94<NestMarkerClusterRendererFactory> y942) {
        this.reactiveConfigProvider = y94;
        this.rendererFactoryProvider = y942;
    }

    public static NestMarkerClusterManager_Factory create(Y94<C36207Tq4> y94, Y94<NestMarkerClusterRendererFactory> y942) {
        return new NestMarkerClusterManager_Factory(y94, y942);
    }

    public static NestMarkerClusterManager newInstance(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, C36207Tq4 c36207Tq4, NestMarkerClusterRendererFactory nestMarkerClusterRendererFactory) {
        return new NestMarkerClusterManager(baseActivity, c39011cD1, reactiveMapEvent, c36207Tq4, nestMarkerClusterRendererFactory);
    }

    public NestMarkerClusterManager get(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent) {
        return newInstance(baseActivity, c39011cD1, reactiveMapEvent, this.reactiveConfigProvider.get(), this.rendererFactoryProvider.get());
    }
}
