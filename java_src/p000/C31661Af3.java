package p000;

import android.location.Location;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.infowindow.BirdInfoWindowAdapter;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.p008ui.MapAreasUi;
import co.bird.android.app.feature.map.p008ui.MapAreasUiImpl;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEventImpl;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.widget.SilenceableMaterialEditText;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24567g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C39011cD1;
@Metadata(m28433d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001vB%\b\u0007\u0012\b\b\u0001\u0010s\u001a\u00020r\u0012\b\b\u0001\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R¢\u0006\u0004\bt\u0010uJ\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J+\u0010\u000e\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\f0\tH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0016J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J \u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u0016\u0010+\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u001e\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0/0\u0006H\u0016J \u00105\u001a\u00020\f2\u0006\u00102\u001a\u0002012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010(H\u0016J\u0012\u00107\u001a\u00020\f2\b\b\u0001\u00106\u001a\u00020\u0016H\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010=\u001a\u00020\u0011H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020$0\u0006H\u0016J\u0012\u0010B\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010C\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u00020\fH\u0016J\b\u0010E\u001a\u00020\fH\u0016J\u0010\u0010G\u001a\u00020\f2\u0006\u0010F\u001a\u00020@H\u0016J\b\u0010H\u001a\u00020\fH\u0016J\b\u0010I\u001a\u00020\fH\u0016J\b\u0010J\u001a\u00020\fH\u0016J\b\u0010K\u001a\u00020\fH\u0016J\u0010\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u000203H\u0016R\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010\u0005\u001a\u0010\u0012\f\u0012\n W*\u0004\u0018\u00010\u00040\u00040V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\"\u0010l\u001a\u0010\u0012\f\u0012\n W*\u0004\u0018\u00010i0i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010q\u001a\u0010\u0012\f\u0012\n W*\u0004\u0018\u00010n0n0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006w"}, m28432d2 = {"LAf3;", "LxE;", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "LUg3;", "LcD1;", "map", "Lio/reactivex/Observable;", "Landroid/location/Location;", "centerLocation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "perform", "withMap", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "am", "", "enable", "enableDoneButton", "show", "showDoneButton", "", Entry.TYPE_TEXT, "setHeadsUpText", "(Ljava/lang/Integer;)V", "doneClicks", "Lco/bird/android/model/wire/WireLocation;", "location", "", "radius", "setCurrentLocation", "animate", "indirect", "setLocation", "getLocation", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "getAddress", "", "Lco/bird/android/model/persistence/Area;", "areas", "setAreas", "key", "setAdditionalAreas", "hideInfoWindow", "Lco/bird/android/buava/Optional;", "selectedAreaMarker", "", "zoomLevel", "Lcom/google/android/gms/maps/model/LatLng;", "viewport", "updateAreasUi", "hint", "setAddressHint", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "showInfoWindow", "mapClicks", "keyboardDoneClicks", "includeIndirectUpdates", "observeLocation", "observeAddressField", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onMapReady", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "point", "showInfoWindowForNonOperationalArea", "LZf3;", "b", "LZf3;", "binding", "Ldr4;", "c", "Ldr4;", "locationManager", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/g;", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "e", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "areasUi", "LfM2;", "f", "LfM2;", "marker", "g", "locationMarker", "Lxj0;", "h", "Lxj0;", "circleMarker", "Lio/reactivex/subjects/a;", "LAf3$a;", "i", "Lio/reactivex/subjects/a;", "locationSubject", "LAG;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "j", "LAG;", "reactiveMapEventRelay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LZf3;Ldr4;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnDemandLocationSelectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandLocationSelectionUi.kt\nco/bird/android/app/feature/longterm/OnDemandLocationSelectionUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,319:1\n199#2:320\n*S KotlinDebug\n*F\n+ 1 OnDemandLocationSelectionUi.kt\nco/bird/android/app/feature/longterm/OnDemandLocationSelectionUiImpl\n*L\n304#1:320\n*E\n"})
/* renamed from: Af3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31661Af3 extends AbstractC30071xE implements LocationSelectionUi, InterfaceC36350Ug3 {

    /* renamed from: b */
    public final C37511Zf3 f911b;

    /* renamed from: c */
    public final InterfaceC40001dr4 f912c;

    /* renamed from: d */
    public C24567g<C39011cD1> f913d;

    /* renamed from: e */
    public MapAreasUi f914e;

    /* renamed from: f */
    public C40889fM2 f915f;

    /* renamed from: g */
    public C40889fM2 f916g;

    /* renamed from: h */
    public C51775xj0 f917h;

    /* renamed from: i */
    public final C24552a<C0171a> f918i;

    /* renamed from: j */
    public final C0058AG<ReactiveMapEvent> f919j;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LAf3$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireLocation;", C17296a.f69688o, "Lco/bird/android/model/wire/WireLocation;", "b", "()Lco/bird/android/model/wire/WireLocation;", "location", "Z", "()Z", "indirect", "<init>", "(Lco/bird/android/model/wire/WireLocation;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Af3$a */
    /* loaded from: classes2.dex */
    public static final class C0171a {

        /* renamed from: a */
        public final WireLocation f920a;

        /* renamed from: b */
        public final boolean f921b;

        public C0171a(WireLocation location, boolean z) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f920a = location;
            this.f921b = z;
        }

        /* renamed from: a */
        public final boolean m115396a() {
            return this.f921b;
        }

        /* renamed from: b */
        public final WireLocation m115395b() {
            return this.f920a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0171a) {
                C0171a c0171a = (C0171a) obj;
                return Intrinsics.areEqual(this.f920a, c0171a.f920a) && this.f921b == c0171a.f921b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f920a.hashCode() * 31;
            boolean z = this.f921b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            WireLocation wireLocation = this.f920a;
            boolean z = this.f921b;
            return "LocationUpdate(location=" + wireLocation + ", indirect=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcD1;", "it", "Lio/reactivex/B;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(LcD1;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$b */
    /* loaded from: classes2.dex */
    public static final class C0172b extends Lambda implements Function1<C39011cD1, InterfaceC23434B<? extends Location>> {
        public C0172b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Location> invoke(C39011cD1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C31661Af3.this.centerLocation(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$c */
    /* loaded from: classes2.dex */
    public static final class C0173c extends Lambda implements Function1<ReactiveMapEvent, InterfaceC23434B<? extends Unit>> {

        /* renamed from: g */
        public static final C0173c f923g = new C0173c();

        public C0173c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(ReactiveMapEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.cameraIdles();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Af3$d */
    /* loaded from: classes2.dex */
    public static final class C0174d extends Lambda implements Function1<Unit, LatLng> {

        /* renamed from: g */
        public final /* synthetic */ C39011cD1 f924g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0174d(C39011cD1 c39011cD1) {
            super(1);
            this.f924g = c39011cD1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final LatLng invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f924g.m61679i().f71394b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Af3$e */
    /* loaded from: classes2.dex */
    public static final class C0175e extends Lambda implements Function1<LatLng, Location> {

        /* renamed from: g */
        public static final C0175e f925g = new C0175e();

        public C0175e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Location invoke(LatLng it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37429Yw2.f47648a.m73962i(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Af3$f */
    /* loaded from: classes2.dex */
    public static final class C0176f extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C0176f f926g = new C0176f();

        public C0176f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcD1;", "it", "Lio/reactivex/B;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "kotlin.jvm.PlatformType", "invoke", "(LcD1;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$g */
    /* loaded from: classes2.dex */
    public static final class C0177g extends Lambda implements Function1<C39011cD1, InterfaceC23434B<? extends ReactiveMapEvent>> {
        public C0177g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends ReactiveMapEvent> invoke(C39011cD1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C31661Af3.this.f919j;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "it", "Lio/reactivex/B;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$h */
    /* loaded from: classes2.dex */
    public static final class C0178h extends Lambda implements Function1<ReactiveMapEvent, InterfaceC23434B<? extends LatLng>> {

        /* renamed from: g */
        public static final C0178h f928g = new C0178h();

        public C0178h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends LatLng> invoke(ReactiveMapEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mapClicks();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Af3$i */
    /* loaded from: classes2.dex */
    public static final class C0179i extends Lambda implements Function1<LatLng, WireLocation> {

        /* renamed from: g */
        public static final C0179i f929g = new C0179i();

        public C0179i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WireLocation invoke(LatLng it) {
            WireLocation m108593a;
            Intrinsics.checkNotNullParameter(it, "it");
            m108593a = C32597Ef3.m108593a(it);
            return m108593a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LAf3$a;", "it", "", C17296a.f69688o, "(LAf3$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$j */
    /* loaded from: classes2.dex */
    public static final class C0180j extends Lambda implements Function1<C0171a, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0180j(boolean z) {
            super(1);
            this.f930g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C0171a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.f930g && it.m115396a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LAf3$a;", "it", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LAf3$a;)Lco/bird/android/model/wire/WireLocation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$k */
    /* loaded from: classes2.dex */
    public static final class C0181k extends Lambda implements Function1<C0171a, WireLocation> {

        /* renamed from: g */
        public static final C0181k f931g = new C0181k();

        public C0181k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireLocation invoke(C0171a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m115395b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Af3$l", "LcD1$m;", "LfM2;", "marker", "", "onMarkerDragStart", "onMarkerDragEnd", "onMarkerDrag", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Af3$l */
    /* loaded from: classes2.dex */
    public static final class C0182l implements C39011cD1.InterfaceC13471m {

        /* renamed from: b */
        public final /* synthetic */ C39011cD1 f933b;

        public C0182l(C39011cD1 c39011cD1) {
            this.f933b = c39011cD1;
        }

        @Override // p000.C39011cD1.InterfaceC13471m
        public void onMarkerDrag(C40889fM2 marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
        }

        @Override // p000.C39011cD1.InterfaceC13471m
        public void onMarkerDragEnd(C40889fM2 marker) {
            WireLocation m108593a;
            Intrinsics.checkNotNullParameter(marker, "marker");
            C24552a c24552a = C31661Af3.this.f918i;
            LatLng m41532b = marker.m41532b();
            Intrinsics.checkNotNullExpressionValue(m41532b, "marker.position");
            m108593a = C32597Ef3.m108593a(m41532b);
            c24552a.onNext(new C0171a(m108593a, false));
            this.f933b.m61682f(C48149rc0.m15708b(marker.m41532b()));
        }

        @Override // p000.C39011cD1.InterfaceC13471m
        public void onMarkerDragStart(C40889fM2 marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$m */
    /* loaded from: classes2.dex */
    public static final class C0183m extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireLocation f934g;

        /* renamed from: h */
        public final /* synthetic */ C31661Af3 f935h;

        /* renamed from: i */
        public final /* synthetic */ double f936i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0183m(WireLocation wireLocation, C31661Af3 c31661Af3, double d) {
            super(1);
            this.f934g = wireLocation;
            this.f935h = c31661Af3;
            this.f936i = d;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            LatLng latLng = new LatLng(this.f934g.getLatitude(), this.f934g.getLongitude());
            if (this.f935h.f917h == null) {
                this.f935h.f916g = map.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.m41777e(this.f935h.getActivity(), C48193rg4.ic_user_location)).m50651Y1(100.0f));
                C31661Af3 c31661Af3 = this.f935h;
                CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(this.f936i);
                C31661Af3 c31661Af32 = this.f935h;
                int i = C32364Df4.transparentLightPurple;
                c31661Af3.f917h = map.m61687a(m50695m0.m50694p0(c31661Af32.getColor(i)).m50692u(this.f935h.getColor(i)).m50702E0(100.0f));
            } else {
                C40889fM2 c40889fM2 = this.f935h.f916g;
                if (c40889fM2 != null) {
                    c40889fM2.m41521m(latLng);
                }
                C51775xj0 c51775xj0 = this.f935h.f917h;
                if (c51775xj0 != null) {
                    c51775xj0.m4797a(latLng);
                }
            }
            map.m61688F(0, 0, 0, this.f935h.f911b.f48921c.getHeight());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$n */
    /* loaded from: classes2.dex */
    public static final class C0184n extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireLocation f937g;

        /* renamed from: h */
        public final /* synthetic */ C31661Af3 f938h;

        /* renamed from: i */
        public final /* synthetic */ boolean f939i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0184n(WireLocation wireLocation, C31661Af3 c31661Af3, boolean z) {
            super(1);
            this.f937g = wireLocation;
            this.f938h = c31661Af3;
            this.f939i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            LatLng latLng = new LatLng(this.f937g.getLatitude(), this.f937g.getLongitude());
            if (this.f938h.f915f == null) {
                this.f938h.f915f = map.m61685c(new MarkerOptions().m50643u1(latLng).m50657N0(C40788fB0.m41777e(this.f938h.getActivity(), C48193rg4.ic_map_drop_pin)).m50642v(true));
                C40889fM2 c40889fM2 = this.f938h.f915f;
                if (c40889fM2 != null) {
                    c40889fM2.m41514t();
                }
            } else {
                C40889fM2 c40889fM22 = this.f938h.f915f;
                if (c40889fM22 != null) {
                    c40889fM22.m41521m(latLng);
                }
            }
            if (this.f939i) {
                map.m61682f(C48149rc0.m15705e(latLng, 17.0f));
            } else {
                map.m61675m(C48149rc0.m15705e(new LatLng(this.f937g.getLatitude(), this.f937g.getLongitude()), 18.0f));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$o */
    /* loaded from: classes2.dex */
    public static final class C0185o extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ MarkerOptions f940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0185o(MarkerOptions markerOptions) {
            super(1);
            this.f940g = markerOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            C40889fM2 m61685c = map.m61685c(this.f940g);
            if (m61685c != null) {
                m61685c.m41514t();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LcD1;", "kotlin.jvm.PlatformType", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Af3$p */
    /* loaded from: classes2.dex */
    public static final class C0186p extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<C39011cD1, Unit> f941g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0186p(Function1<? super C39011cD1, Unit> function1) {
            super(1);
            this.f941g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Function1<C39011cD1, Unit> function1 = this.f941g;
            Intrinsics.checkNotNullExpressionValue(map, "map");
            function1.invoke(map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31661Af3(BaseActivity activity, C37511Zf3 binding, InterfaceC40001dr4 locationManager) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f911b = binding;
        this.f912c = locationManager;
        C24567g<C39011cD1> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<GoogleMap>()");
        this.f913d = m31882w0;
        C24552a<C0171a> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<LocationUpdate>()");
        this.f918i = m31922e;
        C0058AG<ReactiveMapEvent> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<ReactiveMapEvent>()");
        this.f919j = m115951g;
        BottomSheetBehavior m50133G = BottomSheetBehavior.m50133G(binding.f48921c);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.dragView)");
        m50133G.m50098h0(false);
        m50133G.m50092k0(activity.getResources().getDimensionPixelSize(C37044Xf4.bird_bottom_sheet_peek_height));
        m50133G.m50082p0(3);
    }

    public static final InterfaceC23434B centerLocation$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    public static final InterfaceC23434B centerLocation$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    public static final LatLng centerLocation$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    public static final Location centerLocation$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Location) tmp0.invoke(obj);
    }

    public static final Unit keyboardDoneClicks$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    public static final InterfaceC23434B mapClicks$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    public static final InterfaceC23434B mapClicks$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    public static final WireLocation mapClicks$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    public static final WireLocation observeLocation$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    public static final boolean observeLocation$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public static final void withMap$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    /* renamed from: am */
    public CoordinatorLayout getView() {
        CoordinatorLayout root = this.f911b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Location> centerLocation() {
        C24567g<C39011cD1> c24567g = this.f913d;
        final C0172b c0172b = new C0172b();
        Observable m33162D = c24567g.m33162D(new InterfaceC23492o() { // from class: tf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B centerLocation$lambda$1;
                centerLocation$lambda$1 = C31661Af3.centerLocation$lambda$1(Function1.this, obj);
                return centerLocation$lambda$1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "override fun centerLocat… centerLocation(it) }\n  }");
        return m33162D;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Unit> doneClicks() {
        Button button = this.f911b.f48924f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.next");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void enableDoneButton(boolean z) {
        this.f911b.f48924f.setEnabled(z);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public String getAddress() {
        return String.valueOf(this.f911b.f48920b.getText());
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public WireLocation getLocation() {
        WireLocation m108593a;
        C40889fM2 c40889fM2 = this.f915f;
        Intrinsics.checkNotNull(c40889fM2);
        LatLng m41532b = c40889fM2.m41532b();
        Intrinsics.checkNotNullExpressionValue(m41532b, "marker!!.position");
        m108593a = C32597Ef3.m108593a(m41532b);
        return m108593a;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void hideInfoWindow() {
        MapAreasUi mapAreasUi = this.f914e;
        if (mapAreasUi != null) {
            mapAreasUi.hideInfoWindow();
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Unit> keyboardDoneClicks() {
        Observable m41061b;
        SilenceableMaterialEditText silenceableMaterialEditText = this.f911b.f48920b;
        Intrinsics.checkNotNullExpressionValue(silenceableMaterialEditText, "binding.addressText");
        m41061b = C41068ff5.m41061b(silenceableMaterialEditText, null, 1, null);
        final C0176f c0176f = C0176f.f926g;
        Observable<Unit> map = m41061b.map(new InterfaceC23492o() { // from class: yf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit keyboardDoneClicks$lambda$5;
                keyboardDoneClicks$lambda$5 = C31661Af3.keyboardDoneClicks$lambda$5(Function1.this, obj);
                return keyboardDoneClicks$lambda$5;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.addressText.editorActions().map { Unit }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<WireLocation> mapClicks() {
        C24567g<C39011cD1> c24567g = this.f913d;
        final C0177g c0177g = new C0177g();
        Observable<R> m33162D = c24567g.m33162D(new InterfaceC23492o() { // from class: uf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B mapClicks$lambda$2;
                mapClicks$lambda$2 = C31661Af3.mapClicks$lambda$2(Function1.this, obj);
                return mapClicks$lambda$2;
            }
        });
        final C0178h c0178h = C0178h.f928g;
        Observable flatMap = m33162D.flatMap(new InterfaceC23492o() { // from class: vf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B mapClicks$lambda$3;
                mapClicks$lambda$3 = C31661Af3.mapClicks$lambda$3(Function1.this, obj);
                return mapClicks$lambda$3;
            }
        });
        final C0179i c0179i = C0179i.f929g;
        Observable<WireLocation> map = flatMap.map(new InterfaceC23492o() { // from class: wf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation mapClicks$lambda$4;
                mapClicks$lambda$4 = C31661Af3.mapClicks$lambda$4(Function1.this, obj);
                return mapClicks$lambda$4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun mapClicks()….toLocation()\n      }\n  }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<String> observeAddressField() {
        SilenceableMaterialEditText silenceableMaterialEditText = this.f911b.f48920b;
        Intrinsics.checkNotNullExpressionValue(silenceableMaterialEditText, "binding.addressText");
        return C44626lf5.textChanges$default(silenceableMaterialEditText, 100, false, 2, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<WireLocation> observeLocation(boolean z) {
        Observable<C0171a> hide = this.f918i.hide();
        final C0180j c0180j = new C0180j(z);
        Observable<C0171a> filter = hide.filter(new InterfaceC23494q() { // from class: zf3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean observeLocation$lambda$9;
                observeLocation$lambda$9 = C31661Af3.observeLocation$lambda$9(Function1.this, obj);
                return observeLocation$lambda$9;
            }
        });
        final C0181k c0181k = C0181k.f931g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: qf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation observeLocation$lambda$10;
                observeLocation$lambda$10 = C31661Af3.observeLocation$lambda$10(Function1.this, obj);
                return observeLocation$lambda$10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "includeIndirectUpdates: …     .map { it.location }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onCreate(Bundle bundle) {
        C38500bM2.m64632a(getActivity());
        this.f911b.f48923e.m50725b(bundle);
        this.f911b.f48923e.m50726a(this);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onDestroy() {
        this.f911b.f48923e.m50724c();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onLowMemory() {
        this.f911b.f48923e.m50723d();
    }

    @Override // p000.InterfaceC36350Ug3
    public void onMapReady(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f913d.onSuccess(map);
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        this.f919j.accept(reactiveMapEventImpl);
        this.f914e = new MapAreasUiImpl(getActivity(), map, reactiveMapEventImpl, null, null, this.f912c, 24, null);
        map.m61676l().m4917a(true);
        map.m61672p(new BirdInfoWindowAdapter(getActivity(), MapMode.RIDER, false));
        map.m61673o(false);
        map.m61691C(new C0182l(map));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onPause() {
        this.f911b.f48923e.m50722e();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onResume() {
        this.f911b.f48923e.m50721f();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f911b.f48923e.m50720g(outState);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onStart() {
        this.f911b.f48923e.m50719h();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onStop() {
        this.f911b.f48923e.m50718i();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Optional<Area>> selectedAreaMarker() {
        Observable<Optional<Area>> selectedAreaMarker;
        MapAreasUi mapAreasUi = this.f914e;
        if (mapAreasUi == null || (selectedAreaMarker = mapAreasUi.selectedAreaMarker()) == null) {
            Observable<Optional<Area>> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }
        return selectedAreaMarker;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAdditionalAreas(String key, List<Area> areas) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(areas, "areas");
        MapAreasUi mapAreasUi = this.f914e;
        if (mapAreasUi != null) {
            mapAreasUi.setAdditionalAreas(key, areas);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f911b.f48920b.setText((CharSequence) address, TextView.BufferType.EDITABLE, false);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setAddressHint(int i) {
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(hint)");
        SilenceableMaterialEditText silenceableMaterialEditText = this.f911b.f48920b;
        Intrinsics.checkNotNullExpressionValue(silenceableMaterialEditText, "binding.addressText");
        TextInputLayout m87233b = R91.m87233b(silenceableMaterialEditText);
        if (m87233b != null) {
            m87233b.setHint(string);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAreas(List<Area> areas) {
        Intrinsics.checkNotNullParameter(areas, "areas");
        MapAreasUi mapAreasUi = this.f914e;
        if (mapAreasUi != null) {
            mapAreasUi.setAreas(areas);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Unit> setAreasCompleteChanges() {
        return LocationSelectionUi.DefaultImpls.setAreasCompleteChanges(this);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setCurrentLocation(WireLocation location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        withMap(new C0183m(location, this, d));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setHeadsUpText(Integer num) {
        Unit unit = null;
        if (num != null) {
            num.intValue();
            TextView textView = this.f911b.f48922d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.headsUpText");
            C49520tu6.setTextAndVisibility$default(textView, getActivity().getString(num.intValue()), 0, 2, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            CoordinatorLayout root = this.f911b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C49520tu6.m11239l(root);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setLocation(WireLocation location, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f918i.onNext(new C0171a(location, z2));
        withMap(new C0184n(location, this, z));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void showDoneButton(boolean z) {
        Button button = this.f911b.f48924f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.next");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void showInfoWindow(MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        withMap(new C0185o(markerOptions));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForArea(Area area, LatLng latLng) {
        LocationSelectionUi.DefaultImpls.showInfoWindowForArea(this, area, latLng);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForNonOperationalArea(LatLng point) {
        Intrinsics.checkNotNullParameter(point, "point");
        MapAreasUi mapAreasUi = this.f914e;
        if (mapAreasUi != null) {
            mapAreasUi.showInfoWindowForNonOperationalArea(point);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void updateAreasUi(float f, List<LatLng> list) {
        MapAreasUi mapAreasUi = this.f914e;
        if (mapAreasUi != null) {
            mapAreasUi.updateAreasUi(f, list);
        }
    }

    public final void withMap(Function1<? super C39011cD1, Unit> function1) {
        AbstractC23442F<C39011cD1> m33152N = this.f913d.m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "map\n      .observeOn(And…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(getActivity()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0186p c0186p = new C0186p(function1);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: xf3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31661Af3.withMap$lambda$12(Function1.this, obj);
            }
        });
    }

    public final Observable<Location> centerLocation(C39011cD1 c39011cD1) {
        C0058AG<ReactiveMapEvent> c0058ag = this.f919j;
        final C0173c c0173c = C0173c.f923g;
        Observable<R> flatMap = c0058ag.flatMap(new InterfaceC23492o() { // from class: pf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B centerLocation$lambda$6;
                centerLocation$lambda$6 = C31661Af3.centerLocation$lambda$6(Function1.this, obj);
                return centerLocation$lambda$6;
            }
        });
        final C0174d c0174d = new C0174d(c39011cD1);
        Observable observeOn = flatMap.map(new InterfaceC23492o() { // from class: rf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LatLng centerLocation$lambda$7;
                centerLocation$lambda$7 = C31661Af3.centerLocation$lambda$7(Function1.this, obj);
                return centerLocation$lambda$7;
            }
        }).subscribeOn(C23454a.m33087a()).debounce(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final C0175e c0175e = C0175e.f925g;
        Observable<Location> map = observeOn.map(new InterfaceC23492o() { // from class: sf3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Location centerLocation$lambda$8;
                centerLocation$lambda$8 = C31661Af3.centerLocation$lambda$8(Function1.this, obj);
                return centerLocation$lambda$8;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map: GoogleMap): Observa…ap { Locations.from(it) }");
        return map;
    }
}
