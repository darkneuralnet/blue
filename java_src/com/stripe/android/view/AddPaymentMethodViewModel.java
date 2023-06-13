package com.stripe.android.view;

import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.Stripe;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.i18n.ErrorMessageTranslator;
import com.stripe.android.view.i18n.TranslatorManager;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel;", "LOr6;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;)Landroidx/lifecycle/LiveData;", "createPaymentMethod", "updatedPaymentMethodCreateParams$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "updatedPaymentMethodCreateParams", "Lcom/stripe/android/CustomerSession;", "customerSession", "paymentMethod", "attachPaymentMethod$payments_core_release", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/PaymentMethod;)Landroidx/lifecycle/LiveData;", "attachPaymentMethod", "Lcom/stripe/android/Stripe;", "stripe", "Lcom/stripe/android/Stripe;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "errorMessageTranslator", "Lcom/stripe/android/view/i18n/ErrorMessageTranslator;", "", "", NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "<init>", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;Lcom/stripe/android/view/i18n/ErrorMessageTranslator;)V", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodViewModel.kt\ncom/stripe/android/view/AddPaymentMethodViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes7.dex */
public final class AddPaymentMethodViewModel extends AbstractC35048Or6 {
    private final AddPaymentMethodActivityStarter.Args args;
    private final ErrorMessageTranslator errorMessageTranslator;
    private final Set<String> productUsage;
    private final Stripe stripe;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/Stripe;", "stripe", "Lcom/stripe/android/Stripe;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "<init>", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final AddPaymentMethodActivityStarter.Args args;
        private final Stripe stripe;

        public Factory(Stripe stripe, AddPaymentMethodActivityStarter.Args args) {
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(args, "args");
            this.stripe = stripe;
            this.args = args;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new AddPaymentMethodViewModel(this.stripe, this.args, null, 4, null);
        }
    }

    public /* synthetic */ AddPaymentMethodViewModel(Stripe stripe, AddPaymentMethodActivityStarter.Args args, ErrorMessageTranslator errorMessageTranslator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe, args, (i & 4) != 0 ? TranslatorManager.INSTANCE.getErrorMessageTranslator() : errorMessageTranslator);
    }

    public final /* synthetic */ LiveData attachPaymentMethod$payments_core_release(CustomerSession customerSession, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(customerSession, "customerSession");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        final C49882uX2 c49882uX2 = new C49882uX2();
        String str = paymentMethod.f75358id;
        if (str == null) {
            str = "";
        }
        customerSession.attachPaymentMethod$payments_core_release(str, this.productUsage, new CustomerSession.PaymentMethodRetrievalListener() { // from class: com.stripe.android.view.AddPaymentMethodViewModel$attachPaymentMethod$1
            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i, String errorMessage, StripeError stripeError) {
                ErrorMessageTranslator errorMessageTranslator;
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                C49882uX2<Result<PaymentMethod>> c49882uX22 = c49882uX2;
                Result.Companion companion = Result.Companion;
                errorMessageTranslator = this.errorMessageTranslator;
                c49882uX22.setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(new RuntimeException(errorMessageTranslator.translate(i, errorMessage, stripeError))))));
            }

            @Override // com.stripe.android.CustomerSession.PaymentMethodRetrievalListener
            public void onPaymentMethodRetrieved(PaymentMethod paymentMethod2) {
                Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                c49882uX2.setValue(Result.m116782boximpl(Result.m116783constructorimpl(paymentMethod2)));
            }
        });
        return c49882uX2;
    }

    public final LiveData<Result<PaymentMethod>> createPaymentMethod$payments_core_release(PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final C49882uX2 c49882uX2 = new C49882uX2();
        Stripe.createPaymentMethod$default(this.stripe, updatedPaymentMethodCreateParams$payments_core_release(params), null, null, new ApiResultCallback<PaymentMethod>() { // from class: com.stripe.android.view.AddPaymentMethodViewModel$createPaymentMethod$1
            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                C49882uX2<Result<PaymentMethod>> c49882uX22 = c49882uX2;
                Result.Companion companion = Result.Companion;
                c49882uX22.setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(e))));
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(PaymentMethod result) {
                Intrinsics.checkNotNullParameter(result, "result");
                c49882uX2.setValue(Result.m116782boximpl(Result.m116783constructorimpl(result)));
            }
        }, 6, null);
        return c49882uX2;
    }

    public final PaymentMethodCreateParams updatedPaymentMethodCreateParams$payments_core_release(PaymentMethodCreateParams params) {
        PaymentMethodCreateParams copy;
        Intrinsics.checkNotNullParameter(params, "params");
        copy = params.copy((r36 & 1) != 0 ? params.code : null, (r36 & 2) != 0 ? params.requiresMandate : false, (r36 & 4) != 0 ? params.card : null, (r36 & 8) != 0 ? params.ideal : null, (r36 & 16) != 0 ? params.fpx : null, (r36 & 32) != 0 ? params.sepaDebit : null, (r36 & 64) != 0 ? params.auBecsDebit : null, (r36 & 128) != 0 ? params.bacsDebit : null, (r36 & 256) != 0 ? params.sofort : null, (r36 & 512) != 0 ? params.upi : null, (r36 & 1024) != 0 ? params.netbanking : null, (r36 & 2048) != 0 ? params.usBankAccount : null, (r36 & 4096) != 0 ? params.link : null, (r36 & 8192) != 0 ? params.cashAppPay : null, (r36 & 16384) != 0 ? params.billingDetails : null, (r36 & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? params.metadata : null, (r36 & 65536) != 0 ? params.productUsage : this.productUsage, (r36 & net.danlew.android.joda.DateUtils.FORMAT_NUMERIC_DATE) != 0 ? params.overrideParamMap : null);
        return copy;
    }

    public AddPaymentMethodViewModel(Stripe stripe, AddPaymentMethodActivityStarter.Args args, ErrorMessageTranslator errorMessageTranslator) {
        List listOfNotNull;
        Set<String> set;
        Intrinsics.checkNotNullParameter(stripe, "stripe");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(errorMessageTranslator, "errorMessageTranslator");
        this.stripe = stripe;
        this.args = args;
        this.errorMessageTranslator = errorMessageTranslator;
        String[] strArr = new String[2];
        strArr[0] = AddPaymentMethodActivity.PRODUCT_TOKEN;
        strArr[1] = args.isPaymentSessionActive$payments_core_release() ? PaymentSession.PRODUCT_TOKEN : null;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
        set = CollectionsKt___CollectionsKt.toSet(listOfNotNull);
        this.productUsage = set;
    }
}
