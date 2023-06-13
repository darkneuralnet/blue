package com.stripe.android.paymentsheet.p047ui;

import androidx.lifecycle.C11759u;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsPrimaryButtonContainerFragment$viewModel$2 */
/* loaded from: classes7.dex */
public final class PaymentOptionsPrimaryButtonContainerFragment$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    public static final PaymentOptionsPrimaryButtonContainerFragment$viewModel$2 INSTANCE = new PaymentOptionsPrimaryButtonContainerFragment$viewModel$2();

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsPrimaryButtonContainerFragment$viewModel$2$1 */
    /* loaded from: classes7.dex */
    public static final class C193091 extends Lambda implements Function0<PaymentOptionContract.Args> {
        public static final C193091 INSTANCE = new C193091();

        public C193091() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentOptionContract.Args invoke() {
            throw new IllegalStateException("PaymentOptionsViewModel should already exist".toString());
        }
    }

    public PaymentOptionsPrimaryButtonContainerFragment$viewModel$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        return new PaymentOptionsViewModel.Factory(C193091.INSTANCE);
    }
}
