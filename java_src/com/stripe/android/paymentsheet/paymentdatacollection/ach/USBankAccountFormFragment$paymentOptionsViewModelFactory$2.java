package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.os.Parcelable;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$paymentOptionsViewModelFactory$2 extends Lambda implements Function0<PaymentOptionsViewModel.Factory> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$paymentOptionsViewModelFactory$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192561 extends Lambda implements Function0<PaymentOptionContract.Args> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192561(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentOptionContract.Args invoke() {
            Parcelable parcelable = this.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
            if (parcelable != null) {
                return (PaymentOptionContract.Args) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$paymentOptionsViewModelFactory$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentOptionsViewModel.Factory invoke() {
        return new PaymentOptionsViewModel.Factory(new C192561(this.this$0));
    }
}
