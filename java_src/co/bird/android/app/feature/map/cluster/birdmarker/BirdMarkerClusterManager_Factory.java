package co.bird.android.app.feature.map.cluster.birdmarker;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.BirdMarkerClusterItemOptionProvider;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
/* loaded from: classes2.dex */
public final class BirdMarkerClusterManager_Factory {
    private final Y94<BirdMarkerClusterItemOptionProvider> fleetMarkerProvider;
    private final Y94<C36207Tq4> reactiveConfigProvider;
    private final Y94<OperatorBirdMarkerClusterRendererFactory> rendererFactoryProvider;

    public BirdMarkerClusterManager_Factory(Y94<C36207Tq4> y94, Y94<BirdMarkerClusterItemOptionProvider> y942, Y94<OperatorBirdMarkerClusterRendererFactory> y943) {
        this.reactiveConfigProvider = y94;
        this.fleetMarkerProvider = y942;
        this.rendererFactoryProvider = y943;
    }

    public static BirdMarkerClusterManager_Factory create(Y94<C36207Tq4> y94, Y94<BirdMarkerClusterItemOptionProvider> y942, Y94<OperatorBirdMarkerClusterRendererFactory> y943) {
        return new BirdMarkerClusterManager_Factory(y94, y942, y943);
    }

    public static BirdMarkerClusterManager newInstance(C36207Tq4 c36207Tq4, BirdMarkerClusterItemOptionProvider birdMarkerClusterItemOptionProvider, OperatorBirdMarkerClusterRendererFactory operatorBirdMarkerClusterRendererFactory, BaseActivity baseActivity, BK2 bk2, ReactiveMapEvent reactiveMapEvent, C39011cD1 c39011cD1, MapMode mapMode) {
        return new BirdMarkerClusterManager(c36207Tq4, birdMarkerClusterItemOptionProvider, operatorBirdMarkerClusterRendererFactory, baseActivity, bk2, reactiveMapEvent, c39011cD1, mapMode);
    }

    public BirdMarkerClusterManager get(BaseActivity baseActivity, BK2 bk2, ReactiveMapEvent reactiveMapEvent, C39011cD1 c39011cD1, MapMode mapMode) {
        return newInstance(this.reactiveConfigProvider.get(), this.fleetMarkerProvider.get(), this.rendererFactoryProvider.get(), baseActivity, bk2, reactiveMapEvent, c39011cD1, mapMode);
    }
}
