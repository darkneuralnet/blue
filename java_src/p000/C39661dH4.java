package p000;

import android.content.Intent;
import android.location.Location;
import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0003Ba\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u000e\b\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\b\b\u0001\u0010/\u001a\u00020,\u0012\b\b\u0001\u00103\u001a\u000200\u0012\b\b\u0001\u00107\u001a\u000204\u0012\b\b\u0001\u0010;\u001a\u000208¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0017\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>¨\u0006H"}, m28432d2 = {"LdH4;", "LTG4;", "", C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "m", "Lcom/google/android/gms/maps/model/PolygonOptions;", "polygon", "y", "k", "n", "Landroid/location/Location;", "location", "Lio/reactivex/c;", "l", "", "Lco/bird/android/model/wire/WireBird;", "responseBirds", "o", "LaM;", "LaM;", "birdManager", "LjB0;", "b", "LjB0;", "bountyManager", "Lgl;", "c", "Lgl;", "preference", "Ldr4;", DateTokenConverter.CONVERTER_KEY, "Ldr4;", "locationManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "e", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LhH4;", "f", "LhH4;", "ui", "LOG4;", "g", "LOG4;", "mapUi", "Le13;", "h", "Le13;", "navigator", "Lco/bird/android/model/constant/MapMode;", "i", "Lco/bird/android/model/constant/MapMode;", "mapMode", "", "j", "Ljava/util/List;", "birds", "selectedBirds", "LDX3;", "LDX3;", "drawnPolygon", "LMX3;", "drawnPolylines", "<init>", "(LaM;LjB0;Lgl;Ldr4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LhH4;LOG4;Le13;Lco/bird/android/model/constant/MapMode;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportMultipleBirdsFraudPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportMultipleBirdsFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportMultipleBirdsFraudPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n180#2:186\n180#2:187\n180#2:188\n180#2:189\n237#2:190\n180#2:191\n1549#3:192\n1620#3,3:193\n1549#3:196\n1620#3,3:197\n*S KotlinDebug\n*F\n+ 1 ReportMultipleBirdsFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportMultipleBirdsFraudPresenterImpl\n*L\n88#1:186\n92#1:187\n95#1:188\n98#1:189\n106#1:190\n111#1:191\n143#1:192\n143#1:193,3\n153#1:196\n153#1:197,3\n*E\n"})
/* renamed from: dH4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39661dH4 implements TG4 {

    /* renamed from: n */
    public static final C19714a f76381n = new C19714a(null);

    /* renamed from: o */
    public static final int f76382o = 8;

    /* renamed from: a */
    public final InterfaceC10636aM f76383a;

    /* renamed from: b */
    public final InterfaceC43160jB0 f76384b;

    /* renamed from: c */
    public final C22454gl f76385c;

    /* renamed from: d */
    public final InterfaceC40001dr4 f76386d;

    /* renamed from: e */
    public final LifecycleScopeProvider<EnumC7097RE> f76387e;

    /* renamed from: f */
    public final C42032hH4 f76388f;

    /* renamed from: g */
    public final OG4 f76389g;

    /* renamed from: h */
    public final InterfaceC40099e13 f76390h;

    /* renamed from: i */
    public final MapMode f76391i;

    /* renamed from: j */
    public final List<WireBird> f76392j;

    /* renamed from: k */
    public final List<WireBird> f76393k;

    /* renamed from: l */
    public DX3 f76394l;

    /* renamed from: m */
    public final List<MX3> f76395m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LdH4$a;", "", "", "SUBMIT_BATCH_REPORT_REQUEST_CODE", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: dH4$a */
    /* loaded from: classes2.dex */
    public static final class C19714a {
        public /* synthetic */ C19714a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19714a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dH4$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C19715b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/gms/maps/model/PolygonOptions;", "kotlin.jvm.PlatformType", "polygon", "", C17296a.f69688o, "(Lcom/google/android/gms/maps/model/PolygonOptions;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReportMultipleBirdsFraudPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportMultipleBirdsFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportMultipleBirdsFraudPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1549#2:186\n1620#2,3:187\n*S KotlinDebug\n*F\n+ 1 ReportMultipleBirdsFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportMultipleBirdsFraudPresenterImpl$onCreate$1\n*L\n80#1:186\n80#1:187,3\n*E\n"})
    /* renamed from: dH4$c */
    /* loaded from: classes2.dex */
    public static final class C19716c extends Lambda implements Function1<PolygonOptions, Unit> {
        public C19716c() {
            super(1);
        }

        /* renamed from: a */
        public final void m44416a(PolygonOptions polygonOptions) {
            int collectionSizeOrDefault;
            C39661dH4.this.f76393k.clear();
            List<WireBird> list = C39661dH4.this.f76392j;
            C39661dH4 c39661dH4 = C39661dH4.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireBird wireBird : list) {
                if (BX3.m113900b(GoogleMap_Kt.toLatLng(wireBird.getLocation()), polygonOptions.m50636K(), true)) {
                    c39661dH4.f76393k.add(wireBird);
                }
                arrayList.add(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PolygonOptions polygonOptions) {
            m44416a(polygonOptions);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/gms/maps/model/PolygonOptions;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/android/gms/maps/model/PolygonOptions;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dH4$d */
    /* loaded from: classes2.dex */
    public static final class C19717d extends Lambda implements Function1<PolygonOptions, Unit> {
        public C19717d() {
            super(1);
        }

        /* renamed from: a */
        public final void m44415a(PolygonOptions it) {
            C39661dH4 c39661dH4 = C39661dH4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c39661dH4.m44417y(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PolygonOptions polygonOptions) {
            m44415a(polygonOptions);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/gms/maps/model/PolylineOptions;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/google/android/gms/maps/model/PolylineOptions;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dH4$e */
    /* loaded from: classes2.dex */
    public static final class C19718e extends Lambda implements Function1<PolylineOptions, Unit> {
        public C19718e() {
            super(1);
        }

        /* renamed from: a */
        public final void m44414a(PolylineOptions it) {
            List list = C39661dH4.this.f76395m;
            OG4 og4 = C39661dH4.this.f76389g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            list.add(og4.mo90543E1(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PolylineOptions polylineOptions) {
            m44414a(polylineOptions);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dH4$f */
    /* loaded from: classes2.dex */
    public static final class C19719f extends Lambda implements Function1<Unit, Unit> {
        public C19719f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C39661dH4.this.m44431k();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dH4$g */
    /* loaded from: classes2.dex */
    public static final class C19720g extends Lambda implements Function1<Unit, Unit> {
        public C19720g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C39661dH4.this.m44428n();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dH4$h */
    /* loaded from: classes2.dex */
    public static final class C19721h extends Lambda implements Function1<Location, InterfaceC23496h> {
        public C19721h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C39661dH4.this.m44430l(location);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dH4$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C19722i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C19722i f76402b = new C19722i();

        public C19722i() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dH4$j */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C19723j extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, Unit> {
        public C19723j(Object obj) {
            super(1, obj, C39661dH4.class, "onBirdsLoaded", "onBirdsLoaded(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C39661dH4) this.receiver).m44427o(p0);
        }
    }

    public C39661dH4(InterfaceC10636aM birdManager, InterfaceC43160jB0 bountyManager, C22454gl preference, InterfaceC40001dr4 locationManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, C42032hH4 ui, OG4 mapUi, InterfaceC40099e13 navigator, MapMode mapMode) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(bountyManager, "bountyManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        this.f76383a = birdManager;
        this.f76384b = bountyManager;
        this.f76385c = preference;
        this.f76386d = locationManager;
        this.f76387e = scopeProvider;
        this.f76388f = ui;
        this.f76389g = mapUi;
        this.f76390h = navigator;
        this.f76391i = mapMode;
        this.f76392j = new ArrayList();
        this.f76393k = new ArrayList();
        this.f76395m = new ArrayList();
    }

    /* renamed from: p */
    public static final void m44426p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m44425q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m44424r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m44423s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m44422t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23496h m44421u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m44420v() {
    }

    /* renamed from: w */
    public static final void m44419w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m44418x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.TG4
    /* renamed from: a */
    public void mo44441a() {
        m44429m();
        Observable<PolygonOptions> mo90541Q5 = this.f76389g.mo90541Q5();
        final C19716c c19716c = new C19716c();
        Observable<PolygonOptions> observeOn = mo90541Q5.doOnNext(new InterfaceC23484g() { // from class: UG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44426p(Function1.this, obj);
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate() …ribe(::onBirdsLoaded)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f76387e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19717d c19717d = new C19717d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: VG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44425q(Function1.this, obj);
            }
        });
        Observable<PolylineOptions> subscribeOn = this.f76389g.mo90542Od().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "mapUi.polylines()\n      …dSchedulers.mainThread())");
        Object m33094as2 = subscribeOn.m33094as(AutoDispose.m45239a(this.f76387e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19718e c19718e = new C19718e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: WG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44424r(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f76388f.m36563Sl().m33094as(AutoDispose.m45239a(this.f76387e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19719f c19719f = new C19719f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: XG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44423s(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f76388f.m36562w0().m33094as(AutoDispose.m45239a(this.f76387e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19720g c19720g = new C19720g();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: YG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44422t(Function1.this, obj);
            }
        });
        Observable<Location> throttleFirst = this.f76386d.mo43616p().startWith((Z84<Location>) this.f76386d.mo43616p().m73665a()).throttleFirst(15L, TimeUnit.SECONDS);
        final C19721h c19721h = new C19721h();
        AbstractC23461c m33070P = throttleFirst.flatMapCompletable(new InterfaceC23492o() { // from class: ZG4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m44421u;
                m44421u = C39661dH4.m44421u(Function1.this, obj);
                return m44421u;
            }
        }).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "override fun onCreate() …ribe(::onBirdsLoaded)\n  }");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f76387e));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: aH4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C39661dH4.m44420v();
            }
        };
        final C19722i c19722i = C19722i.f76402b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: bH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44419w(Function1.this, obj);
            }
        });
        Observable<List<WireBird>> observeOn2 = this.f76383a.mo71591R0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "birdManager.latestNearby…dSchedulers.mainThread())");
        Object m33094as5 = observeOn2.m33094as(AutoDispose.m45239a(this.f76387e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19723j c19723j = new C19723j(this);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: cH4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39661dH4.m44418x(Function1.this, obj);
            }
        });
    }

    /* renamed from: k */
    public final void m44431k() {
        int collectionSizeOrDefault;
        DX3 dx3 = this.f76394l;
        if (dx3 != null) {
            dx3.m110283c();
        }
        List<MX3> list = this.f76395m;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (MX3 mx3 : list) {
            mx3.m95179a();
            arrayList.add(Unit.INSTANCE);
        }
        this.f76389g.setBirds(this.f76392j);
        this.f76393k.clear();
        this.f76389g.mo90539wf(true);
        this.f76389g.mo90538zj(false);
        this.f76388f.m36565Ql().setText(this.f76388f.m36565Ql().getResources().getString(C45871nl4.report_fraud_draw_infotext));
        this.f76388f.m36566Pl().setVisibility(4);
    }

    /* renamed from: l */
    public final AbstractC23461c m44430l(Location location) {
        if (C19715b.$EnumSwitchMapping$0[this.f76391i.ordinal()] == 1) {
            return this.f76383a.mo71599J0(location, this.f76389g.nearbyRadius());
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    /* renamed from: m */
    public final void m44429m() {
        if (this.f76385c.m37722I0()) {
            return;
        }
        this.f76385c.m37688Q2();
        H31.C3014a.showCustomDialog$default((H31) this.f76388f, C39311cj4.dialog_report_fraud_intro, (Integer) null, (Integer) null, true, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C36585Vg4.btnOk, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 523254, (Object) null);
    }

    /* renamed from: n */
    public final void m44428n() {
        int collectionSizeOrDefault;
        InterfaceC40099e13 interfaceC40099e13 = this.f76390h;
        List<WireBird> list = this.f76393k;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBird wireBird : list) {
            arrayList.add(wireBird.getId());
        }
        interfaceC40099e13.mo37111P2(arrayList, 1000);
    }

    /* renamed from: o */
    public final void m44427o(List<WireBird> list) {
        this.f76392j.clear();
        this.f76392j.addAll(list);
        if (this.f76393k.isEmpty()) {
            DX3 dx3 = this.f76394l;
            if (dx3 != null) {
                Intrinsics.checkNotNull(dx3);
                if (!dx3.m110284b()) {
                    return;
                }
            }
            this.f76389g.setBirds(this.f76392j);
        }
    }

    @Override // p000.TG4
    public void onActivityResult(int i, int i2, Intent intent) {
        Set<String> set;
        if (i == 1000 && i2 == -1 && intent != null) {
            InterfaceC10636aM interfaceC10636aM = this.f76383a;
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("bird_ids");
            Intrinsics.checkNotNull(stringArrayListExtra);
            set = CollectionsKt___CollectionsKt.toSet(stringArrayListExtra);
            interfaceC10636aM.mo71589T0(set);
            this.f76390h.mo37190C1(-1, intent);
        }
    }

    /* renamed from: y */
    public final void m44417y(PolygonOptions polygonOptions) {
        boolean z = true;
        this.f76388f.showProgress(true, 4);
        this.f76394l = this.f76389g.mo90540c0(polygonOptions);
        this.f76389g.setBirds(this.f76393k);
        this.f76389g.mo90539wf(false);
        this.f76389g.mo90538zj(true);
        int size = this.f76393k.size();
        this.f76388f.m36565Ql().setText(this.f76388f.m36565Ql().getResources().getQuantityString(C37089Xk4.report_fraud_birds_selected_infotext, size, Integer.valueOf(size)));
        this.f76388f.m36566Pl().setVisibility(0);
        Button m36564Rl = this.f76388f.m36564Rl();
        if (size <= 0) {
            z = false;
        }
        m36564Rl.setEnabled(z);
        S74.C7343a.showProgress$default(this.f76388f, false, 0, 2, null);
    }
}
