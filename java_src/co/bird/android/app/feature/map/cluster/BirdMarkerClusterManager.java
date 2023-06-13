package co.bird.android.app.feature.map.cluster;

import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.model.constant.MapMode;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0011H&J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0004H&J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001a\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010!J\"\u0010\"\u001a\u00020\u00042\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040$H&J\u001c\u0010%\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&H&J\b\u0010'\u001a\u00020\u0004H&¨\u0006("}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager;", "T", "", "add", "", "marker", "selected", "", "(Ljava/lang/Object;Z)V", "markers", "", "animateMarkers", "clear", "closeInfoWindow", "(Ljava/lang/Object;)V", "deselect", "mapMode", "Lco/bird/android/model/constant/MapMode;", "move", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "(Ljava/lang/Object;Lcom/google/android/gms/maps/model/LatLng;)V", "reload", "remove", "reset", "select", "set", "setInRide", TransferTable.COLUMN_STATE, "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V", "setMapMarkerState", "mapMarkerState", "(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Ljava/lang/Object;)V", "setOnClusterItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "setOnMarkerInfoItemClick", "Lkotlin/Function1;", "showInfoWindow", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public interface BirdMarkerClusterManager<T> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void add$default(BirdMarkerClusterManager birdMarkerClusterManager, Object obj, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            birdMarkerClusterManager.add(obj, z);
        }

        public static /* synthetic */ void setInRide$default(BirdMarkerClusterManager birdMarkerClusterManager, Object obj, BirdClusterItemState birdClusterItemState, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInRide");
            }
            if ((i & 2) != 0) {
                birdClusterItemState = null;
            }
            birdMarkerClusterManager.setInRide(obj, birdClusterItemState);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setMapMarkerState$default(BirdMarkerClusterManager birdMarkerClusterManager, BirdClusterItemState birdClusterItemState, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapMarkerState");
            }
            if ((i & 2) != 0) {
                obj = null;
            }
            birdMarkerClusterManager.setMapMarkerState(birdClusterItemState, obj);
        }
    }

    void add(T t, boolean z);

    void add(List<? extends T> list);

    void animateMarkers();

    void clear();

    void closeInfoWindow(T t);

    void deselect(T t);

    MapMode mapMode();

    void move(T t, LatLng latLng);

    void reload();

    void remove(T t);

    void reset(T t);

    void select(T t);

    void set(List<? extends T> list);

    void setInRide(T t, BirdClusterItemState birdClusterItemState);

    void setMapMarkerState(BirdClusterItemState birdClusterItemState, T t);

    void setOnClusterItemClickListener(Function2<? super T, ? super Boolean, Unit> function2);

    void setOnMarkerInfoItemClick(Function1<? super T, Unit> function1);

    void showInfoWindow();
}
