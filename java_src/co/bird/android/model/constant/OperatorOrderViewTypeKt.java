package co.bird.android.model.constant;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"isLongtail", "", "Lco/bird/android/model/constant/OperatorOrderViewType;", "model-constant"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorOrderViewTypeKt {
    public static final boolean isLongtail(OperatorOrderViewType operatorOrderViewType) {
        Set of;
        Intrinsics.checkNotNullParameter(operatorOrderViewType, "<this>");
        of = SetsKt__SetsKt.setOf((Object[]) new OperatorOrderViewType[]{OperatorOrderViewType.LONGTAIL_DELIVERY, OperatorOrderViewType.LONGTAIL_RETURN});
        return of.contains(operatorOrderViewType);
    }
}
