package p000;

import android.content.Context;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.filter.KeyBasedAreasFilter;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\t*\u00020\u0000\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u000e\u001a\u00020\r\u001a1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/persistence/Area;)Ljava/lang/Integer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "e", "(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/Integer;", "c", "", "f", "b", "", "Lco/bird/android/model/filter/KeyBasedAreasFilter;", "keyBasedAreasFilter", C17296a.f69688o, "Landroid/location/Location;", "location", "max", "g", "(Ljava/util/List;Landroid/location/Location;Ljava/lang/Integer;)Ljava/util/List;", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArea+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Area+.kt\nco/bird/android/library/extension/Area_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1#2:98\n766#3:99\n857#3,2:100\n1855#3,2:102\n766#3:104\n857#3,2:105\n1045#3:107\n*S KotlinDebug\n*F\n+ 1 Area+.kt\nco/bird/android/library/extension/Area_Kt\n*L\n69#1:99\n69#1:100,2\n72#1:102,2\n82#1:104\n82#1:105,2\n86#1:107\n*E\n"})
/* renamed from: io */
/* loaded from: classes3.dex */
public final class C23356io {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: io$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C23357a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AreaIconType.values().length];
            try {
                iArr[AreaIconType.LOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AreaIconType.UP_ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AreaIconType.REBALANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Area+.kt\nco/bird/android/library/extension/Area_Kt\n*L\n1#1,328:1\n87#2,7:329\n*E\n"})
    /* renamed from: io$b */
    /* loaded from: classes3.dex */
    public static final class C23358b<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Location f87880b;

        public C23358b(Location location) {
            this.f87880b = location;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Location location;
            Location location2;
            int compareValues;
            Area area = (Area) t;
            Geolocation centerPoint = area.getCenterPoint();
            if (centerPoint == null || (location = UB1.m81891a(centerPoint)) == null) {
                Point m100298a = JX3.m100298a(area.getRegion());
                location = new Location("");
                location.setLatitude(m100298a.f66612y);
                location.setLongitude(m100298a.f66611x);
            }
            Float valueOf = Float.valueOf(location.distanceTo(this.f87880b));
            Area area2 = (Area) t2;
            Geolocation centerPoint2 = area2.getCenterPoint();
            if (centerPoint2 == null || (location2 = UB1.m81891a(centerPoint2)) == null) {
                Point m100298a2 = JX3.m100298a(area2.getRegion());
                location2 = new Location("");
                location2.setLatitude(m100298a2.f66612y);
                location2.setLongitude(m100298a2.f66611x);
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(valueOf, Float.valueOf(location2.distanceTo(this.f87880b)));
            return compareValues;
        }
    }

    /* renamed from: a */
    public static final List<Area> m33481a(List<Area> list, KeyBasedAreasFilter keyBasedAreasFilter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(keyBasedAreasFilter, "keyBasedAreasFilter");
        ArrayList<Area> arrayList = new ArrayList();
        for (Object obj : list) {
            if (keyBasedAreasFilter.filter((Area) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Area area : arrayList) {
            List<String> areasMerged = area.getAreasMerged();
            if (areasMerged != null) {
                if (!keyBasedAreasFilter.getBirdSelected()) {
                    arrayList2.addAll(areasMerged);
                } else {
                    arrayList2.add(area.getId());
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!arrayList2.contains(((Area) obj2).getId())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* renamed from: b */
    public static final boolean m33480b(Area area) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(area, "<this>");
        String riderBarInRideMessageTitle = area.getRiderBarInRideMessageTitle();
        if (riderBarInRideMessageTitle != null && riderBarInRideMessageTitle.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String riderBarInRideMessageBody = area.getRiderBarInRideMessageBody();
            if (riderBarInRideMessageBody != null && riderBarInRideMessageBody.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                String riderBarNotInRideMessageTitle = area.getRiderBarNotInRideMessageTitle();
                if (riderBarNotInRideMessageTitle != null && riderBarNotInRideMessageTitle.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    String riderBarNotInRideMessageBody = area.getRiderBarNotInRideMessageBody();
                    if (riderBarNotInRideMessageBody != null && riderBarNotInRideMessageBody.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final Integer m33479c(Area area, Context context) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(area, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (area.isReleaseConstrained()) {
            return Integer.valueOf(area.getBorderColor());
        }
        int i = C23357a.$EnumSwitchMapping$0[area.getAreaReleaseCapacityIconType().ordinal()];
        if (i != 2 && i != 3) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(C32364Df4.birdMint);
        }
        if (valueOf == null) {
            return null;
        }
        valueOf.intValue();
        return Integer.valueOf(NA0.m94301c(context, valueOf.intValue()));
    }

    /* renamed from: d */
    public static final Integer m33478d(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.isReleaseConstrained()) {
            return C10854an.m70749b(area.getAreaReleaseCapacityIconType());
        }
        return null;
    }

    /* renamed from: e */
    public static final Integer m33477e(Area area, Context context) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(area, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!area.isReleaseConstrained()) {
            return null;
        }
        int i = C23357a.$EnumSwitchMapping$0[area.getAreaReleaseCapacityIconType().ordinal()];
        if (i != 1 && i != 2) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(C32364Df4.birdWhite);
        }
        if (valueOf == null) {
            return null;
        }
        valueOf.intValue();
        return Integer.valueOf(NA0.m94301c(context, valueOf.intValue()));
    }

    /* renamed from: f */
    public static final boolean m33476f(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        if (area.getMaxSpeed() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final List<Area> m33475g(List<Area> list, Location location, Integer num) {
        List sortedWith;
        int i;
        List<Area> take;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C23358b(location));
        List list2 = sortedWith;
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        take = CollectionsKt___CollectionsKt.take(list2, i);
        return take;
    }

    public static /* synthetic */ List sortClosestTo$default(List list, Location location, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return m33475g(list, location, num);
    }
}
