package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1", m28418f = "USBankAccountFormViewModel.kt", m28417i = {}, m28416l = {333, 345}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nUSBankAccountFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,508:1\n230#2,5:509\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1\n*L\n394#1:509,5\n*E\n"})
/* loaded from: classes7.dex */
public final class USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bankName;
    final /* synthetic */ ClientSecret $clientSecret;
    final /* synthetic */ String $intentId;
    final /* synthetic */ String $last4;
    final /* synthetic */ String $linkAccountId;
    int label;
    final /* synthetic */ USBankAccountFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1(ClientSecret clientSecret, USBankAccountFormViewModel uSBankAccountFormViewModel, String str, String str2, String str3, String str4, Continuation<? super USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1> continuation) {
        super(2, continuation);
        this.$clientSecret = clientSecret;
        this.this$0 = uSBankAccountFormViewModel;
        this.$intentId = str;
        this.$linkAccountId = str2;
        this.$last4 = str3;
        this.$bankName = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1(this.$clientSecret, this.this$0, this.$intentId, this.$linkAccountId, this.$last4, this.$bankName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        StripeRepository stripeRepository;
        Y94 y94;
        Y94 y942;
        List<String> emptyList;
        StripeRepository stripeRepository2;
        Y94 y943;
        Y94 y944;
        List<String> emptyList2;
        Application application;
        USBankAccountFormViewModel.Args args;
        PaymentSelection.CustomerRequestedSave customerRequestedSave;
        USBankAccountFormViewModel.Args args2;
        GX2 gx2;
        Object value;
        Object obj2;
        USBankAccountFormViewModel.Args args3;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ClientSecret clientSecret = this.$clientSecret;
            if (clientSecret instanceof PaymentIntentClientSecret) {
                stripeRepository2 = this.this$0.stripeRepository;
                String value2 = this.$clientSecret.getValue();
                String str = this.$intentId;
                String str2 = this.$linkAccountId;
                y943 = this.this$0.lazyPaymentConfig;
                String publishableKey = ((PaymentConfiguration) y943.get()).getPublishableKey();
                y944 = this.this$0.lazyPaymentConfig;
                ApiRequest.Options options = new ApiRequest.Options(publishableKey, ((PaymentConfiguration) y944.get()).getStripeAccountId(), null, 4, null);
                emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                this.label = 1;
                if (stripeRepository2.attachFinancialConnectionsSessionToPaymentIntent(value2, str, str2, options, emptyList2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (clientSecret instanceof SetupIntentClientSecret) {
                stripeRepository = this.this$0.stripeRepository;
                String value3 = this.$clientSecret.getValue();
                String str3 = this.$intentId;
                String str4 = this.$linkAccountId;
                y94 = this.this$0.lazyPaymentConfig;
                String publishableKey2 = ((PaymentConfiguration) y94.get()).getPublishableKey();
                y942 = this.this$0.lazyPaymentConfig;
                ApiRequest.Options options2 = new ApiRequest.Options(publishableKey2, ((PaymentConfiguration) y942.get()).getStripeAccountId(), null, 4, null);
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                this.label = 2;
                if (stripeRepository.attachFinancialConnectionsSessionToSetupIntent(value3, str3, str4, options2, emptyList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        application = this.this$0.application;
        String string = application.getString(C19159R.string.paymentsheet_payment_method_item_card_number, this.$last4);
        int invoke = TransformToBankIcon.Companion.invoke(this.$bankName);
        PaymentMethodCreateParams create$default = PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.USBankAccount(this.$linkAccountId), new PaymentMethod.BillingDetails(null, this.this$0.getEmail().getValue(), this.this$0.getName().getValue(), null, 9, null), (Map) null, 4, (Object) null);
        args = this.this$0.args;
        if (args.getFormArgs().getShowCheckbox()) {
            if (this.this$0.getSaveForFutureUse().getValue().booleanValue()) {
                customerRequestedSave = PaymentSelection.CustomerRequestedSave.RequestReuse;
            } else {
                customerRequestedSave = PaymentSelection.CustomerRequestedSave.RequestNoReuse;
            }
        } else {
            customerRequestedSave = PaymentSelection.CustomerRequestedSave.NoRequest;
        }
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …                        )");
        PaymentSelection.New.USBankAccount uSBankAccount = new PaymentSelection.New.USBankAccount(string, invoke, this.$bankName, this.$last4, this.$linkAccountId, this.$intentId, create$default, customerRequestedSave);
        args2 = this.this$0.args;
        if (args2.isCompleteFlow()) {
            this.this$0.confirm(this.$clientSecret, uSBankAccount);
        } else {
            gx2 = this.this$0._currentScreenState;
            String str5 = this.$bankName;
            String str6 = this.$last4;
            do {
                value = gx2.getValue();
                obj2 = (USBankAccountFormScreenState) value;
                if (obj2 instanceof USBankAccountFormScreenState.SavedAccount) {
                    obj2 = USBankAccountFormScreenState.SavedAccount.copy$default((USBankAccountFormScreenState.SavedAccount) obj2, null, null, null, null, str5, str6, null, null, false, 463, null);
                }
            } while (!gx2.compareAndSet(value, obj2));
            args3 = this.this$0.args;
            args3.getOnUpdateSelectionAndFinish().invoke(uSBankAccount);
        }
        return Unit.INSTANCE;
    }
}
