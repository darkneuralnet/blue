package p000;

import android.location.Location;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.operator.widget.LocationMarkerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdLocation;
import co.bird.android.model.Point;
import co.bird.android.model.Route;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireLocation;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C39011cD1;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010p\u001a\u00020o\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E¢\u0006\u0004\bq\u0010rJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\fH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0016\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020'H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J(\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0012H\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0004H\u0016J\u0010\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0010\u00109\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010:\u001a\u00020\u0006H\u0016J\u0018\u0010=\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0012H\u0016J\u0018\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0003H\u0016R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010\r\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00060\u00060X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010a\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00150\u00150X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010[R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010^R\"\u0010e\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\u00150\u00150X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010[R\u0014\u0010h\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010NR\u0018\u0010n\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010N¨\u0006s"}, m28432d2 = {"LVy3;", "LxE;", "Lxu3;", "Lco/bird/android/model/BirdLocation;", "", "Tl", "", "lb", "Landroid/location/Location;", "location", "moveTo", "updateMyLocation", "Lio/reactivex/Observable;", "mapClicks", "", "possibleLocations", "Sk", "Lco/bird/android/model/wire/WireLocation;", "", "showAnnotationBubble", "A2", "LfM2;", "og", "dl", "Lco/bird/android/model/Route;", "route", "uj", "removeRoute", "Lco/bird/android/model/Point;", "points", "zoomTo", "q3", "myLocationClicks", "resId", "setTitle", "show", "showConnectionStatus", "f8", "hl", "", "birdCode", "Ie", "tool", "ci", "He", "showBirdCode", "showBattery", "showLastSignal", "showSignalStrengthPercentage", "te", "Jh", "batteryLevel", "F7", "Lco/bird/android/model/Vehicle;", "vehicle", "ca", "kb", "yc", "D4", "marker", "originalLocation", "qa", "ba", "birdLocation", "Jf", "LcD1;", "b", "LcD1;", "map", "LB4;", "c", "LB4;", "binding", "", DateTokenConverter.CONVERTER_KEY, "F", "zoomLevel", "e", "LfM2;", "locationMarker", "Lxj0;", "f", "Lxj0;", "radiusCircle", "LMX3;", "g", "LMX3;", "currentRoute", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/d;", "", "i", "Ljava/util/Map;", "possibleLocationMarkers", "j", "possibleLocationMarkerClicks", "k", "originalLocationMarker", "l", "originalLocationMarkerClicks", "m", "I", "pathColor", "n", "zoomPaddingPx", "o", "originalLocationInfoWindow", "p", "currentLocationSourceBubble", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LcD1;LB4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSupplementMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapUi.kt\nco/bird/android/app/feature/operator/ui/OtherPossibleLocationsUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,354:1\n1855#2:355\n1856#2:357\n1855#2,2:358\n1855#2,2:360\n1#3:356\n*S KotlinDebug\n*F\n+ 1 OperatorSupplementMapUi.kt\nco/bird/android/app/feature/operator/ui/OtherPossibleLocationsUiImpl\n*L\n149#1:355\n149#1:357\n210#1:358,2\n220#1:360,2\n*E\n"})
/* renamed from: Vy3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36746Vy3 extends AbstractC30071xE implements InterfaceC51888xu3 {

    /* renamed from: b */
    public final C39011cD1 f40147b;

    /* renamed from: c */
    public final C0384B4 f40148c;

    /* renamed from: d */
    public final float f40149d;

    /* renamed from: e */
    public C40889fM2 f40150e;

    /* renamed from: f */
    public C51775xj0 f40151f;

    /* renamed from: g */
    public MX3 f40152g;

    /* renamed from: h */
    public final C24558d<Unit> f40153h;

    /* renamed from: i */
    public final Map<BirdLocation, C40889fM2> f40154i;

    /* renamed from: j */
    public final C24558d<C40889fM2> f40155j;

    /* renamed from: k */
    public final Map<WireLocation, C40889fM2> f40156k;

    /* renamed from: l */
    public final C24558d<C40889fM2> f40157l;

    /* renamed from: m */
    public final int f40158m;

    /* renamed from: n */
    public final int f40159n;

    /* renamed from: o */
    public C40889fM2 f40160o;

    /* renamed from: p */
    public C40889fM2 f40161p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36746Vy3(BaseActivity activity, C39011cD1 map, C0384B4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f40147b = map;
        this.f40148c = binding;
        this.f40149d = 17.0f;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f40153h = m31902e;
        this.f40154i = new LinkedHashMap();
        C24558d<C40889fM2> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Marker>()");
        this.f40155j = m31902e2;
        this.f40156k = new LinkedHashMap();
        C24558d<C40889fM2> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Marker>()");
        this.f40157l = m31902e3;
        this.f40158m = C40788fB0.m41776f(activity, C32364Df4.birdESBlue);
        this.f40159n = activity.getResources().getDimensionPixelSize(C37044Xf4.map_zoom_padding_large);
    }

    /* renamed from: Rl */
    public static final boolean m79035Rl(C36746Vy3 this$0, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (this$0.f40154i.containsValue(marker)) {
            if (marker.m41531c() != null) {
                this$0.f40155j.onNext(marker);
                return false;
            }
            return false;
        } else if (this$0.f40156k.containsValue(marker) && marker.m41531c() != null) {
            this$0.f40157l.onNext(marker);
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: Sl */
    public static final void m79034Sl(C36746Vy3 this$0, LatLng it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f40153h.onNext(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: A2 */
    public void mo4499A2(WireLocation location, boolean z) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (z) {
            this.f40160o = this.f40147b.m61685c(new MarkerOptions().m50643u1(new LatLng(location.getLatitude(), location.getLongitude())).m50644u(0.5f, 1.2f).m50657N0(C40788fB0.iconBitmapDescriptor$default(getActivity(), new LocationMarkerView(getActivity(), null, 0, 6, null), C48193rg4.ic_pin_location_marker_bg, (AP1) null, 4, (Object) null)).m50651Y1(30.0f));
        }
        C40889fM2 m61685c = this.f40147b.m61685c(new MarkerOptions().m50643u1(new LatLng(location.getLatitude(), location.getLongitude())).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.icon$default(getActivity(), C48193rg4.marker_original_location, null, null, 6, null)).m50651Y1(30.0f));
        if (m61685c != null) {
            m61685c.m41518p(location);
        }
        if (m61685c != null) {
            this.f40156k.put(location, m61685c);
        }
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: D4 */
    public void mo4498D4() {
        C40889fM2 c40889fM2 = this.f40160o;
        if (c40889fM2 != null) {
            c40889fM2.m41528f();
        }
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: F7 */
    public void mo4497F7(int i) {
        this.f40148c.f1592c.setText(C51916xx1.f118396a.m4411a(getActivity(), i, true));
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: He */
    public void mo4496He(boolean z) {
        CardView cardView = this.f40148c.f1594e;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.birdFinderView");
        C49520tu6.show$default(cardView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: Ie */
    public void mo4495Ie(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f40148c.f1601l.setText(getActivity().getString(C45871nl4.other_possible_location_bird_code, birdCode));
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: Jf */
    public void mo4494Jf(BirdLocation birdLocation) {
        Intrinsics.checkNotNullParameter(birdLocation, "birdLocation");
        C40889fM2 c40889fM2 = this.f40161p;
        if (c40889fM2 != null) {
            c40889fM2.m41528f();
        }
        if (birdLocation.getDisplayName() != null) {
            LocationMarkerView locationMarkerView = new LocationMarkerView(getActivity(), null, 0, 6, null);
            locationMarkerView.m60206a(birdLocation);
            this.f40161p = this.f40147b.m61685c(new MarkerOptions().m50643u1(new LatLng(birdLocation.getLocation().getLatitude(), birdLocation.getLocation().getLongitude())).m50644u(0.5f, 1.2f).m50657N0(C40788fB0.iconBitmapDescriptor$default(getActivity(), locationMarkerView, C48193rg4.ic_pin_location_marker_bg, (AP1) null, 4, (Object) null)).m50651Y1(30.0f));
        }
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: Jh */
    public void mo4493Jh(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f40148c.f1596g.setText(birdCode);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: Sk */
    public void mo4492Sk(List<BirdLocation> possibleLocations) {
        Intrinsics.checkNotNullParameter(possibleLocations, "possibleLocations");
        for (BirdLocation birdLocation : possibleLocations) {
            C40889fM2 m61685c = this.f40147b.m61685c(new MarkerOptions().m50643u1(new LatLng(birdLocation.getLocation().getLatitude(), birdLocation.getLocation().getLongitude())).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.icon$default(getActivity(), m79033Tl(birdLocation), null, null, 6, null)).m50651Y1(30.0f));
            if (m61685c != null) {
                m61685c.m41518p(birdLocation);
            }
            if (m61685c != null) {
                this.f40154i.put(birdLocation, m61685c);
            }
        }
        this.f40147b.m61692B(new C39011cD1.InterfaceC13470l() { // from class: Ty3
            @Override // p000.C39011cD1.InterfaceC13470l
            /* renamed from: c */
            public final boolean mo27413c(C40889fM2 c40889fM2) {
                boolean m79035Rl;
                m79035Rl = C36746Vy3.m79035Rl(C36746Vy3.this, c40889fM2);
                return m79035Rl;
            }
        });
    }

    /* renamed from: Tl */
    public final int m79033Tl(BirdLocation birdLocation) {
        DateTime createdAt = birdLocation.getCreatedAt();
        boolean z = false;
        if (createdAt != null && createdAt.isBefore(DateTime.now().minusHours(1))) {
            z = true;
        }
        if (z) {
            return C48193rg4.marker_possible_location_aged;
        }
        return C48193rg4.marker_possible_location;
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: ba */
    public void mo4491ba(C40889fM2 marker, boolean z) {
        BirdLocation birdLocation;
        int i;
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (z) {
            marker.m41523k(C40788fB0.icon$default(getActivity(), C48193rg4.marker_original_location, null, null, 6, null));
            return;
        }
        BaseActivity activity = getActivity();
        Object m41531c = marker.m41531c();
        if (m41531c instanceof BirdLocation) {
            birdLocation = (BirdLocation) m41531c;
        } else {
            birdLocation = null;
        }
        if (birdLocation != null) {
            i = m79033Tl(birdLocation);
        } else {
            i = C48193rg4.marker_possible_location;
        }
        marker.m41523k(C40788fB0.icon$default(activity, i, null, null, 6, null));
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: ca */
    public void mo4490ca(Vehicle vehicle) {
        int i;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        ImageView imageView = this.f40148c.f1610u;
        JA5 m4236a = C51957y13.m4236a(vehicle);
        if (m4236a != null) {
            i = m4236a.m101051b();
        } else {
            i = C48193rg4.ic_ui_signal_one;
        }
        imageView.setImageResource(i);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: ci */
    public void mo4489ci(String tool) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        this.f40148c.f1601l.setText(tool);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: dl */
    public Observable<C40889fM2> mo4488dl() {
        Observable<C40889fM2> hide = this.f40157l.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "originalLocationMarkerClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: f8 */
    public void mo4487f8(boolean z, boolean z2) {
        LinearLayout linearLayout = this.f40148c.f1600k;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.infoBanner");
        C49520tu6.show$default(linearLayout, z, 0, 2, null);
        LinearLayout linearLayout2 = this.f40148c.f1599j;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.connectionStatusLayout");
        C49520tu6.show$default(linearLayout2, z2, 0, 2, null);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: hl */
    public void mo4486hl(int i) {
        this.f40148c.f1602m.setText(i);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: kb */
    public Observable<Unit> mo4485kb() {
        ImageButton imageButton = this.f40148c.f1595f;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.chirpButton");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: lb */
    public void mo4484lb() {
        this.f40147b.m61662z(new C39011cD1.InterfaceC13468j() { // from class: Uy3
            @Override // p000.C39011cD1.InterfaceC13468j
            /* renamed from: a */
            public final void mo61655a(LatLng latLng) {
                C36746Vy3.m79034Sl(C36746Vy3.this, latLng);
            }
        });
    }

    @Override // p000.InterfaceC51888xu3
    public Observable<Unit> mapClicks() {
        Observable<Unit> hide = this.f40153h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "mapClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC51888xu3
    public void moveTo(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f40147b.m61675m(C48149rc0.m15705e(new LatLng(location.getLatitude(), location.getLongitude()), this.f40149d));
    }

    @Override // p000.InterfaceC51888xu3
    public Observable<Unit> myLocationClicks() {
        ImageButton imageButton = this.f40148c.f1606q;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.myLocationButton");
        return C45219mf5.m25214a(imageButton);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: og */
    public Observable<C40889fM2> mo4483og() {
        Observable<C40889fM2> hide = this.f40155j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "possibleLocationMarkerClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: q3 */
    public void mo4482q3(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f40147b.m61682f(C48149rc0.m15705e(new LatLng(location.getLatitude(), location.getLongitude()), this.f40149d));
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: qa */
    public void mo4481qa(C40889fM2 marker, boolean z) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (z) {
            marker.m41523k(C40788fB0.icon$default(getActivity(), C48193rg4.marker_original_location_selected, null, null, 6, null));
        } else {
            marker.m41523k(C40788fB0.icon$default(getActivity(), C48193rg4.marker_possible_location_selected, null, null, 6, null));
        }
    }

    @Override // p000.InterfaceC51888xu3
    public void removeRoute() {
        MX3 mx3 = this.f40152g;
        if (mx3 != null) {
            mx3.m95179a();
        }
    }

    @Override // p000.InterfaceC51888xu3
    public void setTitle(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70243D(i);
        }
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: te */
    public void mo4480te(boolean z, boolean z2, boolean z3, boolean z4) {
        TextView textView = this.f40148c.f1597h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.codeLabel");
        C49520tu6.show$default(textView, z, 0, 2, null);
        TextView textView2 = this.f40148c.f1596g;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.code");
        C49520tu6.show$default(textView2, z, 0, 2, null);
        TextView textView3 = this.f40148c.f1593d;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.batteryLabel");
        C49520tu6.show$default(textView3, z2, 0, 2, null);
        TextView textView4 = this.f40148c.f1592c;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.battery");
        C49520tu6.show$default(textView4, z2, 0, 2, null);
        TextView textView5 = this.f40148c.f1604o;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.lastSignalLabel");
        C49520tu6.show$default(textView5, z3, 0, 2, null);
        TextView textView6 = this.f40148c.f1603n;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.lastSignal");
        C49520tu6.show$default(textView6, z3, 0, 2, null);
        TextView textView7 = this.f40148c.f1612w;
        Intrinsics.checkNotNullExpressionValue(textView7, "binding.signalStrengthPercentage");
        C49520tu6.show$default(textView7, z4, 0, 2, null);
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: uj */
    public void mo4479uj(Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        MX3 mx3 = this.f40152g;
        if (mx3 != null) {
            mx3.m95179a();
        }
        PolylineOptions m50611j1 = new PolylineOptions().m50622E(this.f40158m).m50610k1(new RoundCap()).m50620F(new RoundCap()).m50611j1(2);
        Intrinsics.checkNotNullExpressionValue(m50611j1, "PolylineOptions()\n      …ointType(JointType.ROUND)");
        for (LatLng latLng : route.getPoints()) {
            m50611j1.m50607s(latLng);
        }
        this.f40152g = this.f40147b.m61683e(m50611j1);
    }

    @Override // p000.InterfaceC51888xu3
    public void updateMyLocation(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        C40889fM2 c40889fM2 = this.f40150e;
        if (c40889fM2 == null) {
            this.f40150e = this.f40147b.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.icon$default(getActivity(), C48193rg4.ic_user_location, null, null, 6, null)).m50658L1(getActivity().getString(C45871nl4.map_my_location)).m50651Y1(100.0f));
            C39011cD1 c39011cD1 = this.f40147b;
            CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(location.getAccuracy());
            int i = C32364Df4.transparentLightPurple;
            this.f40151f = c39011cD1.m61687a(m50695m0.m50692u(getColor(i)).m50694p0(getColor(i)).m50702E0(100.0f));
            return;
        }
        if (c40889fM2 != null) {
            c40889fM2.m41521m(latLng);
        }
        C51775xj0 c51775xj0 = this.f40151f;
        if (c51775xj0 != null) {
            c51775xj0.m4797a(latLng);
        }
        C51775xj0 c51775xj02 = this.f40151f;
        if (c51775xj02 != null) {
            c51775xj02.m4796b(location.getAccuracy());
        }
    }

    @Override // p000.InterfaceC51888xu3
    /* renamed from: yc */
    public void mo4478yc(boolean z) {
        TextView textView = this.f40148c.f1607r;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.noOtherLocationWarning");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC51888xu3
    public void zoomTo(List<? extends Point> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        LatLngBounds.C17620a m50670s = LatLngBounds.m50670s();
        Intrinsics.checkNotNullExpressionValue(m50670s, "builder()");
        for (Point point : points) {
            m50670s.m50666b(new LatLng(point.f66612y, point.f66611x));
        }
        this.f40147b.m61682f(C48149rc0.m15707c(m50670s.m50667a(), this.f40159n));
    }
}
