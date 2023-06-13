package com.stripe.android.paymentsheet.p047ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.stripe.android.paymentsheet.databinding.FragmentAchBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentElementKt$PaymentElement$1$1$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentElementKt$PaymentElement$1$1$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAchBinding> {
    public static final PaymentElementKt$PaymentElement$1$1$1 INSTANCE = new PaymentElementKt$PaymentElement$1$1$1();

    public PaymentElementKt$PaymentElement$1$1$1() {
        super(3, FragmentAchBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/paymentsheet/databinding/FragmentAchBinding;", 0);
    }

    public final FragmentAchBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAchBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FragmentAchBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
