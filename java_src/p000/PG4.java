package p000;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory;
import co.bird.android.app.feature.map.p008ui.MapBirdUiImpl;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001AB\u00ad\u0001\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0001\u0010,\u001a\u00020+\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0001\u00100\u001a\u00020/\u0012\b\b\u0001\u00102\u001a\u000201\u0012\b\b\u0001\u00104\u001a\u000203\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u00107\u001a\u000206\u0012\b\b\u0001\u00108\u001a\u00020\u0018\u0012\b\b\u0001\u00109\u001a\u00020\u0018\u0012\b\b\u0001\u0010;\u001a\u00020:\u0012\b\b\u0001\u0010<\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00040\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00060\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006B"}, m28432d2 = {"LPG4;", "Lco/bird/android/app/feature/map/ui/MapBirdUiImpl;", "LOG4;", "Lio/reactivex/Observable;", "Lcom/google/android/gms/maps/model/PolylineOptions;", "Od", "Lcom/google/android/gms/maps/model/PolygonOptions;", "Q5", "options", "LMX3;", "E1", "LDX3;", "c0", "Landroid/view/View;", "b", "Landroid/view/View;", "mapOverlayLayout", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "polylineSubject", DateTokenConverter.CONVERTER_KEY, "polygonSubject", "", "value", "getOverlayEnabled", "()Z", "wf", "(Z)V", "overlayEnabled", "canPanMap", "getMapPanEnabled", "zj", "mapPanEnabled", "Li66;", "traceProvider", "LTq4;", "reactiveConfig", "LOh;", "appBuildConfig", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;", "clusterManagerFactory", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lcom/google/android/gms/maps/MapView;", "mapView", "myLocationButton", "Lco/bird/android/model/constant/MapMode;", "mode", "drawUserLocation", "userDirectionalArrow", "LBK2;", "markerOverridesManager", "hourly", "Ldr4;", "locationManager", "<init>", "(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLandroid/view/View;Ldr4;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PG4 */
/* loaded from: classes2.dex */
public class PG4 extends MapBirdUiImpl implements OG4 {

    /* renamed from: b */
    public final View f28170b;

    /* renamed from: c */
    public final C24558d<PolylineOptions> f28171c;

    /* renamed from: d */
    public final C24558d<PolygonOptions> f28172d;

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LPG4$a;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "", "Lcom/google/android/gms/maps/model/LatLng;", "points", "Lcom/google/android/gms/maps/model/PolygonOptions;", C17296a.f69688o, "pointA", "pointB", "Lcom/google/android/gms/maps/model/PolylineOptions;", "b", "LcD1;", "LcD1;", "map", "", "c", "Ljava/util/List;", "polygonPoints", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/maps/model/LatLng;", "prevLatLng", "<init>", "(LPG4;LcD1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: PG4$a */
    /* loaded from: classes2.dex */
    public final class View$OnTouchListenerC6303a implements View.OnTouchListener {

        /* renamed from: b */
        public final C39011cD1 f28173b;

        /* renamed from: c */
        public final List<LatLng> f28174c;

        /* renamed from: d */
        public LatLng f28175d;

        /* renamed from: e */
        public final /* synthetic */ PG4 f28176e;

        public View$OnTouchListenerC6303a(PG4 pg4, C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f28176e = pg4;
            this.f28173b = map;
            this.f28174c = new ArrayList();
        }

        /* renamed from: a */
        public final PolygonOptions m90537a(List<LatLng> list) {
            PolygonOptions m50639E = new PolygonOptions().m50626s(list).m50631W0(this.f28176e.getActivity().getResources().getDimension(C37044Xf4.map_overlay_polygon_width)).m50634N0(NA0.m94301c(this.f28176e.getActivity(), C32364Df4.birdESBlue)).m50639E(NA0.m94301c(this.f28176e.getActivity(), C32364Df4.birdESBlue20));
            Intrinsics.checkNotNullExpressionValue(m50639E, "PolygonOptions()\n       …or.R.color.birdESBlue20))");
            return m50639E;
        }

        /* renamed from: b */
        public final PolylineOptions m90536b(LatLng latLng, LatLng latLng2) {
            PolylineOptions m50622E = new PolylineOptions().m50606u(latLng, latLng2).m50605u1(this.f28176e.getActivity().getResources().getDimension(C37044Xf4.map_overlay_polygon_width)).m50622E(NA0.m94301c(this.f28176e.getActivity(), C32364Df4.birdESBlue));
            Intrinsics.checkNotNullExpressionValue(m50622E, "PolylineOptions()\n      …olor.R.color.birdESBlue))");
            return m50622E;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            LatLng m81935a = this.f28173b.m61677k().m81935a(new Point(Math.round(event.getX()), Math.round(event.getY())));
            Intrinsics.checkNotNullExpressionValue(m81935a, "map.projection.fromScreenLocation(touchPoint)");
            LatLng latLng = new LatLng(m81935a.f71430b, m81935a.f71431c);
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        this.f28174c.add(latLng);
                        C24558d c24558d = this.f28176e.f28171c;
                        LatLng latLng2 = this.f28175d;
                        Intrinsics.checkNotNull(latLng2);
                        c24558d.onNext(m90536b(latLng2, latLng));
                    }
                } else {
                    this.f28176e.f28172d.onNext(m90537a(this.f28174c));
                    this.f28174c.clear();
                    this.f28175d = null;
                }
            } else {
                this.f28174c.add(latLng);
            }
            this.f28175d = latLng;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PG4(InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, BirdClusterManagerFactory clusterManagerFactory, BaseActivity activity, CameraPosition cameraPosition, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mode, boolean z, boolean z2, BK2 markerOverridesManager, boolean z3, View mapOverlayLayout, InterfaceC40001dr4 locationManager) {
        super(activity, cameraPosition, traceProvider, reactiveConfig, appBuildConfig, map, reactiveMapEvent, mapView, view, mode, z, z2, markerOverridesManager, z3, clusterManagerFactory, locationManager);
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(clusterManagerFactory, "clusterManagerFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(mapOverlayLayout, "mapOverlayLayout");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f28170b = mapOverlayLayout;
        mapOverlayLayout.setOnTouchListener(new View$OnTouchListenerC6303a(this, map));
        C24558d<PolylineOptions> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<PolylineOptions>()");
        this.f28171c = m31902e;
        C24558d<PolygonOptions> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<PolygonOptions>()");
        this.f28172d = m31902e2;
    }

    @Override // p000.OG4
    /* renamed from: E1 */
    public MX3 mo90543E1(PolylineOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        MX3 m61683e = getMap().m61683e(options);
        Intrinsics.checkNotNullExpressionValue(m61683e, "map.addPolyline(options)");
        return m61683e;
    }

    @Override // p000.OG4
    /* renamed from: Od */
    public Observable<PolylineOptions> mo90542Od() {
        Observable<PolylineOptions> hide = this.f28171c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "polylineSubject.hide()");
        return hide;
    }

    @Override // p000.OG4
    /* renamed from: Q5 */
    public Observable<PolygonOptions> mo90541Q5() {
        Observable<PolygonOptions> hide = this.f28172d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "polygonSubject.hide()");
        return hide;
    }

    @Override // p000.OG4
    /* renamed from: c0 */
    public DX3 mo90540c0(PolygonOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        DX3 m61684d = getMap().m61684d(options);
        Intrinsics.checkNotNullExpressionValue(m61684d, "map.addPolygon(options)");
        return m61684d;
    }

    @Override // p000.OG4
    /* renamed from: wf */
    public void mo90539wf(boolean z) {
        this.f28170b.setEnabled(z);
    }

    @Override // p000.OG4
    /* renamed from: zj */
    public void mo90538zj(boolean z) {
        getMap().m61676l().m4914d(z);
    }
}
