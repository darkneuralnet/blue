package co.bird.api.response;

import co.bird.android.model.wire.WireInventoryPart;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"toPart", "Lco/bird/android/model/wire/WireInventoryPart;", "Lco/bird/api/response/WireInventory;", "co.bird.android.api"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireInventoryKt {
    public static final WireInventoryPart toPart(WireInventory wireInventory) {
        Intrinsics.checkNotNullParameter(wireInventory, "<this>");
        String sku = wireInventory.getSku();
        String displayName = wireInventory.displayName();
        return new WireInventoryPart(sku, wireInventory.getSku(), null, displayName, wireInventory.getDescription(), wireInventory.getDefaultImageUrl(), null, null, null, wireInventory.getQuantity(), null, wireInventory.getHealthyThreshold(), false, 0, 13764, null);
    }
}
