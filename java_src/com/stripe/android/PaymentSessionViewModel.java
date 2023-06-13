package com.stripe.android;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSessionPrefs;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.core.StripeError;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.utils.CreationExtrasKtxKt;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0004EFGHB1\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\bC\u0010DJ7\u0010\u000b\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0014\u001a\u00020\fJ1\u0010\u001c\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 J\u000e\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#J\u0006\u0010&\u001a\u00020\tR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R*\u0010$\u001a\u00020#2\u0006\u00100\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020#0\u00158\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R \u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<¨\u0006I"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel;", "Lie;", "", "paymentMethodId", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlin/ParameterName;", "name", "paymentMethod", "", "onComplete", "fetchCustomerPaymentMethod", "", "useGooglePay", "persistPaymentMethodResult", "", "cartTotal", "updateCartTotal", "clearPaymentMethod", "onCompleted", "isInitialFetch", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "fetchCustomer", "customerId", "Lkotlin/Function0;", "onCustomerRetrieved$payments_core_release", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "onCustomerRetrieved", "userSelectedPaymentMethodId", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "getSelectedPaymentMethod", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onPaymentMethodResult", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "onPaymentFlowResult", "onListenerAttached", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "Lcom/stripe/android/PaymentSessionPrefs;", "paymentSessionPrefs", "Lcom/stripe/android/PaymentSessionPrefs;", "value", "Lcom/stripe/android/PaymentSessionData;", "getPaymentSessionData", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData", "(Lcom/stripe/android/PaymentSessionData;)V", "LuX2;", "_paymentSessionDataLiveData", "LuX2;", "paymentSessionDataLiveData", "Landroidx/lifecycle/LiveData;", "getPaymentSessionDataLiveData", "()Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "_networkState", "networkState", "getNetworkState$payments_core_release", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/p;Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionPrefs;)V", "Companion", "Factory", "FetchCustomerResult", "NetworkState", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PaymentSessionViewModel extends C23294ie {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_PAYMENT_SESSION_DATA = "key_payment_session_data";
    private static final int MAX_PAYMENT_METHODS_LIMIT = 100;
    private final C49882uX2<NetworkState> _networkState;
    private final C49882uX2<PaymentSessionData> _paymentSessionDataLiveData;
    private final CustomerSession customerSession;
    private final LiveData<NetworkState> networkState;
    private PaymentSessionData paymentSessionData;
    private final LiveData<PaymentSessionData> paymentSessionDataLiveData;
    private final PaymentSessionPrefs paymentSessionPrefs;
    private final C11747p savedStateHandle;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel$Companion;", "", "()V", "KEY_PAYMENT_SESSION_DATA", "", "MAX_PAYMENT_METHODS_LIMIT", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "<init>", "(Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/CustomerSession;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        public Factory(PaymentSessionData paymentSessionData, CustomerSession customerSession) {
            Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
            Intrinsics.checkNotNullParameter(customerSession, "customerSession");
            this.paymentSessionData = paymentSessionData;
            this.customerSession = customerSession;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new PaymentSessionViewModel(CreationExtrasKtxKt.requireApplication(extras), C11750q.m66936a(extras), this.paymentSessionData, this.customerSession, null, 16, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "", "()V", "Error", "Success", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Success;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class FetchCustomerResult {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "errorCode", "", "errorMessage", "", "stripeError", "Lcom/stripe/android/core/StripeError;", "(ILjava/lang/String;Lcom/stripe/android/core/StripeError;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getStripeError", "()Lcom/stripe/android/core/StripeError;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Error extends FetchCustomerResult {
            public static final int $stable = 8;
            private final int errorCode;
            private final String errorMessage;
            private final StripeError stripeError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(int i, String errorMessage, StripeError stripeError) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.errorCode = i;
                this.errorMessage = errorMessage;
                this.stripeError = stripeError;
            }

            public static /* synthetic */ Error copy$default(Error error, int i, String str, StripeError stripeError, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = error.errorCode;
                }
                if ((i2 & 2) != 0) {
                    str = error.errorMessage;
                }
                if ((i2 & 4) != 0) {
                    stripeError = error.stripeError;
                }
                return error.copy(i, str, stripeError);
            }

            public final int component1() {
                return this.errorCode;
            }

            public final String component2() {
                return this.errorMessage;
            }

            public final StripeError component3() {
                return this.stripeError;
            }

            public final Error copy(int i, String errorMessage, StripeError stripeError) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new Error(i, errorMessage, stripeError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    return this.errorCode == error.errorCode && Intrinsics.areEqual(this.errorMessage, error.errorMessage) && Intrinsics.areEqual(this.stripeError, error.stripeError);
                }
                return false;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final StripeError getStripeError() {
                return this.stripeError;
            }

            public int hashCode() {
                int hashCode = ((Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode()) * 31;
                StripeError stripeError = this.stripeError;
                return hashCode + (stripeError == null ? 0 : stripeError.hashCode());
            }

            public String toString() {
                int i = this.errorCode;
                String str = this.errorMessage;
                StripeError stripeError = this.stripeError;
                return "Error(errorCode=" + i + ", errorMessage=" + str + ", stripeError=" + stripeError + ")";
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Success;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Success extends FetchCustomerResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        public /* synthetic */ FetchCustomerResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FetchCustomerResult() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "", "(Ljava/lang/String;I)V", "Active", "Inactive", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public enum NetworkState {
        Active,
        Inactive
    }

    public /* synthetic */ PaymentSessionViewModel(Application application, C11747p c11747p, PaymentSessionData paymentSessionData, CustomerSession customerSession, PaymentSessionPrefs paymentSessionPrefs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, c11747p, paymentSessionData, customerSession, (i & 16) != 0 ? new PaymentSessionPrefs.Default(application) : paymentSessionPrefs);
    }

    public static /* synthetic */ LiveData fetchCustomer$default(PaymentSessionViewModel paymentSessionViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return paymentSessionViewModel.fetchCustomer(z);
    }

    private final void fetchCustomerPaymentMethod(final String str, final Function1<? super PaymentMethod, Unit> function1) {
        if (str != null) {
            CustomerSession.getPaymentMethods$default(this.customerSession, PaymentMethod.Type.Card, 100, null, null, new CustomerSession.PaymentMethodsRetrievalListener() { // from class: com.stripe.android.PaymentSessionViewModel$fetchCustomerPaymentMethod$1
                @Override // com.stripe.android.CustomerSession.RetrievalListener
                public void onError(int i, String errorMessage, StripeError stripeError) {
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    function1.invoke(null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.stripe.android.CustomerSession.PaymentMethodsRetrievalListener
                public void onPaymentMethodsRetrieved(List<PaymentMethod> paymentMethods) {
                    Object obj;
                    Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
                    Function1<PaymentMethod, Unit> function12 = function1;
                    String str2 = str;
                    Iterator<T> it = paymentMethods.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.areEqual(((PaymentMethod) obj).f75358id, str2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    function12.invoke(obj);
                }
            }, 12, null);
        } else {
            function1.invoke(null);
        }
    }

    public static /* synthetic */ PaymentSessionPrefs.SelectedPaymentMethod getSelectedPaymentMethod$default(PaymentSessionViewModel paymentSessionViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return paymentSessionViewModel.getSelectedPaymentMethod(str);
    }

    public static /* synthetic */ void onCustomerRetrieved$payments_core_release$default(PaymentSessionViewModel paymentSessionViewModel, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        paymentSessionViewModel.onCustomerRetrieved$payments_core_release(str, z, function0);
    }

    private final void persistPaymentMethodResult(PaymentMethod paymentMethod, boolean z) {
        PaymentSessionData copy;
        String id;
        PaymentSessionPrefs.SelectedPaymentMethod selectedPaymentMethod;
        String str;
        Customer cachedCustomer = this.customerSession.getCachedCustomer();
        if (cachedCustomer != null && (id = cachedCustomer.getId()) != null) {
            if (z) {
                selectedPaymentMethod = PaymentSessionPrefs.SelectedPaymentMethod.GooglePay.INSTANCE;
            } else if (paymentMethod != null && (str = paymentMethod.f75358id) != null) {
                selectedPaymentMethod = new PaymentSessionPrefs.SelectedPaymentMethod.Saved(str);
            } else {
                selectedPaymentMethod = null;
            }
            this.paymentSessionPrefs.savePaymentMethod(id, selectedPaymentMethod);
        }
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : paymentMethod, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : z);
        setPaymentSessionData(copy);
    }

    public final void clearPaymentMethod() {
        PaymentSessionData copy;
        copy = r0.copy((r22 & 1) != 0 ? r0.isShippingInfoRequired : false, (r22 & 2) != 0 ? r0.isShippingMethodRequired : false, (r22 & 4) != 0 ? r0.cartTotal : 0L, (r22 & 8) != 0 ? r0.shippingTotal : 0L, (r22 & 16) != 0 ? r0.shippingInformation : null, (r22 & 32) != 0 ? r0.shippingMethod : null, (r22 & 64) != 0 ? r0.paymentMethod : null, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : false);
        setPaymentSessionData(copy);
    }

    public final /* synthetic */ LiveData fetchCustomer(final boolean z) {
        Set of;
        this._networkState.setValue(NetworkState.Active);
        final C49882uX2 c49882uX2 = new C49882uX2();
        CustomerSession customerSession = this.customerSession;
        of = SetsKt__SetsJVMKt.setOf(PaymentSession.PRODUCT_TOKEN);
        customerSession.retrieveCurrentCustomer$payments_core_release(of, new CustomerSession.CustomerRetrievalListener() { // from class: com.stripe.android.PaymentSessionViewModel$fetchCustomer$1
            @Override // com.stripe.android.CustomerSession.CustomerRetrievalListener
            public void onCustomerRetrieved(Customer customer) {
                Intrinsics.checkNotNullParameter(customer, "customer");
                PaymentSessionViewModel.this.onCustomerRetrieved$payments_core_release(customer.getId(), z, new PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1(PaymentSessionViewModel.this, c49882uX2));
            }

            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i, String errorMessage, StripeError stripeError) {
                C49882uX2 c49882uX22;
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                c49882uX22 = PaymentSessionViewModel.this._networkState;
                c49882uX22.setValue(PaymentSessionViewModel.NetworkState.Inactive);
                c49882uX2.setValue(new PaymentSessionViewModel.FetchCustomerResult.Error(i, errorMessage, stripeError));
            }
        });
        return c49882uX2;
    }

    public final LiveData<NetworkState> getNetworkState$payments_core_release() {
        return this.networkState;
    }

    public final PaymentSessionData getPaymentSessionData() {
        return this.paymentSessionData;
    }

    public final LiveData<PaymentSessionData> getPaymentSessionDataLiveData() {
        return this.paymentSessionDataLiveData;
    }

    public final /* synthetic */ PaymentSessionPrefs.SelectedPaymentMethod getSelectedPaymentMethod(String str) {
        String id;
        String str2 = null;
        if (this.paymentSessionData.getUseGooglePay()) {
            return null;
        }
        PaymentSessionPrefs.SelectedPaymentMethod.Companion companion = PaymentSessionPrefs.SelectedPaymentMethod.Companion;
        PaymentSessionPrefs.SelectedPaymentMethod fromString = companion.fromString(str);
        if (fromString == null) {
            if (this.paymentSessionData.getPaymentMethod() != null) {
                PaymentMethod paymentMethod = this.paymentSessionData.getPaymentMethod();
                if (paymentMethod != null) {
                    str2 = paymentMethod.f75358id;
                }
                return companion.fromString(str2);
            }
            Customer cachedCustomer = this.customerSession.getCachedCustomer();
            if (cachedCustomer == null || (id = cachedCustomer.getId()) == null) {
                return null;
            }
            return this.paymentSessionPrefs.getPaymentMethod(id);
        }
        return fromString;
    }

    public final /* synthetic */ void onCompleted() {
    }

    public final /* synthetic */ void onCustomerRetrieved$payments_core_release(String str, boolean z, Function0 onComplete) {
        Unit unit;
        PaymentSessionData copy;
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (z) {
            PaymentSessionPrefs.SelectedPaymentMethod paymentMethod = this.paymentSessionPrefs.getPaymentMethod(str);
            if (paymentMethod != null) {
                if (paymentMethod instanceof PaymentSessionPrefs.SelectedPaymentMethod.GooglePay) {
                    copy = r4.copy((r22 & 1) != 0 ? r4.isShippingInfoRequired : false, (r22 & 2) != 0 ? r4.isShippingMethodRequired : false, (r22 & 4) != 0 ? r4.cartTotal : 0L, (r22 & 8) != 0 ? r4.shippingTotal : 0L, (r22 & 16) != 0 ? r4.shippingInformation : null, (r22 & 32) != 0 ? r4.shippingMethod : null, (r22 & 64) != 0 ? r4.paymentMethod : null, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : true);
                    setPaymentSessionData(copy);
                    onComplete.invoke();
                } else {
                    fetchCustomerPaymentMethod(paymentMethod.getStringValue(), new PaymentSessionViewModel$onCustomerRetrieved$1$1(onComplete, this));
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                onComplete.invoke();
                return;
            }
            return;
        }
        onComplete.invoke();
    }

    public final /* synthetic */ void onListenerAttached() {
        this._paymentSessionDataLiveData.setValue(this.paymentSessionData);
    }

    public final /* synthetic */ void onPaymentFlowResult(PaymentSessionData paymentSessionData) {
        Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
        setPaymentSessionData(paymentSessionData);
    }

    public final /* synthetic */ void onPaymentMethodResult(PaymentMethodsActivityStarter.Result result) {
        PaymentMethod paymentMethod;
        boolean z;
        if (result != null) {
            paymentMethod = result.paymentMethod;
        } else {
            paymentMethod = null;
        }
        if (result != null) {
            z = result.getUseGooglePay();
        } else {
            z = false;
        }
        persistPaymentMethodResult(paymentMethod, z);
    }

    public final void setPaymentSessionData(PaymentSessionData value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value, this.paymentSessionData)) {
            this.paymentSessionData = value;
            this.savedStateHandle.m66940m(KEY_PAYMENT_SESSION_DATA, value);
            this._paymentSessionDataLiveData.setValue(value);
        }
    }

    public final /* synthetic */ void updateCartTotal(long j) {
        PaymentSessionData copy;
        copy = r0.copy((r22 & 1) != 0 ? r0.isShippingInfoRequired : false, (r22 & 2) != 0 ? r0.isShippingMethodRequired : false, (r22 & 4) != 0 ? r0.cartTotal : j, (r22 & 8) != 0 ? r0.shippingTotal : 0L, (r22 & 16) != 0 ? r0.shippingInformation : null, (r22 & 32) != 0 ? r0.shippingMethod : null, (r22 & 64) != 0 ? r0.paymentMethod : null, (r22 & 128) != 0 ? this.paymentSessionData.useGooglePay : false);
        setPaymentSessionData(copy);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel(Application application, C11747p savedStateHandle, PaymentSessionData paymentSessionData, CustomerSession customerSession, PaymentSessionPrefs paymentSessionPrefs) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
        Intrinsics.checkNotNullParameter(customerSession, "customerSession");
        Intrinsics.checkNotNullParameter(paymentSessionPrefs, "paymentSessionPrefs");
        this.savedStateHandle = savedStateHandle;
        this.customerSession = customerSession;
        this.paymentSessionPrefs = paymentSessionPrefs;
        this.paymentSessionData = paymentSessionData;
        C49882uX2<PaymentSessionData> c49882uX2 = new C49882uX2<>();
        this._paymentSessionDataLiveData = c49882uX2;
        this.paymentSessionDataLiveData = c49882uX2;
        PaymentSessionData paymentSessionData2 = (PaymentSessionData) savedStateHandle.m66947f(KEY_PAYMENT_SESSION_DATA);
        if (paymentSessionData2 != null) {
            setPaymentSessionData(paymentSessionData2);
        }
        C49882uX2<NetworkState> c49882uX22 = new C49882uX2<>();
        this._networkState = c49882uX22;
        this.networkState = c49882uX22;
    }
}
