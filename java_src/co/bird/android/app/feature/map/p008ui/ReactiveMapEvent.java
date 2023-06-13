package co.bird.android.app.feature.map.p008ui;

import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H&R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "", "Lio/reactivex/Observable;", "Lcom/google/android/gms/maps/model/LatLng;", "mapClicks", "", "cameraMoveCancels", "cameraIdles", "cameraMoves", "cameraMoveStarts", "LfE1;", "groundOverlayClicks", "LfM2;", "markerClicks", "infoWindowCloses", "infoWindowClicks", "mapLongClicks", "LDX3;", "polygonClicks", "LZ84;", "", "getCameraMoving", "()LZ84;", "cameraMoving", "core-basemap_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.ReactiveMapEvent */
/* loaded from: classes2.dex */
public interface ReactiveMapEvent {
    Observable<Unit> cameraIdles();

    Observable<Unit> cameraMoveCancels();

    Observable<Unit> cameraMoveStarts();

    Observable<Unit> cameraMoves();

    Z84<Boolean> getCameraMoving();

    Observable<C40816fE1> groundOverlayClicks();

    Observable<C40889fM2> infoWindowClicks();

    Observable<C40889fM2> infoWindowCloses();

    Observable<LatLng> mapClicks();

    Observable<LatLng> mapLongClicks();

    Observable<C40889fM2> markerClicks();

    Observable<DX3> polygonClicks();
}
