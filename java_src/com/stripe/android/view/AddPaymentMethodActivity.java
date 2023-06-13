package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import com.adyen.checkout.components.model.payments.response.Action;
import com.stripe.android.C18606R;
import com.stripe.android.CustomerSession;
import com.stripe.android.Stripe;
import com.stripe.android.databinding.AddPaymentMethodActivityBinding;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.utils.ActivityUtilsKt;
import com.stripe.android.view.AddPaymentMethodActivity;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J\u001f\u0010/\u001a\u00020'2\u0006\u0010!\u001a\u00020\"2\b\u00100\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0002\b2J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u00104\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020'H\u0016J\u0012\u00109\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020\u0014H\u0014J\b\u0010>\u001a\u00020'H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$¨\u0006@"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/StripeActivity;", "()V", "addPaymentMethodView", "Lcom/stripe/android/view/AddPaymentMethodView;", "getAddPaymentMethodView", "()Lcom/stripe/android/view/AddPaymentMethodView;", "addPaymentMethodView$delegate", "Lkotlin/Lazy;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args$delegate", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/PaymentMethod$Type;", "getPaymentMethodType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType$delegate", "shouldAttachToCustomer", "", "getShouldAttachToCustomer", "()Z", "shouldAttachToCustomer$delegate", "stripe", "Lcom/stripe/android/Stripe;", "getStripe", "()Lcom/stripe/android/Stripe;", "stripe$delegate", "titleStringRes", "", "getTitleStringRes", "()I", "viewModel", "Lcom/stripe/android/view/AddPaymentMethodViewModel;", "getViewModel", "()Lcom/stripe/android/view/AddPaymentMethodViewModel;", "viewModel$delegate", "attachPaymentMethodToCustomer", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "configureView", "createFooterView", "Landroid/view/View;", "contentRoot", "Landroid/view/ViewGroup;", "createPaymentMethod", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod$payments_core_release", "createPaymentMethodView", "finishWithPaymentMethod", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "onActionSave", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onProgressBarVisibilityChanged", "visible", "onResume", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddPaymentMethodActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodActivity.kt\ncom/stripe/android/view/AddPaymentMethodActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,260:1\n75#2,13:261\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethodActivity.kt\ncom/stripe/android/view/AddPaymentMethodActivity\n*L\n63#1:261,13\n*E\n"})
/* loaded from: classes7.dex */
public final class AddPaymentMethodActivity extends StripeActivity {
    public static final String PRODUCT_TOKEN = "AddPaymentMethodActivity";
    private final Lazy addPaymentMethodView$delegate;
    private final Lazy args$delegate;
    private final Lazy paymentMethodType$delegate;
    private final Lazy shouldAttachToCustomer$delegate;
    private final Lazy stripe$delegate;
    private final Lazy viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity$Companion;", "", "()V", "PRODUCT_TOKEN", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.Netbanking.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AddPaymentMethodActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        lazy = LazyKt__LazyJVMKt.lazy(new AddPaymentMethodActivity$args$2(this));
        this.args$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new AddPaymentMethodActivity$stripe$2(this));
        this.stripe$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new AddPaymentMethodActivity$paymentMethodType$2(this));
        this.paymentMethodType$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new AddPaymentMethodActivity$shouldAttachToCustomer$2(this));
        this.shouldAttachToCustomer$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new AddPaymentMethodActivity$addPaymentMethodView$2(this));
        this.addPaymentMethodView$delegate = lazy5;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(AddPaymentMethodViewModel.class), new AddPaymentMethodActivity$special$$inlined$viewModels$default$2(this), new AddPaymentMethodActivity$viewModel$2(this), new AddPaymentMethodActivity$special$$inlined$viewModels$default$3(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachPaymentMethodToCustomer(PaymentMethod paymentMethod) {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(CustomerSession.Companion.getInstance());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            LiveData attachPaymentMethod$payments_core_release = getViewModel().attachPaymentMethod$payments_core_release((CustomerSession) m116783constructorimpl, paymentMethod);
            final AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1 addPaymentMethodActivity$attachPaymentMethodToCustomer$2$1 = new AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1(this);
            attachPaymentMethod$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: o7
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    AddPaymentMethodActivity.attachPaymentMethodToCustomer$lambda$5$lambda$4(Function1.this, obj);
                }
            });
            return;
        }
        finishWithResult(new AddPaymentMethodActivityStarter.Result.Failure(m116786exceptionOrNullimpl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPaymentMethodToCustomer$lambda$5$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void configureView(AddPaymentMethodActivityStarter.Args args) {
        Integer windowFlags$payments_core_release = args.getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        getViewStub$payments_core_release().setLayoutResource(C18606R.C18609layout.add_payment_method_activity);
        View inflate = getViewStub$payments_core_release().inflate();
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        AddPaymentMethodActivityBinding bind = AddPaymentMethodActivityBinding.bind((ViewGroup) inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(scrollView)");
        bind.root.addView(getAddPaymentMethodView());
        LinearLayout linearLayout = bind.root;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewBinding.root");
        View createFooterView = createFooterView(linearLayout);
        if (createFooterView != null) {
            getAddPaymentMethodView().setAccessibilityTraversalBefore(createFooterView.getId());
            createFooterView.setAccessibilityTraversalAfter(getAddPaymentMethodView().getId());
            bind.root.addView(createFooterView);
        }
        setTitle(getTitleStringRes());
    }

    private final View createFooterView(ViewGroup viewGroup) {
        if (getArgs().getAddPaymentMethodFooterLayoutId$payments_core_release() > 0) {
            View inflate = getLayoutInflater().inflate(getArgs().getAddPaymentMethodFooterLayoutId$payments_core_release(), viewGroup, false);
            inflate.setId(C18606R.C18608id.stripe_add_payment_method_footer);
            if (inflate instanceof TextView) {
                TextView textView = (TextView) inflate;
                C36916Wr2.m77791d(textView, 15);
                C38790bq6.m62477j(inflate);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return inflate;
            }
            return inflate;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPaymentMethod$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddPaymentMethodView createPaymentMethodView(AddPaymentMethodActivityStarter.Args args) {
        int i = WhenMappings.$EnumSwitchMapping$0[getPaymentMethodType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return AddPaymentMethodNetbankingView.Companion.create$payments_core_release(this);
                }
                String str = getPaymentMethodType().code;
                throw new IllegalArgumentException("Unsupported Payment Method type: " + str);
            }
            return AddPaymentMethodFpxView.Companion.create$payments_core_release(this);
        }
        return new AddPaymentMethodCardView(this, null, 0, args.getBillingAddressFields$payments_core_release(), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithPaymentMethod(PaymentMethod paymentMethod) {
        finishWithResult(new AddPaymentMethodActivityStarter.Result.Success(paymentMethod));
    }

    private final void finishWithResult(AddPaymentMethodActivityStarter.Result result) {
        setProgressBarVisible(false);
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    private final AddPaymentMethodView getAddPaymentMethodView() {
        return (AddPaymentMethodView) this.addPaymentMethodView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddPaymentMethodActivityStarter.Args getArgs() {
        return (AddPaymentMethodActivityStarter.Args) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethod.Type getPaymentMethodType() {
        return (PaymentMethod.Type) this.paymentMethodType$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldAttachToCustomer() {
        return ((Boolean) this.shouldAttachToCustomer$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Stripe getStripe() {
        return (Stripe) this.stripe$delegate.getValue();
    }

    private final int getTitleStringRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[getPaymentMethodType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C18606R.string.title_bank_account;
                }
                String str = getPaymentMethodType().code;
                throw new IllegalArgumentException("Unsupported Payment Method type: " + str);
            }
            return C18606R.string.title_bank_account;
        }
        return C18606R.string.title_add_a_card;
    }

    private final AddPaymentMethodViewModel getViewModel() {
        return (AddPaymentMethodViewModel) this.viewModel$delegate.getValue();
    }

    public final void createPaymentMethod$payments_core_release(AddPaymentMethodViewModel viewModel, PaymentMethodCreateParams paymentMethodCreateParams) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (paymentMethodCreateParams == null) {
            return;
        }
        setProgressBarVisible(true);
        LiveData<Result<PaymentMethod>> createPaymentMethod$payments_core_release = viewModel.createPaymentMethod$payments_core_release(paymentMethodCreateParams);
        final AddPaymentMethodActivity$createPaymentMethod$1 addPaymentMethodActivity$createPaymentMethod$1 = new AddPaymentMethodActivity$createPaymentMethod$1(this);
        createPaymentMethod$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: p7
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                AddPaymentMethodActivity.createPaymentMethod$lambda$2(Function1.this, obj);
            }
        });
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onActionSave() {
        createPaymentMethod$payments_core_release(getViewModel(), getAddPaymentMethodView().getCreateParams());
    }

    @Override // com.stripe.android.view.StripeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ActivityUtilsKt.argsAreInvalid(this, new AddPaymentMethodActivity$onCreate$1(this))) {
            return;
        }
        configureView(getArgs());
        setResult(-1, new Intent().putExtras(AddPaymentMethodActivityStarter.Result.Canceled.INSTANCE.toBundle()));
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onProgressBarVisibilityChanged(boolean z) {
        getAddPaymentMethodView().setCommunicatingProgress(z);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getAddPaymentMethodView().requestFocus();
    }
}
