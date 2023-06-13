package co.bird.android.model.persistence;

import co.bird.android.model.constant.TransferOrderDemandSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"isInbound", "", "Lco/bird/android/model/persistence/SkuOrder;", "model-persistence_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SkuOrderKt {
    public static final boolean isInbound(SkuOrder skuOrder) {
        Intrinsics.checkNotNullParameter(skuOrder, "<this>");
        if (skuOrder.getTransferOrderLineItem().getTransferOrder().getDemandSource() == TransferOrderDemandSource.FM_DROP_OFF) {
            return true;
        }
        return false;
    }
}
