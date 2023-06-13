package com.stripe.android.paymentsheet.p047ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.stripe.android.paymentsheet.databinding.FragmentPaymentOptionsPrimaryButtonBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentPaymentOptionsPrimaryButtonBinding> {
    public static final PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4 INSTANCE = new PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4();

    public PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4() {
        super(3, FragmentPaymentOptionsPrimaryButtonBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/paymentsheet/databinding/FragmentPaymentOptionsPrimaryButtonBinding;", 0);
    }

    public final FragmentPaymentOptionsPrimaryButtonBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPaymentOptionsPrimaryButtonBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FragmentPaymentOptionsPrimaryButtonBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
