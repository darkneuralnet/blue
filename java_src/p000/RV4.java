package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.RidePassView;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\r"}, m28432d2 = {"LRV4;", "", "LBH1;", "headerData", "", "Lco/bird/android/model/persistence/RidePassView;", "ridePassViews", "Lio/reactivex/F;", "LH6;", "b", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV2Converter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Converter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2Converter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n1549#2:40\n1620#2,3:41\n*S KotlinDebug\n*F\n+ 1 RidePassV2Converter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2Converter\n*L\n31#1:36\n31#1:37,3\n21#1:40\n21#1:41,3\n*E\n"})
/* renamed from: RV4 */
/* loaded from: classes3.dex */
public final class RV4 {
    /* renamed from: c */
    public static final List m86683c(BH1 headerData, List ridePassViews) {
        List mutableListOf;
        int collectionSizeOrDefault;
        List mutableList;
        List mutableListOf2;
        Intrinsics.checkNotNullParameter(headerData, "$headerData");
        Intrinsics.checkNotNullParameter(ridePassViews, "$ridePassViews");
        C3023H6[] c3023h6Arr = new C3023H6[2];
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(headerData, C33102Gj4.view_ride_pass_v2_header, false, 4, null));
        c3023h6Arr[0] = new C3023H6(mutableListOf, null, null, 6, null);
        List<RidePassView> list = ridePassViews;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RidePassView ridePassView : list) {
            arrayList.add(new C2637G6(ridePassView, C33102Gj4.view_ride_pass_v2_card, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        c3023h6Arr[1] = new C3023H6(mutableList, null, null, 6, null);
        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(c3023h6Arr);
        return mutableListOf2;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m86684b(final BH1 headerData, final List<RidePassView> ridePassViews) {
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        Intrinsics.checkNotNullParameter(ridePassViews, "ridePassViews");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: QV4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m86683c;
                m86683c = RV4.m86683c(BH1.this, ridePassViews);
                return m86683c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      mut…          )\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final List<C3023H6> m86682d(List<RidePassView> ridePassViews) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> mutableListOf;
        Intrinsics.checkNotNullParameter(ridePassViews, "ridePassViews");
        C3023H6[] c3023h6Arr = new C3023H6[1];
        List<RidePassView> list = ridePassViews;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RidePassView ridePassView : list) {
            arrayList.add(new C2637G6(ridePassView, C33102Gj4.view_ride_pass_v2_card, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        c3023h6Arr[0] = new C3023H6(mutableList, null, null, 6, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c3023h6Arr);
        return mutableListOf;
    }
}
