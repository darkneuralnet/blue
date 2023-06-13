package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LongTermRentalMap;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.constant.RiderMapZoneKind;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.AreaKt;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import co.bird.android.model.wire.WireRiderMapZone;
import co.bird.android.model.wire.WireRiderMapZoneColor;
import co.bird.android.model.wire.WireRiderMapZoneColors;
import co.bird.android.model.wire.WireRiderZoneCellsRequest;
import co.bird.android.model.wire.WireRiderZoneCellsResponse;
import co.bird.android.model.wire.WireZoneRegion;
import co.bird.api.request.OperatorMapRequest;
import co.bird.api.request.ZoneRegionRequest;
import co.bird.api.response.OperatorMapResponse;
import co.bird.api.response.ZoneRegionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p000.C9979Yn;
import p000.InterfaceC6137On;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bE\u0010FJ,\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002J*\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002J,\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0002J(\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J.\u0010#\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0002H\u0016J$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00020&2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\tH\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020+0$2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0016R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, m28432d2 = {"LYn;", "LOn;", "", "Lco/bird/android/model/wire/WireRiderMapZone;", "zoneList", "", "", "Lco/bird/android/model/wire/WireZoneRegion;", "geos", "Lio/reactivex/c;", "Z1", "Lco/bird/android/model/persistence/Area;", "zone", "e2", "role", "areas", "retainedAreaIds", "c2", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/constant/MapMode;", "mapMode", "", "includeMergedArea", "R0", "center", "", "cellIds", "r1", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "G1", "Lio/reactivex/F;", "I0", "Lio/reactivex/k;", "z1", "clear", "Lorg/joda/time/DateTime;", "before", "", "d1", "LXm;", C17296a.f69688o, "LXm;", "areaDao", "LTk3;", "b", "LTk3;", "operatorClient", "LVK;", "c", "LVK;", "birdClient", "LDB1;", DateTokenConverter.CONVERTER_KEY, "LDB1;", "geocachedDataClient", "Lxx4;", "e", "Lxx4;", "rentalClient", "Lgl;", "f", "Lgl;", "preference", "<init>", "(LXm;LTk3;LVK;LDB1;Lxx4;Lgl;)V", "co.bird.android.repository.area"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1549#2:254\n1620#2,3:255\n1549#2:259\n1620#2,3:260\n1#3:258\n37#4,2:263\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl\n*L\n114#1:254\n114#1:255,3\n181#1:259\n181#1:260,3\n237#1:263,2\n*E\n"})
/* renamed from: Yn */
/* loaded from: classes4.dex */
public final class C9979Yn implements InterfaceC6137On {

    /* renamed from: a */
    public final AbstractC9490Xm f46599a;

    /* renamed from: b */
    public final InterfaceC36152Tk3 f46600b;

    /* renamed from: c */
    public final InterfaceC8601VK f46601c;

    /* renamed from: d */
    public final DB1 f46602d;

    /* renamed from: e */
    public final InterfaceC51919xx4 f46603e;

    /* renamed from: f */
    public final C22454gl f46604f;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireArea;", "areas", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n766#2:254\n857#2,2:255\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$1\n*L\n52#1:254\n52#1:255,2\n*E\n"})
    /* renamed from: Yn$a */
    /* loaded from: classes4.dex */
    public static final class C9980a extends Lambda implements Function1<List<? extends WireArea>, List<? extends WireArea>> {

        /* renamed from: g */
        public final /* synthetic */ MapMode f46605g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yn$a$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C9981a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MapMode.values().length];
                try {
                    iArr[MapMode.RIDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MapMode.OPERATOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9980a(MapMode mapMode) {
            super(1);
            this.f46605g = mapMode;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireArea> invoke(List<WireArea> areas) {
            boolean z;
            List<WireArea> emptyList;
            Intrinsics.checkNotNullParameter(areas, "areas");
            int i = C9981a.$EnumSwitchMapping$0[this.f46605g.ordinal()];
            if (i != 1 && i != 2) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : areas) {
                WireArea wireArea = (WireArea) obj;
                if ((!wireArea.getNoRides() || wireArea.getHideBirds()) && !wireArea.getNoParking() && !wireArea.getPreferredParking() && !wireArea.getOperational() && wireArea.getMaxSpeed() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireArea;", "wireAreas", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1549#2:254\n1620#2,3:255\n1549#2:258\n1620#2,3:259\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$2\n*L\n64#1:254\n64#1:255,3\n65#1:258\n65#1:259,3\n*E\n"})
    /* renamed from: Yn$b */
    /* loaded from: classes4.dex */
    public static final class C9982b extends Lambda implements Function1<List<? extends WireArea>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ MapMode f46607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9982b(MapMode mapMode) {
            super(1);
            this.f46607h = mapMode;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<WireArea> wireAreas) {
            String m42542a;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullParameter(wireAreas, "wireAreas");
            m42542a = C20102eo.m42542a(C9979Yn.this.f46604f, this.f46607h);
            List<WireArea> list = wireAreas;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireArea wireArea : list) {
                arrayList.add(C8792Vm.m79432a(wireArea, m42542a));
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireArea wireArea2 : list) {
                arrayList2.add(wireArea2.getId());
            }
            return C9979Yn.this.m74252c2(m42542a, arrayList, arrayList2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderZoneCellsResponse;", "results", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireRiderZoneCellsResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yn$c */
    /* loaded from: classes4.dex */
    public static final class C9983c extends Lambda implements Function1<WireRiderZoneCellsResponse, InterfaceC23447K<? extends Pair<? extends WireRiderZoneCellsResponse, ? extends List<? extends String>>>> {

        /* renamed from: h */
        public final /* synthetic */ MapMode f46609h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "areaIds", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yn$c$a */
        /* loaded from: classes4.dex */
        public static final class C9984a extends Lambda implements Function1<List<? extends String>, Pair<? extends WireRiderZoneCellsResponse, ? extends List<? extends String>>> {

            /* renamed from: g */
            public final /* synthetic */ WireRiderZoneCellsResponse f46610g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9984a(WireRiderZoneCellsResponse wireRiderZoneCellsResponse) {
                super(1);
                this.f46610g = wireRiderZoneCellsResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireRiderZoneCellsResponse, List<String>> invoke(List<String> areaIds) {
                Intrinsics.checkNotNullParameter(areaIds, "areaIds");
                return TuplesKt.m28425to(this.f46610g, areaIds);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9983c(MapMode mapMode) {
            super(1);
            this.f46609h = mapMode;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireRiderZoneCellsResponse, List<String>>> invoke(WireRiderZoneCellsResponse results) {
            String m42542a;
            Intrinsics.checkNotNullParameter(results, "results");
            AbstractC9490Xm abstractC9490Xm = C9979Yn.this.f46599a;
            m42542a = C20102eo.m42542a(C9979Yn.this.f46604f, this.f46609h);
            AbstractC23442F<List<String>> mo74307f = abstractC9490Xm.mo74307f(m42542a);
            final C9984a c9984a = new C9984a(results);
            return mo74307f.m33157I(new InterfaceC23492o() { // from class: Zn
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C9979Yn.C9983c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/LongTermRentalMap;", "longTermRentalMap", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/LongTermRentalMap;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchRentalAreas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1549#2:254\n1620#2,3:255\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchRentalAreas$1\n*L\n202#1:254\n202#1:255,3\n*E\n"})
    /* renamed from: Yn$e */
    /* loaded from: classes4.dex */
    public static final class C9987e extends Lambda implements Function1<LongTermRentalMap, List<? extends Area>> {

        /* renamed from: g */
        public static final C9987e f46614g = new C9987e();

        public C9987e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Area> invoke(LongTermRentalMap longTermRentalMap) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(longTermRentalMap, "longTermRentalMap");
            List<WireArea> deliveryAreas = longTermRentalMap.getDeliveryAreas();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(deliveryAreas, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireArea wireArea : deliveryAreas) {
                arrayList.add(C8792Vm.m79432a(wireArea, "rental"));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchServerDrivenAreas$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1549#2:254\n1620#2,3:255\n1549#2:258\n1620#2,3:259\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchServerDrivenAreas$2\n*L\n185#1:254\n185#1:255,3\n186#1:258\n186#1:259,3\n*E\n"})
    /* renamed from: Yn$f */
    /* loaded from: classes4.dex */
    public static final class C9988f extends Lambda implements Function1<OperatorMapResponse, InterfaceC23496h> {
        public C9988f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(OperatorMapResponse response) {
            String m42542a;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullParameter(response, "response");
            m42542a = C20102eo.m42542a(C9979Yn.this.f46604f, MapMode.OPERATOR);
            List<WireArea> areas = response.getAreas();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(areas, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireArea wireArea : areas) {
                arrayList.add(C8792Vm.m79432a(wireArea, m42542a));
            }
            List<WireArea> areas2 = response.getAreas();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(areas2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireArea wireArea2 : areas2) {
                arrayList2.add(wireArea2.getId());
            }
            return C9979Yn.this.m74252c2(m42542a, arrayList, arrayList2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Area;", "areas", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$processResponseGetNearbyAreaByCell$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1194#2,2:254\n1222#2,4:256\n1603#2,9:260\n1855#2:269\n1856#2:272\n1612#2:273\n1#3:270\n1#3:271\n37#4,2:274\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$processResponseGetNearbyAreaByCell$1\n*L\n118#1:254,2\n118#1:256,4\n119#1:260,9\n119#1:269\n119#1:272\n119#1:273\n119#1:271\n127#1:274,2\n*E\n"})
    /* renamed from: Yn$g */
    /* loaded from: classes4.dex */
    public static final class C9989g extends Lambda implements Function1<List<? extends Area>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ List<WireRiderMapZone> f46616g;

        /* renamed from: h */
        public final /* synthetic */ C9979Yn f46617h;

        /* renamed from: i */
        public final /* synthetic */ Map<String, WireZoneRegion> f46618i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9989g(List<WireRiderMapZone> list, C9979Yn c9979Yn, Map<String, WireZoneRegion> map) {
            super(1);
            this.f46616g = list;
            this.f46617h = c9979Yn;
            this.f46618i = map;
        }

        /* renamed from: c */
        public static final Unit m74232c(List areas, List zoneList, C9979Yn this$0, Map map) {
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            Intrinsics.checkNotNullParameter(areas, "$areas");
            Intrinsics.checkNotNullParameter(zoneList, "$zoneList");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            List list = areas;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (Object obj : list) {
                linkedHashMap.put(((Area) obj).getId(), obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = zoneList.iterator();
            while (it.hasNext()) {
                WireRiderMapZone wireRiderMapZone = (WireRiderMapZone) it.next();
                Area area = (Area) linkedHashMap.get(wireRiderMapZone.getId());
                Area area2 = null;
                if (area == null) {
                    if (map != null && ((WireZoneRegion) map.get(wireRiderMapZone.getId())) != null) {
                        area = r8.copy((r75 & 1) != 0 ? r8.f66669id : wireRiderMapZone.getId(), (r75 & 2) != 0 ? r8.title : null, (r75 & 4) != 0 ? r8.label : null, (r75 & 8) != 0 ? r8.notes : null, (r75 & 16) != 0 ? r8.hideBirds : false, (r75 & 32) != 0 ? r8.rejectDrops : false, (r75 & 64) != 0 ? r8.noRides : false, (r75 & 128) != 0 ? r8.noParking : false, (r75 & 256) != 0 ? r8.preferredParking : false, (r75 & 512) != 0 ? r8.delivery : false, (r75 & 1024) != 0 ? r8.isReleaseConstrained : false, (r75 & 2048) != 0 ? r8.isDemandArea : false, (r75 & 4096) != 0 ? r8.feeModified : null, (r75 & 8192) != 0 ? r8.demandLevel : null, (r75 & 16384) != 0 ? r8.overlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r8.overlayIcon : null, (r75 & 65536) != 0 ? r8.overlayMinZoomLevel : null, (r75 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r8.selectedOverlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r8.region : null, (r75 & 524288) != 0 ? r8.color : 0, (r75 & 1048576) != 0 ? r8.colorDark : null, (r75 & 2097152) != 0 ? r8.borderColor : 0, (r75 & 4194304) != 0 ? r8.borderColorDark : null, (r75 & 8388608) != 0 ? r8.titleColor : 0, (r75 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r8.titleColorDark : null, (r75 & 33554432) != 0 ? r8.zoomBehavior : null, (r75 & 67108864) != 0 ? r8.operational : false, (r75 & 134217728) != 0 ? r8.maxSpeed : null, (r75 & 268435456) != 0 ? r8.releaseCapacity : null, (r75 & 536870912) != 0 ? r8.noParkingFineAlertTitle : null, (r75 & 1073741824) != 0 ? r8.noParkingFineAlertMessage : null, (r75 & Integer.MIN_VALUE) != 0 ? r8.riderBarInRideMessageTitle : null, (r76 & 1) != 0 ? r8.riderBarInRideMessageBody : null, (r76 & 2) != 0 ? r8.riderBarNotInRideMessageTitle : null, (r76 & 4) != 0 ? r8.riderBarNotInRideMessageBody : null, (r76 & 8) != 0 ? r8.riderBarInRideMessageIconType : null, (r76 & 16) != 0 ? r8.riderBarNotInRideMessageIconType : null, (r76 & 32) != 0 ? r8.areaReleaseCapacityIconType : null, (r76 & 64) != 0 ? r8.partnerId : null, (r76 & 128) != 0 ? r8.fleetIds : null, (r76 & 256) != 0 ? r8.areaKeys : null, (r76 & 512) != 0 ? r8.isUniversalArea : false, (r76 & 1024) != 0 ? r8.noParkingFineCurrency : null, (r76 & 2048) != 0 ? r8.noParkingWarningAlertTitle : null, (r76 & 4096) != 0 ? r8.noParkingWarningAlertBody : null, (r76 & 8192) != 0 ? r8.noParkingFineAmount : null, (r76 & 16384) != 0 ? r8.areasMerged : null, (r76 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r8.centerPoint : null, (r76 & 65536) != 0 ? r8.role : MapMode.RIDER.name(), (r76 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r8.updatedAt : null, (r76 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r8.zoneId : null, (r76 & 524288) != 0 ? AreaKt.getTEST_AREA().walkway : null);
                    } else {
                        area = null;
                    }
                }
                if (area != null) {
                    area2 = this$0.m74249e2(area, wireRiderMapZone, map);
                }
                if (area2 != null) {
                    arrayList.add(area2);
                }
            }
            AbstractC9490Xm abstractC9490Xm = this$0.f46599a;
            Area[] areaArr = (Area[]) arrayList.toArray(new Area[0]);
            abstractC9490Xm.mo74301l((Area[]) Arrays.copyOf(areaArr, areaArr.length));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final List<Area> areas) {
            Intrinsics.checkNotNullParameter(areas, "areas");
            final List<WireRiderMapZone> list = this.f46616g;
            final C9979Yn c9979Yn = this.f46617h;
            final Map<String, WireZoneRegion> map = this.f46618i;
            return AbstractC23461c.m33078H(new Callable() { // from class: co
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m74232c;
                    m74232c = C9979Yn.C9989g.m74232c(areas, list, c9979Yn, map);
                    return m74232c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "count", "Lna4;", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Integer;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$streamAreas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1549#2:254\n1620#2,3:255\n37#3,2:258\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$streamAreas$1\n*L\n211#1:254\n211#1:255,3\n213#1:258,2\n*E\n"})
    /* renamed from: Yn$h */
    /* loaded from: classes4.dex */
    public static final class C9990h extends Lambda implements Function1<Integer, InterfaceC45761na4<? extends List<? extends Area>>> {

        /* renamed from: h */
        public final /* synthetic */ String f46620h;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "areaArray", "", "Lco/bird/android/model/persistence/Area;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$streamAreas$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,253:1\n10242#2:254\n10664#2,5:255\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$streamAreas$1$2\n*L\n215#1:254\n215#1:255,5\n*E\n"})
        /* renamed from: Yn$h$a */
        /* loaded from: classes4.dex */
        public static final class C9991a extends Lambda implements Function1<Object[], List<? extends Area>> {

            /* renamed from: g */
            public static final C9991a f46621g = new C9991a();

            public C9991a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Area> invoke(Object[] areaArray) {
                Intrinsics.checkNotNullParameter(areaArray, "areaArray");
                ArrayList arrayList = new ArrayList();
                for (Object obj : areaArray) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<co.bird.android.model.persistence.Area>");
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, (List) obj);
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9990h(String str) {
            super(1);
            this.f46620h = str;
        }

        /* renamed from: c */
        public static final List m74229c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<? extends List<Area>> invoke(Integer count) {
            IntRange until;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(count, "count");
            until = RangesKt___RangesKt.until(0, (int) Math.ceil(count.intValue() / 100.0d));
            C9979Yn c9979Yn = C9979Yn.this;
            String str = this.f46620h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(c9979Yn.f46599a.mo74312a(str, ((IntIterator) it).nextInt() * 100));
            }
            final C9991a c9991a = C9991a.f46621g;
            return AbstractC24490k.m32130m((InterfaceC45761na4[]) arrayList.toArray(new AbstractC24490k[0]), new InterfaceC23492o() { // from class: do
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m74229c;
                    m74229c = C9979Yn.C9990h.m74229c(Function1.this, obj);
                    return m74229c;
                }
            });
        }
    }

    public C9979Yn(AbstractC9490Xm areaDao, InterfaceC36152Tk3 operatorClient, InterfaceC8601VK birdClient, DB1 geocachedDataClient, InterfaceC51919xx4 rentalClient, C22454gl preference) {
        Intrinsics.checkNotNullParameter(areaDao, "areaDao");
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(geocachedDataClient, "geocachedDataClient");
        Intrinsics.checkNotNullParameter(rentalClient, "rentalClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f46599a = areaDao;
        this.f46600b = operatorClient;
        this.f46601c = birdClient;
        this.f46602d = geocachedDataClient;
        this.f46603e = rentalClient;
        this.f46604f = preference;
    }

    /* renamed from: T1 */
    public static final List m74261T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final InterfaceC23496h m74260U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final InterfaceC23447K m74259V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final InterfaceC23496h m74258W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final List m74257X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final InterfaceC23496h m74256Y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: a2 */
    public static final InterfaceC23496h m74254a2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: b2 */
    public static final InterfaceC45761na4 m74253b2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: d2 */
    public static final Unit m74250d2(C9979Yn this$0, List areas) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(areas, "$areas");
        AbstractC9490Xm abstractC9490Xm = this$0.f46599a;
        Area[] areaArr = (Area[]) areas.toArray(new Area[0]);
        abstractC9490Xm.mo74301l((Area[]) Arrays.copyOf(areaArr, areaArr.length));
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC6137On
    /* renamed from: G1 */
    public AbstractC23461c mo74274G1(Location location, double d, OperatorMapFilterBundle filters, List<Geolocation> viewport) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        InterfaceC36152Tk3 interfaceC36152Tk3 = this.f46600b;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        WireOperatorMapFilterBundle m17958i = C47311qB0.m17958i(filters);
        OperatorMapKind operatorMapKind = OperatorMapKind.AREA;
        List<Geolocation> list = viewport;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Geolocation geolocation : list) {
            arrayList.add(C47311qB0.m17960g(geolocation));
        }
        AbstractC23442F<OperatorMapResponse> m83017z = interfaceC36152Tk3.m83017z(new OperatorMapRequest(latitude, longitude, d, operatorMapKind, m17958i, null, null, arrayList, 96, null));
        final C9988f c9988f = new C9988f();
        AbstractC23461c m33164B = m83017z.m33164B(new InterfaceC23492o() { // from class: Tn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74256Y1;
                m74256Y1 = C9979Yn.m74256Y1(Function1.this, obj);
                return m74256Y1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchServer…ainedAreaIds)\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC6137On
    /* renamed from: I0 */
    public AbstractC23442F<List<Area>> mo74273I0(Location location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<LongTermRentalMap> m4381f = this.f46603e.m4381f(location.getLatitude(), location.getLongitude(), d);
        final C9987e c9987e = C9987e.f46614g;
        AbstractC23442F m33157I = m4381f.m33157I(new InterfaceC23492o() { // from class: Xn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m74257X1;
                m74257X1 = C9979Yn.m74257X1(Function1.this, obj);
                return m74257X1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "rentalClient.getMap(\n   …tence(\"rental\") }\n      }");
        return m33157I;
    }

    @Override // p000.InterfaceC6137On
    /* renamed from: R0 */
    public AbstractC23461c mo74264R0(Location location, double d, MapMode mapMode, boolean z) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        Observable<List<WireArea>> m79976I = this.f46601c.m79976I(location.getLatitude(), location.getLongitude(), d, z);
        final C9980a c9980a = new C9980a(mapMode);
        Observable<R> map = m79976I.map(new InterfaceC23492o() { // from class: Rn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m74261T1;
                m74261T1 = C9979Yn.m74261T1(Function1.this, obj);
                return m74261T1;
            }
        });
        final C9982b c9982b = new C9982b(mapMode);
        AbstractC23461c flatMapCompletable = map.flatMapCompletable(new InterfaceC23492o() { // from class: Sn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74260U1;
                m74260U1 = C9979Yn.m74260U1(Function1.this, obj);
                return m74260U1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun fetchAreas(…ainedAreaIds)\n      }\n  }");
        return flatMapCompletable;
    }

    /* renamed from: S1 */
    public <T> AbstractC24490k<T> m74262S1(AbstractC24490k<T> abstractC24490k) {
        return InterfaceC6137On.C6138a.m91445a(this, abstractC24490k);
    }

    /* renamed from: Z1 */
    public final AbstractC23461c m74255Z1(List<WireRiderMapZone> list, Map<String, WireZoneRegion> map) {
        int collectionSizeOrDefault;
        List<WireRiderMapZone> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireRiderMapZone wireRiderMapZone : list2) {
            arrayList.add(wireRiderMapZone.getId());
        }
        AbstractC23442F<List<Area>> mo74311b = this.f46599a.mo74311b(arrayList);
        final C9989g c9989g = new C9989g(list, this, map);
        AbstractC23461c m33065U = mo74311b.m33164B(new InterfaceC23492o() { // from class: Pn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74254a2;
                m74254a2 = C9979Yn.m74254a2(Function1.this, obj);
                return m74254a2;
            }
        }).m33065U(1L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "private fun processRespo…    }\n      .retry(1)\n  }");
        return m33065U;
    }

    /* renamed from: c2 */
    public final AbstractC23461c m74252c2(String str, final List<Area> list, List<String> list2) {
        AbstractC23461c mo74309d;
        List listOf;
        if (list2.size() <= 999) {
            mo74309d = this.f46599a.mo74304i(str, list2);
        } else {
            mo74309d = this.f46599a.mo74309d(str);
        }
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: Qn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m74250d2;
                m74250d2 = C9979Yn.m74250d2(C9979Yn.this, list);
                return m74250d2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable { areaDao.u…(*areas.toTypedArray()) }");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{mo74309d, m33078H});
        AbstractC23461c m33063X = AbstractC23461c.m33037r(listOf).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "concat(listOf(\n      tri…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f46599a.mo74310c();
    }

    @Override // p000.InterfaceC6137On
    /* renamed from: d1 */
    public AbstractC23442F<Integer> mo74251d1(MapMode mapMode, DateTime before) {
        String m42542a;
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        Intrinsics.checkNotNullParameter(before, "before");
        AbstractC9490Xm abstractC9490Xm = this.f46599a;
        m42542a = C20102eo.m42542a(this.f46604f, mapMode);
        return abstractC9490Xm.mo74303j(m42542a, before);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r0 == null) goto L94;
     */
    /* renamed from: e2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Area m74249e2(Area area, WireRiderMapZone wireRiderMapZone, Map<String, WireZoneRegion> map) {
        Polygon region;
        ZoomBehavior zoomBehavior;
        Integer colorDark;
        Integer titleColorDark;
        Integer borderColorDark;
        Area copy;
        WireRiderMapZoneColor borderColor;
        WireRiderMapZoneColor titleColor;
        WireRiderMapZoneColor fillColor;
        WireRiderMapZoneColor borderColor2;
        Integer lightMode;
        WireRiderMapZoneColor titleColor2;
        Integer lightMode2;
        WireRiderMapZoneColor fillColor2;
        Integer lightMode3;
        String id = wireRiderMapZone.getId();
        String title = wireRiderMapZone.getTitle();
        String id2 = wireRiderMapZone.getId();
        if (map != null) {
            WireZoneRegion wireZoneRegion = map.get(wireRiderMapZone.getId());
            region = wireZoneRegion != null ? wireZoneRegion.getRegion() : null;
        }
        region = area.getRegion();
        Polygon polygon = region;
        String label = wireRiderMapZone.getLabel();
        String notes = wireRiderMapZone.getNotes();
        String zoomBehavior2 = wireRiderMapZone.getZoomBehavior();
        if (zoomBehavior2 != null) {
            try {
                String upperCase = zoomBehavior2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                zoomBehavior = ZoomBehavior.valueOf(upperCase);
            } catch (Exception unused) {
                zoomBehavior = ZoomBehavior.ALWAYS_HIDDEN;
            }
        }
        zoomBehavior = ZoomBehavior.ALWAYS_VISIBLE;
        ZoomBehavior zoomBehavior3 = zoomBehavior;
        WireRiderMapZoneColors colors = wireRiderMapZone.getColors();
        int intValue = (colors == null || (fillColor2 = colors.getFillColor()) == null || (lightMode3 = fillColor2.getLightMode()) == null) ? 0 : lightMode3.intValue();
        WireRiderMapZoneColors colors2 = wireRiderMapZone.getColors();
        int intValue2 = (colors2 == null || (titleColor2 = colors2.getTitleColor()) == null || (lightMode2 = titleColor2.getLightMode()) == null) ? 0 : lightMode2.intValue();
        WireRiderMapZoneColors colors3 = wireRiderMapZone.getColors();
        int intValue3 = (colors3 == null || (borderColor2 = colors3.getBorderColor()) == null || (lightMode = borderColor2.getLightMode()) == null) ? 0 : lightMode.intValue();
        WireRiderMapZoneColors colors4 = wireRiderMapZone.getColors();
        if (colors4 == null || (fillColor = colors4.getFillColor()) == null || (colorDark = fillColor.getDarkMode()) == null) {
            colorDark = area.getColorDark();
        }
        Integer num = colorDark;
        WireRiderMapZoneColors colors5 = wireRiderMapZone.getColors();
        if (colors5 == null || (titleColor = colors5.getTitleColor()) == null || (titleColorDark = titleColor.getDarkMode()) == null) {
            titleColorDark = area.getTitleColorDark();
        }
        Integer num2 = titleColorDark;
        WireRiderMapZoneColors colors6 = wireRiderMapZone.getColors();
        if (colors6 == null || (borderColor = colors6.getBorderColor()) == null || (borderColorDark = borderColor.getDarkMode()) == null) {
            borderColorDark = area.getBorderColorDark();
        }
        Integer num3 = borderColorDark;
        Integer maxSpeed = wireRiderMapZone.getMaxSpeed();
        String noParkingFineAlertTitle = wireRiderMapZone.getNoParkingFineAlertTitle();
        String noParkingFineAlertMessage = wireRiderMapZone.getNoParkingFineAlertMessage();
        Integer noParkingFineAmount = wireRiderMapZone.getNoParkingFineAmount();
        String noParkingFineCurrency = wireRiderMapZone.getNoParkingFineCurrency();
        String riderBarInRideMessageTitle = wireRiderMapZone.getRiderBarInRideMessageTitle();
        String riderBarInRideMessageBody = wireRiderMapZone.getRiderBarInRideMessageBody();
        AreaIconType riderBarInRideMessageIconType = wireRiderMapZone.getRiderBarInRideMessageIconType();
        if (riderBarInRideMessageIconType == null) {
            riderBarInRideMessageIconType = AreaIconType.UNKNOWN;
        }
        AreaIconType areaIconType = riderBarInRideMessageIconType;
        String riderBarNotInRideMessageTitle = wireRiderMapZone.getRiderBarNotInRideMessageTitle();
        String riderBarNotInRideMessageBody = wireRiderMapZone.getRiderBarNotInRideMessageBody();
        AreaIconType riderBarNotInRideMessageIconType = wireRiderMapZone.getRiderBarNotInRideMessageIconType();
        if (riderBarNotInRideMessageIconType == null) {
            riderBarNotInRideMessageIconType = AreaIconType.UNKNOWN;
        }
        AreaIconType areaIconType2 = riderBarNotInRideMessageIconType;
        String partnerId = wireRiderMapZone.getPartnerId();
        List<String> areasMerged = wireRiderMapZone.getAreasMerged();
        List<String> areaKeys = wireRiderMapZone.getAreaKeys();
        WireLocation centerPoint = wireRiderMapZone.getCenterPoint();
        Geolocation m17966a = centerPoint != null ? C47311qB0.m17966a(centerPoint) : null;
        DateTime now = DateTime.now();
        List<RiderMapZoneKind> mapZoneKinds = wireRiderMapZone.getMapZoneKinds();
        boolean contains = mapZoneKinds != null ? mapZoneKinds.contains(RiderMapZoneKind.PREFERRED_PARKING) : area.getPreferredParking();
        List<RiderMapZoneKind> mapZoneKinds2 = wireRiderMapZone.getMapZoneKinds();
        boolean contains2 = mapZoneKinds2 != null ? mapZoneKinds2.contains(RiderMapZoneKind.NO_RIDES) : area.getNoRides();
        List<RiderMapZoneKind> mapZoneKinds3 = wireRiderMapZone.getMapZoneKinds();
        boolean contains3 = mapZoneKinds3 != null ? mapZoneKinds3.contains(RiderMapZoneKind.NO_PARKING) : area.getNoParking();
        List<RiderMapZoneKind> mapZoneKinds4 = wireRiderMapZone.getMapZoneKinds();
        boolean contains4 = mapZoneKinds4 != null ? mapZoneKinds4.contains(RiderMapZoneKind.OPERATIONAL) : area.getOperational();
        List<RiderMapZoneKind> mapZoneKinds5 = wireRiderMapZone.getMapZoneKinds();
        Boolean valueOf = mapZoneKinds5 != null ? Boolean.valueOf(mapZoneKinds5.contains(RiderMapZoneKind.WALKWAY)) : area.getWalkway();
        String name = MapMode.RIDER.name();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        copy = area.copy((r75 & 1) != 0 ? area.f66669id : id, (r75 & 2) != 0 ? area.title : title, (r75 & 4) != 0 ? area.label : label, (r75 & 8) != 0 ? area.notes : notes, (r75 & 16) != 0 ? area.hideBirds : false, (r75 & 32) != 0 ? area.rejectDrops : false, (r75 & 64) != 0 ? area.noRides : contains2, (r75 & 128) != 0 ? area.noParking : contains3, (r75 & 256) != 0 ? area.preferredParking : contains, (r75 & 512) != 0 ? area.delivery : false, (r75 & 1024) != 0 ? area.isReleaseConstrained : false, (r75 & 2048) != 0 ? area.isDemandArea : false, (r75 & 4096) != 0 ? area.feeModified : null, (r75 & 8192) != 0 ? area.demandLevel : null, (r75 & 16384) != 0 ? area.overlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? area.overlayIcon : null, (r75 & 65536) != 0 ? area.overlayMinZoomLevel : null, (r75 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? area.selectedOverlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? area.region : polygon, (r75 & 524288) != 0 ? area.color : intValue, (r75 & 1048576) != 0 ? area.colorDark : num, (r75 & 2097152) != 0 ? area.borderColor : intValue3, (r75 & 4194304) != 0 ? area.borderColorDark : num3, (r75 & 8388608) != 0 ? area.titleColor : intValue2, (r75 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? area.titleColorDark : num2, (r75 & 33554432) != 0 ? area.zoomBehavior : zoomBehavior3, (r75 & 67108864) != 0 ? area.operational : contains4, (r75 & 134217728) != 0 ? area.maxSpeed : maxSpeed, (r75 & 268435456) != 0 ? area.releaseCapacity : null, (r75 & 536870912) != 0 ? area.noParkingFineAlertTitle : null, (r75 & 1073741824) != 0 ? area.noParkingFineAlertMessage : null, (r75 & Integer.MIN_VALUE) != 0 ? area.riderBarInRideMessageTitle : riderBarInRideMessageTitle, (r76 & 1) != 0 ? area.riderBarInRideMessageBody : riderBarInRideMessageBody, (r76 & 2) != 0 ? area.riderBarNotInRideMessageTitle : riderBarNotInRideMessageTitle, (r76 & 4) != 0 ? area.riderBarNotInRideMessageBody : riderBarNotInRideMessageBody, (r76 & 8) != 0 ? area.riderBarInRideMessageIconType : areaIconType, (r76 & 16) != 0 ? area.riderBarNotInRideMessageIconType : areaIconType2, (r76 & 32) != 0 ? area.areaReleaseCapacityIconType : null, (r76 & 64) != 0 ? area.partnerId : partnerId, (r76 & 128) != 0 ? area.fleetIds : null, (r76 & 256) != 0 ? area.areaKeys : areaKeys, (r76 & 512) != 0 ? area.isUniversalArea : false, (r76 & 1024) != 0 ? area.noParkingFineCurrency : noParkingFineCurrency, (r76 & 2048) != 0 ? area.noParkingWarningAlertTitle : noParkingFineAlertTitle, (r76 & 4096) != 0 ? area.noParkingWarningAlertBody : noParkingFineAlertMessage, (r76 & 8192) != 0 ? area.noParkingFineAmount : noParkingFineAmount, (r76 & 16384) != 0 ? area.areasMerged : areasMerged, (r76 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? area.centerPoint : m17966a, (r76 & 65536) != 0 ? area.role : name, (r76 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? area.updatedAt : now, (r76 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? area.zoneId : id2, (r76 & 524288) != 0 ? area.walkway : valueOf);
        return copy;
    }

    @Override // p000.InterfaceC6137On
    /* renamed from: r1 */
    public AbstractC23461c mo74248r1(Location center, Set<String> cellIds, MapMode mapMode) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(cellIds, "cellIds");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        DB1 db1 = this.f46602d;
        String provider = center.getProvider();
        if (provider == null) {
            provider = WireLocation.DEFAULT_SOURCE;
        }
        AbstractC23442F<WireRiderZoneCellsResponse> m110791b = db1.m110791b(new WireRiderZoneCellsRequest(WireLocationKt.toLocation(center, provider), cellIds));
        final C9983c c9983c = new C9983c(mapMode);
        AbstractC23442F<R> m33165A = m110791b.m33165A(new InterfaceC23492o() { // from class: Vn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74259V1;
                m74259V1 = C9979Yn.m74259V1(Function1.this, obj);
                return m74259V1;
            }
        });
        final C9985d c9985d = new C9985d();
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: Wn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74258W1;
                m74258W1 = C9979Yn.m74258W1(Function1.this, obj);
                return m74258W1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchAreas(… })\n        }\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC6137On
    /* renamed from: z1 */
    public AbstractC24490k<List<Area>> mo74247z1(String role) {
        Intrinsics.checkNotNullParameter(role, "role");
        AbstractC24490k<Integer> mo74308e = this.f46599a.mo74308e(role);
        final C9990h c9990h = new C9990h(role);
        InterfaceC45761na4 m32157b1 = mo74308e.m32157b1(new InterfaceC23492o() { // from class: Un
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m74253b2;
                m74253b2 = C9979Yn.m74253b2(Function1.this, obj);
                return m74253b2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32157b1, "override fun streamAreas…      .clearOnError()\n  }");
        return m74262S1(m32157b1);
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireRiderZoneCellsResponse;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n3190#2,10:254\n1549#2:264\n1620#2,3:265\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$4\n*L\n83#1:254,10\n95#1:264\n95#1:265,3\n*E\n"})
    /* renamed from: Yn$d */
    /* loaded from: classes4.dex */
    public static final class C9985d extends Lambda implements Function1<Pair<? extends WireRiderZoneCellsResponse, ? extends List<? extends String>>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ZoneRegionResponse;", "wireGeoZoneList", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ZoneRegionResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAreaRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$4$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1194#2,2:254\n1222#2,4:256\n*S KotlinDebug\n*F\n+ 1 AreaRepositoryImpl.kt\nco/bird/android/repository/area/AreaRepositoryImpl$fetchAreas$4$2$2\n*L\n99#1:254,2\n99#1:256,4\n*E\n"})
        /* renamed from: Yn$d$a */
        /* loaded from: classes4.dex */
        public static final class C9986a extends Lambda implements Function1<ZoneRegionResponse, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C9979Yn f46612g;

            /* renamed from: h */
            public final /* synthetic */ List<WireRiderMapZone> f46613h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9986a(C9979Yn c9979Yn, List<WireRiderMapZone> list) {
                super(1);
                this.f46612g = c9979Yn;
                this.f46613h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(ZoneRegionResponse wireGeoZoneList) {
                int collectionSizeOrDefault;
                int mapCapacity;
                int coerceAtLeast;
                Intrinsics.checkNotNullParameter(wireGeoZoneList, "wireGeoZoneList");
                List<WireZoneRegion> zoneRegions = wireGeoZoneList.getZoneRegions();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(zoneRegions, 10);
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
                for (Object obj : zoneRegions) {
                    linkedHashMap.put(((WireZoneRegion) obj).getZoneId(), obj);
                }
                return this.f46612g.m74255Z1(this.f46613h, linkedHashMap);
            }
        }

        public C9985d() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m74239c(C9979Yn this$0, List zonesProcessLater) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(zonesProcessLater, "$zonesProcessLater");
            InterfaceC8601VK interfaceC8601VK = this$0.f46601c;
            List<WireRiderMapZone> list = zonesProcessLater;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireRiderMapZone wireRiderMapZone : list) {
                arrayList.add(wireRiderMapZone.getId());
            }
            AbstractC23442F<ZoneRegionResponse> m79971N = interfaceC8601VK.m79971N(new ZoneRegionRequest(arrayList, null, 2, null));
            final C9986a c9986a = new C9986a(this$0, zonesProcessLater);
            return m79971N.m33164B(new InterfaceC23492o() { // from class: bo
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m74238d;
                    m74238d = C9979Yn.C9985d.m74238d(Function1.this, obj);
                    return m74238d;
                }
            });
        }

        /* renamed from: d */
        public static final InterfaceC23496h m74238d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<WireRiderZoneCellsResponse, ? extends List<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<String> component2 = pair.component2();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : pair.component1().getZones()) {
                if (component2.contains(((WireRiderMapZone) obj).getId())) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair2 = new Pair(arrayList, arrayList2);
            final List list = (List) pair2.component2();
            AbstractC23461c m74255Z1 = C9979Yn.this.m74255Z1((List) pair2.component1(), null);
            if (list.isEmpty()) {
                return m74255Z1;
            }
            final C9979Yn c9979Yn = C9979Yn.this;
            return m74255Z1.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: ao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m74239c;
                    m74239c = C9979Yn.C9985d.m74239c(C9979Yn.this, list);
                    return m74239c;
                }
            }));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends WireRiderZoneCellsResponse, ? extends List<? extends String>> pair) {
            return invoke2((Pair<WireRiderZoneCellsResponse, ? extends List<String>>) pair);
        }
    }
}
