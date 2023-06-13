package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002 \u0005*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0018\u00010\u00010\u00012P\u0010\u0006\u001aL\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002 \u0005*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0018\u00010\u00010\u00010\u0002H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$18\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,261:1\n37#2,2:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$18\n*L\n210#1:262,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$18 extends Lambda implements Function1<Pair<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>>, List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>> {

    /* renamed from: g */
    public static final CoreInventoryScanPresenter$consume$18 f63851g = new CoreInventoryScanPresenter$consume$18();

    public CoreInventoryScanPresenter$consume$18() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>> invoke(Pair<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>> pair) {
        return invoke2((Pair<Pair<WireVehicleInventoryScan, Boolean>, ? extends List<Pair<WireVehicleInventoryScan, Boolean>>>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<Pair<WireVehicleInventoryScan, Boolean>> invoke2(Pair<Pair<WireVehicleInventoryScan, Boolean>, ? extends List<Pair<WireVehicleInventoryScan, Boolean>>> pair) {
        List<Pair<WireVehicleInventoryScan, Boolean>> listOf;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        List<Pair<WireVehicleInventoryScan, Boolean>> coreInventory = pair.component2();
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(pair.component1());
        Intrinsics.checkNotNullExpressionValue(coreInventory, "coreInventory");
        spreadBuilder.addSpread(coreInventory.toArray(new Pair[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Pair[spreadBuilder.size()]));
        return listOf;
    }
}
