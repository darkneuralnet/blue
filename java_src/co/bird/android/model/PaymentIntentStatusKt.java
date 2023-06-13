package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"isEnded", "", "Lco/bird/android/model/PaymentIntentStatus;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentIntentStatusKt {
    public static final boolean isEnded(PaymentIntentStatus paymentIntentStatus) {
        Intrinsics.checkNotNullParameter(paymentIntentStatus, "<this>");
        if (!Intrinsics.areEqual(paymentIntentStatus, COMPLETE.INSTANCE) && !(paymentIntentStatus instanceof UNEXPECTED) && !(paymentIntentStatus instanceof UNKNOWN)) {
            return false;
        }
        return true;
    }
}
