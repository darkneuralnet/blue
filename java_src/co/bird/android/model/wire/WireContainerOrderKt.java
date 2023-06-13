package co.bird.android.model.wire;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0004"}, m28432d2 = {"carrierName", "", "Lco/bird/android/model/wire/WireContainerOrder;", "containerType", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireContainerOrderKt {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String carrierName(WireContainerOrder wireContainerOrder) {
        String str;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Map<String, String> carrierNames = wireContainerOrder.getCarrierNames();
        String carrierName = wireContainerOrder.getCarrierName();
        if (carrierName != null) {
            str = carrierName.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
        }
        str = "";
        String str2 = carrierNames.get(str);
        if (str2 == null) {
            return wireContainerOrder.getCarrierName();
        }
        return str2;
    }

    public static final String containerType(WireContainerOrder wireContainerOrder) {
        String str;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Map<String, String> containerTypes = wireContainerOrder.getContainerTypes();
        String containerType = wireContainerOrder.getContainerType();
        if (containerType != null) {
            str = containerType.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
        } else {
            str = null;
        }
        return containerTypes.get(str);
    }
}
