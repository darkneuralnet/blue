package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import co.bird.api.response.VehicleInventoryScanResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002 \u0005*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0018\u00010\u00010\u00012J\u0010\u0006\u001aF\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002 \u0005*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0018\u00010\u00010\u00010\u0002H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/api/response/VehicleInventoryScanResponse;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1549#2:262\n1620#2,3:263\n1549#2:266\n1620#2,3:267\n1549#2:270\n1620#2,3:271\n1549#2:274\n1620#2,3:275\n819#2:278\n847#2,2:279\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$4\n*L\n81#1:262\n81#1:263,3\n82#1:266\n82#1:267,3\n85#1:270\n85#1:271,3\n86#1:274\n86#1:275,3\n87#1:278\n87#1:279,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$4 extends Lambda implements Function1<Pair<? extends VehicleInventoryScanResponse, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>>, List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>> {

    /* renamed from: g */
    public static final CoreInventoryScanPresenter$consume$4 f63860g = new CoreInventoryScanPresenter$consume$4();

    public CoreInventoryScanPresenter$consume$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>> invoke(Pair<? extends VehicleInventoryScanResponse, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>> pair) {
        return invoke2((Pair<VehicleInventoryScanResponse, ? extends List<Pair<WireVehicleInventoryScan, Boolean>>>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<Pair<WireVehicleInventoryScan, Boolean>> invoke2(Pair<VehicleInventoryScanResponse, ? extends List<Pair<WireVehicleInventoryScan, Boolean>>> pair) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List plus;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        List plus2;
        List<Pair<WireVehicleInventoryScan, Boolean>> plus3;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        VehicleInventoryScanResponse component1 = pair.component1();
        List<Pair<WireVehicleInventoryScan, Boolean>> scans = pair.component2();
        List<WireVehicleInventoryScan> success = component1.getSuccess();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(success, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireVehicleInventoryScan wireVehicleInventoryScan : success) {
            arrayList.add(wireVehicleInventoryScan.getScanIdentifier());
        }
        List<WireVehicleInventoryScan> failure = component1.getFailure();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(failure, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (WireVehicleInventoryScan wireVehicleInventoryScan2 : failure) {
            arrayList2.add(wireVehicleInventoryScan2.getScanIdentifier());
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        List<WireVehicleInventoryScan> success2 = component1.getSuccess();
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(success2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (WireVehicleInventoryScan wireVehicleInventoryScan3 : success2) {
            arrayList3.add(TuplesKt.m28425to(wireVehicleInventoryScan3, null));
        }
        List<WireVehicleInventoryScan> failure2 = component1.getFailure();
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(failure2, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
        for (WireVehicleInventoryScan wireVehicleInventoryScan4 : failure2) {
            arrayList4.add(TuplesKt.m28425to(wireVehicleInventoryScan4, Boolean.FALSE));
        }
        plus2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList4);
        List list = plus2;
        Intrinsics.checkNotNullExpressionValue(scans, "scans");
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : scans) {
            if (!plus.contains(((WireVehicleInventoryScan) ((Pair) obj).component1()).getScanIdentifier())) {
                arrayList5.add(obj);
            }
        }
        plus3 = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList5);
        return plus3;
    }
}
