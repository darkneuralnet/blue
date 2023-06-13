package co.bird.android.app.feature.map.cluster.zonemarker;

import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRendererFactory;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.ZoneMarker;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0014J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014J\f\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\fH\u0014R\u001a\u0010\u0010\u001a\u00020\u000f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;", "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;", "Lco/bird/android/model/persistence/ZoneMarker;", "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;", "marker", "newMarker", "existingClusterItem", "updateMarker", "", "id", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "LfM2;", "", "filterClickable", "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;", "renderer", "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;", "getRenderer", "()Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;", "rendererFactory", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterManager extends AbstractMarkerClusterManager<ZoneMarker, ZoneMarkerClusterItem> {
    private final ZoneMarkerClusterRenderer renderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerClusterManager(BaseActivity activity, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, ZoneMarkerClusterRendererFactory rendererFactory) {
        super(activity, map, reactiveMapEvent);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(rendererFactory, "rendererFactory");
        this.renderer = rendererFactory.create(getClusterManager(), map);
        init();
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public boolean filterClickable(C40889fM2 marker) {
        OperatorMapZoneSelectability operatorMapZoneSelectability;
        ZoneMarker marker2;
        Intrinsics.checkNotNullParameter(marker, "marker");
        ZoneMarkerClusterItem zoneMarkerClusterItem = (ZoneMarkerClusterItem) getRenderer().getClusterItem(marker);
        if (zoneMarkerClusterItem != null && (marker2 = zoneMarkerClusterItem.getMarker()) != null) {
            operatorMapZoneSelectability = marker2.getSelectability();
        } else {
            operatorMapZoneSelectability = null;
        }
        if (operatorMapZoneSelectability == OperatorMapZoneSelectability.SELECTABLE_ANNOTATION) {
            return true;
        }
        return false;
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public AbstractMarkerClusterRenderer<ZoneMarker, ZoneMarkerClusterItem> getRenderer() {
        return this.renderer;
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    /* renamed from: id  reason: avoid collision after fix types in other method */
    public String mo60514id(ZoneMarker zoneMarker) {
        Intrinsics.checkNotNullParameter(zoneMarker, "<this>");
        return zoneMarker.getZoneId();
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public LatLng latLng(ZoneMarker zoneMarker) {
        Intrinsics.checkNotNullParameter(zoneMarker, "<this>");
        return GoogleMap_Kt.toLatLng(zoneMarker.getCenterPoint());
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public ZoneMarkerClusterItem newMarker(ZoneMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return new ZoneMarkerClusterItem(marker, false, 2, null);
    }

    @Override // co.bird.android.app.feature.map.cluster.AbstractMarkerClusterManager
    public ZoneMarkerClusterItem updateMarker(ZoneMarker marker, ZoneMarkerClusterItem existingClusterItem) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(existingClusterItem, "existingClusterItem");
        return new ZoneMarkerClusterItem(marker, existingClusterItem.getSelected());
    }
}
