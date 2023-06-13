package p000;

import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideReport;
import co.bird.android.model.wire.WireRideReportItem;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, m28432d2 = {"Ls35;", "", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "", "LH6;", C17296a.f69688o, "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideReportConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportConverter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1559#2:29\n1590#2,4:30\n*S KotlinDebug\n*F\n+ 1 RideReportConverter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportConverter\n*L\n11#1:29\n11#1:30,4\n*E\n"})
/* renamed from: s35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48422s35 {
    /* renamed from: a */
    public final List<C3023H6> m14820a(WireRideDetail rideDetail) {
        List list;
        List<C3023H6> listOf;
        List<WireRideReportItem> items;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
        WireRideReport report = rideDetail.getReport();
        if (report != null && (items = report.getItems()) != null) {
            List<WireRideReportItem> list2 = items;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new C2637G6(TuplesKt.m28425to(Integer.valueOf(i), (WireRideReportItem) obj), C32868Fj4.item_ride_report_item, false, 4, null));
                i = i2;
            }
            list = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        } else {
            list = null;
        }
        C2637G6 c2637g6 = new C2637G6(rideDetail, C32868Fj4.item_ride_report_summary, false, 4, null);
        if (list == null) {
            list = new ArrayList();
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(list, c2637g6, null, 4, null));
        return listOf;
    }
}
