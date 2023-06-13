package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManager;
import co.bird.android.app.feature.map.p008ui.MapModelRenderer;
import co.bird.android.model.persistence.BirdMapMarker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;", "Lco/bird/android/app/feature/map/ui/MapModelRenderer;", "Lco/bird/android/model/persistence/BirdMapMarker;", "clusterManager", "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;", "(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;)V", "render", "", "models", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.BirdMarkerRenderer */
/* loaded from: classes2.dex */
public final class BirdMarkerRenderer implements MapModelRenderer<BirdMapMarker> {
    private final BirdMarkerClusterManager clusterManager;

    public BirdMarkerRenderer(BirdMarkerClusterManager clusterManager) {
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        this.clusterManager = clusterManager;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapModelRenderer
    public void render(List<? extends BirdMapMarker> models) {
        Intrinsics.checkNotNullParameter(models, "models");
        this.clusterManager.set(models);
    }
}
