package co.bird.android.app.feature.map.presenter;

import android.hardware.SensorManager;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.model.constant.MapMode;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* loaded from: classes2.dex */
public final class MapPresenterImpl_Factory {
    private final Y94<InterfaceC12495bn> areaManagerProvider;
    private final Y94<InterfaceC10636aM> birdManagerProvider;
    private final Y94<InterfaceC42163hW0> deepLinkManagerProvider;
    private final Y94<InterfaceC33117Gl1> filterAreasManagerProvider;
    private final Y94<InterfaceC40001dr4> locationManagerProvider;
    private final Y94<C22454gl> preferenceProvider;
    private final Y94<C36207Tq4> reactiveConfigProvider;
    private final Y94<YR4> rideManagerProvider;
    private final Y94<InterfaceC46893pU4> rideMapStateManagerProvider;
    private final Y94<InterfaceC47297q95> riderMapDataManagerProvider;
    private final Y94<SensorManager> sensorManagerProvider;

    public MapPresenterImpl_Factory(Y94<InterfaceC40001dr4> y94, Y94<C36207Tq4> y942, Y94<InterfaceC12495bn> y943, Y94<InterfaceC33117Gl1> y944, Y94<SensorManager> y945, Y94<InterfaceC46893pU4> y946, Y94<C22454gl> y947, Y94<InterfaceC42163hW0> y948, Y94<InterfaceC10636aM> y949, Y94<InterfaceC47297q95> y9410, Y94<YR4> y9411) {
        this.locationManagerProvider = y94;
        this.reactiveConfigProvider = y942;
        this.areaManagerProvider = y943;
        this.filterAreasManagerProvider = y944;
        this.sensorManagerProvider = y945;
        this.rideMapStateManagerProvider = y946;
        this.preferenceProvider = y947;
        this.deepLinkManagerProvider = y948;
        this.birdManagerProvider = y949;
        this.riderMapDataManagerProvider = y9410;
        this.rideManagerProvider = y9411;
    }

    public static MapPresenterImpl_Factory create(Y94<InterfaceC40001dr4> y94, Y94<C36207Tq4> y942, Y94<InterfaceC12495bn> y943, Y94<InterfaceC33117Gl1> y944, Y94<SensorManager> y945, Y94<InterfaceC46893pU4> y946, Y94<C22454gl> y947, Y94<InterfaceC42163hW0> y948, Y94<InterfaceC10636aM> y949, Y94<InterfaceC47297q95> y9410, Y94<YR4> y9411) {
        return new MapPresenterImpl_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    public static MapPresenterImpl newInstance(InterfaceC40001dr4 interfaceC40001dr4, C36207Tq4 c36207Tq4, InterfaceC12495bn interfaceC12495bn, InterfaceC33117Gl1 interfaceC33117Gl1, SensorManager sensorManager, InterfaceC46893pU4 interfaceC46893pU4, C22454gl c22454gl, InterfaceC42163hW0 interfaceC42163hW0, InterfaceC10636aM interfaceC10636aM, InterfaceC47297q95 interfaceC47297q95, YR4 yr4, LifecycleScopeProvider<?> lifecycleScopeProvider, MapUi mapUi, MapMode mapMode, boolean z) {
        return new MapPresenterImpl(interfaceC40001dr4, c36207Tq4, interfaceC12495bn, interfaceC33117Gl1, sensorManager, interfaceC46893pU4, c22454gl, interfaceC42163hW0, interfaceC10636aM, interfaceC47297q95, yr4, lifecycleScopeProvider, mapUi, mapMode, z);
    }

    public MapPresenterImpl get(LifecycleScopeProvider<?> lifecycleScopeProvider, MapUi mapUi, MapMode mapMode, boolean z) {
        return newInstance(this.locationManagerProvider.get(), this.reactiveConfigProvider.get(), this.areaManagerProvider.get(), this.filterAreasManagerProvider.get(), this.sensorManagerProvider.get(), this.rideMapStateManagerProvider.get(), this.preferenceProvider.get(), this.deepLinkManagerProvider.get(), this.birdManagerProvider.get(), this.riderMapDataManagerProvider.get(), this.rideManagerProvider.get(), lifecycleScopeProvider, mapUi, mapMode, z);
    }
}
