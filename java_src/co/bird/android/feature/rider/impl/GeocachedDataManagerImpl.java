package co.bird.android.feature.rider.impl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.rider.impl.GeocachedDataManagerImpl;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireRiderCell;
import co.bird.android.model.wire.WireRiderCellByType;
import co.bird.android.model.wire.WireRiderCellGeometry;
import co.bird.android.model.wire.WireRiderCellRect;
import co.bird.android.model.wire.WireRiderCellsRequest;
import co.bird.android.model.wire.WireRiderCellsResponse;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.MapGeocacheConfig;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fBE\b\u0007\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\b\b\u0001\u0010Q\u001a\u00020\u0004\u0012\u0006\u0010U\u001a\u00020R\u0012\b\b\u0001\u0010:\u001a\u00020\u0002¢\u0006\u0004\br\u0010sJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010H\u0002J$\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u001b0\u00102\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\"\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u001b0\u0010H\u0002J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00060\u0011j\u0002`\u0012*\u00020\u00152\u0006\u0010%\u001a\u00020\"H\u0002J\u0018\u0010(\u001a\u00020'*\u00060\u0011j\u0002`\u00122\u0006\u0010%\u001a\u00020\"H\u0002J$\u0010+\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"H\u0002J&\u0010-\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010*\u00020\t2\u0006\u0010%\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"H\u0002J\f\u0010/\u001a\u00020.*\u00020\tH\u0002J\u0012\u00102\u001a\b\u0012\u0004\u0012\u00020100*\u00020\u0002H\u0002JB\u00107\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0017j\u0002`\u001b\u0012\u0004\u0012\u00020\"060504*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u00103\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u001b0\u0010H\u0002J\u0012\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b*\u00020\u0002H\u0002J\u0016\u0010<\u001a\u0004\u0018\u00010;*\u0002092\u0006\u0010:\u001a\u00020\u0002H\u0002J\u001d\u0010=\u001a\u0004\u0018\u00010\"*\u00020!2\u0006\u0010:\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010:\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010,\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010^\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010`\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b_\u0010[R4\u0010d\u001a\"\u0012\u001e\u0012\u001c\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0017j\u0002`\u001b0\u0010060a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR*\u0010g\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0017j\u0002`\u001b\u0012\u0004\u0012\u00020e060a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010cR \u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0017050a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010cR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u0002010a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010cR(\u0010p\u001a\u0010\u0012\f\u0012\n m*\u0004\u0018\u000101010l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q¨\u0006u"}, m28432d2 = {"Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;", "Lwu6;", "Lvt4;", "LVX0;", "LLifecycleOwner;", "owner", "", "onCreate", "onStart", "Lcom/google/android/gms/maps/model/LatLngBounds;", "region", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/c;", C17296a.f69688o, "", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "requestedSubregions", "B", "Lcom/google/android/gms/maps/model/LatLng;", "center", "", "cellIds", "z", "subregions", "Lco/bird/android/feature/rider/impl/ServerCellId;", "V", "t", "u", "serverCellIds", "R", "Lco/bird/android/model/wire/configs/MobileMapConfigView;", "", "x", "(Lco/bird/android/model/wire/configs/MobileMapConfigView;)Ljava/lang/Integer;", "gridDegreeSubdivision", "X", "Lco/bird/android/model/wire/WireRiderCellGeometry;", "Y", "lat", "lon", "K", "maxGeocacheSubRegionLayersPerMapRegion", "D", "", "W", "Lio/reactivex/Observable;", "", "E", "neededCellIds", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "", "S", "U", "Lco/bird/android/model/wire/WireRiderCellByType;", "cellType", "Lco/bird/android/model/wire/WireRiderCell;", "v", "y", "(Lco/bird/android/model/wire/configs/MobileMapConfigView;Lvt4;)Ljava/lang/Integer;", "LaM;", "b", "LaM;", "birdManager", "Lbn;", "c", "Lbn;", "areaManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LDB1;", "e", "LDB1;", "geocachedDataClient", "f", "LLifecycleOwner;", "processLifecycleOwner", "Lgl;", "g", "Lgl;", "appPreference", "h", "Lvt4;", "w", "()Lvt4;", "i", "I", "j", "k", "maxMapGeocacheSubRegionCacheLimit", "l", "maxServerCellIdCacheLimit", "La94;", "m", "La94;", "subRegionToServerCells", "Lorg/joda/time/DateTime;", "n", "serverCellLastQuery", "o", "serverCellStrategy", "p", "isEnabledRelay", "LZ84;", "kotlin.jvm.PlatformType", "q", "LZ84;", "isEnabled", "()LZ84;", "<init>", "(LaM;Lbn;LTq4;LDB1;LLifecycleOwner;Lgl;Lvt4;)V", "r", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,523:1\n44#2:524\n44#2:526\n44#2:528\n180#3:525\n180#3:527\n180#3:529\n766#4:530\n857#4,2:531\n1855#4,2:533\n1360#4:535\n1446#4,5:536\n766#4:541\n857#4,2:542\n1549#4:544\n1620#4,3:545\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl\n*L\n118#1:524\n125#1:526\n138#1:528\n118#1:525\n125#1:527\n138#1:529\n189#1:530\n189#1:531,2\n196#1:533,2\n297#1:535\n297#1:536,5\n331#1:541\n331#1:542,2\n341#1:544\n341#1:545,3\n*E\n"})
/* loaded from: classes3.dex */
public final class GeocachedDataManagerImpl implements InterfaceC51298wu6<InterfaceC50693vt4>, VX0 {

    /* renamed from: r */
    public static final C15491a f65123r = new C15491a(null);

    /* renamed from: b */
    public final InterfaceC10636aM f65124b;

    /* renamed from: c */
    public final InterfaceC12495bn f65125c;

    /* renamed from: d */
    public final C36207Tq4 f65126d;

    /* renamed from: e */
    public final DB1 f65127e;

    /* renamed from: f */
    public final LifecycleOwner f65128f;

    /* renamed from: g */
    public final C22454gl f65129g;

    /* renamed from: h */
    public final InterfaceC50693vt4 f65130h;

    /* renamed from: i */
    public final int f65131i;

    /* renamed from: j */
    public final int f65132j;

    /* renamed from: k */
    public final int f65133k;

    /* renamed from: l */
    public final int f65134l;

    /* renamed from: m */
    public final C37791a94<Map<Long, Set<String>>> f65135m;

    /* renamed from: n */
    public final C37791a94<Map<String, DateTime>> f65136n;

    /* renamed from: o */
    public final C37791a94<Optional<String>> f65137o;

    /* renamed from: p */
    public final C37791a94<Boolean> f65138p;

    /* renamed from: q */
    public final Z84<Boolean> f65139q;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$a;", "", "", "DEFAULT_GEOCACHE_EXPIRY_SECONDS", "I", "DEFAULT_GEOCACHE_QUERY_LIMIT", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$a */
    /* loaded from: classes3.dex */
    public static final class C15491a {
        public /* synthetic */ C15491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15491a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "", "Lco/bird/android/feature/rider/impl/ServerCellId;", "", "fetchedCellIdsOptional", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$b */
    /* loaded from: classes3.dex */
    public static final class C15492b extends Lambda implements Function1<Optional<Map<String, ? extends Integer>>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Set<String> f65141h;

        /* renamed from: i */
        public final /* synthetic */ LatLng f65142i;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/ServerCellId;", "Lorg/joda/time/DateTime;", "map", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$handleBundleOfCellIds$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,523:1\n1855#2,2:524\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$handleBundleOfCellIds$1$1\n*L\n255#1:524,2\n*E\n"})
        /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$b$a */
        /* loaded from: classes3.dex */
        public static final class C15493a extends Lambda implements Function1<Map<String, ? extends DateTime>, Map<String, ? extends DateTime>> {

            /* renamed from: g */
            public final /* synthetic */ Set<String> f65143g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15493a(Set<String> set) {
                super(1);
                this.f65143g = set;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Map<String, DateTime> invoke(Map<String, DateTime> map) {
                Map mutableMap;
                Map<String, DateTime> map2;
                Intrinsics.checkNotNullParameter(map, "map");
                mutableMap = MapsKt__MapsKt.toMutableMap(map);
                for (String str : this.f65143g) {
                    DateTime now = DateTime.now();
                    Intrinsics.checkNotNullExpressionValue(now, "now()");
                    mutableMap.put(str, now);
                }
                map2 = MapsKt__MapsKt.toMap(mutableMap);
                return map2;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/ServerCellId;", "Lorg/joda/time/DateTime;", "map", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$handleBundleOfCellIds$1$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,523:1\n215#2,2:524\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$handleBundleOfCellIds$1$2\n*L\n270#1:524,2\n*E\n"})
        /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$b$b */
        /* loaded from: classes3.dex */
        public static final class C15494b extends Lambda implements Function1<Map<String, ? extends DateTime>, Map<String, ? extends DateTime>> {

            /* renamed from: g */
            public final /* synthetic */ Map<String, Integer> f65144g;

            /* renamed from: h */
            public final /* synthetic */ Set<String> f65145h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15494b(Map<String, Integer> map, Set<String> set) {
                super(1);
                this.f65144g = map;
                this.f65145h = set;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Map<String, DateTime> invoke(Map<String, DateTime> map) {
                Map mutableMap;
                Map<String, DateTime> map2;
                Intrinsics.checkNotNullParameter(map, "map");
                mutableMap = MapsKt__MapsKt.toMutableMap(map);
                Map<String, Integer> map3 = this.f65144g;
                Set<String> set = this.f65145h;
                for (Map.Entry<String, Integer> entry : map3.entrySet()) {
                    set.remove(entry.getKey());
                    if (entry.getValue().intValue() > 0) {
                        String key = entry.getKey();
                        DateTime now = DateTime.now();
                        Intrinsics.checkNotNullExpressionValue(now, "now()");
                        mutableMap.put(key, now);
                    }
                }
                map2 = MapsKt__MapsKt.toMap(mutableMap);
                return map2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15492b(Set<String> set, LatLng latLng) {
            super(1);
            this.f65141h = set;
            this.f65142i = latLng;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Optional<Map<String, Integer>> fetchedCellIdsOptional) {
            Set mutableSet;
            Intrinsics.checkNotNullParameter(fetchedCellIdsOptional, "fetchedCellIdsOptional");
            Map<String, Integer> m59035e = fetchedCellIdsOptional.m59035e();
            C41318g46.m40163a("fetchedCellIds = " + m59035e, new Object[0]);
            if (m59035e == null) {
                GeocachedDataManagerImpl.this.f65136n.m71837i(new C15493a(this.f65141h));
                return AbstractC23461c.m33039p();
            } else if (m59035e.isEmpty()) {
                return AbstractC23461c.m33039p();
            } else {
                mutableSet = CollectionsKt___CollectionsKt.toMutableSet(this.f65141h);
                GeocachedDataManagerImpl.this.f65136n.m71837i(new C15494b(m59035e, mutableSet));
                C41318g46.m40152l("remainingCellIds = " + mutableSet, new Object[0]);
                return GeocachedDataManagerImpl.this.m57059R(this.f65142i, mutableSet);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderCellsResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRiderCellsResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,523:1\n1#2:524\n1549#3:525\n1620#3,3:526\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2\n*L\n213#1:525\n213#1:526,3\n*E\n"})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$c */
    /* loaded from: classes3.dex */
    public static final class C15495c extends Lambda implements Function1<WireRiderCellsResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ List<Long> f65147h;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001c\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u00002 \u0010\u0006\u001a\u001c\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "", "", "Lco/bird/android/feature/rider/impl/ServerCellId;", "map", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,523:1\n215#2,2:524\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$hydrateMapGeocacheSubRegions$2$2\n*L\n224#1:524,2\n*E\n"})
        /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$c$a */
        /* loaded from: classes3.dex */
        public static final class C15496a extends Lambda implements Function1<Map<Long, ? extends Set<? extends String>>, Map<Long, ? extends Set<? extends String>>> {

            /* renamed from: g */
            public final /* synthetic */ Map<String, WireRiderCellByType> f65148g;

            /* renamed from: h */
            public final /* synthetic */ List<Long> f65149h;

            /* renamed from: i */
            public final /* synthetic */ GeocachedDataManagerImpl f65150i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15496a(Map<String, WireRiderCellByType> map, List<Long> list, GeocachedDataManagerImpl geocachedDataManagerImpl) {
                super(1);
                this.f65148g = map;
                this.f65149h = list;
                this.f65150i = geocachedDataManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Map<Long, Set<String>> invoke(Map<Long, ? extends Set<String>> map) {
                Map mutableMap;
                Map<Long, Set<String>> map2;
                Long longOrNull;
                List<String> cellIds;
                Set set;
                Intrinsics.checkNotNullParameter(map, "map");
                mutableMap = MapsKt__MapsKt.toMutableMap(map);
                Map<String, WireRiderCellByType> map3 = this.f65148g;
                List<Long> list = this.f65149h;
                GeocachedDataManagerImpl geocachedDataManagerImpl = this.f65150i;
                for (Map.Entry<String, WireRiderCellByType> entry : map3.entrySet()) {
                    WireRiderCellByType value = entry.getValue();
                    longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(entry.getKey());
                    if (longOrNull != null) {
                        long longValue = longOrNull.longValue();
                        list.remove(Long.valueOf(longValue));
                        WireRiderCell m57037v = geocachedDataManagerImpl.m57037v(value, geocachedDataManagerImpl.m57036w());
                        if (m57037v != null && (cellIds = m57037v.getCellIds()) != null) {
                            Long valueOf = Long.valueOf(longValue);
                            set = CollectionsKt___CollectionsKt.toSet(cellIds);
                            mutableMap.put(valueOf, set);
                        }
                    }
                }
                map2 = MapsKt__MapsKt.toMap(mutableMap);
                return map2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15495c(List<Long> list) {
            super(1);
            this.f65147h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireRiderCellsResponse response) {
            int collectionSizeOrDefault;
            Object firstOrNull;
            List mutableList;
            Set set;
            WireRiderCellByType wireRiderCellByType;
            Intrinsics.checkNotNullParameter(response, "response");
            Map<String, WireRiderCellByType> cells = response.getCells();
            if (cells != null) {
                String str = null;
                if (!(!cells.isEmpty())) {
                    cells = null;
                }
                if (cells != null) {
                    Collection<WireRiderCellByType> values = cells.values();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (WireRiderCellByType wireRiderCellByType2 : values) {
                        arrayList.add(wireRiderCellByType2.getBirds());
                    }
                    C41318g46.m40152l("returned cells: " + arrayList, new Object[0]);
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(cells.entrySet());
                    Map.Entry entry = (Map.Entry) firstOrNull;
                    if (entry != null && (wireRiderCellByType = (WireRiderCellByType) entry.getValue()) != null) {
                        GeocachedDataManagerImpl geocachedDataManagerImpl = GeocachedDataManagerImpl.this;
                        WireRiderCell m57037v = geocachedDataManagerImpl.m57037v(wireRiderCellByType, geocachedDataManagerImpl.m57036w());
                        if (m57037v != null) {
                            str = m57037v.getStrategy();
                        }
                    }
                    C41318g46.m40152l("returned strategy: " + str, new Object[0]);
                    if (str != null) {
                        GeocachedDataManagerImpl.this.f65137o.accept(Optional.f63040c.m59033b(str));
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f65147h);
                    GeocachedDataManagerImpl.this.f65135m.m71837i(new C15496a(cells, mutableList, GeocachedDataManagerImpl.this));
                    C41318g46.m40152l("remaining subregions to request: " + mutableList, new Object[0]);
                    GeocachedDataManagerImpl geocachedDataManagerImpl2 = GeocachedDataManagerImpl.this;
                    set = CollectionsKt___CollectionsKt.toSet(mutableList);
                    return geocachedDataManagerImpl2.m57073B(set);
                }
            }
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$d */
    /* loaded from: classes3.dex */
    public static final class C15497d extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C15497d f65151g = new C15497d();

        public C15497d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MapGeocacheConfig clientBirdGeocacheConfig = it.getRiderMapConfig().getClientBirdGeocacheConfig();
            return Boolean.valueOf(clientBirdGeocacheConfig != null ? Intrinsics.areEqual(clientBirdGeocacheConfig.getEnabled(), Boolean.TRUE) : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$e */
    /* loaded from: classes3.dex */
    public static final class C15498e extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C15498e f65152g = new C15498e();

        public C15498e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MapGeocacheConfig clientZoneGeocacheConfig = it.getRiderMapConfig().getClientZoneGeocacheConfig();
            return Boolean.valueOf(clientZoneGeocacheConfig != null ? Intrinsics.areEqual(clientZoneGeocacheConfig.getEnabled(), Boolean.TRUE) : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$f */
    /* loaded from: classes3.dex */
    public static final class C15499f extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C15499f f65153g = new C15499f();

        public C15499f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MapGeocacheConfig clientNestGeocacheConfig = it.getRiderMapConfig().getClientNestGeocacheConfig();
            return Boolean.valueOf(clientNestGeocacheConfig != null ? Intrinsics.areEqual(clientNestGeocacheConfig.getEnabled(), Boolean.TRUE) : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$g */
    /* loaded from: classes3.dex */
    public static final class C15500g extends Lambda implements Function1<Boolean, Unit> {
        public C15500g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            GeocachedDataManagerImpl.this.f65136n.m71836j();
            GeocachedDataManagerImpl.this.f65124b.mo71607B0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$h */
    /* loaded from: classes3.dex */
    public static final class C15501h extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C15501h f65155g = new C15501h();

        public C15501h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<String> optional) {
            return optional.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "strategy", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$i */
    /* loaded from: classes3.dex */
    public static final class C15502i extends Lambda implements Function1<String, Unit> {
        public C15502i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C41318g46.m40163a("evicting all map cell caches for new strategy " + str, new Object[0]);
            GeocachedDataManagerImpl.this.f65135m.m71836j();
            GeocachedDataManagerImpl.this.f65136n.m71836j();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/H;", "", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$j */
    /* loaded from: classes3.dex */
    public static final class C15503j extends Lambda implements Function1<InterfaceC23444H<Set<? extends Long>>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ LatLngBounds f65157g;

        /* renamed from: h */
        public final /* synthetic */ List<WireBird> f65158h;

        /* renamed from: i */
        public final /* synthetic */ GeocachedDataManagerImpl f65159i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15503j(LatLngBounds latLngBounds, List<WireBird> list, GeocachedDataManagerImpl geocachedDataManagerImpl) {
            super(1);
            this.f65157g = latLngBounds;
            this.f65158h = list;
            this.f65159i = geocachedDataManagerImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Set<? extends Long>> interfaceC23444H) {
            invoke2((InterfaceC23444H<Set<Long>>) interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<Set<Long>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            LatLngBounds latLngBounds = this.f65157g;
            List<WireBird> list = this.f65158h;
            C41318g46.m40163a("refresh called for region=" + latLngBounds + " and birds=" + list, new Object[0]);
            GeocachedDataManagerImpl geocachedDataManagerImpl = this.f65159i;
            emitter.onSuccess(geocachedDataManagerImpl.m57071D(this.f65157g, geocachedDataManagerImpl.f65131i, this.f65159i.f65132j));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\b\u0012\u00060\u0001j\u0002`\u0002 \u0003*\u000e\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/util/Set;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$k */
    /* loaded from: classes3.dex */
    public static final class C15504k extends Lambda implements Function1<Set<? extends Long>, Unit> {
        public C15504k() {
            super(1);
        }

        /* renamed from: a */
        public final void m57026a(Set<Long> set) {
            GeocachedDataManagerImpl.this.m57039t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Long> set) {
            m57026a(set);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aR\u0012\"\b\u0001\u0012\u001e\u0012\b\u0012\u00060\u0001j\u0002`\u0002 \u0005*\u000e\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0018\u00010\u00000\u0000 \u0005*(\u0012\"\b\u0001\u0012\u001e\u0012\b\u0012\u00060\u0001j\u0002`\u0002 \u0005*\u000e\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "innerRegions", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Set;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$l */
    /* loaded from: classes3.dex */
    public static final class C15505l extends Lambda implements Function1<Set<? extends Long>, InterfaceC23447K<? extends Set<? extends Long>>> {
        public C15505l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Set<Long>> invoke(Set<Long> innerRegions) {
            Intrinsics.checkNotNullParameter(innerRegions, "innerRegions");
            return GeocachedDataManagerImpl.this.m57073B(innerRegions).m33046j0(innerRegions);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\b\u0012\u00060\u0001j\u0002`\u0002 \u0003*\u000e\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/util/Set;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$m */
    /* loaded from: classes3.dex */
    public static final class C15506m extends Lambda implements Function1<Set<? extends Long>, Unit> {
        public C15506m() {
            super(1);
        }

        /* renamed from: a */
        public final void m57024a(Set<Long> set) {
            GeocachedDataManagerImpl.this.m57038u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Long> set) {
            m57024a(set);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;", "innerRegions", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Set;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$n */
    /* loaded from: classes3.dex */
    public static final class C15507n extends Lambda implements Function1<Set<? extends Long>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ LatLngBounds f65164h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15507n(LatLngBounds latLngBounds) {
            super(1);
            this.f65164h = latLngBounds;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Set<Long> innerRegions) {
            Intrinsics.checkNotNullParameter(innerRegions, "innerRegions");
            Set m57055V = GeocachedDataManagerImpl.this.m57055V(innerRegions);
            GeocachedDataManagerImpl geocachedDataManagerImpl = GeocachedDataManagerImpl.this;
            LatLng m50668v = this.f65164h.m50668v();
            Intrinsics.checkNotNullExpressionValue(m50668v, "region.center");
            return geocachedDataManagerImpl.m57059R(m50668v, m57055V);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a6\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0005\u0012\u0004\u0012\u00020\u00020\u0000 \u0006*\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0005\u0012\u0004\u0012\u00020\u00020\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "", "", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/feature/rider/impl/ServerCellId;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.impl.GeocachedDataManagerImpl$o */
    /* loaded from: classes3.dex */
    public static final class C15508o extends Lambda implements Function1<Map<String, ? extends Integer>, Optional<Map<String, ? extends Integer>>> {

        /* renamed from: g */
        public static final C15508o f65165g = new C15508o();

        public C15508o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Map<String, Integer>> invoke(Map<String, Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59032c(it);
        }
    }

    public GeocachedDataManagerImpl(InterfaceC10636aM birdManager, InterfaceC12495bn areaManager, C36207Tq4 reactiveConfig, DB1 geocachedDataClient, LifecycleOwner processLifecycleOwner, C22454gl appPreference, InterfaceC50693vt4 cellType) {
        Map emptyMap;
        Map emptyMap2;
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(geocachedDataClient, "geocachedDataClient");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        this.f65124b = birdManager;
        this.f65125c = areaManager;
        this.f65126d = reactiveConfig;
        this.f65127e = geocachedDataClient;
        this.f65128f = processLifecycleOwner;
        this.f65129g = appPreference;
        this.f65130h = cellType;
        this.f65131i = 100;
        this.f65132j = 3;
        this.f65133k = 1000;
        this.f65134l = 6400;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f65135m = C37791a94.C10586a.create$default(c10586a, emptyMap, null, 2, null);
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        this.f65136n = C37791a94.C10586a.create$default(c10586a, emptyMap2, null, 2, null);
        this.f65137o = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        C37791a94<Boolean> create$default = C37791a94.C10586a.create$default(c10586a, Boolean.TRUE, null, 2, null);
        this.f65138p = create$default;
        this.f65139q = Z84.f47888d.m73663b(create$default);
        processLifecycleOwner.getLifecycle().mo67008a(this);
    }

    /* renamed from: A */
    public static final InterfaceC23496h m57074A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m57072C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final Boolean m57069G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final Boolean m57068H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final Boolean m57067J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m57065L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m57064M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m57063N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23447K m57062O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m57061P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23496h m57060Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Optional m57057T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final AbstractC23461c m57073B(Set<Long> set) {
        C41318g46.m40163a("hydrateMapGeocacheSubRegions called with requestedSubregions=" + set, new Object[0]);
        Set<Long> keySet = this.f65135m.getValue().keySet();
        C41318g46.m40152l("knownRegions=" + keySet, new Object[0]);
        ArrayList<Number> arrayList = new ArrayList();
        for (Object obj : set) {
            if (!keySet.contains(Long.valueOf(((Number) obj).longValue()))) {
                arrayList.add(obj);
            }
        }
        C41318g46.m40152l("filtered subregions to check " + arrayList, new Object[0]);
        if (arrayList.isEmpty()) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Number number : arrayList) {
            long longValue = number.longValue();
            linkedHashMap.put(String.valueOf(longValue), m57052Y(longValue, this.f65131i));
        }
        WireRiderCellsRequest wireRiderCellsRequest = new WireRiderCellsRequest(linkedHashMap, m57056U(m57036w()));
        Set<String> keySet2 = wireRiderCellsRequest.getGeometries().keySet();
        C41318g46.m40152l("making subregions to cell id request: " + keySet2, new Object[0]);
        AbstractC23442F<WireRiderCellsResponse> m110792a = this.f65127e.m110792a(wireRiderCellsRequest);
        final C15495c c15495c = new C15495c(arrayList);
        AbstractC23461c m33164B = m110792a.m33164B(new InterfaceC23492o() { // from class: EB1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23496h m57072C;
                m57072C = GeocachedDataManagerImpl.m57072C(Function1.this, obj2);
                return m57072C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun hydrateMapGe…ions.toSet())\n      }\n  }");
        return m33164B;
    }

    /* renamed from: D */
    public final Set<Long> m57071D(LatLngBounds latLngBounds, int i, int i2) {
        Set<Long> mutableSetOf;
        Set<Long> of;
        C41318g46.m40163a("innerRegions called with gridDegreeSubdivision=" + i + " and maxGeocacheSubRegionLayersPerMapRegion=" + i2, new Object[0]);
        LatLng center = latLngBounds.m50668v();
        Intrinsics.checkNotNullExpressionValue(center, "center");
        long m57053X = m57053X(center, i);
        double m57054W = m57054W(latLngBounds) / 2.0d;
        C41318g46.m40152l("spanRadius=" + m57054W, new Object[0]);
        int i3 = 1;
        int i4 = ((int) (m57054W * ((double) i))) - 1;
        C41318g46.m40152l("layersDesired=" + i4, new Object[0]);
        if (i4 < 1) {
            of = SetsKt__SetsJVMKt.setOf(Long.valueOf(m57053X));
            return of;
        }
        int min = Math.min(i4, i2);
        C41318g46.m40152l("resolvedLayerCount=" + min, new Object[0]);
        mutableSetOf = SetsKt__SetsKt.mutableSetOf(Long.valueOf(m57053X));
        if (1 <= min) {
            while (true) {
                int i5 = -i3;
                if (i5 <= i3) {
                    int i6 = i5;
                    while (true) {
                        mutableSetOf.add(Long.valueOf(m57066K(m57053X, i6, i5)));
                        mutableSetOf.add(Long.valueOf(m57066K(m57053X, i6, i3)));
                        mutableSetOf.add(Long.valueOf(m57066K(m57053X, i5, i6)));
                        mutableSetOf.add(Long.valueOf(m57066K(m57053X, i3, i6)));
                        if (i6 == i3) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i3 == min) {
                    break;
                }
                i3++;
            }
        }
        C41318g46.m40152l("result=" + mutableSetOf, new Object[0]);
        return mutableSetOf;
    }

    /* renamed from: E */
    public final Observable<Boolean> m57070E(InterfaceC50693vt4 interfaceC50693vt4) {
        if (interfaceC50693vt4 instanceof InterfaceC8259UK) {
            Z84<Config> m82623f8 = this.f65126d.m82623f8();
            final C15497d c15497d = C15497d.f65151g;
            Observable<Boolean> distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: OB1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m57069G;
                    m57069G = GeocachedDataManagerImpl.m57069G(Function1.this, obj);
                    return m57069G;
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config\n  …  .distinctUntilChanged()");
            return distinctUntilChanged;
        } else if (interfaceC50693vt4 instanceof InterfaceC8440Um) {
            Z84<Config> m82623f82 = this.f65126d.m82623f8();
            final C15498e c15498e = C15498e.f65152g;
            Observable<Boolean> distinctUntilChanged2 = m82623f82.map(new InterfaceC23492o() { // from class: PB1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m57068H;
                    m57068H = GeocachedDataManagerImpl.m57068H(Function1.this, obj);
                    return m57068H;
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "reactiveConfig.config\n  …  .distinctUntilChanged()");
            return distinctUntilChanged2;
        } else if (interfaceC50693vt4 instanceof B23) {
            Z84<Config> m82623f83 = this.f65126d.m82623f8();
            final C15499f c15499f = C15499f.f65153g;
            Observable<Boolean> distinctUntilChanged3 = m82623f83.map(new InterfaceC23492o() { // from class: FB1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m57067J;
                    m57067J = GeocachedDataManagerImpl.m57067J(Function1.this, obj);
                    return m57067J;
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "reactiveConfig.config\n  …  .distinctUntilChanged()");
            return distinctUntilChanged3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: K */
    public final long m57066K(long j, int i, int i2) {
        long j2 = j >>> 32;
        return ((j & 4294967295L) + i2) | ((j2 + i) << 32);
    }

    /* renamed from: R */
    public final AbstractC23461c m57059R(LatLng latLng, Set<String> set) {
        int i;
        int i2;
        List chunked;
        int collectionSizeOrDefault;
        Set<String> set2;
        boolean z;
        C41318g46.m40163a("refreshServerCellIds called with center=" + latLng + " and serverCellIds=" + set, new Object[0]);
        MobileMapConfigView riderMapConfig = this.f65126d.m82623f8().m73665a().getRiderMapConfig();
        Integer m57035x = m57035x(riderMapConfig);
        if (m57035x != null) {
            i = m57035x.intValue();
        } else {
            i = 300;
        }
        DateTime minusSeconds = DateTime.now().minusSeconds(i);
        Map<String, DateTime> value = this.f65136n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            DateTime dateTime = value.get((String) obj);
            if (dateTime == null) {
                dateTime = new DateTime(Instant.ofEpochSecond(0L));
            }
            if (dateTime.compareTo((ReadableInstant) minusSeconds) < 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        C41318g46.m40152l("neededServerCellIds = " + arrayList, new Object[0]);
        if (arrayList.isEmpty()) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        Integer m57034y = m57034y(riderMapConfig, m57036w());
        if (m57034y != null) {
            i2 = m57034y.intValue();
        } else {
            i2 = 16;
        }
        chunked = CollectionsKt___CollectionsKt.chunked(arrayList, i2);
        C41318g46.m40152l("idCellId Bundle requests: " + chunked, new Object[0]);
        List<List> list = chunked;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (List list2 : list) {
            set2 = CollectionsKt___CollectionsKt.toSet(list2);
            arrayList2.add(m57033z(latLng, set2));
        }
        AbstractC23461c m33037r = AbstractC23461c.m33037r(arrayList2);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(streams)");
        return m33037r;
    }

    /* renamed from: S */
    public final AbstractC23442F<Optional<Map<String, Integer>>> m57058S(InterfaceC50693vt4 interfaceC50693vt4, LatLng latLng, Set<String> set) {
        if (interfaceC50693vt4 instanceof InterfaceC8259UK) {
            AbstractC23442F<Map<String, Integer>> mo71593P0 = this.f65124b.mo71593P0(C39339cm2.m60884e(latLng), set);
            final C15508o c15508o = C15508o.f65165g;
            AbstractC23442F m33157I = mo71593P0.m33157I(new InterfaceC23492o() { // from class: GB1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m57057T;
                    m57057T = GeocachedDataManagerImpl.m57057T(Function1.this, obj);
                    return m57057T;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "birdManager.fetchNearbyB… .map { Optional.of(it) }");
            return m33157I;
        } else if (interfaceC50693vt4 instanceof InterfaceC8440Um) {
            AbstractC23442F<Optional<Map<String, Integer>>> m33046j0 = this.f65125c.mo64010P(C39339cm2.m60884e(latLng), set, this.f65129g.m37571t0()).m33046j0(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m33046j0, "areaManager.refreshNearb…efault(Optional.absent())");
            return m33046j0;
        } else if (interfaceC50693vt4 instanceof B23) {
            throw new NotImplementedError(null, 1, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: U */
    public final List<String> m57056U(InterfaceC50693vt4 interfaceC50693vt4) {
        List<String> listOf;
        List<String> listOf2;
        List<String> listOf3;
        if (interfaceC50693vt4 instanceof InterfaceC8259UK) {
            listOf3 = CollectionsKt__CollectionsJVMKt.listOf("bird");
            return listOf3;
        } else if (interfaceC50693vt4 instanceof InterfaceC8440Um) {
            listOf2 = CollectionsKt__CollectionsJVMKt.listOf("zone");
            return listOf2;
        } else if (interfaceC50693vt4 instanceof B23) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf("nest");
            return listOf;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: V */
    public final Set<String> m57055V(Set<Long> set) {
        Set<String> set2;
        C41318g46.m40163a("serverCellIdsForSubRegions called with subregions=" + set, new Object[0]);
        Map<Long, Set<String>> value = this.f65135m.getValue();
        ArrayList arrayList = new ArrayList();
        for (Number number : set) {
            Set<String> set3 = value.get(Long.valueOf(number.longValue()));
            if (set3 == null) {
                set3 = SetsKt__SetsKt.emptySet();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, set3);
        }
        set2 = CollectionsKt___CollectionsKt.toSet(arrayList);
        return set2;
    }

    /* renamed from: W */
    public final double m57054W(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.f71433c;
        double d = latLng.f71431c;
        LatLng latLng2 = latLngBounds.f71432b;
        double d2 = d - latLng2.f71431c;
        double d3 = latLng.f71430b - latLng2.f71430b;
        if (d2 <= d3) {
            return d3;
        }
        return d2;
    }

    /* renamed from: X */
    public final long m57053X(LatLng latLng, int i) {
        double d = i;
        return ((long) ((latLng.f71431c + 180.0d) * d)) | (((long) ((latLng.f71430b + 90.0d) * d)) << 32);
    }

    /* renamed from: Y */
    public final WireRiderCellGeometry m57052Y(long j, int i) {
        double d = 1.0d / i;
        double d2 = ((j >>> 32) * d) - 90.0d;
        double d3 = ((j & 4294967295L) * d) - 180.0d;
        return new WireRiderCellGeometry(new WireRiderCellRect(new WireLocation(d2, d3, null, null, null, null, false, null, null, 508, null), new WireLocation(d2 + d, d3 + d, null, null, null, null, false, null, null, 508, null)));
    }

    @Override // p000.InterfaceC51298wu6
    /* renamed from: a */
    public AbstractC23461c mo6122a(LatLngBounds region, List<WireBird> list) {
        Intrinsics.checkNotNullParameter(region, "region");
        AbstractC23442F m23305k = C45832nh5.m23305k(new C15503j(region, list, this));
        final C15504k c15504k = new C15504k();
        AbstractC23442F m33101w = m23305k.m33101w(new InterfaceC23484g() { // from class: JB1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GeocachedDataManagerImpl.m57063N(Function1.this, obj);
            }
        });
        final C15505l c15505l = new C15505l();
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: KB1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m57062O;
                m57062O = GeocachedDataManagerImpl.m57062O(Function1.this, obj);
                return m57062O;
            }
        });
        final C15506m c15506m = new C15506m();
        AbstractC23442F m33101w2 = m33165A.m33101w(new InterfaceC23484g() { // from class: LB1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GeocachedDataManagerImpl.m57061P(Function1.this, obj);
            }
        });
        final C15507n c15507n = new C15507n(region);
        AbstractC23461c m33164B = m33101w2.m33164B(new InterfaceC23492o() { // from class: MB1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57060Q;
                m57060Q = GeocachedDataManagerImpl.m57060Q(Function1.this, obj);
                return m57060Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun refresh(reg…ch,\n        )\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC51298wu6
    public Z84<Boolean> isEnabled() {
        return this.f65139q;
    }

    @Override // p000.VX0
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        Observable<Boolean> m57070E = m57070E(m57036w());
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = m57070E.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f65138p);
        Observable<Boolean> skip = isEnabled().distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "isEnabled\n      .distinc…lChanged()\n      .skip(1)");
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as2 = skip.m33094as(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15500g c15500g = new C15500g();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: HB1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GeocachedDataManagerImpl.m57065L(Function1.this, obj);
            }
        });
        Observable skip2 = C37279Yf5.m74575T(this.f65137o, C15501h.f65155g).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip2, "serverCellStrategy\n     …lChanged()\n      .skip(1)");
        AndroidLifecycleScopeProvider m45197b3 = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b3, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as3 = skip2.m33094as(AutoDispose.m45239a(m45197b3));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C15502i c15502i = new C15502i();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: IB1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GeocachedDataManagerImpl.m57064M(Function1.this, obj);
            }
        });
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
    }

    /* renamed from: t */
    public final void m57039t() {
        C41318g46.m40163a("evictMapGeocacheLookupIfRequired called", new Object[0]);
        if (this.f65135m.getValue().size() > this.f65133k) {
            C41318g46.m40152l("evictMapGeocacheLookupIfRequired reset subRegionToServerCells", new Object[0]);
            this.f65135m.m71836j();
        }
    }

    /* renamed from: u */
    public final void m57038u() {
        C41318g46.m40163a("evictServerCellIdIfRequired called", new Object[0]);
        if (this.f65136n.getValue().size() > this.f65134l) {
            C41318g46.m40152l("evictServerCellIdIfRequired reset serverCellLastQuery", new Object[0]);
            this.f65136n.m71836j();
        }
    }

    /* renamed from: v */
    public final WireRiderCell m57037v(WireRiderCellByType wireRiderCellByType, InterfaceC50693vt4 interfaceC50693vt4) {
        if (interfaceC50693vt4 instanceof InterfaceC8259UK) {
            return wireRiderCellByType.getBirds();
        }
        if (interfaceC50693vt4 instanceof InterfaceC8440Um) {
            return wireRiderCellByType.getZones();
        }
        if (interfaceC50693vt4 instanceof B23) {
            return wireRiderCellByType.getNests();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: w */
    public InterfaceC50693vt4 m57036w() {
        return this.f65130h;
    }

    /* renamed from: x */
    public final Integer m57035x(MobileMapConfigView mobileMapConfigView) {
        InterfaceC50693vt4 m57036w = m57036w();
        if (m57036w instanceof InterfaceC8259UK) {
            MapGeocacheConfig clientBirdGeocacheConfig = mobileMapConfigView.getClientBirdGeocacheConfig();
            if (clientBirdGeocacheConfig == null) {
                return null;
            }
            return clientBirdGeocacheConfig.getExpirySeconds();
        } else if (m57036w instanceof InterfaceC8440Um) {
            MapGeocacheConfig clientZoneGeocacheConfig = mobileMapConfigView.getClientZoneGeocacheConfig();
            if (clientZoneGeocacheConfig == null) {
                return null;
            }
            return clientZoneGeocacheConfig.getExpirySeconds();
        } else if (m57036w instanceof B23) {
            MapGeocacheConfig clientNestGeocacheConfig = mobileMapConfigView.getClientNestGeocacheConfig();
            if (clientNestGeocacheConfig == null) {
                return null;
            }
            return clientNestGeocacheConfig.getExpirySeconds();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: y */
    public final Integer m57034y(MobileMapConfigView mobileMapConfigView, InterfaceC50693vt4 interfaceC50693vt4) {
        if (interfaceC50693vt4 instanceof InterfaceC8259UK) {
            MapGeocacheConfig clientBirdGeocacheConfig = mobileMapConfigView.getClientBirdGeocacheConfig();
            if (clientBirdGeocacheConfig == null) {
                return null;
            }
            return clientBirdGeocacheConfig.getQueryLimit();
        } else if (interfaceC50693vt4 instanceof InterfaceC8440Um) {
            MapGeocacheConfig clientZoneGeocacheConfig = mobileMapConfigView.getClientZoneGeocacheConfig();
            if (clientZoneGeocacheConfig == null) {
                return null;
            }
            return clientZoneGeocacheConfig.getQueryLimit();
        } else if (interfaceC50693vt4 instanceof B23) {
            MapGeocacheConfig clientNestGeocacheConfig = mobileMapConfigView.getClientNestGeocacheConfig();
            if (clientNestGeocacheConfig == null) {
                return null;
            }
            return clientNestGeocacheConfig.getQueryLimit();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: z */
    public final AbstractC23461c m57033z(LatLng latLng, Set<String> set) {
        C41318g46.m40163a("handleBundleOfCellIds called with center=" + latLng + " and cellIds=" + set, new Object[0]);
        AbstractC23442F<Optional<Map<String, Integer>>> m57058S = m57058S(m57036w(), latLng, set);
        final C15492b c15492b = new C15492b(set, latLng);
        AbstractC23461c m33164B = m57058S.m33164B(new InterfaceC23492o() { // from class: NB1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m57074A;
                m57074A = GeocachedDataManagerImpl.m57074A(Function1.this, obj);
                return m57074A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun handleBundle…ds,\n        )\n      }\n  }");
        return m33164B;
    }
}
