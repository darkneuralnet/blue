package co.bird.android.app.feature.map.cluster.warehousemarker;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.WarehouseMarker;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0014J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014J\f\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0014R\u001a\u0010\r\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;", "Lco/bird/android/model/persistence/WarehouseMarker;", "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;", "marker", "newMarker", "existingClusterItem", "updateMarker", "", "id", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;", "renderer", "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;", "getRenderer", "()Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRendererFactory;", "rendererFactory", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRendererFactory;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterManager extends AbstractMarkerClusterManager<WarehouseMarker, WarehouseMarkerClusterItem> {
    private final WarehouseMarkerClusterRenderer renderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarehouseMarkerClusterManager(BaseActivity activity, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, WarehouseMarkerClusterRendererFactory rendererFactory) {
        super(activity, map, reactiveMapEvent);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(rendererFactory, "rendererFactory");
        this.renderer = rendererFactory.create(getClusterManager(), map);
        init();
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public AbstractMarkerClusterRenderer<WarehouseMarker, WarehouseMarkerClusterItem> getRenderer() {
        return this.renderer;
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    /* renamed from: id  reason: avoid collision after fix types in other method */
    public String mo60514id(WarehouseMarker warehouseMarker) {
        Intrinsics.checkNotNullParameter(warehouseMarker, "<this>");
        return warehouseMarker.getId();
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public LatLng latLng(WarehouseMarker warehouseMarker) {
        Intrinsics.checkNotNullParameter(warehouseMarker, "<this>");
        return GoogleMap_Kt.toLatLng(warehouseMarker.getLocation());
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public WarehouseMarkerClusterItem newMarker(WarehouseMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return new WarehouseMarkerClusterItem(marker, false, 2, null);
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public WarehouseMarkerClusterItem updateMarker(WarehouseMarker marker, WarehouseMarkerClusterItem existingClusterItem) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(existingClusterItem, "existingClusterItem");
        return new WarehouseMarkerClusterItem(marker, existingClusterItem.getSelected());
    }
}
