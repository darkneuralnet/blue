package co.bird.android.model.constant;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/constant/SkuOrderStatus;", "", "(Ljava/lang/String;I)V", "isClosed", "", "()Z", "CANCELED", "IN_TRANSIT", "PENDING", "PROCESSED", "PROCESSED_WITH_OSD", "READY_FOR_PICKUP", "READY_FOR_PROCESSING", "RETURN_TO_SENDER", "CHECKED_IN", "COMPLETED", "RECEIVED", "RECEIVED_WITH_OSD", "UNKNOWN", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum SkuOrderStatus {
    CANCELED,
    IN_TRANSIT,
    PENDING,
    PROCESSED,
    PROCESSED_WITH_OSD,
    READY_FOR_PICKUP,
    READY_FOR_PROCESSING,
    RETURN_TO_SENDER,
    CHECKED_IN,
    COMPLETED,
    RECEIVED,
    RECEIVED_WITH_OSD,
    UNKNOWN;

    public final boolean isClosed() {
        Set of;
        of = SetsKt__SetsKt.setOf((Object[]) new SkuOrderStatus[]{COMPLETED, CANCELED, PROCESSED, PROCESSED_WITH_OSD});
        return of.contains(this);
    }
}
