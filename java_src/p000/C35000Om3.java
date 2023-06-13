package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager;
import co.bird.android.app.feature.map.p008ui.MapBirdMarkerUiImpl;
import co.bird.android.app.feature.map.p008ui.MapUiKt;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.AreaKt;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.wire.WireNest;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000\u0083\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001Z\b\u0007\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0001FB°\u0001\b\u0007\u0012\u0006\u0010_\u001a\u00020^\u0012\u0006\u0010a\u001a\u00020`\u0012\u0006\u0010c\u001a\u00020b\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010i\u001a\u00020h\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010m\u001a\u00020l\u0012\b\b\u0001\u0010o\u001a\u00020n\u0012\n\b\u0001\u0010q\u001a\u0004\u0018\u00010p\u0012\b\b\u0001\u0010s\u001a\u00020r\u0012\b\b\u0001\u0010u\u001a\u00020t\u0012\b\b\u0001\u0010w\u001a\u00020v\u0012\n\b\u0001\u0010y\u001a\u0004\u0018\u00010x\u0012\b\b\u0001\u0010z\u001a\u00020\b\u0012\b\b\u0001\u0010|\u001a\u00020{\u0012\b\b\u0001\u0010=\u001a\u00020\b\u0012\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0003H\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00060\u0003H\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00060\u0003H\u0016J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00060\u0003H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J#\u0010\u001d\u001a\u00020\u00132\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001b\"\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\bH\u0016J\u0016\u0010&\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110$H\u0016J\u0016\u0010'\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110$H\u0016J\u0016\u0010)\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\u0016\u0010+\u001a\u00020\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u0016\u0010-\u001a\u00020\u00132\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\nH\u0016J\u0018\u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\nH\u0016J\b\u00103\u001a\u00020\u0013H\u0016J\u0012\u00106\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u00107\u001a\u00020\fH\u0016J\b\u00108\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u000eH\u0016J\b\u0010:\u001a\u00020\u0013H\u0016R\u0014\u0010=\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010\u00040\u00040>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR:\u0010\t\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b ?*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010AR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR:\u0010\u000b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b ?*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010AR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR:\u0010\r\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b ?*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010AR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b ?*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010AR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006\u0082\u0001"}, m28432d2 = {"LOm3;", "Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;", "LNm3;", "Lio/reactivex/Observable;", "LfM2;", "parkingMarkerClicks", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "bountyMarkerClicks", "Lco/bird/android/model/persistence/NestMarker;", "nestMarkerClicks", "Lco/bird/android/model/persistence/WarehouseMarker;", "warehouseMarkerClicks", "Lco/bird/android/model/persistence/ZoneMarker;", "zoneMarkerClicks", "", "Lco/bird/android/model/ParkingNest;", "nests", "", "addParkingNests", "bountyMarkers", "setBountyMarkers", "bountyMarker", "select", "deselect", "clearBountyMarkers", "", "bounties", "L3", "([Lco/bird/android/model/persistence/BountyMapMarker;)V", "marker", "resetParkingMarker", "selectParkingMarker", "show", "showParkingMarkers", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "addParkingFilter", "removeParkingFilter", "nestMarkers", "setNestMarkers", "warehouseMarkers", "setWarehouseMarkers", "zoneMarkers", "setZoneMarkers", "nestMarker", "", "claimProgress", "claim", "unclaim", "clearNestMarkers", "Lco/bird/android/model/wire/WireNest;", "nest", "setNestArea", "warehouseMarker", "clearWarehouseMarkers", "zoneMarker", "clearZoneMarkers", "b", "Z", "drawParkingNestOutline", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", "parkingNestModelManager", "e", "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;", "f", "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManager;", "bountyMarkerClusterManager", "g", "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;", "h", "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManager;", "nestMarkerClusterManager", "i", "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;", "j", "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;", "warehouseMarkerClusterManager", "k", "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;", "l", "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;", "zoneMarkerClusterManager", "Om3$f", "m", "LOm3$f;", "hideParkingFilter", "Li66;", "traceProvider", "LTq4;", "reactiveConfig", "LOh;", "appBuildConfig", "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;", "birdMarkerClusterManagerFactory", "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;", "bountyMarkerClusterManagerFactory", "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;", "nestMarkerClusterManagerFactory", "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;", "warehouseMarkerClusterManagerFactory", "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;", "zoneMarkerClusterManagerFactory", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lcom/google/android/gms/maps/MapView;", "mapView", "Landroid/view/View;", "myLocationButton", "userDirectionalArrow", "LBK2;", "markerOverridesManager", "Ldr4;", "locationManager", "<init>", "(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;ZLdr4;)V", "n", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorMapUi.kt\nco/bird/android/app/feature/operator/ui/OperatorMapUiImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n13579#2,2:282\n*S KotlinDebug\n*F\n+ 1 OperatorMapUi.kt\nco/bird/android/app/feature/operator/ui/OperatorMapUiImpl\n*L\n182#1:282,2\n*E\n"})
/* renamed from: Om3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35000Om3 extends MapBirdMarkerUiImpl implements InterfaceC34766Nm3 {

    /* renamed from: n */
    public static final C6133e f27274n = new C6133e(null);

    /* renamed from: o */
    public static final int f27275o = 8;

    /* renamed from: b */
    public final boolean f27276b;

    /* renamed from: c */
    public final C24558d<C40889fM2> f27277c;

    /* renamed from: d */
    public final ParkingNestModelManager f27278d;

    /* renamed from: e */
    public final C24558d<Pair<BountyMapMarker, Boolean>> f27279e;

    /* renamed from: f */
    public final BountyMarkerClusterManager f27280f;

    /* renamed from: g */
    public final C24558d<Pair<NestMarker, Boolean>> f27281g;

    /* renamed from: h */
    public final NestMarkerClusterManager f27282h;

    /* renamed from: i */
    public final C24558d<Pair<WarehouseMarker, Boolean>> f27283i;

    /* renamed from: j */
    public final WarehouseMarkerClusterManager f27284j;

    /* renamed from: k */
    public final C24558d<Pair<ZoneMarker, Boolean>> f27285k;

    /* renamed from: l */
    public final ZoneMarkerClusterManager f27286l;

    /* renamed from: m */
    public final C6134f f27287m;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/NestMarker;", "nestMarker", "", "selected", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestMarker;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Om3$a */
    /* loaded from: classes2.dex */
    public static final class C6129a extends Lambda implements Function2<NestMarker, Boolean, Unit> {
        public C6129a() {
            super(2);
        }

        /* renamed from: a */
        public final void m91460a(NestMarker nestMarker, boolean z) {
            Intrinsics.checkNotNullParameter(nestMarker, "nestMarker");
            C35000Om3.this.f27281g.onNext(TuplesKt.m28425to(nestMarker, Boolean.valueOf(z)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(NestMarker nestMarker, Boolean bool) {
            m91460a(nestMarker, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyMapMarker;", "bountyMarker", "", "selected", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BountyMapMarker;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Om3$b */
    /* loaded from: classes2.dex */
    public static final class C6130b extends Lambda implements Function2<BountyMapMarker, Boolean, Unit> {
        public C6130b() {
            super(2);
        }

        /* renamed from: a */
        public final void m91459a(BountyMapMarker bountyMarker, boolean z) {
            Intrinsics.checkNotNullParameter(bountyMarker, "bountyMarker");
            C35000Om3.this.f27279e.onNext(TuplesKt.m28425to(bountyMarker, Boolean.valueOf(z)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(BountyMapMarker bountyMapMarker, Boolean bool) {
            m91459a(bountyMapMarker, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/WarehouseMarker;", "warehouseMarker", "", "selected", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/WarehouseMarker;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Om3$c */
    /* loaded from: classes2.dex */
    public static final class C6131c extends Lambda implements Function2<WarehouseMarker, Boolean, Unit> {
        public C6131c() {
            super(2);
        }

        /* renamed from: a */
        public final void m91458a(WarehouseMarker warehouseMarker, boolean z) {
            Intrinsics.checkNotNullParameter(warehouseMarker, "warehouseMarker");
            C35000Om3.this.f27283i.onNext(TuplesKt.m28425to(warehouseMarker, Boolean.valueOf(z)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseMarker warehouseMarker, Boolean bool) {
            m91458a(warehouseMarker, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneMarker;", "zoneMarker", "", "selected", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/ZoneMarker;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Om3$d */
    /* loaded from: classes2.dex */
    public static final class C6132d extends Lambda implements Function2<ZoneMarker, Boolean, Unit> {
        public C6132d() {
            super(2);
        }

        /* renamed from: a */
        public final void m91457a(ZoneMarker zoneMarker, boolean z) {
            Intrinsics.checkNotNullParameter(zoneMarker, "zoneMarker");
            C35000Om3.this.f27285k.onNext(TuplesKt.m28425to(zoneMarker, Boolean.valueOf(z)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ZoneMarker zoneMarker, Boolean bool) {
            m91457a(zoneMarker, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LOm3$e;", "", "", "NEST_AREAS_KEY", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Om3$e */
    /* loaded from: classes2.dex */
    public static final class C6133e {
        public /* synthetic */ C6133e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6133e() {
        }
    }

    @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR?\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"Om3$f", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/ParkingNest;", "", "models", "apply", "", C17296a.f69688o, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "b", "Lkotlin/jvm/functions/Function1;", "getSetDirty", "()Lkotlin/jvm/functions/Function1;", "setSetDirty", "(Lkotlin/jvm/functions/Function1;)V", "setDirty", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Om3$f */
    /* loaded from: classes2.dex */
    public static final class C6134f implements Filter<ParkingNest> {

        /* renamed from: a */
        public final String f27292a = "hide-all";

        /* renamed from: b */
        public Function1<? super String, Unit> f27293b;

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public List<ParkingNest> apply(List<? extends ParkingNest> models) {
            List<ParkingNest> emptyList;
            Intrinsics.checkNotNullParameter(models, "models");
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public String getId() {
            return this.f27292a;
        }

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public Function1<String, Unit> getSetDirty() {
            return this.f27293b;
        }

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public void setSetDirty(Function1<? super String, Unit> function1) {
            this.f27293b = function1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Om3$g */
    /* loaded from: classes2.dex */
    public static final class C6135g extends Lambda implements Function1<Exception, String> {

        /* renamed from: g */
        public final /* synthetic */ BountyMapMarker[] f27294g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyMapMarker;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Om3$g$a */
        /* loaded from: classes2.dex */
        public static final class C6136a extends Lambda implements Function1<BountyMapMarker, CharSequence> {

            /* renamed from: g */
            public static final C6136a f27295g = new C6136a();

            public C6136a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CharSequence invoke(BountyMapMarker it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6135g(BountyMapMarker[] bountyMapMarkerArr) {
            super(1);
            this.f27294g = bountyMapMarkerArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Exception it) {
            String joinToString$default;
            Intrinsics.checkNotNullParameter(it, "it");
            joinToString$default = ArraysKt___ArraysKt.joinToString$default(this.f27294g, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C6136a.f27295g, 31, (Object) null);
            return "Error while attempting to zoomToBoundsContainingBounties bounties=" + joinToString$default;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35000Om3(InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, BirdMarkerClusterManagerFactory birdMarkerClusterManagerFactory, BountyMarkerClusterManagerFactory bountyMarkerClusterManagerFactory, NestMarkerClusterManagerFactory nestMarkerClusterManagerFactory, WarehouseMarkerClusterManagerFactory warehouseMarkerClusterManagerFactory, ZoneMarkerClusterManagerFactory zoneMarkerClusterManagerFactory, BaseActivity activity, CameraPosition cameraPosition, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, BK2 markerOverridesManager, boolean z2, InterfaceC40001dr4 locationManager) {
        super(activity, cameraPosition, traceProvider, reactiveConfig, appBuildConfig, map, reactiveMapEvent, mapView, view, MapMode.OPERATOR, true, z, markerOverridesManager, birdMarkerClusterManagerFactory, locationManager);
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(birdMarkerClusterManagerFactory, "birdMarkerClusterManagerFactory");
        Intrinsics.checkNotNullParameter(bountyMarkerClusterManagerFactory, "bountyMarkerClusterManagerFactory");
        Intrinsics.checkNotNullParameter(nestMarkerClusterManagerFactory, "nestMarkerClusterManagerFactory");
        Intrinsics.checkNotNullParameter(warehouseMarkerClusterManagerFactory, "warehouseMarkerClusterManagerFactory");
        Intrinsics.checkNotNullParameter(zoneMarkerClusterManagerFactory, "zoneMarkerClusterManagerFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f27276b = z2;
        C24558d<C40889fM2> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Marker>()");
        this.f27277c = m31902e;
        this.f27278d = new ParkingNestModelManager(new ParkingNestRenderer(activity, map, z2), getMapModelManagerViewportChangesObservable());
        C24558d<Pair<BountyMapMarker, Boolean>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<BountyMapMarker, Boolean>>()");
        this.f27279e = m31902e2;
        BountyMarkerClusterManager create = bountyMarkerClusterManagerFactory.create(activity, map, reactiveMapEvent);
        this.f27280f = create;
        C24558d<Pair<NestMarker, Boolean>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<NestMarker, Boolean>>()");
        this.f27281g = m31902e3;
        NestMarkerClusterManager create2 = nestMarkerClusterManagerFactory.create(activity, map, reactiveMapEvent);
        this.f27282h = create2;
        C24558d<Pair<WarehouseMarker, Boolean>> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Pair<WarehouseMarker, Boolean>>()");
        this.f27283i = m31902e4;
        WarehouseMarkerClusterManager create3 = warehouseMarkerClusterManagerFactory.create(activity, map, reactiveMapEvent);
        this.f27284j = create3;
        C24558d<Pair<ZoneMarker, Boolean>> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Pair<ZoneMarker, Boolean>>()");
        this.f27285k = m31902e5;
        ZoneMarkerClusterManager create4 = zoneMarkerClusterManagerFactory.create(activity, map, reactiveMapEvent);
        this.f27286l = create4;
        this.f27287m = new C6134f();
        create2.setOnClusterItemClickListener(new C6129a());
        create.setOnClusterItemClickListener(new C6130b());
        create3.setOnClusterItemClickListener(new C6131c());
        create4.setOnClusterItemClickListener(new C6132d());
    }

    @Override // p000.InterfaceC34766Nm3
    /* renamed from: L3 */
    public void mo91461L3(BountyMapMarker... bounties) {
        boolean z;
        Intrinsics.checkNotNullParameter(bounties, "bounties");
        if (bounties.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
            for (BountyMapMarker bountyMapMarker : bounties) {
                c17620a.m50666b(UB1.m81890b(bountyMapMarker.getLocation()));
            }
            C39011cD1 map = getMap();
            LatLngBounds m50667a = c17620a.m50667a();
            Intrinsics.checkNotNullExpressionValue(m50667a, "builder.build()");
            MapUiKt.safeAnimateCamera(map, m50667a, 0, new C6135g(bounties));
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void addParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f27278d.addFilter(filter);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void addParkingNests(List<ParkingNest> nests) {
        Intrinsics.checkNotNullParameter(nests, "nests");
        this.f27278d.addItems(nests);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBountyMarkerUi
    public Observable<Pair<BountyMapMarker, Boolean>> bountyMarkerClicks() {
        Observable<Pair<BountyMapMarker, Boolean>> hide = this.f27279e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "bountyMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void claim(NestMarker nestMarker, int i) {
        Intrinsics.checkNotNullParameter(nestMarker, "nestMarker");
        this.f27282h.claim(nestMarker, i);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBountyMarkerUi
    public void clearBountyMarkers() {
        this.f27280f.clear();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void clearNestMarkers() {
        this.f27282h.clear();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi
    public void clearWarehouseMarkers() {
        this.f27284j.clear();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi
    public void clearZoneMarkers() {
        this.f27286l.clear();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBountyMarkerUi
    public void deselect(BountyMapMarker bountyMarker) {
        Intrinsics.checkNotNullParameter(bountyMarker, "bountyMarker");
        this.f27280f.deselect(bountyMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public Observable<Pair<NestMarker, Boolean>> nestMarkerClicks() {
        Observable<Pair<NestMarker, Boolean>> hide = this.f27281g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nestMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public Observable<C40889fM2> parkingMarkerClicks() {
        Observable<C40889fM2> hide = this.f27277c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "parkingMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void removeParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f27278d.removeFilter(filter);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void resetParkingMarker(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        marker.m41523k(C40788fB0.icon$default(getActivity(), C48193rg4.marker_parking, null, null, 6, null));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBountyMarkerUi
    public void select(BountyMapMarker bountyMarker) {
        Intrinsics.checkNotNullParameter(bountyMarker, "bountyMarker");
        this.f27280f.select(bountyMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void selectParkingMarker(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        marker.m41523k(C40788fB0.icon$default(getActivity(), C48193rg4.marker_parking_selected, null, null, 6, null));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBountyMarkerUi
    public void setBountyMarkers(List<BountyMapMarker> bountyMarkers) {
        Intrinsics.checkNotNullParameter(bountyMarkers, "bountyMarkers");
        this.f27280f.set(bountyMarkers);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void setNestArea(WireNest wireNest) {
        Area area;
        List<Area> listOfNotNull;
        if (wireNest != null && wireNest.getRegion() != null) {
            area = r1.copy((r75 & 1) != 0 ? r1.f66669id : wireNest.getId(), (r75 & 2) != 0 ? r1.title : null, (r75 & 4) != 0 ? r1.label : null, (r75 & 8) != 0 ? r1.notes : null, (r75 & 16) != 0 ? r1.hideBirds : false, (r75 & 32) != 0 ? r1.rejectDrops : false, (r75 & 64) != 0 ? r1.noRides : false, (r75 & 128) != 0 ? r1.noParking : false, (r75 & 256) != 0 ? r1.preferredParking : false, (r75 & 512) != 0 ? r1.delivery : false, (r75 & 1024) != 0 ? r1.isReleaseConstrained : false, (r75 & 2048) != 0 ? r1.isDemandArea : false, (r75 & 4096) != 0 ? r1.feeModified : null, (r75 & 8192) != 0 ? r1.demandLevel : null, (r75 & 16384) != 0 ? r1.overlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r1.overlayIcon : null, (r75 & 65536) != 0 ? r1.overlayMinZoomLevel : null, (r75 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r1.selectedOverlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r1.region : wireNest.getRegion(), (r75 & 524288) != 0 ? r1.color : NA0.m94301c(getActivity(), C32364Df4.birdMatteBlack25), (r75 & 1048576) != 0 ? r1.colorDark : null, (r75 & 2097152) != 0 ? r1.borderColor : NA0.m94301c(getActivity(), C32364Df4.birdESBlue), (r75 & 4194304) != 0 ? r1.borderColorDark : null, (r75 & 8388608) != 0 ? r1.titleColor : 0, (r75 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r1.titleColorDark : null, (r75 & 33554432) != 0 ? r1.zoomBehavior : null, (r75 & 67108864) != 0 ? r1.operational : false, (r75 & 134217728) != 0 ? r1.maxSpeed : null, (r75 & 268435456) != 0 ? r1.releaseCapacity : null, (r75 & 536870912) != 0 ? r1.noParkingFineAlertTitle : null, (r75 & 1073741824) != 0 ? r1.noParkingFineAlertMessage : null, (r75 & Integer.MIN_VALUE) != 0 ? r1.riderBarInRideMessageTitle : null, (r76 & 1) != 0 ? r1.riderBarInRideMessageBody : null, (r76 & 2) != 0 ? r1.riderBarNotInRideMessageTitle : null, (r76 & 4) != 0 ? r1.riderBarNotInRideMessageBody : null, (r76 & 8) != 0 ? r1.riderBarInRideMessageIconType : null, (r76 & 16) != 0 ? r1.riderBarNotInRideMessageIconType : null, (r76 & 32) != 0 ? r1.areaReleaseCapacityIconType : null, (r76 & 64) != 0 ? r1.partnerId : null, (r76 & 128) != 0 ? r1.fleetIds : null, (r76 & 256) != 0 ? r1.areaKeys : null, (r76 & 512) != 0 ? r1.isUniversalArea : false, (r76 & 1024) != 0 ? r1.noParkingFineCurrency : null, (r76 & 2048) != 0 ? r1.noParkingWarningAlertTitle : null, (r76 & 4096) != 0 ? r1.noParkingWarningAlertBody : null, (r76 & 8192) != 0 ? r1.noParkingFineAmount : null, (r76 & 16384) != 0 ? r1.areasMerged : null, (r76 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r1.centerPoint : null, (r76 & 65536) != 0 ? r1.role : null, (r76 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r1.updatedAt : null, (r76 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r1.zoneId : null, (r76 & 524288) != 0 ? AreaKt.getTEST_AREA().walkway : null);
        } else {
            area = null;
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(area);
        setAdditionalAreas("nest_areas_key", listOfNotNull);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void setNestMarkers(List<NestMarker> nestMarkers) {
        Intrinsics.checkNotNullParameter(nestMarkers, "nestMarkers");
        this.f27282h.set(nestMarkers);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi
    public void setWarehouseMarkers(List<WarehouseMarker> warehouseMarkers) {
        Intrinsics.checkNotNullParameter(warehouseMarkers, "warehouseMarkers");
        this.f27284j.set(warehouseMarkers);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi
    public void setZoneMarkers(List<ZoneMarker> zoneMarkers) {
        Intrinsics.checkNotNullParameter(zoneMarkers, "zoneMarkers");
        this.f27286l.set(zoneMarkers);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void showParkingMarkers(boolean z) {
        if (z) {
            this.f27278d.removeFilter(this.f27287m);
        } else {
            this.f27278d.addFilter(this.f27287m);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void unclaim(NestMarker nestMarker) {
        Intrinsics.checkNotNullParameter(nestMarker, "nestMarker");
        this.f27282h.unclaim(nestMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi
    public Observable<Pair<WarehouseMarker, Boolean>> warehouseMarkerClicks() {
        Observable<Pair<WarehouseMarker, Boolean>> hide = this.f27283i.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "warehouseMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi
    public Observable<Pair<ZoneMarker, Boolean>> zoneMarkerClicks() {
        Observable<Pair<ZoneMarker, Boolean>> hide = this.f27285k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "zoneMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void deselect(NestMarker nestMarker) {
        Intrinsics.checkNotNullParameter(nestMarker, "nestMarker");
        this.f27282h.deselect(nestMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapNestMarkerUi
    public void select(NestMarker nestMarker) {
        Intrinsics.checkNotNullParameter(nestMarker, "nestMarker");
        this.f27282h.select(nestMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi
    public void deselect(WarehouseMarker warehouseMarker) {
        Intrinsics.checkNotNullParameter(warehouseMarker, "warehouseMarker");
        this.f27284j.deselect(warehouseMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi
    public void select(WarehouseMarker warehouseMarker) {
        Intrinsics.checkNotNullParameter(warehouseMarker, "warehouseMarker");
        this.f27284j.select(warehouseMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi
    public void deselect(ZoneMarker zoneMarker) {
        Intrinsics.checkNotNullParameter(zoneMarker, "zoneMarker");
        this.f27286l.deselect(zoneMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi
    public void select(ZoneMarker zoneMarker) {
        Intrinsics.checkNotNullParameter(zoneMarker, "zoneMarker");
        this.f27286l.select(zoneMarker);
    }
}
