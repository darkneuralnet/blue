package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Companion$rememberLauncher$activityResultLauncher$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class C18947x49c2996c extends FunctionReferenceImpl implements Function1<GooglePayPaymentMethodLauncher.Result, Unit> {
    public C18947x49c2996c(Object obj) {
        super(1, obj, GooglePayPaymentMethodLauncher.ResultCallback.class, "onResult", "onResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GooglePayPaymentMethodLauncher.Result result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GooglePayPaymentMethodLauncher.Result p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GooglePayPaymentMethodLauncher.ResultCallback) this.receiver).onResult(p0);
    }
}
