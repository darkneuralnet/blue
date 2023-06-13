package co.bird.android.app.feature.map.cluster.bird;

import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.BirdClusterRendererFactory;
import co.bird.android.app.feature.map.renderer.OperatorClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
/* loaded from: classes2.dex */
public final class BirdClusterManager_Factory {
    private final Y94<InterfaceC1880Ea> analyticsManagerProvider;
    private final Y94<BirdClusterRendererFactory> birdRendererFactoryProvider;
    private final Y94<InterfaceC6097Oh> buildConfigProvider;
    private final Y94<OperatorClusterRendererFactory> operatorRendererFactoryProvider;
    private final Y94<C36207Tq4> reactiveConfigProvider;

    public BirdClusterManager_Factory(Y94<BirdClusterRendererFactory> y94, Y94<OperatorClusterRendererFactory> y942, Y94<C36207Tq4> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC6097Oh> y945) {
        this.birdRendererFactoryProvider = y94;
        this.operatorRendererFactoryProvider = y942;
        this.reactiveConfigProvider = y943;
        this.analyticsManagerProvider = y944;
        this.buildConfigProvider = y945;
    }

    public static BirdClusterManager_Factory create(Y94<BirdClusterRendererFactory> y94, Y94<OperatorClusterRendererFactory> y942, Y94<C36207Tq4> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC6097Oh> y945) {
        return new BirdClusterManager_Factory(y94, y942, y943, y944, y945);
    }

    public static BirdClusterManager newInstance(BirdClusterRendererFactory birdClusterRendererFactory, OperatorClusterRendererFactory operatorClusterRendererFactory, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC6097Oh interfaceC6097Oh, BaseActivity baseActivity, BK2 bk2, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapMode mapMode, boolean z) {
        return new BirdClusterManager(birdClusterRendererFactory, operatorClusterRendererFactory, c36207Tq4, interfaceC1880Ea, interfaceC6097Oh, baseActivity, bk2, c39011cD1, reactiveMapEvent, mapMode, z);
    }

    public BirdClusterManager get(BaseActivity baseActivity, BK2 bk2, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapMode mapMode, boolean z) {
        return newInstance(this.birdRendererFactoryProvider.get(), this.operatorRendererFactoryProvider.get(), this.reactiveConfigProvider.get(), this.analyticsManagerProvider.get(), this.buildConfigProvider.get(), baseActivity, bk2, c39011cD1, reactiveMapEvent, mapMode, z);
    }
}
