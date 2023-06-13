package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LG6;", "adapterItem", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LG6;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$itemSwiped$2 extends Lambda implements Function1<C2637G6, Pair<? extends WireVehicleInventoryScan, ? extends Boolean>> {

    /* renamed from: g */
    public static final CoreInventoryScanActivity$itemSwiped$2 f63818g = new CoreInventoryScanActivity$itemSwiped$2();

    public CoreInventoryScanActivity$itemSwiped$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final Pair<WireVehicleInventoryScan, Boolean> invoke(C2637G6 adapterItem) {
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        Object m105816c = adapterItem.m105816c();
        Intrinsics.checkNotNull(m105816c, "null cannot be cast to non-null type kotlin.Pair<co.bird.android.model.wire.WireVehicleInventoryScan, kotlin.Boolean?>");
        return (Pair) m105816c;
    }
}
