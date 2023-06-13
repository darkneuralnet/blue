package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.NearbyRide;
import co.bird.android.model.RideTrack;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.widget.ControlButton;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import io.reactivex.Observable;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C39011cD1;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001RB\u001f\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\bO\u0010PJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J,\u0010\u000b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u001e\u0010\u0016\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0017H\u0016J\u0016\u0010'\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0016J\u0012\u0010*\u001a\u00020)2\b\b\u0001\u0010(\u001a\u00020\u001cH\u0002J\u0016\u0010+\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0002J \u0010-\u001a\u00020\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\b\b\u0002\u0010!\u001a\u00020\u0017H\u0002J\u0016\u0010.\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0002R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00108¨\u0006S"}, m28432d2 = {"LLw;", "LxE;", "LIw;", "Lio/reactivex/Observable;", "", "W5", "u1", "LfM2;", "markerClicks", "If", "kotlin.jvm.PlatformType", "mapClicks", "Lco/bird/android/model/wire/WireLocation;", "location", "k8", "", "Lco/bird/android/model/NearbyRide;", "rides", "N1", "Lco/bird/android/model/RideTrack;", "tracks", "marker", "V5", "", "halfAlpha", "fg", "i8", "p7", "", "res", "cj", "", "f4", "animate", "R6", "show", "Ae", "Lkotlin/Function0;", "onPrimaryClick", "x6", "drawableRes", "LPT;", "Ul", "Tl", "markers", "Vl", "Xl", "LV2;", "b", "LV2;", "binding", "LcD1;", "c", "LcD1;", "map", DateTokenConverter.CONVERTER_KEY, "LfM2;", "locationMarker", "Lxj0;", "e", "Lxj0;", "circleMarker", "", "f", "Ljava/util/List;", "LMX3;", "g", "LMX3;", "currentRoute", "Lio/reactivex/subjects/h;", "h", "Lio/reactivex/subjects/h;", "markerClick", "i", "mapClick", "j", "selectedMarker", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LV2;LcD1;)V", "k", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadRidingUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadRidingUi.kt\nco/bird/android/app/feature/communitymode/ui/BadRidingUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1549#2:274\n1620#2,2:275\n1622#2:278\n1855#2,2:279\n1855#2,2:281\n1855#2,2:283\n1855#2,2:285\n1#3:277\n*S KotlinDebug\n*F\n+ 1 BadRidingUi.kt\nco/bird/android/app/feature/communitymode/ui/BadRidingUiImpl\n*L\n135#1:274\n135#1:275,2\n135#1:278\n175#1:279,2\n234#1:281,2\n244#1:283,2\n265#1:285,2\n*E\n"})
/* renamed from: Lw */
/* loaded from: classes2.dex */
public final class C5129Lw extends AbstractC30071xE implements InterfaceC3815Iw {

    /* renamed from: k */
    public static final C5130a f22288k = new C5130a(null);

    /* renamed from: l */
    public static final int f22289l = 8;

    /* renamed from: b */
    public final C8536V2 f22290b;

    /* renamed from: c */
    public final C39011cD1 f22291c;

    /* renamed from: d */
    public C40889fM2 f22292d;

    /* renamed from: e */
    public C51775xj0 f22293e;

    /* renamed from: f */
    public final List<C40889fM2> f22294f;

    /* renamed from: g */
    public MX3 f22295g;

    /* renamed from: h */
    public final AbstractC24569h<C40889fM2> f22296h;

    /* renamed from: i */
    public final AbstractC24569h<Unit> f22297i;

    /* renamed from: j */
    public C40889fM2 f22298j;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LLw$a;", "", "", "CREATE_RADIUS", "D", "", "MAP_PADDING_PIXELS", "I", "", "ZOOM_LEVEL", "F", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Lw$a */
    /* loaded from: classes2.dex */
    public static final class C5130a {
        public /* synthetic */ C5130a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5130a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5129Lw(BaseActivity activity, C8536V2 binding, C39011cD1 map) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "map");
        this.f22290b = binding;
        this.f22291c = map;
        this.f22294f = new ArrayList();
        C24558d m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create()");
        this.f22296h = m31902e;
        C24558d m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create()");
        this.f22297i = m31902e2;
        map.m61676l().m4916b(false);
    }

    /* renamed from: Rl */
    public static final void m96136Rl(C5129Lw this$0, LatLng it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f22297i.onNext(Unit.INSTANCE);
    }

    /* renamed from: Sl */
    public static final boolean m96135Sl(C5129Lw this$0, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (marker.m41531c() != null) {
            this$0.f22296h.onNext(marker);
            return true;
        }
        return false;
    }

    /* renamed from: Wl */
    public static /* synthetic */ void m96129Wl(C5129Lw c5129Lw, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c5129Lw.m96131Vl(list, z);
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: Ae */
    public void mo96142Ae(boolean z) {
        RelativeLayout relativeLayout = this.f22290b.f38448b;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.container");
        C49520tu6.show$default(relativeLayout, z, 0, 2, null);
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: If */
    public Observable<Unit> mo96141If() {
        ControlButton controlButton = this.f22290b.f38454h;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.reportButton");
        return C44626lf5.clicksThrottle$default(controlButton, 0L, 1, null);
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: N1 */
    public void mo96140N1(List<NearbyRide> rides) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(rides, "rides");
        List<NearbyRide> list = rides;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (true) {
            Boolean bool = null;
            if (it.hasNext()) {
                NearbyRide nearbyRide = (NearbyRide) it.next();
                LatLng latLng = new LatLng(nearbyRide.getLocation().getLatitude(), nearbyRide.getLocation().getLongitude());
                C40889fM2 m61685c = this.f22291c.m61685c(new MarkerOptions().m50643u1(latLng).m50657N0(m96133Ul(C34479Mg4.marker_ready)));
                if (m61685c != null) {
                    m61685c.m41518p(nearbyRide.getRideId());
                }
                if (m61685c != null) {
                    bool = Boolean.valueOf(this.f22294f.add(m61685c));
                }
                arrayList.add(bool);
            } else {
                m96129Wl(this, this.f22294f, false, 2, null);
                this.f22291c.m61662z(new C39011cD1.InterfaceC13468j() { // from class: Jw
                    @Override // p000.C39011cD1.InterfaceC13468j
                    /* renamed from: a */
                    public final void mo61655a(LatLng latLng2) {
                        C5129Lw.m96136Rl(C5129Lw.this, latLng2);
                    }
                });
                this.f22291c.m61692B(new C39011cD1.InterfaceC13470l() { // from class: Kw
                    @Override // p000.C39011cD1.InterfaceC13470l
                    /* renamed from: c */
                    public final boolean mo27413c(C40889fM2 c40889fM2) {
                        boolean m96135Sl;
                        m96135Sl = C5129Lw.m96135Sl(C5129Lw.this, c40889fM2);
                        return m96135Sl;
                    }
                });
                return;
            }
        }
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: R6 */
    public void mo96137R6(WireLocation location, boolean z) {
        Intrinsics.checkNotNullParameter(location, "location");
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (z) {
            this.f22291c.m61682f(C48149rc0.m15705e(latLng, 16.0f));
        } else {
            this.f22291c.m61675m(C48149rc0.m15705e(latLng, 16.0f));
        }
    }

    /* renamed from: Tl */
    public final void m96134Tl(List<RideTrack> list) {
        PolylineOptions m50611j1 = new PolylineOptions().m50622E(getColor(C32364Df4.mapPathBlue)).m50610k1(new RoundCap()).m50620F(new RoundCap()).m50611j1(2);
        Intrinsics.checkNotNullExpressionValue(m50611j1, "PolylineOptions()\n      …ointType(JointType.ROUND)");
        for (RideTrack rideTrack : list) {
            m50611j1.m50607s(new LatLng(rideTrack.getLocation().getLatitude(), rideTrack.getLocation().getLongitude()));
        }
        this.f22295g = this.f22291c.m61683e(m50611j1);
        m96128Xl(list);
    }

    /* renamed from: Ul */
    public final C6378PT m96133Ul(int i) {
        Drawable m41773i = C40788fB0.m41773i(getActivity(), i);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(m41773i.getIntrinsicWidth(), m41773i.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        m41773i.setBounds(0, 0, m41773i.getIntrinsicWidth(), m41773i.getIntrinsicHeight());
        m41773i.draw(canvas);
        C6378PT m88495a = C6780QT.m88495a(createBitmap);
        Intrinsics.checkNotNullExpressionValue(m88495a, "fromBitmap(bitmap)");
        return m88495a;
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: V5 */
    public void mo96132V5(List<RideTrack> tracks, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(marker, "marker");
        mo96125fg(true);
        m96134Tl(tracks);
        marker.m41523k(m96133Ul(C34479Mg4.marker_ride));
        marker.m41527g(1.0f);
        ControlButton controlButton = this.f22290b.f38454h;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.reportButton");
        C49520tu6.m11233r(controlButton);
        this.f22298j = marker;
    }

    /* renamed from: Vl */
    public final void m96131Vl(List<C40889fM2> list, boolean z) {
        LatLng m41532b;
        LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
        for (C40889fM2 c40889fM2 : list) {
            c17620a.m50666b(c40889fM2.m41532b());
        }
        C40889fM2 c40889fM22 = this.f22292d;
        if (c40889fM22 != null && (m41532b = c40889fM22.m41532b()) != null) {
            c17620a.m50666b(m41532b);
        }
        LatLngBounds m50667a = c17620a.m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "builder.build()");
        C47556qc0 m15707c = C48149rc0.m15707c(m50667a, 150);
        Intrinsics.checkNotNullExpressionValue(m15707c, "newLatLngBounds(\n      b… MAP_PADDING_PIXELS\n    )");
        if (z) {
            this.f22291c.m61682f(m15707c);
        } else {
            this.f22291c.m61675m(m15707c);
        }
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: W5 */
    public Observable<Unit> mo96130W5() {
        ImageButton imageButton = this.f22290b.f38452f;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.myLocationButton");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    /* renamed from: Xl */
    public final void m96128Xl(List<RideTrack> list) {
        LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
        for (RideTrack rideTrack : list) {
            c17620a.m50666b(new LatLng(rideTrack.getLocation().getLatitude(), rideTrack.getLocation().getLongitude()));
        }
        LatLngBounds m50667a = c17620a.m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "builder.build()");
        C47556qc0 m15707c = C48149rc0.m15707c(m50667a, 150);
        Intrinsics.checkNotNullExpressionValue(m15707c, "newLatLngBounds(bounds, MAP_PADDING_PIXELS)");
        this.f22291c.m61682f(m15707c);
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: cj */
    public void mo96127cj(int i) {
        this.f22290b.f38450d.setText(getActivity().getString(i));
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: f4 */
    public String mo96126f4() {
        C40889fM2 c40889fM2 = this.f22298j;
        Object m41531c = c40889fM2 != null ? c40889fM2.m41531c() : null;
        Intrinsics.checkNotNull(m41531c, "null cannot be cast to non-null type kotlin.String");
        return (String) m41531c;
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: fg */
    public void mo96125fg(boolean z) {
        float f;
        MX3 mx3 = this.f22295g;
        if (mx3 != null) {
            mx3.m95179a();
        }
        for (C40889fM2 c40889fM2 : this.f22294f) {
            c40889fM2.m41523k(m96133Ul(C34479Mg4.marker_ready));
            if (z) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            c40889fM2.m41527g(f);
        }
        m96131Vl(this.f22294f, true);
        ControlButton controlButton = this.f22290b.f38454h;
        Intrinsics.checkNotNullExpressionValue(controlButton, "binding.reportButton");
        C49520tu6.m11239l(controlButton);
        this.f22298j = null;
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: i8 */
    public boolean mo96124i8() {
        return this.f22298j != null;
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: k8 */
    public void mo96123k8(WireLocation location) {
        Unit unit;
        Intrinsics.checkNotNullParameter(location, "location");
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.f22293e != null) {
            C40889fM2 c40889fM2 = this.f22292d;
            if (c40889fM2 != null) {
                c40889fM2.m41521m(latLng);
            }
            C51775xj0 c51775xj0 = this.f22293e;
            if (c51775xj0 != null) {
                c51775xj0.m4797a(latLng);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f22292d = this.f22291c.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(m96133Ul(C48193rg4.ic_user_location)).m50651Y1(100.0f));
            C39011cD1 c39011cD1 = this.f22291c;
            CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(27.4332d);
            int i = C32364Df4.transparentLightPurple;
            this.f22293e = c39011cD1.m61687a(m50695m0.m50694p0(getColor(i)).m50692u(getColor(i)).m50702E0(100.0f));
        }
    }

    @Override // p000.InterfaceC3815Iw
    public Observable<Unit> mapClicks() {
        return this.f22297i.hide();
    }

    @Override // p000.InterfaceC3815Iw
    public Observable<C40889fM2> markerClicks() {
        Observable<C40889fM2> hide = this.f22296h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "markerClick.hide()");
        return hide;
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: p7 */
    public void mo96122p7() {
        ControlButton controlButton = this.f22290b.f38454h;
        String string = getActivity().getString(C45871nl4.report_button_text);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.report_button_text)");
        controlButton.setActionText(string);
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: u1 */
    public Observable<Unit> mo96121u1() {
        Button button = this.f22290b.f38455i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.skipButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC3815Iw
    /* renamed from: x6 */
    public void mo96120x6(Function0<Unit> onPrimaryClick) {
        Intrinsics.checkNotNullParameter(onPrimaryClick, "onPrimaryClick");
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_bad_riding_rate_limit, (Integer) null, (Integer) null, false, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C36585Vg4.confirmButton, (Integer) null, (String) null, (String) null, (Function0) onPrimaryClick, (Function0) null, (Function0) null, (Function0) null, false, 506862, (Object) null);
    }
}
