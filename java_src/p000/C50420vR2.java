package p000;

import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.infowindow.BirdInfoWindowAdapter;
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
import com.google.android.gms.maps.MapView;
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
import p000.InterfaceC43306jR2;
@Metadata(m28433d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0089\u0001B\u001d\b\u0007\u0012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001\u0012\u0006\u0010Q\u001a\u00020N¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J+\u0010\r\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000b0\bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0016J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J \u0010\"\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u0016\u0010+\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u001e\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\b\u0010.\u001a\u00020\u000bH\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0/0\u0005H\u0016J \u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010(H\u0016J\u0012\u00107\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020\u0016H\u0016J\u0010\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u000208H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\u0006\u0010=\u001a\u00020\u0011H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020$0\u0005H\u0016J\u0012\u0010B\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010C\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010D\u001a\u00020\u000bH\u0016J\b\u0010E\u001a\u00020\u000bH\u0016J\u0010\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020@H\u0016J\b\u0010H\u001a\u00020\u000bH\u0016J\b\u0010I\u001a\u00020\u000bH\u0016J\b\u0010J\u001a\u00020\u000bH\u0016J\b\u0010K\u001a\u00020\u000bH\u0016J\u0010\u0010M\u001a\u00020\u000b2\u0006\u0010L\u001a\u000203H\u0016R\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010\u0004\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010\u00030\u00030R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010f\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010c0c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\"\u0010\u007f\u001a\u0010\u0012\f\u0012\n S*\u0004\u0018\u00010|0|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R(\u0010\u0084\u0001\u001a\u0013\u0012\u000e\u0012\f S*\u0005\u0018\u00010\u0081\u00010\u0081\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u008a\u0001"}, m28432d2 = {"LvR2;", "LxE;", "LjR2;", "LcD1;", "map", "Lio/reactivex/Observable;", "Landroid/location/Location;", "centerLocation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "perform", "withMap", "init", "Landroid/view/View;", "getView", "", "enable", "enableDoneButton", "show", "showDoneButton", "", Entry.TYPE_TEXT, "setHeadsUpText", "(Ljava/lang/Integer;)V", "doneClicks", "Lco/bird/android/model/wire/WireLocation;", "location", "", "radius", "setCurrentLocation", "animate", "indirect", "setLocation", "getLocation", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "getAddress", "", "Lco/bird/android/model/persistence/Area;", "areas", "setAreas", "key", "setAdditionalAreas", "hideInfoWindow", "Lco/bird/android/buava/Optional;", "selectedAreaMarker", "", "zoomLevel", "Lcom/google/android/gms/maps/model/LatLng;", "viewport", "updateAreasUi", "hint", "setAddressHint", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "showInfoWindow", "mapClicks", "keyboardDoneClicks", "includeIndirectUpdates", "observeLocation", "observeAddressField", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onMapReady", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "point", "showInfoWindowForNonOperationalArea", "Ldr4;", "b", "Ldr4;", "locationManager", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/g;", "Lcom/google/android/gms/maps/MapView;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/maps/MapView;", "mapView", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "e", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "areasUi", "Lco/bird/android/widget/SilenceableMaterialEditText;", "f", "Lco/bird/android/widget/SilenceableMaterialEditText;", "addressText", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheet", "h", "Landroid/widget/LinearLayout;", "dragView", "i", "Landroid/view/View;", "mainContainer", "Landroid/widget/Button;", "j", "Landroid/widget/Button;", "nextButton", "LfM2;", "k", "LfM2;", "marker", "l", "locationMarker", "Lxj0;", "m", "Lxj0;", "circleMarker", "Lio/reactivex/subjects/a;", "LvR2$a;", "n", "Lio/reactivex/subjects/a;", "locationSubject", "LAG;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "o", "LAG;", "reactiveMapEventRelay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantLocationEditUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantLocationEditUi.kt\nco/bird/android/app/feature/merchant/MerchantLocationEditUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,316:1\n199#2:317\n*S KotlinDebug\n*F\n+ 1 MerchantLocationEditUi.kt\nco/bird/android/app/feature/merchant/MerchantLocationEditUiImpl\n*L\n301#1:317\n*E\n"})
/* renamed from: vR2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50420vR2 extends AbstractC30071xE implements InterfaceC43306jR2 {

    /* renamed from: b */
    public final InterfaceC40001dr4 f114070b;

    /* renamed from: c */
    public C24567g<C39011cD1> f114071c;

    /* renamed from: d */
    public final MapView f114072d;

    /* renamed from: e */
    public MapAreasUi f114073e;

    /* renamed from: f */
    public final SilenceableMaterialEditText f114074f;

    /* renamed from: g */
    public final BottomSheetBehavior<LinearLayout> f114075g;

    /* renamed from: h */
    public final LinearLayout f114076h;

    /* renamed from: i */
    public final View f114077i;

    /* renamed from: j */
    public final Button f114078j;

    /* renamed from: k */
    public C40889fM2 f114079k;

    /* renamed from: l */
    public C40889fM2 f114080l;

    /* renamed from: m */
    public C51775xj0 f114081m;

    /* renamed from: n */
    public final C24552a<C29539a> f114082n;

    /* renamed from: o */
    public final C0058AG<ReactiveMapEvent> f114083o;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LvR2$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireLocation;", C17296a.f69688o, "Lco/bird/android/model/wire/WireLocation;", "b", "()Lco/bird/android/model/wire/WireLocation;", "location", "Z", "()Z", "indirect", "<init>", "(Lco/bird/android/model/wire/WireLocation;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vR2$a */
    /* loaded from: classes2.dex */
    public static final class C29539a {

        /* renamed from: a */
        public final WireLocation f114084a;

        /* renamed from: b */
        public final boolean f114085b;

        public C29539a(WireLocation location, boolean z) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f114084a = location;
            this.f114085b = z;
        }

        /* renamed from: a */
        public final boolean m8648a() {
            return this.f114085b;
        }

        /* renamed from: b */
        public final WireLocation m8647b() {
            return this.f114084a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C29539a) {
                C29539a c29539a = (C29539a) obj;
                return Intrinsics.areEqual(this.f114084a, c29539a.f114084a) && this.f114085b == c29539a.f114085b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f114084a.hashCode() * 31;
            boolean z = this.f114085b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            WireLocation wireLocation = this.f114084a;
            boolean z = this.f114085b;
            return "LocationUpdate(location=" + wireLocation + ", indirect=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcD1;", "it", "Lio/reactivex/B;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(LcD1;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$b */
    /* loaded from: classes2.dex */
    public static final class C29540b extends Lambda implements Function1<C39011cD1, InterfaceC23434B<? extends Location>> {
        public C29540b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Location> invoke(C39011cD1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C50420vR2.this.centerLocation(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$c */
    /* loaded from: classes2.dex */
    public static final class C29541c extends Lambda implements Function1<ReactiveMapEvent, InterfaceC23434B<? extends Unit>> {

        /* renamed from: g */
        public static final C29541c f114087g = new C29541c();

        public C29541c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(ReactiveMapEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.cameraIdles();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vR2$d */
    /* loaded from: classes2.dex */
    public static final class C29542d extends Lambda implements Function1<Unit, LatLng> {

        /* renamed from: g */
        public final /* synthetic */ C39011cD1 f114088g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29542d(C39011cD1 c39011cD1) {
            super(1);
            this.f114088g = c39011cD1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final LatLng invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f114088g.m61679i().f71394b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vR2$e */
    /* loaded from: classes2.dex */
    public static final class C29543e extends Lambda implements Function1<LatLng, Location> {

        /* renamed from: g */
        public static final C29543e f114089g = new C29543e();

        public C29543e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Location invoke(LatLng it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37429Yw2.f47648a.m73962i(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vR2$f */
    /* loaded from: classes2.dex */
    public static final class C29544f extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C29544f f114090g = new C29544f();

        public C29544f() {
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
    /* renamed from: vR2$g */
    /* loaded from: classes2.dex */
    public static final class C29545g extends Lambda implements Function1<C39011cD1, InterfaceC23434B<? extends ReactiveMapEvent>> {
        public C29545g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends ReactiveMapEvent> invoke(C39011cD1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C50420vR2.this.f114083o;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "it", "Lio/reactivex/B;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$h */
    /* loaded from: classes2.dex */
    public static final class C29546h extends Lambda implements Function1<ReactiveMapEvent, InterfaceC23434B<? extends LatLng>> {

        /* renamed from: g */
        public static final C29546h f114092g = new C29546h();

        public C29546h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends LatLng> invoke(ReactiveMapEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mapClicks();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vR2$i */
    /* loaded from: classes2.dex */
    public static final class C29547i extends Lambda implements Function1<LatLng, WireLocation> {

        /* renamed from: g */
        public static final C29547i f114093g = new C29547i();

        public C29547i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WireLocation invoke(LatLng it) {
            WireLocation m5268a;
            Intrinsics.checkNotNullParameter(it, "it");
            m5268a = C51606xR2.m5268a(it);
            return m5268a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvR2$a;", "it", "", C17296a.f69688o, "(LvR2$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$j */
    /* loaded from: classes2.dex */
    public static final class C29548j extends Lambda implements Function1<C29539a, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f114094g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29548j(boolean z) {
            super(1);
            this.f114094g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C29539a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.f114094g && it.m8648a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LvR2$a;", "it", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LvR2$a;)Lco/bird/android/model/wire/WireLocation;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$k */
    /* loaded from: classes2.dex */
    public static final class C29549k extends Lambda implements Function1<C29539a, WireLocation> {

        /* renamed from: g */
        public static final C29549k f114095g = new C29549k();

        public C29549k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireLocation invoke(C29539a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m8647b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"vR2$l", "LcD1$m;", "LfM2;", "marker", "", "onMarkerDragStart", "onMarkerDragEnd", "onMarkerDrag", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vR2$l */
    /* loaded from: classes2.dex */
    public static final class C29550l implements C39011cD1.InterfaceC13471m {

        /* renamed from: b */
        public final /* synthetic */ C39011cD1 f114097b;

        public C29550l(C39011cD1 c39011cD1) {
            this.f114097b = c39011cD1;
        }

        @Override // p000.C39011cD1.InterfaceC13471m
        public void onMarkerDrag(C40889fM2 marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
        }

        @Override // p000.C39011cD1.InterfaceC13471m
        public void onMarkerDragEnd(C40889fM2 marker) {
            WireLocation m5268a;
            Intrinsics.checkNotNullParameter(marker, "marker");
            C24552a c24552a = C50420vR2.this.f114082n;
            LatLng m41532b = marker.m41532b();
            Intrinsics.checkNotNullExpressionValue(m41532b, "marker.position");
            m5268a = C51606xR2.m5268a(m41532b);
            c24552a.onNext(new C29539a(m5268a, false));
            this.f114097b.m61682f(C48149rc0.m15708b(marker.m41532b()));
        }

        @Override // p000.C39011cD1.InterfaceC13471m
        public void onMarkerDragStart(C40889fM2 marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$m */
    /* loaded from: classes2.dex */
    public static final class C29551m extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireLocation f114098g;

        /* renamed from: h */
        public final /* synthetic */ C50420vR2 f114099h;

        /* renamed from: i */
        public final /* synthetic */ double f114100i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29551m(WireLocation wireLocation, C50420vR2 c50420vR2, double d) {
            super(1);
            this.f114098g = wireLocation;
            this.f114099h = c50420vR2;
            this.f114100i = d;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            LatLng latLng = new LatLng(this.f114098g.getLatitude(), this.f114098g.getLongitude());
            if (this.f114099h.f114081m == null) {
                this.f114099h.f114080l = map.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.m41777e(this.f114099h.getActivity(), C48193rg4.ic_user_location)).m50651Y1(100.0f));
                C50420vR2 c50420vR2 = this.f114099h;
                CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(this.f114100i);
                C50420vR2 c50420vR22 = this.f114099h;
                int i = C32364Df4.transparentLightPurple;
                c50420vR2.f114081m = map.m61687a(m50695m0.m50694p0(c50420vR22.getColor(i)).m50692u(this.f114099h.getColor(i)).m50702E0(100.0f));
            } else {
                C40889fM2 c40889fM2 = this.f114099h.f114080l;
                if (c40889fM2 != null) {
                    c40889fM2.m41521m(latLng);
                }
                C51775xj0 c51775xj0 = this.f114099h.f114081m;
                if (c51775xj0 != null) {
                    c51775xj0.m4797a(latLng);
                }
            }
            map.m61688F(0, 0, 0, this.f114099h.f114076h.getHeight());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$n */
    /* loaded from: classes2.dex */
    public static final class C29552n extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireLocation f114101g;

        /* renamed from: h */
        public final /* synthetic */ C50420vR2 f114102h;

        /* renamed from: i */
        public final /* synthetic */ boolean f114103i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29552n(WireLocation wireLocation, C50420vR2 c50420vR2, boolean z) {
            super(1);
            this.f114101g = wireLocation;
            this.f114102h = c50420vR2;
            this.f114103i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            LatLng latLng = new LatLng(this.f114101g.getLatitude(), this.f114101g.getLongitude());
            if (this.f114102h.f114079k == null) {
                this.f114102h.f114079k = map.m61685c(new MarkerOptions().m50643u1(latLng).m50657N0(C40788fB0.m41777e(this.f114102h.getActivity(), C48193rg4.ic_map_drop_pin)).m50642v(true));
                C40889fM2 c40889fM2 = this.f114102h.f114079k;
                if (c40889fM2 != null) {
                    c40889fM2.m41514t();
                }
            } else {
                C40889fM2 c40889fM22 = this.f114102h.f114079k;
                if (c40889fM22 != null) {
                    c40889fM22.m41521m(latLng);
                }
            }
            if (this.f114103i) {
                map.m61682f(C48149rc0.m15705e(latLng, 17.0f));
            } else {
                map.m61675m(C48149rc0.m15705e(new LatLng(this.f114101g.getLatitude(), this.f114101g.getLongitude()), 18.0f));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LcD1;", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$o */
    /* loaded from: classes2.dex */
    public static final class C29553o extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ MarkerOptions f114104g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29553o(MarkerOptions markerOptions) {
            super(1);
            this.f114104g = markerOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Intrinsics.checkNotNullParameter(map, "map");
            C40889fM2 m61685c = map.m61685c(this.f114104g);
            if (m61685c != null) {
                m61685c.m41514t();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LcD1;", "kotlin.jvm.PlatformType", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vR2$p */
    /* loaded from: classes2.dex */
    public static final class C29554p extends Lambda implements Function1<C39011cD1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<C39011cD1, Unit> f114105g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29554p(Function1<? super C39011cD1, Unit> function1) {
            super(1);
            this.f114105g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
            invoke2(c39011cD1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C39011cD1 map) {
            Function1<C39011cD1, Unit> function1 = this.f114105g;
            Intrinsics.checkNotNullExpressionValue(map, "map");
            function1.invoke(map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50420vR2(BaseActivity activity, InterfaceC40001dr4 locationManager) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f114070b = locationManager;
        C24567g<C39011cD1> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<GoogleMap>()");
        this.f114071c = m31882w0;
        this.f114072d = (MapView) C40788fB0.m41779c(activity, C36585Vg4.mapView);
        this.f114074f = (SilenceableMaterialEditText) C40788fB0.m41779c(activity, C36585Vg4.addressText);
        int i = C36585Vg4.dragView;
        BottomSheetBehavior<LinearLayout> m50133G = BottomSheetBehavior.m50133G(C40788fB0.m41779c(activity, i));
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(activity.find<LinearLayout>(R.id.dragView))");
        this.f114075g = m50133G;
        this.f114076h = (LinearLayout) C40788fB0.m41779c(activity, i);
        this.f114077i = C40788fB0.m41779c(activity, C36585Vg4.mainContainer);
        this.f114078j = (Button) C40788fB0.m41779c(activity, C36585Vg4.next);
        C24552a<C29539a> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<LocationUpdate>()");
        this.f114082n = m31922e;
        C0058AG<ReactiveMapEvent> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<ReactiveMapEvent>()");
        this.f114083o = m115951g;
    }

    /* renamed from: am */
    public static final InterfaceC23434B m8658am(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: bm */
    public static final InterfaceC23434B m8657bm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: cm */
    public static final LatLng m8656cm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    /* renamed from: dm */
    public static final Location m8655dm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Location) tmp0.invoke(obj);
    }

    /* renamed from: em */
    public static final Unit m8654em(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: fm */
    public static final InterfaceC23434B m8653fm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: gm */
    public static final WireLocation m8652gm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* renamed from: hm */
    public static final boolean m8651hm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: im */
    public static final WireLocation m8650im(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* renamed from: jm */
    public static final void m8649jm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final InterfaceC23434B mapClicks$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Location> centerLocation() {
        C24567g<C39011cD1> c24567g = this.f114071c;
        final C29540b c29540b = new C29540b();
        Observable m33162D = c24567g.m33162D(new InterfaceC23492o() { // from class: mR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m8658am;
                m8658am = C50420vR2.m8658am(Function1.this, obj);
                return m8658am;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "override fun centerLocat… centerLocation(it) }\n  }");
        return m33162D;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Unit> doneClicks() {
        return C44626lf5.clicksThrottle$default(this.f114078j, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void enableDoneButton(boolean z) {
        this.f114078j.setEnabled(z);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public String getAddress() {
        return String.valueOf(this.f114074f.getText());
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public WireLocation getLocation() {
        WireLocation m5268a;
        C40889fM2 c40889fM2 = this.f114079k;
        Intrinsics.checkNotNull(c40889fM2);
        LatLng m41532b = c40889fM2.m41532b();
        Intrinsics.checkNotNullExpressionValue(m41532b, "marker!!.position");
        m5268a = C51606xR2.m5268a(m41532b);
        return m5268a;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public View getView() {
        return this.f114077i;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void hideInfoWindow() {
        MapAreasUi mapAreasUi = this.f114073e;
        if (mapAreasUi != null) {
            mapAreasUi.hideInfoWindow();
        }
    }

    public void init() {
        this.f114072d.m50726a(this);
        this.f114075g.m50098h0(false);
        this.f114075g.m50092k0(getActivity().getResources().getDimensionPixelSize(C37044Xf4.bird_bottom_sheet_peek_height));
        this.f114075g.m50082p0(3);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Unit> keyboardDoneClicks() {
        Observable m41061b;
        m41061b = C41068ff5.m41061b(this.f114074f, null, 1, null);
        final C29544f c29544f = C29544f.f114090g;
        Observable<Unit> map = m41061b.map(new InterfaceC23492o() { // from class: qR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m8654em;
                m8654em = C50420vR2.m8654em(Function1.this, obj);
                return m8654em;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "addressText.editorActions().map { Unit }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<WireLocation> mapClicks() {
        C24567g<C39011cD1> c24567g = this.f114071c;
        final C29545g c29545g = new C29545g();
        Observable<R> m33162D = c24567g.m33162D(new InterfaceC23492o() { // from class: nR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m8653fm;
                m8653fm = C50420vR2.m8653fm(Function1.this, obj);
                return m8653fm;
            }
        });
        final C29546h c29546h = C29546h.f114092g;
        Observable flatMap = m33162D.flatMap(new InterfaceC23492o() { // from class: oR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B mapClicks$lambda$2;
                mapClicks$lambda$2 = C50420vR2.mapClicks$lambda$2(Function1.this, obj);
                return mapClicks$lambda$2;
            }
        });
        final C29547i c29547i = C29547i.f114093g;
        Observable<WireLocation> map = flatMap.map(new InterfaceC23492o() { // from class: pR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation m8652gm;
                m8652gm = C50420vR2.m8652gm(Function1.this, obj);
                return m8652gm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun mapClicks()….toLocation()\n      }\n  }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<String> observeAddressField() {
        return C44626lf5.textChanges$default(this.f114074f, 100, false, 2, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<WireLocation> observeLocation(boolean z) {
        Observable<C29539a> hide = this.f114082n.hide();
        final C29548j c29548j = new C29548j(z);
        Observable<C29539a> filter = hide.filter(new InterfaceC23494q() { // from class: uR2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m8651hm;
                m8651hm = C50420vR2.m8651hm(Function1.this, obj);
                return m8651hm;
            }
        });
        final C29549k c29549k = C29549k.f114095g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: lR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation m8650im;
                m8650im = C50420vR2.m8650im(Function1.this, obj);
                return m8650im;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "includeIndirectUpdates: …     .map { it.location }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onCreate(Bundle bundle) {
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onDestroy() {
        this.f114072d.m50724c();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onLowMemory() {
        this.f114072d.m50723d();
    }

    @Override // p000.InterfaceC36350Ug3
    public void onMapReady(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f114071c.onSuccess(map);
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        this.f114083o.accept(reactiveMapEventImpl);
        this.f114073e = new MapAreasUiImpl(getActivity(), map, reactiveMapEventImpl, null, null, this.f114070b, 24, null);
        map.m61676l().m4917a(true);
        map.m61672p(new BirdInfoWindowAdapter(getActivity(), MapMode.RIDER, false));
        map.m61673o(false);
        map.m61691C(new C29550l(map));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onPause() {
        this.f114072d.m50722e();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onResume() {
        this.f114072d.m50721f();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f114072d.m50720g(outState);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onStart() {
        this.f114072d.m50719h();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onStop() {
        this.f114072d.m50718i();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Optional<Area>> selectedAreaMarker() {
        Observable<Optional<Area>> selectedAreaMarker;
        MapAreasUi mapAreasUi = this.f114073e;
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
        MapAreasUi mapAreasUi = this.f114073e;
        if (mapAreasUi != null) {
            mapAreasUi.setAdditionalAreas(key, areas);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f114074f.setText((CharSequence) address, TextView.BufferType.EDITABLE, false);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setAddressHint(int i) {
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(hint)");
        TextInputLayout m87233b = R91.m87233b(this.f114074f);
        if (m87233b != null) {
            m87233b.setHint(string);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAreas(List<Area> areas) {
        Intrinsics.checkNotNullParameter(areas, "areas");
        MapAreasUi mapAreasUi = this.f114073e;
        if (mapAreasUi != null) {
            mapAreasUi.setAreas(areas);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Unit> setAreasCompleteChanges() {
        return InterfaceC43306jR2.C24841a.m30623a(this);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setCurrentLocation(WireLocation location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        withMap(new C29551m(location, this, d));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setHeadsUpText(Integer num) {
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setLocation(WireLocation location, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f114082n.onNext(new C29539a(location, z2));
        withMap(new C29552n(location, this, z));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void showDoneButton(boolean z) {
        C49520tu6.show$default(this.f114078j, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void showInfoWindow(MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        withMap(new C29553o(markerOptions));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForArea(Area area, LatLng latLng) {
        InterfaceC43306jR2.C24841a.m30622b(this, area, latLng);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForNonOperationalArea(LatLng point) {
        Intrinsics.checkNotNullParameter(point, "point");
        MapAreasUi mapAreasUi = this.f114073e;
        if (mapAreasUi != null) {
            mapAreasUi.showInfoWindowForNonOperationalArea(point);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void updateAreasUi(float f, List<LatLng> list) {
        MapAreasUi mapAreasUi = this.f114073e;
        if (mapAreasUi != null) {
            mapAreasUi.updateAreasUi(f, list);
        }
    }

    public final void withMap(Function1<? super C39011cD1, Unit> function1) {
        AbstractC23442F<C39011cD1> m33152N = this.f114071c.m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "map\n      .observeOn(And…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(getActivity()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29554p c29554p = new C29554p(function1);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: kR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50420vR2.m8649jm(Function1.this, obj);
            }
        });
    }

    public final Observable<Location> centerLocation(C39011cD1 c39011cD1) {
        C0058AG<ReactiveMapEvent> c0058ag = this.f114083o;
        final C29541c c29541c = C29541c.f114087g;
        Observable<R> flatMap = c0058ag.flatMap(new InterfaceC23492o() { // from class: rR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m8657bm;
                m8657bm = C50420vR2.m8657bm(Function1.this, obj);
                return m8657bm;
            }
        });
        final C29542d c29542d = new C29542d(c39011cD1);
        Observable observeOn = flatMap.map(new InterfaceC23492o() { // from class: sR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LatLng m8656cm;
                m8656cm = C50420vR2.m8656cm(Function1.this, obj);
                return m8656cm;
            }
        }).subscribeOn(C23454a.m33087a()).debounce(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final C29543e c29543e = C29543e.f114089g;
        Observable<Location> map = observeOn.map(new InterfaceC23492o() { // from class: tR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Location m8655dm;
                m8655dm = C50420vR2.m8655dm(Function1.this, obj);
                return m8655dm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map: GoogleMap): Observa…ap { Locations.from(it) }");
        return map;
    }
}
