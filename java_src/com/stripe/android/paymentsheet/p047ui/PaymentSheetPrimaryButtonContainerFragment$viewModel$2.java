package com.stripe.android.paymentsheet.p047ui;

import androidx.lifecycle.C11759u;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$viewModel$2 */
/* loaded from: classes7.dex */
public final class PaymentSheetPrimaryButtonContainerFragment$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    public static final PaymentSheetPrimaryButtonContainerFragment$viewModel$2 INSTANCE = new PaymentSheetPrimaryButtonContainerFragment$viewModel$2();

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment$viewModel$2$1 */
    /* loaded from: classes7.dex */
    public static final class C193211 extends Lambda implements Function0<PaymentSheetContractV2.Args> {
        public static final C193211 INSTANCE = new C193211();

        public C193211() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentSheetContractV2.Args invoke() {
            throw new IllegalStateException("PaymentSheetViewModel should already exist".toString());
        }
    }

    public PaymentSheetPrimaryButtonContainerFragment$viewModel$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        return new PaymentSheetViewModel.Factory(C193211.INSTANCE);
    }
}
