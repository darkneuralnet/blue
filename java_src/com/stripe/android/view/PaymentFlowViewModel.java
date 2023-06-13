package com.stripe.android.view;

import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 B2\u00020\u0001:\u0002BCB\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b@\u0010AJ&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel;", "LOr6;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "saveCustomerShippingInformation$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;", "saveCustomerShippingInformation", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsFactory", "", "Lcom/stripe/android/model/ShippingMethod;", "validateShippingInformation$payments_core_release", "(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;", "validateShippingInformation", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "getPaymentSessionData$payments_core_release", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData$payments_core_release", "(Lcom/stripe/android/PaymentSessionData;)V", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "shippingMethods", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "", "isShippingInfoSubmitted", "Z", "isShippingInfoSubmitted$payments_core_release", "()Z", "setShippingInfoSubmitted$payments_core_release", "(Z)V", "selectedShippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "getSelectedShippingMethod$payments_core_release", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "submittedShippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getSubmittedShippingInfo$payments_core_release", "()Lcom/stripe/android/model/ShippingInformation;", "setSubmittedShippingInfo$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)V", "", "currentPage", "I", "getCurrentPage$payments_core_release", "()I", "setCurrentPage$payments_core_release", "(I)V", "<init>", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentFlowViewModel extends AbstractC35048Or6 {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> PRODUCT_USAGE;
    private static final String SHIPPING_INFO_PRODUCT_TOKEN = "ShippingInfoScreen";
    private int currentPage;
    private final CustomerSession customerSession;
    private boolean isShippingInfoSubmitted;
    private PaymentSessionData paymentSessionData;
    private ShippingMethod selectedShippingMethod;
    private List<ShippingMethod> shippingMethods;
    private ShippingInformation submittedShippingInfo;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Companion;", "", "()V", "PRODUCT_USAGE", "", "", "getPRODUCT_USAGE", "()Ljava/util/Set;", "SHIPPING_INFO_PRODUCT_TOKEN", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getPRODUCT_USAGE() {
            return PaymentFlowViewModel.PRODUCT_USAGE;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "<init>", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        public Factory(CustomerSession customerSession, PaymentSessionData paymentSessionData) {
            Intrinsics.checkNotNullParameter(customerSession, "customerSession");
            Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
            this.customerSession = customerSession;
            this.paymentSessionData = paymentSessionData;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new PaymentFlowViewModel(this.customerSession, this.paymentSessionData, T41.m84377b());
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{PaymentSession.PRODUCT_TOKEN, PaymentFlowActivity.PRODUCT_TOKEN, SHIPPING_INFO_PRODUCT_TOKEN});
        PRODUCT_USAGE = of;
    }

    public PaymentFlowViewModel(CustomerSession customerSession, PaymentSessionData paymentSessionData, CoroutineContext workContext) {
        List<ShippingMethod> emptyList;
        Intrinsics.checkNotNullParameter(customerSession, "customerSession");
        Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.customerSession = customerSession;
        this.paymentSessionData = paymentSessionData;
        this.workContext = workContext;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.shippingMethods = emptyList;
    }

    public final int getCurrentPage$payments_core_release() {
        return this.currentPage;
    }

    public final PaymentSessionData getPaymentSessionData$payments_core_release() {
        return this.paymentSessionData;
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return this.selectedShippingMethod;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final ShippingInformation getSubmittedShippingInfo$payments_core_release() {
        return this.submittedShippingInfo;
    }

    public final boolean isShippingInfoSubmitted$payments_core_release() {
        return this.isShippingInfoSubmitted;
    }

    public final /* synthetic */ LiveData saveCustomerShippingInformation$payments_core_release(ShippingInformation shippingInformation) {
        Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
        this.submittedShippingInfo = shippingInformation;
        final C49882uX2 c49882uX2 = new C49882uX2();
        this.customerSession.setCustomerShippingInformation$payments_core_release(shippingInformation, PRODUCT_USAGE, new CustomerSession.CustomerRetrievalListener() { // from class: com.stripe.android.view.PaymentFlowViewModel$saveCustomerShippingInformation$1
            @Override // com.stripe.android.CustomerSession.CustomerRetrievalListener
            public void onCustomerRetrieved(Customer customer) {
                Intrinsics.checkNotNullParameter(customer, "customer");
                PaymentFlowViewModel.this.setShippingInfoSubmitted$payments_core_release(true);
                c49882uX2.setValue(Result.m116782boximpl(Result.m116783constructorimpl(customer)));
            }

            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i, String errorMessage, StripeError stripeError) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                PaymentFlowViewModel.this.setShippingInfoSubmitted$payments_core_release(false);
                C49882uX2<Result<Customer>> c49882uX22 = c49882uX2;
                Result.Companion companion = Result.Companion;
                c49882uX22.setValue(Result.m116782boximpl(Result.m116783constructorimpl(ResultKt.createFailure(new RuntimeException(errorMessage)))));
            }
        });
        return c49882uX2;
    }

    public final void setCurrentPage$payments_core_release(int i) {
        this.currentPage = i;
    }

    public final void setPaymentSessionData$payments_core_release(PaymentSessionData paymentSessionData) {
        Intrinsics.checkNotNullParameter(paymentSessionData, "<set-?>");
        this.paymentSessionData = paymentSessionData;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod = shippingMethod;
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z) {
        this.isShippingInfoSubmitted = z;
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shippingMethods = list;
    }

    public final void setSubmittedShippingInfo$payments_core_release(ShippingInformation shippingInformation) {
        this.submittedShippingInfo = shippingInformation;
    }

    public final /* synthetic */ LiveData validateShippingInformation$payments_core_release(PaymentSessionConfig.ShippingInformationValidator shippingInfoValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        Intrinsics.checkNotNullParameter(shippingInfoValidator, "shippingInfoValidator");
        Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
        return WC0.m78736b(null, 0L, new PaymentFlowViewModel$validateShippingInformation$1(this, shippingInfoValidator, shippingInformation, shippingMethodsFactory, null), 3, null);
    }
}
