package p000;

import android.location.Location;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.Point;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28432d2 = {"", "Lco/bird/android/model/ParkingNest;", "Landroid/location/Location;", "location", "", "max", C17296a.f69688o, "(Ljava/util/List;Landroid/location/Location;Ljava/lang/Integer;)Ljava/util/List;", "Lkotlin/Function1;", "", "predicate", "b", "(Ljava/util/List;Landroid/location/Location;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)Ljava/util/List;", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingNest+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNest+.kt\nco/bird/android/library/extension/ParkingNest_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1045#2:29\n766#2:30\n857#2,2:31\n*S KotlinDebug\n*F\n+ 1 ParkingNest+.kt\nco/bird/android/library/extension/ParkingNest_Kt\n*L\n8#1:29\n25#1:30\n25#1:31,2\n*E\n"})
/* renamed from: oG3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46173oG3 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ParkingNest+.kt\nco/bird/android/library/extension/ParkingNest_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n9#2:329\n10#2,6:331\n1#3:330\n*E\n"})
    /* renamed from: oG3$a */
    /* loaded from: classes3.dex */
    public static final class C26893a<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Location f101712b;

        public C26893a(Location location) {
            this.f101712b = location;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            ParkingNest parkingNest = (ParkingNest) t;
            Location fromLocation = parkingNest.getLocation().fromLocation();
            Location location = null;
            if (!C39339cm2.m60888a(fromLocation)) {
                fromLocation = null;
            }
            if (fromLocation == null) {
                Point m100298a = JX3.m100298a(parkingNest.getShape());
                fromLocation = new Location("");
                fromLocation.setLatitude(m100298a.f66612y);
                fromLocation.setLongitude(m100298a.f66611x);
            }
            Float valueOf = Float.valueOf(fromLocation.distanceTo(this.f101712b));
            ParkingNest parkingNest2 = (ParkingNest) t2;
            Location fromLocation2 = parkingNest2.getLocation().fromLocation();
            if (C39339cm2.m60888a(fromLocation2)) {
                location = fromLocation2;
            }
            if (location == null) {
                Point m100298a2 = JX3.m100298a(parkingNest2.getShape());
                location = new Location("");
                location.setLatitude(m100298a2.f66612y);
                location.setLongitude(m100298a2.f66611x);
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(valueOf, Float.valueOf(location.distanceTo(this.f101712b)));
            return compareValues;
        }
    }

    /* renamed from: a */
    public static final List<ParkingNest> m21418a(List<ParkingNest> list, Location location, Integer num) {
        List sortedWith;
        int i;
        List<ParkingNest> take;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C26893a(location));
        List list2 = sortedWith;
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        take = CollectionsKt___CollectionsKt.take(list2, i);
        return take;
    }

    /* renamed from: b */
    public static final List<ParkingNest> m21417b(List<ParkingNest> list, Location location, Function1<? super ParkingNest, Boolean> predicate, Integer num) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (predicate.invoke((ParkingNest) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return m21418a(arrayList, location, num);
    }

    public static /* synthetic */ List sortClosestTo$default(List list, Location location, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return m21418a(list, location, num);
    }

    public static /* synthetic */ List sortClosestTo$default(List list, Location location, Function1 function1, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return m21417b(list, location, function1, num);
    }
}
