package co.bird.android.app.feature.map.cluster;

import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u001d\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\rH&J\u0014\u0010\u000f\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H&J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H&¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "T", "", "clear", "", "heldItem", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "marker", "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "holdIfNotReady", "", "item", "holdNonReadyItems", "", "items", "ready", "overrideId", "", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "removeHeldItem", "(Ljava/lang/Object;)V", "setReadyAndReleaseItemsFor", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public interface UnreadyMarkerOverrides<T> {
    void clear();

    BirdMarkerClusterItem<T> heldItem(T t);

    boolean holdIfNotReady(BirdMarkerClusterItem<T> birdMarkerClusterItem);

    List<BirdMarkerClusterItem<T>> holdNonReadyItems(List<? extends BirdMarkerClusterItem<T>> list);

    boolean ready(String str);

    void removeHeldItem(T t);

    List<BirdMarkerClusterItem<T>> setReadyAndReleaseItemsFor(String str);
}
