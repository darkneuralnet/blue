package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.bird.android.app.feature.map.infowindow.BirdInfoWindowAdapter;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.app.feature.map.p008ui.LocationSelectionUiImpl;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.widget.SilenceableMaterialEditText;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C39011cD1;
@Metadata(m28433d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001mB%\b\u0007\u0012\b\b\u0001\u0010j\u001a\u00020i\u0012\b\b\u0001\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bk\u0010lJ\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J+\u0010\u000e\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\f0\tH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0016J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J \u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u0016\u0010+\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u001e\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0/0\u0006H\u0016J \u00105\u001a\u00020\f2\u0006\u00102\u001a\u0002012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010(H\u0016J\u0012\u00107\u001a\u00020\f2\b\b\u0001\u00106\u001a\u00020\u0016H\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010=\u001a\u00020\u0011H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020$0\u0006H\u0016J\u0012\u0010B\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010C\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u00020\fH\u0016J\b\u0010E\u001a\u00020\fH\u0016J\u0010\u0010G\u001a\u00020\f2\u0006\u0010F\u001a\u00020@H\u0016J\b\u0010H\u001a\u00020\fH\u0016J\b\u0010I\u001a\u00020\fH\u0016J\b\u0010J\u001a\u00020\fH\u0016J\b\u0010K\u001a\u00020\fH\u0016J\u0010\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u000203H\u0016R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010\u0005\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010\u00040\u00040T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010c\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010b0b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010g\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010f0f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006n"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;", "LxE;", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "LUg3;", "LcD1;", "map", "Lio/reactivex/Observable;", "Landroid/location/Location;", "centerLocation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "perform", "withMap", "Landroid/view/View;", "getView", "", "enable", "enableDoneButton", "show", "showDoneButton", "", Entry.TYPE_TEXT, "setHeadsUpText", "(Ljava/lang/Integer;)V", "doneClicks", "Lco/bird/android/model/wire/WireLocation;", "location", "", "radius", "setCurrentLocation", "animate", "indirect", "setLocation", "getLocation", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "getAddress", "", "Lco/bird/android/model/persistence/Area;", "areas", "setAreas", "key", "setAdditionalAreas", "hideInfoWindow", "Lco/bird/android/buava/Optional;", "selectedAreaMarker", "", "zoomLevel", "Lcom/google/android/gms/maps/model/LatLng;", "viewport", "updateAreasUi", "hint", "setAddressHint", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "showInfoWindow", "mapClicks", "keyboardDoneClicks", "includeIndirectUpdates", "observeLocation", "observeAddressField", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onMapReady", "onStart", "onResume", "outState", "onSaveInstanceState", "onPause", "onStop", "onDestroy", "onLowMemory", "point", "showInfoWindowForNonOperationalArea", "LHx5;", "binding", "LHx5;", "Ldr4;", "locationManager", "Ldr4;", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/g;", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "areasUi", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "LfM2;", "marker", "LfM2;", "locationMarker", "Lxj0;", "circleMarker", "Lxj0;", "Lio/reactivex/subjects/a;", "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;", "locationSubject", "Lio/reactivex/subjects/a;", "LAG;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEventRelay", "LAG;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LHx5;Ldr4;)V", "LocationUpdate", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocationSelectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationSelectionUi.kt\nco/bird/android/app/feature/map/ui/LocationSelectionUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,359:1\n199#2:360\n*S KotlinDebug\n*F\n+ 1 LocationSelectionUi.kt\nco/bird/android/app/feature/map/ui/LocationSelectionUiImpl\n*L\n344#1:360\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl extends AbstractC30071xE implements LocationSelectionUi, InterfaceC36350Ug3 {
    private MapAreasUi areasUi;
    private final C33463Hx5 binding;
    private C51775xj0 circleMarker;
    private final InterfaceC40001dr4 locationManager;
    private C40889fM2 locationMarker;
    private final C24552a<LocationUpdate> locationSubject;
    private C24567g<C39011cD1> map;
    private C40889fM2 marker;
    private final C0058AG<ReactiveMapEvent> reactiveMapEventRelay;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;", "", "location", "Lco/bird/android/model/wire/WireLocation;", "indirect", "", "(Lco/bird/android/model/wire/WireLocation;Z)V", "getIndirect", "()Z", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$LocationUpdate */
    /* loaded from: classes2.dex */
    public static final class LocationUpdate {
        private final boolean indirect;
        private final WireLocation location;

        public LocationUpdate(WireLocation location, boolean z) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.location = location;
            this.indirect = z;
        }

        public static /* synthetic */ LocationUpdate copy$default(LocationUpdate locationUpdate, WireLocation wireLocation, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                wireLocation = locationUpdate.location;
            }
            if ((i & 2) != 0) {
                z = locationUpdate.indirect;
            }
            return locationUpdate.copy(wireLocation, z);
        }

        public final WireLocation component1() {
            return this.location;
        }

        public final boolean component2() {
            return this.indirect;
        }

        public final LocationUpdate copy(WireLocation location, boolean z) {
            Intrinsics.checkNotNullParameter(location, "location");
            return new LocationUpdate(location, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LocationUpdate) {
                LocationUpdate locationUpdate = (LocationUpdate) obj;
                return Intrinsics.areEqual(this.location, locationUpdate.location) && this.indirect == locationUpdate.indirect;
            }
            return false;
        }

        public final boolean getIndirect() {
            return this.indirect;
        }

        public final WireLocation getLocation() {
            return this.location;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.location.hashCode() * 31;
            boolean z = this.indirect;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            WireLocation wireLocation = this.location;
            boolean z = this.indirect;
            return "LocationUpdate(location=" + wireLocation + ", indirect=" + z + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionUiImpl(BaseActivity activity, C33463Hx5 binding, InterfaceC40001dr4 locationManager) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.binding = binding;
        this.locationManager = locationManager;
        C24567g<C39011cD1> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<GoogleMap>()");
        this.map = m31882w0;
        C24552a<LocationUpdate> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<LocationUpdate>()");
        this.locationSubject = m31922e;
        C0058AG<ReactiveMapEvent> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<ReactiveMapEvent>()");
        this.reactiveMapEventRelay = m115951g;
        BottomSheetBehavior m50133G = BottomSheetBehavior.m50133G(binding.f14216c);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.dragView)");
        m50133G.m50098h0(false);
        m50133G.m50092k0(activity.getResources().getDimensionPixelSize(C37044Xf4.bird_bottom_sheet_peek_height));
        m50133G.m50082p0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B centerLocation$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B centerLocation$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LatLng centerLocation$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location centerLocation$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Location) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit keyboardDoneClicks$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B mapClicks$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B mapClicks$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WireLocation mapClicks$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WireLocation observeLocation$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeLocation$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    private final void withMap(Function1<? super C39011cD1, Unit> function1) {
        AbstractC23442F<C39011cD1> m33152N = this.map.m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "map\n      .observeOn(And…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(getActivity()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final LocationSelectionUiImpl$withMap$1 locationSelectionUiImpl$withMap$1 = new LocationSelectionUiImpl$withMap$1(function1);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Fw2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocationSelectionUiImpl.withMap$lambda$12(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withMap$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Location> centerLocation() {
        C24567g<C39011cD1> c24567g = this.map;
        final LocationSelectionUiImpl$centerLocation$1 locationSelectionUiImpl$centerLocation$1 = new LocationSelectionUiImpl$centerLocation$1(this);
        Observable m33162D = c24567g.m33162D(new InterfaceC23492o() { // from class: zw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B centerLocation$lambda$1;
                centerLocation$lambda$1 = LocationSelectionUiImpl.centerLocation$lambda$1(Function1.this, obj);
                return centerLocation$lambda$1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33162D, "override fun centerLocat… centerLocation(it) }\n  }");
        return m33162D;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Unit> doneClicks() {
        Button button = this.binding.f14220g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.next");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void enableDoneButton(boolean z) {
        this.binding.f14220g.setEnabled(z);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public String getAddress() {
        return String.valueOf(this.binding.f14215b.getText());
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public WireLocation getLocation() {
        WireLocation location;
        C40889fM2 c40889fM2 = this.marker;
        Intrinsics.checkNotNull(c40889fM2);
        LatLng m41532b = c40889fM2.m41532b();
        Intrinsics.checkNotNullExpressionValue(m41532b, "marker!!.position");
        location = LocationSelectionUiKt.toLocation(m41532b);
        return location;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public View getView() {
        C33463Hx5 c33463Hx5 = this.binding;
        Intrinsics.checkNotNull(c33463Hx5, "null cannot be cast to non-null type android.view.View");
        return (View) c33463Hx5;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void hideInfoWindow() {
        MapAreasUi mapAreasUi = this.areasUi;
        if (mapAreasUi != null) {
            mapAreasUi.hideInfoWindow();
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<Unit> keyboardDoneClicks() {
        Observable m41061b;
        SilenceableMaterialEditText silenceableMaterialEditText = this.binding.f14215b;
        Intrinsics.checkNotNullExpressionValue(silenceableMaterialEditText, "binding.addressText");
        m41061b = C41068ff5.m41061b(silenceableMaterialEditText, null, 1, null);
        final LocationSelectionUiImpl$keyboardDoneClicks$1 locationSelectionUiImpl$keyboardDoneClicks$1 = LocationSelectionUiImpl$keyboardDoneClicks$1.INSTANCE;
        Observable<Unit> map = m41061b.map(new InterfaceC23492o() { // from class: yw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit keyboardDoneClicks$lambda$5;
                keyboardDoneClicks$lambda$5 = LocationSelectionUiImpl.keyboardDoneClicks$lambda$5(Function1.this, obj);
                return keyboardDoneClicks$lambda$5;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.addressText.editorActions().map { Unit }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<WireLocation> mapClicks() {
        C24567g<C39011cD1> c24567g = this.map;
        final LocationSelectionUiImpl$mapClicks$1 locationSelectionUiImpl$mapClicks$1 = new LocationSelectionUiImpl$mapClicks$1(this);
        Observable<R> m33162D = c24567g.m33162D(new InterfaceC23492o() { // from class: Cw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B mapClicks$lambda$2;
                mapClicks$lambda$2 = LocationSelectionUiImpl.mapClicks$lambda$2(Function1.this, obj);
                return mapClicks$lambda$2;
            }
        });
        final LocationSelectionUiImpl$mapClicks$2 locationSelectionUiImpl$mapClicks$2 = LocationSelectionUiImpl$mapClicks$2.INSTANCE;
        Observable flatMap = m33162D.flatMap(new InterfaceC23492o() { // from class: Dw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B mapClicks$lambda$3;
                mapClicks$lambda$3 = LocationSelectionUiImpl.mapClicks$lambda$3(Function1.this, obj);
                return mapClicks$lambda$3;
            }
        });
        final LocationSelectionUiImpl$mapClicks$3 locationSelectionUiImpl$mapClicks$3 = LocationSelectionUiImpl$mapClicks$3.INSTANCE;
        Observable<WireLocation> map = flatMap.map(new InterfaceC23492o() { // from class: Ew2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation mapClicks$lambda$4;
                mapClicks$lambda$4 = LocationSelectionUiImpl.mapClicks$lambda$4(Function1.this, obj);
                return mapClicks$lambda$4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun mapClicks()….toLocation()\n      }\n  }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<String> observeAddressField() {
        SilenceableMaterialEditText silenceableMaterialEditText = this.binding.f14215b;
        Intrinsics.checkNotNullExpressionValue(silenceableMaterialEditText, "binding.addressText");
        return C44626lf5.textChanges$default(silenceableMaterialEditText, 100, false, 2, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public Observable<WireLocation> observeLocation(boolean z) {
        Observable<LocationUpdate> hide = this.locationSubject.hide();
        final LocationSelectionUiImpl$observeLocation$1 locationSelectionUiImpl$observeLocation$1 = new LocationSelectionUiImpl$observeLocation$1(z);
        Observable<LocationUpdate> filter = hide.filter(new InterfaceC23494q() { // from class: Aw2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean observeLocation$lambda$9;
                observeLocation$lambda$9 = LocationSelectionUiImpl.observeLocation$lambda$9(Function1.this, obj);
                return observeLocation$lambda$9;
            }
        });
        final LocationSelectionUiImpl$observeLocation$2 locationSelectionUiImpl$observeLocation$2 = LocationSelectionUiImpl$observeLocation$2.INSTANCE;
        Observable map = filter.map(new InterfaceC23492o() { // from class: Bw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation observeLocation$lambda$10;
                observeLocation$lambda$10 = LocationSelectionUiImpl.observeLocation$lambda$10(Function1.this, obj);
                return observeLocation$lambda$10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "includeIndirectUpdates: …     .map { it.location }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onCreate(Bundle bundle) {
        C38500bM2.m64632a(getActivity());
        this.binding.f14218e.m50725b(bundle);
        this.binding.f14218e.m50726a(this);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onDestroy() {
        this.binding.f14218e.m50724c();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onLowMemory() {
        this.binding.f14218e.m50723d();
    }

    @Override // p000.InterfaceC36350Ug3
    public void onMapReady(final C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map.onSuccess(map);
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        this.reactiveMapEventRelay.accept(reactiveMapEventImpl);
        this.areasUi = new MapAreasUiImpl(getActivity(), map, reactiveMapEventImpl, null, null, this.locationManager, 24, null);
        map.m61676l().m4917a(true);
        map.m61672p(new BirdInfoWindowAdapter(getActivity(), MapMode.RIDER, false));
        map.m61673o(false);
        map.m61691C(new C39011cD1.InterfaceC13471m() { // from class: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$onMapReady$2
            @Override // p000.C39011cD1.InterfaceC13471m
            public void onMarkerDrag(C40889fM2 marker) {
                Intrinsics.checkNotNullParameter(marker, "marker");
            }

            @Override // p000.C39011cD1.InterfaceC13471m
            public void onMarkerDragEnd(C40889fM2 marker) {
                C24552a c24552a;
                WireLocation location;
                Intrinsics.checkNotNullParameter(marker, "marker");
                c24552a = LocationSelectionUiImpl.this.locationSubject;
                LatLng m41532b = marker.m41532b();
                Intrinsics.checkNotNullExpressionValue(m41532b, "marker.position");
                location = LocationSelectionUiKt.toLocation(m41532b);
                c24552a.onNext(new LocationSelectionUiImpl.LocationUpdate(location, false));
                map.m61682f(C48149rc0.m15708b(marker.m41532b()));
            }

            @Override // p000.C39011cD1.InterfaceC13471m
            public void onMarkerDragStart(C40889fM2 marker) {
                Intrinsics.checkNotNullParameter(marker, "marker");
            }
        });
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onPause() {
        this.binding.f14218e.m50722e();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onResume() {
        this.binding.f14218e.m50721f();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.binding.f14218e.m50720g(outState);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onStart() {
        this.binding.f14218e.m50719h();
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi, p000.UX0
    public void onStop() {
        this.binding.f14218e.m50718i();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Optional<Area>> selectedAreaMarker() {
        Observable<Optional<Area>> selectedAreaMarker;
        MapAreasUi mapAreasUi = this.areasUi;
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
        MapAreasUi mapAreasUi = this.areasUi;
        if (mapAreasUi != null) {
            mapAreasUi.setAdditionalAreas(key, areas);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.binding.f14215b.setText((CharSequence) address, TextView.BufferType.EDITABLE, false);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setAddressHint(int i) {
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(hint)");
        SilenceableMaterialEditText silenceableMaterialEditText = this.binding.f14215b;
        Intrinsics.checkNotNullExpressionValue(silenceableMaterialEditText, "binding.addressText");
        TextInputLayout m87233b = R91.m87233b(silenceableMaterialEditText);
        if (m87233b != null) {
            m87233b.setHint(string);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAreas(List<Area> areas) {
        Intrinsics.checkNotNullParameter(areas, "areas");
        MapAreasUi mapAreasUi = this.areasUi;
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
        withMap(new LocationSelectionUiImpl$setCurrentLocation$1(location, this, d));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setHeadsUpText(Integer num) {
        Unit unit = null;
        if (num != null) {
            num.intValue();
            TextView textView = this.binding.f14217d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.headsUpText");
            C49520tu6.setTextAndVisibility$default(textView, getActivity().getString(num.intValue()), 0, 2, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            CoordinatorLayout root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C49520tu6.m11239l(root);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void setLocation(WireLocation location, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.locationSubject.onNext(new LocationUpdate(location, z2));
        withMap(new LocationSelectionUiImpl$setLocation$1(location, this, z));
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void showDoneButton(boolean z) {
        Button button = this.binding.f14220g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.next");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.LocationSelectionUi
    public void showInfoWindow(MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        withMap(new LocationSelectionUiImpl$showInfoWindow$1(markerOptions));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForArea(Area area, LatLng latLng) {
        LocationSelectionUi.DefaultImpls.showInfoWindowForArea(this, area, latLng);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForNonOperationalArea(LatLng point) {
        Intrinsics.checkNotNullParameter(point, "point");
        MapAreasUi mapAreasUi = this.areasUi;
        if (mapAreasUi != null) {
            mapAreasUi.showInfoWindowForNonOperationalArea(point);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void updateAreasUi(float f, List<LatLng> list) {
        MapAreasUi mapAreasUi = this.areasUi;
        if (mapAreasUi != null) {
            mapAreasUi.updateAreasUi(f, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Location> centerLocation(C39011cD1 c39011cD1) {
        C0058AG<ReactiveMapEvent> c0058ag = this.reactiveMapEventRelay;
        final LocationSelectionUiImpl$centerLocation$2 locationSelectionUiImpl$centerLocation$2 = LocationSelectionUiImpl$centerLocation$2.INSTANCE;
        Observable<R> flatMap = c0058ag.flatMap(new InterfaceC23492o() { // from class: Gw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B centerLocation$lambda$6;
                centerLocation$lambda$6 = LocationSelectionUiImpl.centerLocation$lambda$6(Function1.this, obj);
                return centerLocation$lambda$6;
            }
        });
        final LocationSelectionUiImpl$centerLocation$3 locationSelectionUiImpl$centerLocation$3 = new LocationSelectionUiImpl$centerLocation$3(c39011cD1);
        Observable observeOn = flatMap.map(new InterfaceC23492o() { // from class: Hw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LatLng centerLocation$lambda$7;
                centerLocation$lambda$7 = LocationSelectionUiImpl.centerLocation$lambda$7(Function1.this, obj);
                return centerLocation$lambda$7;
            }
        }).subscribeOn(C23454a.m33087a()).debounce(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final LocationSelectionUiImpl$centerLocation$4 locationSelectionUiImpl$centerLocation$4 = LocationSelectionUiImpl$centerLocation$4.INSTANCE;
        Observable<Location> map = observeOn.map(new InterfaceC23492o() { // from class: Iw2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Location centerLocation$lambda$8;
                centerLocation$lambda$8 = LocationSelectionUiImpl.centerLocation$lambda$8(Function1.this, obj);
                return centerLocation$lambda$8;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map: GoogleMap): Observa…ap { Locations.from(it) }");
        return map;
    }
}
