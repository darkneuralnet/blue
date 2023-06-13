package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireFleet;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.model.wire.WireWarehouse;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrderLineItem;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: i96  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42554i96 {
    /* renamed from: a */
    public static final String m34391a(WireTransferOrderLineItem wireTransferOrderLineItem, Context context) {
        String str;
        WireWarehouse originWarehouse;
        WireWarehouse destinationWarehouse;
        String name;
        Intrinsics.checkNotNullParameter(wireTransferOrderLineItem, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        WireFleet originFleet = wireTransferOrderLineItem.getOriginFleet();
        String str2 = "";
        if (originFleet == null || (str = originFleet.getName()) == null) {
            WireTransferOrder transferOrder = wireTransferOrderLineItem.getTransferOrder();
            if (transferOrder == null || (originWarehouse = transferOrder.getOriginWarehouse()) == null) {
                str = "";
            } else {
                str = originWarehouse.getName();
            }
        }
        WireFleet destinationFleet = wireTransferOrderLineItem.getDestinationFleet();
        if (destinationFleet != null && (name = destinationFleet.getName()) != null) {
            str2 = name;
        } else {
            WireTransferOrder transferOrder2 = wireTransferOrderLineItem.getTransferOrder();
            if (transferOrder2 != null && (destinationWarehouse = transferOrder2.getDestinationWarehouse()) != null) {
                str2 = destinationWarehouse.getName();
            }
        }
        String string = context.getString(C45871nl4.transfer_order_from_to_location, str, str2);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ion, origin, destination)");
        return string;
    }
}
