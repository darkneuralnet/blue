package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LinearRing;
import co.bird.android.model.Point;
import co.bird.android.model.persistence.ZoneData;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.ZoneRegion;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\tH'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u000bH'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u000bH'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0010\u001a\u00020\u0003H'J \u0010\u0016\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H'J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H'J\u0016\u0010\u0019\u001a\u00020\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H'J\b\u0010\u001a\u001a\u00020\u0015H'J\b\u0010\u001b\u001a\u00020\u0015H'J)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0002\"\u00020\u001cH%¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00182\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0002\"\u00020\u001cH%¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0002\"\u00020\u0006H%¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u00020\u00182\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0002\"\u00020\u0006H%¢\u0006\u0004\b'\u0010(J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H%J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H%J#\u0010,\u001a\u00020\u00182\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0002\"\u00020\u001cH\u0017¢\u0006\u0004\b,\u0010\"J#\u0010-\u001a\u00020\u00182\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0002\"\u00020\u0006H\u0017¢\u0006\u0004\b-\u0010(J$\u00100\u001a\u00020\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0005H\u0017¨\u00063"}, m28432d2 = {"LCI6;", "", "", "", "zoneIds", "", "Lco/bird/android/model/persistence/ZoneRegion;", "f", "([Ljava/lang/String;)Ljava/util/List;", "Lio/reactivex/F;", "q", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/ZonePolygonable;", "s", "Lco/bird/android/model/persistence/ZoneMarker;", "r", "zoneId", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "c", "Lorg/joda/time/DateTime;", "date", "Lio/reactivex/c;", "h", "i", "", "g", C17296a.f69688o, "b", "Lco/bird/android/model/persistence/ZoneData;", "zoneData", "", DateTokenConverter.CONVERTER_KEY, "([Lco/bird/android/model/persistence/ZoneData;)Ljava/util/List;", "k", "([Lco/bird/android/model/persistence/ZoneData;)V", "zoneRegion", "e", "([Lco/bird/android/model/persistence/ZoneRegion;)Ljava/util/List;", "zoneRegions", "l", "([Lco/bird/android/model/persistence/ZoneRegion;)V", "rowIds", "o", "p", "m", "n", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "j", "<init>", "()V", "co.bird.android.lib.persistence.zone.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneDao.kt\nco/bird/android/persistence/zone/api/ZoneDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1855#2,2:161\n766#2:165\n857#2:166\n858#2:169\n1549#2:170\n1620#2,3:171\n37#3,2:163\n12744#4,2:167\n1#5:174\n*S KotlinDebug\n*F\n+ 1 ZoneDao.kt\nco/bird/android/persistence/zone/api/ZoneDao\n*L\n137#1:161,2\n148#1:165\n148#1:166\n148#1:169\n151#1:170\n151#1:171,3\n145#1:163,2\n149#1:167,2\n*E\n"})
/* renamed from: CI6 */
/* loaded from: classes4.dex */
public abstract class CI6 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "chunkedZones", "", "Lco/bird/android/model/persistence/ZoneData;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nZoneDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneDao.kt\nco/bird/android/persistence/zone/api/ZoneDao$upsertZoneData$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n37#2,2:161\n37#2,2:166\n819#3:163\n847#3,2:164\n*S KotlinDebug\n*F\n+ 1 ZoneDao.kt\nco/bird/android/persistence/zone/api/ZoneDao$upsertZoneData$1\n*L\n109#1:161,2\n112#1:166,2\n111#1:163\n111#1:164,2\n*E\n"})
    /* renamed from: CI6$a */
    /* loaded from: classes4.dex */
    public static final class C1010a extends Lambda implements Function1<List<? extends ZoneData>, Unit> {
        public C1010a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ZoneData> list) {
            invoke2((List<ZoneData>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ZoneData> chunkedZones) {
            Intrinsics.checkNotNullParameter(chunkedZones, "chunkedZones");
            CI6 ci6 = CI6.this;
            ZoneData[] zoneDataArr = (ZoneData[]) chunkedZones.toArray(new ZoneData[0]);
            List<String> mo109212o = CI6.this.mo109212o(ci6.mo109223d((ZoneData[]) Arrays.copyOf(zoneDataArr, zoneDataArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : chunkedZones) {
                if (!mo109212o.contains(((ZoneData) obj).getZoneId())) {
                    arrayList.add(obj);
                }
            }
            CI6 ci62 = CI6.this;
            ZoneData[] zoneDataArr2 = (ZoneData[]) arrayList.toArray(new ZoneData[0]);
            ci62.mo109216k((ZoneData[]) Arrays.copyOf(zoneDataArr2, zoneDataArr2.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "chunkedZones", "", "Lco/bird/android/model/persistence/ZoneRegion;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nZoneDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneDao.kt\nco/bird/android/persistence/zone/api/ZoneDao$upsertZoneRegions$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n37#2,2:161\n37#2,2:166\n819#3:163\n847#3,2:164\n*S KotlinDebug\n*F\n+ 1 ZoneDao.kt\nco/bird/android/persistence/zone/api/ZoneDao$upsertZoneRegions$1\n*L\n119#1:161,2\n122#1:166,2\n121#1:163\n121#1:164,2\n*E\n"})
    /* renamed from: CI6$b */
    /* loaded from: classes4.dex */
    public static final class C1011b extends Lambda implements Function1<List<? extends ZoneRegion>, Unit> {
        public C1011b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ZoneRegion> list) {
            invoke2((List<ZoneRegion>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<ZoneRegion> chunkedZones) {
            Intrinsics.checkNotNullParameter(chunkedZones, "chunkedZones");
            CI6 ci6 = CI6.this;
            ZoneRegion[] zoneRegionArr = (ZoneRegion[]) chunkedZones.toArray(new ZoneRegion[0]);
            List<String> mo109211p = CI6.this.mo109211p(ci6.mo109222e((ZoneRegion[]) Arrays.copyOf(zoneRegionArr, zoneRegionArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : chunkedZones) {
                if (!mo109211p.contains(((ZoneRegion) obj).getZoneId())) {
                    arrayList.add(obj);
                }
            }
            CI6 ci62 = CI6.this;
            ZoneRegion[] zoneRegionArr2 = (ZoneRegion[]) arrayList.toArray(new ZoneRegion[0]);
            ci62.mo109215l((ZoneRegion[]) Arrays.copyOf(zoneRegionArr2, zoneRegionArr2.length));
        }
    }

    public static /* synthetic */ AbstractC23461c trimAnnotationsAndOverlays$default(CI6 ci6, List list, DateTime dateTime, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                dateTime = DateTime.now().minusMinutes(5);
                Intrinsics.checkNotNullExpressionValue(dateTime, "now().minusMinutes(5)");
            }
            return ci6.mo109219h(list, dateTime);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trimAnnotationsAndOverlays");
    }

    /* renamed from: a */
    public abstract AbstractC23461c mo109226a();

    /* renamed from: b */
    public abstract AbstractC23461c mo109225b();

    /* renamed from: c */
    public abstract AbstractC23442F<ZoneOverlayAnalytics> mo109224c(String str);

    /* renamed from: d */
    public abstract List<Long> mo109223d(ZoneData... zoneDataArr);

    /* renamed from: e */
    public abstract List<Long> mo109222e(ZoneRegion... zoneRegionArr);

    /* renamed from: f */
    public abstract List<ZoneRegion> mo109221f(String... strArr);

    /* renamed from: g */
    public abstract void mo109220g(List<String> list);

    /* renamed from: h */
    public abstract AbstractC23461c mo109219h(List<String> list, DateTime dateTime);

    /* renamed from: i */
    public abstract AbstractC23461c mo109218i(DateTime dateTime);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
        if (r3 == true) goto L37;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo109217j(List<String> zoneIds, List<Geolocation> viewport) {
        int collectionSizeOrDefault;
        boolean z;
        Point[] points;
        boolean z2;
        boolean m110597a;
        Intrinsics.checkNotNullParameter(zoneIds, "zoneIds");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        double d = -90.0d;
        double d2 = 90.0d;
        double d3 = -180.0d;
        double d4 = 180.0d;
        for (Geolocation geolocation : viewport) {
            if (geolocation.getLatitude() > d) {
                d = geolocation.getLatitude();
            }
            if (geolocation.getLatitude() < d2) {
                d2 = geolocation.getLatitude();
            }
            if (geolocation.getLongitude() > d3) {
                d3 = geolocation.getLongitude();
            }
            if (geolocation.getLongitude() < d4) {
                d4 = geolocation.getLongitude();
            }
        }
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(d2, d4), new LatLng(d, d3));
        String[] strArr = (String[]) zoneIds.toArray(new String[0]);
        ArrayList<ZoneRegion> arrayList = new ArrayList();
        for (Object obj : mo109221f((String[]) Arrays.copyOf(strArr, strArr.length))) {
            LinearRing ring = ((ZoneRegion) obj).getRegion().getRing(0);
            if (ring != null && (points = ring.getPoints()) != null) {
                Intrinsics.checkNotNullExpressionValue(points, "points");
                int length = points.length;
                int i = 0;
                while (true) {
                    z = true;
                    if (i < length) {
                        Point point = points[i];
                        Intrinsics.checkNotNullExpressionValue(point, "point");
                        m110597a = DI6.m110597a(latLngBounds, point);
                        if (m110597a) {
                            z2 = true;
                            break;
                        }
                        i++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (ZoneRegion zoneRegion : arrayList) {
            arrayList2.add(zoneRegion.getZoneId());
        }
        mo109220g(arrayList2);
    }

    /* renamed from: k */
    public abstract void mo109216k(ZoneData... zoneDataArr);

    /* renamed from: l */
    public abstract void mo109215l(ZoneRegion... zoneRegionArr);

    /* renamed from: m */
    public void mo109214m(ZoneData... zoneData) {
        List list;
        Intrinsics.checkNotNullParameter(zoneData, "zoneData");
        list = ArraysKt___ArraysKt.toList(zoneData);
        CollectionsKt___CollectionsKt.chunked(list, 999, new C1010a());
    }

    /* renamed from: n */
    public void mo109213n(ZoneRegion... zoneRegions) {
        List list;
        Intrinsics.checkNotNullParameter(zoneRegions, "zoneRegions");
        list = ArraysKt___ArraysKt.toList(zoneRegions);
        CollectionsKt___CollectionsKt.chunked(list, 999, new C1011b());
    }

    /* renamed from: o */
    public abstract List<String> mo109212o(List<Long> list);

    /* renamed from: p */
    public abstract List<String> mo109211p(List<Long> list);

    /* renamed from: q */
    public abstract AbstractC23442F<List<String>> mo109210q();

    /* renamed from: r */
    public abstract Observable<List<ZoneMarker>> mo109209r();

    /* renamed from: s */
    public abstract Observable<List<ZonePolygonable>> mo109208s();
}
