package com.stripe.android.payments.core;

import com.stripe.android.payments.PaymentFlowResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "", "Lu5;", "activityResultCaller", "Lt5;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "", "onNewActivityResultCaller", "onLauncherInvalidated", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface ActivityResultLauncherHost {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static void onLauncherInvalidated(ActivityResultLauncherHost activityResultLauncherHost) {
        }

        public static void onNewActivityResultCaller(ActivityResultLauncherHost activityResultLauncherHost, InterfaceC29050u5 activityResultCaller, InterfaceC28515t5<PaymentFlowResult.Unvalidated> activityResultCallback) {
            Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
            Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        }
    }

    void onLauncherInvalidated();

    void onNewActivityResultCaller(InterfaceC29050u5 interfaceC29050u5, InterfaceC28515t5<PaymentFlowResult.Unvalidated> interfaceC28515t5);
}
