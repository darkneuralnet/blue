package com.stripe.android.paymentsheet.p047ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.stripe.android.paymentsheet.databinding.FragmentPaymentSheetPrimaryButtonBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$PaymentSheetScreenContent$2$3 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentSheetScreenKt$PaymentSheetScreenContent$2$3 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentPaymentSheetPrimaryButtonBinding> {
    public static final PaymentSheetScreenKt$PaymentSheetScreenContent$2$3 INSTANCE = new PaymentSheetScreenKt$PaymentSheetScreenContent$2$3();

    public PaymentSheetScreenKt$PaymentSheetScreenContent$2$3() {
        super(3, FragmentPaymentSheetPrimaryButtonBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/paymentsheet/databinding/FragmentPaymentSheetPrimaryButtonBinding;", 0);
    }

    public final FragmentPaymentSheetPrimaryButtonBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPaymentSheetPrimaryButtonBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FragmentPaymentSheetPrimaryButtonBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
