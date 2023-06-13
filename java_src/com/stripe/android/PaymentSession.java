package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.InterfaceC11733l;
import androidx.lifecycle.LiveData;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionPrefs;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.view.ActivityStarter;
import com.stripe.android.view.PaymentFlowActivity;
import com.stripe.android.view.PaymentFlowActivityStarter;
import com.stripe.android.view.PaymentMethodsActivity;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00014\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002EFBc\b\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010:\u001a\u000209\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\"\u0012\b\b\u0002\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>B\u0019\b\u0016\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b=\u0010AB\u0019\b\u0016\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b=\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0004J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006G"}, m28432d2 = {"Lcom/stripe/android/PaymentSession;", "", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", "onPaymentMethodResult", "", "isInitialFetch", "fetchCustomer", "onCompleted", "", "requestCode", "resultCode", "handlePaymentData", "Lcom/stripe/android/PaymentSession$PaymentSessionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "init", "", "selectedPaymentMethodId", "presentPaymentMethodSelection", "", "cartTotal", "setCartTotal", "presentShippingFlow", "clearPaymentMethod", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "LLifecycleOwner;", "lifecycleOwner", "LLifecycleOwner;", "Lcom/stripe/android/PaymentSessionConfig;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentMethodsActivity;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "paymentMethodsActivityStarter", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "paymentFlowActivityStarter", "Lcom/stripe/android/PaymentSessionViewModel;", "viewModel", "Lcom/stripe/android/PaymentSessionViewModel;", "getViewModel$payments_core_release", "()Lcom/stripe/android/PaymentSessionViewModel;", "Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "getListener$payments_core_release", "()Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "setListener$payments_core_release", "(Lcom/stripe/android/PaymentSession$PaymentSessionListener;)V", "com/stripe/android/PaymentSession$lifecycleObserver$1", "lifecycleObserver", "Lcom/stripe/android/PaymentSession$lifecycleObserver$1;", "LXr6;", "viewModelStoreOwner", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "<init>", "(Landroid/content/Context;LXr6;LLifecycleOwner;Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/CustomerSession;Lcom/stripe/android/view/ActivityStarter;Lcom/stripe/android/view/ActivityStarter;Lcom/stripe/android/PaymentSessionData;)V", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/PaymentSessionConfig;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/PaymentSessionConfig;)V", "Companion", "PaymentSessionListener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PaymentSession {
    public static final String EXTRA_PAYMENT_SESSION_DATA = "extra_payment_session_data";
    public static final String PRODUCT_TOKEN = "PaymentSession";
    private static final Set<Integer> VALID_REQUEST_CODES;
    private final PaymentSessionConfig config;
    private final Context context;
    private final PaymentSession$lifecycleObserver$1 lifecycleObserver;
    private final LifecycleOwner lifecycleOwner;
    private /* synthetic */ PaymentSessionListener listener;
    private final ActivityStarter<PaymentFlowActivity, PaymentFlowActivityStarter.Args> paymentFlowActivityStarter;
    private final ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter;
    private final PaymentSessionViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.PaymentSession$1 */
    /* loaded from: classes6.dex */
    public static final class C186041 extends Lambda implements Function1<PaymentSessionViewModel.NetworkState, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.PaymentSession$1$WhenMappings */
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaymentSessionViewModel.NetworkState.values().length];
                try {
                    iArr[PaymentSessionViewModel.NetworkState.Active.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentSessionViewModel.NetworkState.Inactive.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C186041() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentSessionViewModel.NetworkState networkState) {
            invoke2(networkState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PaymentSessionViewModel.NetworkState networkState) {
            PaymentSessionListener listener$payments_core_release;
            if (networkState == null || (listener$payments_core_release = PaymentSession.this.getListener$payments_core_release()) == null) {
                return;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[networkState.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            listener$payments_core_release.onCommunicatingStateChanged(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/PaymentSessionData;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.PaymentSession$2 */
    /* loaded from: classes6.dex */
    public static final class C186052 extends Lambda implements Function1<PaymentSessionData, Unit> {
        public C186052() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentSessionData paymentSessionData) {
            invoke2(paymentSessionData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PaymentSessionData it) {
            PaymentSessionListener listener$payments_core_release = PaymentSession.this.getListener$payments_core_release();
            if (listener$payments_core_release != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                listener$payments_core_release.onPaymentSessionDataChanged(it);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/PaymentSession$Companion;", "", "()V", "EXTRA_PAYMENT_SESSION_DATA", "", "PRODUCT_TOKEN", "VALID_REQUEST_CODES", "", "", "isValidRequestCode", "", "requestCode", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isValidRequestCode(int i) {
            return PaymentSession.VALID_REQUEST_CODES.contains(Integer.valueOf(i));
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "", "onCommunicatingStateChanged", "", "isCommunicating", "", "onError", "errorCode", "", "errorMessage", "", "onPaymentSessionDataChanged", MessageExtension.FIELD_DATA, "Lcom/stripe/android/PaymentSessionData;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public interface PaymentSessionListener {
        void onCommunicatingStateChanged(boolean z);

        void onError(int i, String str);

        void onPaymentSessionDataChanged(PaymentSessionData paymentSessionData);
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf((int) PaymentMethodsActivityStarter.REQUEST_CODE), Integer.valueOf((int) PaymentFlowActivityStarter.REQUEST_CODE)});
        VALID_REQUEST_CODES = of;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.stripe.android.PaymentSession$lifecycleObserver$1, Fq2] */
    public PaymentSession(Context context, InterfaceC37154Xr6 viewModelStoreOwner, LifecycleOwner lifecycleOwner, PaymentSessionConfig config, CustomerSession customerSession, ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter, ActivityStarter<PaymentFlowActivity, PaymentFlowActivityStarter.Args> paymentFlowActivityStarter, PaymentSessionData paymentSessionData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(customerSession, "customerSession");
        Intrinsics.checkNotNullParameter(paymentMethodsActivityStarter, "paymentMethodsActivityStarter");
        Intrinsics.checkNotNullParameter(paymentFlowActivityStarter, "paymentFlowActivityStarter");
        Intrinsics.checkNotNullParameter(paymentSessionData, "paymentSessionData");
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        this.config = config;
        this.paymentMethodsActivityStarter = paymentMethodsActivityStarter;
        this.paymentFlowActivityStarter = paymentFlowActivityStarter;
        PaymentSessionViewModel paymentSessionViewModel = (PaymentSessionViewModel) new C11759u(viewModelStoreOwner, new PaymentSessionViewModel.Factory(paymentSessionData, customerSession)).m66922a(PaymentSessionViewModel.class);
        this.viewModel = paymentSessionViewModel;
        ?? r3 = new InterfaceC32929Fq2() { // from class: com.stripe.android.PaymentSession$lifecycleObserver$1
            @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_DESTROY)
            public final void onDestroy() {
                PaymentSession.this.setListener$payments_core_release(null);
            }
        };
        this.lifecycleObserver = r3;
        lifecycleOwner.getLifecycle().mo67008a(r3);
        LiveData<PaymentSessionViewModel.NetworkState> networkState$payments_core_release = paymentSessionViewModel.getNetworkState$payments_core_release();
        final C186041 c186041 = new C186041();
        networkState$payments_core_release.observe(lifecycleOwner, new InterfaceC41056fe3() { // from class: yP3
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                PaymentSession._init_$lambda$0(Function1.this, obj);
            }
        });
        LiveData<PaymentSessionData> paymentSessionDataLiveData = paymentSessionViewModel.getPaymentSessionDataLiveData();
        final C186052 c186052 = new C186052();
        paymentSessionDataLiveData.observe(lifecycleOwner, new InterfaceC41056fe3() { // from class: zP3
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                PaymentSession._init_$lambda$1(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void fetchCustomer(boolean z) {
        LiveData fetchCustomer = this.viewModel.fetchCustomer(z);
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        final PaymentSession$fetchCustomer$1 paymentSession$fetchCustomer$1 = new PaymentSession$fetchCustomer$1(this);
        fetchCustomer.observe(lifecycleOwner, new InterfaceC41056fe3() { // from class: xP3
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                PaymentSession.fetchCustomer$lambda$3(Function1.this, obj);
            }
        });
    }

    public static /* synthetic */ void fetchCustomer$default(PaymentSession paymentSession, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        paymentSession.fetchCustomer(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchCustomer$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void onPaymentMethodResult(Intent intent) {
        this.viewModel.onPaymentMethodResult(PaymentMethodsActivityStarter.Result.Companion.fromIntent(intent));
    }

    public static /* synthetic */ void presentPaymentMethodSelection$default(PaymentSession paymentSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        paymentSession.presentPaymentMethodSelection(str);
    }

    public final void clearPaymentMethod() {
        this.viewModel.clearPaymentMethod();
    }

    public final PaymentSessionListener getListener$payments_core_release() {
        return this.listener;
    }

    public final PaymentSessionViewModel getViewModel$payments_core_release() {
        return this.viewModel;
    }

    public final boolean handlePaymentData(int i, int i2, Intent intent) {
        if (intent == null || !Companion.isValidRequestCode(i)) {
            return false;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                return false;
            }
            if (i == 6000) {
                onPaymentMethodResult(intent);
                return false;
            }
            fetchCustomer$default(this, false, 1, null);
            return false;
        }
        if (i != 6000) {
            if (i != 6002) {
                return false;
            }
            PaymentSessionData paymentSessionData = (PaymentSessionData) intent.getParcelableExtra(EXTRA_PAYMENT_SESSION_DATA);
            if (paymentSessionData != null) {
                this.viewModel.onPaymentFlowResult(paymentSessionData);
            }
        } else {
            onPaymentMethodResult(intent);
        }
        return true;
    }

    public final void init(PaymentSessionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.viewModel.onListenerAttached();
        if (this.config.getShouldPrefetchCustomer$payments_core_release()) {
            fetchCustomer(true);
        }
    }

    public final void onCompleted() {
        this.viewModel.onCompleted();
    }

    public final void presentPaymentMethodSelection(String str) {
        boolean useGooglePay;
        String str2;
        PaymentSessionPrefs.SelectedPaymentMethod selectedPaymentMethod = this.viewModel.getSelectedPaymentMethod(str);
        if (selectedPaymentMethod instanceof PaymentSessionPrefs.SelectedPaymentMethod.GooglePay) {
            useGooglePay = true;
        } else {
            useGooglePay = this.viewModel.getPaymentSessionData().getUseGooglePay();
        }
        ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> activityStarter = this.paymentMethodsActivityStarter;
        PaymentMethodsActivityStarter.Args.Builder builder = new PaymentMethodsActivityStarter.Args.Builder();
        if (selectedPaymentMethod != null) {
            str2 = selectedPaymentMethod.getStringValue();
        } else {
            str2 = null;
        }
        activityStarter.startForResult(builder.setInitialPaymentMethodId(str2).setPaymentMethodsFooter(this.config.getPaymentMethodsFooterLayoutId()).setAddPaymentMethodFooter(this.config.getAddPaymentMethodFooterLayoutId()).setIsPaymentSessionActive(true).setPaymentConfiguration(PaymentConfiguration.Companion.getInstance(this.context)).setPaymentMethodTypes(this.config.getPaymentMethodTypes()).setShouldShowGooglePay(this.config.getShouldShowGooglePay()).setWindowFlags(this.config.getWindowFlags$payments_core_release()).setBillingAddressFields(this.config.getBillingAddressFields()).setUseGooglePay$payments_core_release(useGooglePay).setCanDeletePaymentMethods(this.config.getCanDeletePaymentMethods()).build());
    }

    public final void presentShippingFlow() {
        this.paymentFlowActivityStarter.startForResult(new PaymentFlowActivityStarter.Args(this.config, this.viewModel.getPaymentSessionData(), true, this.config.getWindowFlags$payments_core_release()));
    }

    public final void setCartTotal(long j) {
        this.viewModel.updateCartTotal(j);
    }

    public final void setListener$payments_core_release(PaymentSessionListener paymentSessionListener) {
        this.listener = paymentSessionListener;
    }

    public /* synthetic */ PaymentSession(Context context, InterfaceC37154Xr6 interfaceC37154Xr6, LifecycleOwner lifecycleOwner, PaymentSessionConfig paymentSessionConfig, CustomerSession customerSession, ActivityStarter activityStarter, ActivityStarter activityStarter2, PaymentSessionData paymentSessionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC37154Xr6, lifecycleOwner, paymentSessionConfig, customerSession, activityStarter, activityStarter2, (i & 128) != 0 ? new PaymentSessionData(paymentSessionConfig) : paymentSessionData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentSession(ComponentActivity activity, PaymentSessionConfig config) {
        this(r2, activity, activity, config, CustomerSession.Companion.getInstance(), new PaymentMethodsActivityStarter(activity), new PaymentFlowActivityStarter(activity, config), null, 128, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentSession(Fragment fragment, PaymentSessionConfig config) {
        this(r2, fragment, fragment, config, CustomerSession.Companion.getInstance(), new PaymentMethodsActivityStarter(fragment), new PaymentFlowActivityStarter(fragment, config), null, 128, null);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = fragment.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "fragment.requireActivity().applicationContext");
    }
}
