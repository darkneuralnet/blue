package p000;

import co.bird.android.app.feature.map.p008ui.MapBirdUi;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001c\u0010\u0011\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LOG4;", "Lco/bird/android/app/feature/map/ui/MapBirdUi;", "Lio/reactivex/Observable;", "Lcom/google/android/gms/maps/model/PolylineOptions;", "Od", "Lcom/google/android/gms/maps/model/PolygonOptions;", "Q5", "options", "LMX3;", "E1", "LDX3;", "c0", "", "getOverlayEnabled", "()Z", "wf", "(Z)V", "overlayEnabled", "getMapPanEnabled", "zj", "mapPanEnabled", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OG4 */
/* loaded from: classes2.dex */
public interface OG4 extends MapBirdUi {
    /* renamed from: E1 */
    MX3 mo90543E1(PolylineOptions polylineOptions);

    /* renamed from: Od */
    Observable<PolylineOptions> mo90542Od();

    /* renamed from: Q5 */
    Observable<PolygonOptions> mo90541Q5();

    /* renamed from: c0 */
    DX3 mo90540c0(PolygonOptions polygonOptions);

    /* renamed from: wf */
    void mo90539wf(boolean z);

    /* renamed from: zj */
    void mo90538zj(boolean z);
}
