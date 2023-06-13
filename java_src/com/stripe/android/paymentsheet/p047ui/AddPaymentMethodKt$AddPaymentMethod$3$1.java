package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$3$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class AddPaymentMethodKt$AddPaymentMethod$3$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public AddPaymentMethodKt$AddPaymentMethod$3$1(Object obj) {
        super(1, obj, EventReporter.class, "onAutofill", "onAutofill(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventReporter) this.receiver).onAutofill(p0);
    }
}
