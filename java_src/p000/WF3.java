package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.buava.Optional;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireNestPhoto;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0001\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"LWF3;", "Lco/bird/android/model/FlightBanner;", "", "onBannerShown", "onBannerRemoved", "Ldr4;", C17296a.f69688o, "Ldr4;", "reactiveLocationManager", "Lbn;", "b", "Lbn;", "areaManager", "LEa;", "c", "LEa;", "analyticsManager", "LYR4;", DateTokenConverter.CONVERTER_KEY, "LYR4;", "rideManager", "Le13;", "e", "Le13;", "navigator", "LaG3;", "f", "LaG3;", "parkingNestBannerUi", "Lcom/uber/autodispose/ScopeProvider;", "g", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/app/feature/map/ui/MapUi;", "h", "Lco/bird/android/app/feature/map/ui/MapUi;", "mapUi", "", "i", "Ljava/lang/String;", "nestId", "<init>", "(Ldr4;Lbn;LEa;LYR4;Le13;LaG3;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingNestBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ParkingNestBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,136:1\n199#2:137\n180#2:138\n180#2:139\n180#2:140\n*S KotlinDebug\n*F\n+ 1 ParkingNestBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ParkingNestBannerPresenterImpl\n*L\n61#1:137\n78#1:138\n92#1:139\n123#1:140\n*E\n"})
/* renamed from: WF3 */
/* loaded from: classes2.dex */
public final class WF3 implements FlightBanner {

    /* renamed from: a */
    public final InterfaceC40001dr4 f40646a;

    /* renamed from: b */
    public final InterfaceC12495bn f40647b;

    /* renamed from: c */
    public final InterfaceC1880Ea f40648c;

    /* renamed from: d */
    public final YR4 f40649d;

    /* renamed from: e */
    public final InterfaceC40099e13 f40650e;

    /* renamed from: f */
    public final InterfaceC37854aG3 f40651f;

    /* renamed from: g */
    public final ScopeProvider f40652g;

    /* renamed from: h */
    public final MapUi f40653h;

    /* renamed from: i */
    public final String f40654i;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/ParkingNest;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WF3$a */
    /* loaded from: classes2.dex */
    public static final class C8962a extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Pair<? extends ParkingNest, ? extends Float>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "nest", "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNest;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: WF3$a$a */
        /* loaded from: classes2.dex */
        public static final class C8963a extends Lambda implements Function1<ParkingNest, Boolean> {

            /* renamed from: g */
            public static final C8963a f40656g = new C8963a();

            public C8963a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(ParkingNest nest) {
                boolean z;
                Intrinsics.checkNotNullParameter(nest, "nest");
                Integer availableParkingCapacity = nest.getAvailableParkingCapacity();
                if (availableParkingCapacity == null || availableParkingCapacity.intValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C8962a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<ParkingNest, Float>> invoke(Unit it) {
            ParkingNest parkingNest;
            WireLocation location;
            Location fromLocation;
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(it, "it");
            ParkingNestData m59035e = WF3.this.f40647b.mo64003c0().getValue().m59035e();
            if (m59035e != null && (parkingNest = m59035e.getParkingNest()) != null && (location = parkingNest.getLocation()) != null && (fromLocation = location.fromLocation()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) C46173oG3.m21417b(WF3.this.f40647b.mo64006V().m73665a(), fromLocation, C8963a.f40656g, 1));
                ParkingNest parkingNest2 = (ParkingNest) firstOrNull;
                if (parkingNest2 == null) {
                    return Observable.empty();
                }
                Location m73665a = WF3.this.f40646a.mo43616p().m73665a();
                float m73969b = C37429Yw2.f47648a.m73969b(m73665a.getLatitude(), m73665a.getLongitude(), parkingNest2.getLocation().getLatitude(), parkingNest2.getLocation().getLongitude());
                WF3.this.f40647b.mo64015G(new ParkingNestData(parkingNest2, m73969b));
                return Observable.just(TuplesKt.m28425to(parkingNest2, Float.valueOf(m73969b))).delaySubscription(100L, TimeUnit.MILLISECONDS);
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/ParkingNest;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$b */
    /* loaded from: classes2.dex */
    public static final class C8964b extends Lambda implements Function1<Pair<? extends ParkingNest, ? extends Float>, Unit> {
        public C8964b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ParkingNest, ? extends Float> pair) {
            invoke2((Pair<ParkingNest, Float>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<ParkingNest, Float> pair) {
            ParkingNest component1 = pair.component1();
            float floatValue = pair.component2().floatValue();
            MapUi.DefaultImpls.zoomTo$default(WF3.this.f40653h, component1.getLocation().fromLocation(), null, 2, null);
            WF3.this.f40651f.mo64749a(component1, floatValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroid/location/Location;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$c */
    /* loaded from: classes2.dex */
    public static final class C8965c extends Lambda implements Function1<Pair<? extends Location, ? extends Optional<ParkingNestData>>, Unit> {
        public C8965c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Location, ? extends Optional<ParkingNestData>> pair) {
            invoke2((Pair<? extends Location, Optional<ParkingNestData>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Location, Optional<ParkingNestData>> pair) {
            Location component1 = pair.component1();
            Optional<ParkingNestData> component2 = pair.component2();
            if (component2.m59037c()) {
                ParkingNest parkingNest = component2.m59038b().getParkingNest();
                WF3.this.f40651f.mo64749a(parkingNest, C37429Yw2.f47648a.m73969b(component1.getLatitude(), component1.getLongitude(), parkingNest.getLocation().getLatitude(), parkingNest.getLocation().getLongitude()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$d */
    /* loaded from: classes2.dex */
    public static final class C8966d extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ParkingNestData>>, Boolean> {

        /* renamed from: g */
        public static final C8966d f40659g = new C8966d();

        public C8966d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Optional<ParkingNestData>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Optional<ParkingNestData>> pair) {
            return invoke2((Pair<Unit, Optional<ParkingNestData>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0003*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingNestBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ParkingNestBannerPresenterImpl$onBannerShown$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1549#2:137\n1620#2,3:138\n*S KotlinDebug\n*F\n+ 1 ParkingNestBannerPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/ParkingNestBannerPresenterImpl$onBannerShown$4\n*L\n74#1:137\n74#1:138,3\n*E\n"})
    /* renamed from: WF3$e */
    /* loaded from: classes2.dex */
    public static final class C8967e extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ParkingNestData>>, List<? extends String>> {

        /* renamed from: g */
        public static final C8967e f40660g = new C8967e();

        public C8967e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends String> invoke(Pair<? extends Unit, ? extends Optional<ParkingNestData>> pair) {
            return invoke2((Pair<Unit, Optional<ParkingNestData>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<String> invoke2(Pair<Unit, Optional<ParkingNestData>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireNestPhoto> photos = pair.component2().m59038b().getParkingNest().getPhotos();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(photos, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNestPhoto wireNestPhoto : photos) {
                arrayList.add(wireNestPhoto.getUrl());
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$f */
    /* loaded from: classes2.dex */
    public static final class C8968f extends Lambda implements Function1<List<? extends String>, Boolean> {

        /* renamed from: g */
        public static final C8968f f40661g = new C8968f();

        public C8968f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends String> list) {
            return invoke2((List<String>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$g */
    /* loaded from: classes2.dex */
    public static final class C8969g extends Lambda implements Function1<List<? extends String>, Unit> {
        public C8969g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> it) {
            InterfaceC40099e13 interfaceC40099e13 = WF3.this.f40650e;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC40099e13.mo36932v(it);
            String str = WF3.this.f40654i;
            if (str != null) {
                WF3.this.f40648c.mo55905y(new C40243eG3(null, null, null, str, 7, null));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$h */
    /* loaded from: classes2.dex */
    public static final class C8970h extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ParkingNestData>>, Boolean> {

        /* renamed from: g */
        public static final C8970h f40663g = new C8970h();

        public C8970h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Optional<ParkingNestData>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component2().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Optional<ParkingNestData>> pair) {
            return invoke2((Pair<Unit, Optional<ParkingNestData>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$j */
    /* loaded from: classes2.dex */
    public static final class C8972j extends Lambda implements Function1<WireLocation, Unit> {
        public C8972j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
            invoke2(wireLocation);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireLocation wireLocation) {
            ParkingNest parkingNest;
            WF3.this.f40650e.mo36935u2(wireLocation.fromLocation());
            ParkingNestData m59035e = WF3.this.f40647b.mo64003c0().getValue().m59035e();
            if (m59035e == null || (parkingNest = m59035e.getParkingNest()) == null) {
                return;
            }
            WF3 wf3 = WF3.this;
            wf3.f40648c.mo55905y(new C40836fG3(null, null, null, parkingNest.getId(), wf3.f40649d.mo75033n0(), Double.valueOf(wf3.f40646a.mo43618n(parkingNest.getLocation().fromLocation())), 7, null));
        }
    }

    public WF3(InterfaceC40001dr4 reactiveLocationManager, InterfaceC12495bn areaManager, InterfaceC1880Ea analyticsManager, YR4 rideManager, InterfaceC40099e13 navigator, InterfaceC37854aG3 parkingNestBannerUi, ScopeProvider scopeProvider, MapUi mapUi) {
        String str;
        ParkingNest parkingNest;
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(parkingNestBannerUi, "parkingNestBannerUi");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        this.f40646a = reactiveLocationManager;
        this.f40647b = areaManager;
        this.f40648c = analyticsManager;
        this.f40649d = rideManager;
        this.f40650e = navigator;
        this.f40651f = parkingNestBannerUi;
        this.f40652g = scopeProvider;
        this.f40653h = mapUi;
        ParkingNestData m59035e = areaManager.mo64003c0().getValue().m59035e();
        if (m59035e != null && (parkingNest = m59035e.getParkingNest()) != null) {
            str = parkingNest.getId();
        } else {
            str = null;
        }
        this.f40654i = str;
    }

    /* renamed from: k */
    public static final void m78666k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m78665l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final boolean m78664m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n */
    public static final List m78663n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final boolean m78662o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p */
    public static final void m78661p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final boolean m78660q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: r */
    public static final WireLocation m78659r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m78658s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23434B m78657t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.FlightBanner
    public Observable<Unit> closeImmediately() {
        return FlightBanner.DefaultImpls.closeImmediately(this);
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerRemoved() {
        String str = this.f40654i;
        if (str != null) {
            this.f40648c.mo55905y(new C39040cG3(null, null, null, str, 7, null));
        }
    }

    @Override // co.bird.android.model.FlightBanner
    public void onBannerShown() {
        String str = this.f40654i;
        if (str != null) {
            this.f40648c.mo55905y(new C39651dG3(null, null, null, str, 7, null));
        }
        AbstractC23442F m33152N = C37279Yf5.m74531s0(this.f40646a.mo43627e(true), this.f40647b.mo64003c0()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "reactiveLocationManager.…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f40652g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8965c c8965c = new C8965c();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: MF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WF3.m78666k(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f40651f.mo64748b(), this.f40647b.mo64003c0());
        final C8966d c8966d = C8966d.f40659g;
        Observable filter = m31950a.filter(new InterfaceC23494q() { // from class: NF3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m78664m;
                m78664m = WF3.m78664m(Function1.this, obj);
                return m78664m;
            }
        });
        final C8967e c8967e = C8967e.f40660g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: OF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m78663n;
                m78663n = WF3.m78663n(Function1.this, obj);
                return m78663n;
            }
        });
        final C8968f c8968f = C8968f.f40661g;
        Observable observeOn = map.filter(new InterfaceC23494q() { // from class: PF3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m78662o;
                m78662o = WF3.m78662o(Function1.this, obj);
                return m78662o;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "parkingNestBannerUi.nest…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f40652g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8969g c8969g = new C8969g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: QF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WF3.m78661p(Function1.this, obj);
            }
        });
        Observable m31950a2 = C24527f.m31950a(this.f40651f.mo64746d(), this.f40647b.mo64003c0());
        final C8970h c8970h = C8970h.f40663g;
        Observable filter2 = m31950a2.filter(new InterfaceC23494q() { // from class: RF3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m78660q;
                m78660q = WF3.m78660q(Function1.this, obj);
                return m78660q;
            }
        });
        final C8971i c8971i = C8971i.f40664g;
        Observable map2 = filter2.map(new InterfaceC23492o() { // from class: SF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation m78659r;
                m78659r = WF3.m78659r(Function1.this, obj);
                return m78659r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "parkingNestBannerUi.getD…kingNest.location\n      }");
        Object m33094as2 = map2.m33094as(AutoDispose.m45239a(this.f40652g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8972j c8972j = new C8972j();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: TF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WF3.m78658s(Function1.this, obj);
            }
        });
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(this.f40651f.mo64747c(), 0L, 1, null);
        final C8962a c8962a = new C8962a();
        Observable observeOn2 = clicksThrottle$default.flatMap(new InterfaceC23492o() { // from class: UF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m78657t;
                m78657t = WF3.m78657t(Function1.this, obj);
                return m78657t;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onBannerSho…st, distance)\n      }\n  }");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f40652g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8964b c8964b = new C8964b();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: VF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WF3.m78665l(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WF3$i */
    /* loaded from: classes2.dex */
    public static final class C8971i extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ParkingNestData>>, WireLocation> {

        /* renamed from: g */
        public static final C8971i f40664g = new C8971i();

        public C8971i() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final WireLocation invoke2(Pair<Unit, Optional<ParkingNestData>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2().m59038b().getParkingNest().getLocation();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ WireLocation invoke(Pair<? extends Unit, ? extends Optional<ParkingNestData>> pair) {
            return invoke2((Pair<Unit, Optional<ParkingNestData>>) pair);
        }
    }
}
