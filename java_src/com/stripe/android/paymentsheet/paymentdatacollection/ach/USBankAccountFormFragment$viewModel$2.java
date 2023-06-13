package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.lifecycle.C11759u;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$viewModel$2 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$viewModel$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192621 extends Lambda implements Function0<USBankAccountFormViewModel.Args> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "params", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$viewModel$2$1$1 */
        /* loaded from: classes7.dex */
        public static final class C192631 extends Lambda implements Function1<ConfirmStripeIntentParams, Unit> {
            final /* synthetic */ USBankAccountFormFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C192631(USBankAccountFormFragment uSBankAccountFormFragment) {
                super(1);
                this.this$0 = uSBankAccountFormFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConfirmStripeIntentParams confirmStripeIntentParams) {
                invoke2(confirmStripeIntentParams);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ConfirmStripeIntentParams params) {
                BaseSheetViewModel sheetViewModel;
                Intrinsics.checkNotNullParameter(params, "params");
                sheetViewModel = this.this$0.getSheetViewModel();
                PaymentSheetViewModel paymentSheetViewModel = sheetViewModel instanceof PaymentSheetViewModel ? (PaymentSheetViewModel) sheetViewModel : null;
                if (paymentSheetViewModel != null) {
                    paymentSheetViewModel.confirmStripeIntent(params);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$viewModel$2$1$2 */
        /* loaded from: classes7.dex */
        public static final class C192642 extends Lambda implements Function1<PaymentSelection, Unit> {
            final /* synthetic */ USBankAccountFormFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C192642(USBankAccountFormFragment uSBankAccountFormFragment) {
                super(1);
                this.this$0 = uSBankAccountFormFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaymentSelection paymentSelection) {
                invoke2(paymentSelection);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(PaymentSelection paymentSelection) {
                BaseSheetViewModel sheetViewModel;
                BaseSheetViewModel sheetViewModel2;
                Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
                sheetViewModel = this.this$0.getSheetViewModel();
                if (sheetViewModel != null) {
                    sheetViewModel.updateSelection(paymentSelection);
                }
                sheetViewModel2 = this.this$0.getSheetViewModel();
                if (sheetViewModel2 != null) {
                    sheetViewModel2.onFinish();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192621(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final USBankAccountFormViewModel.Args invoke() {
            BaseSheetViewModel sheetViewModel;
            FormArguments formArgs;
            BaseSheetViewModel sheetViewModel2;
            ClientSecret clientSecret;
            BaseSheetViewModel sheetViewModel3;
            PaymentSheet.Configuration config$paymentsheet_release;
            sheetViewModel = this.this$0.getSheetViewModel();
            AddressDetails addressDetails = null;
            PaymentSelection.New newPaymentSelection = sheetViewModel != null ? sheetViewModel.getNewPaymentSelection() : null;
            PaymentSelection.New.USBankAccount uSBankAccount = newPaymentSelection instanceof PaymentSelection.New.USBankAccount ? (PaymentSelection.New.USBankAccount) newPaymentSelection : null;
            formArgs = this.this$0.getFormArgs();
            sheetViewModel2 = this.this$0.getSheetViewModel();
            boolean z = sheetViewModel2 instanceof PaymentSheetViewModel;
            clientSecret = this.this$0.getClientSecret();
            sheetViewModel3 = this.this$0.getSheetViewModel();
            if (sheetViewModel3 != null && (config$paymentsheet_release = sheetViewModel3.getConfig$paymentsheet_release()) != null) {
                addressDetails = config$paymentsheet_release.getShippingDetails();
            }
            return new USBankAccountFormViewModel.Args(formArgs, z, clientSecret, uSBankAccount, addressDetails, new C192631(this.this$0), new C192642(this.this$0), null, 128, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$viewModel$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C11759u.InterfaceC11763b invoke() {
        return new USBankAccountFormViewModel.Factory(new C192621(this.this$0));
    }
}
