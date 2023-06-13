package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CoreInventoryScanPresenter$consume$19 extends FunctionReferenceImpl implements Function1<List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>, Unit> {
    public CoreInventoryScanPresenter$consume$19(Object obj) {
        super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>> list) {
        invoke2((List<Pair<WireVehicleInventoryScan, Boolean>>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Pair<WireVehicleInventoryScan, Boolean>> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((C45168ma4) this.receiver).accept(p0);
    }
}
