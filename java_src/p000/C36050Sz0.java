package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireContainerOrder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Sz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36050Sz0 {
    /* renamed from: a */
    public static final String m84512a(WireContainerOrder wireContainerOrder, Context context) {
        Object firstOrNull;
        WireTransferOrderLineItem transferOrderLineItem;
        String m34391a;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) wireContainerOrder.getSkuOrders());
        WireSkuOrder wireSkuOrder = (WireSkuOrder) firstOrNull;
        if (wireSkuOrder == null || (transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem()) == null || (m34391a = C42554i96.m34391a(transferOrderLineItem, context)) == null) {
            return "";
        }
        return m34391a;
    }
}
