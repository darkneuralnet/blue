package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00010\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/wire/WireVehicleInventoryScan;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$itemSwiped$4 extends Lambda implements Function1<Pair<? extends WireVehicleInventoryScan, ? extends Boolean>, WireVehicleInventoryScan> {

    /* renamed from: g */
    public static final CoreInventoryScanActivity$itemSwiped$4 f63820g = new CoreInventoryScanActivity$itemSwiped$4();

    public CoreInventoryScanActivity$itemSwiped$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final WireVehicleInventoryScan invoke(Pair<WireVehicleInventoryScan, Boolean> pair) {
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        return pair.component1();
    }
}
