package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.PaymentMethodsActivityBinding;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.utils.ActivityUtilsKt;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentMethodsActivity;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import com.stripe.android.view.PaymentMethodsAdapter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\u001c\u00105\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u000209H\u0002J\u0015\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=J\u0010\u0010>\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J\u0012\u0010?\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u000203H\u0014J\b\u0010C\u001a\u00020\u001fH\u0016J\b\u0010D\u001a\u000203H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "getAdapter", "()Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "alertDisplayer", "Lcom/stripe/android/view/AlertDisplayer;", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "args", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "args$delegate", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "getCardDisplayTextFactory", "()Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory$delegate", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "getCustomerSession-d1pmJ48", "()Ljava/lang/Object;", "customerSession$delegate", "earlyExitDueToIllegalState", "", "startedFromPaymentSession", "getStartedFromPaymentSession", "()Z", "startedFromPaymentSession$delegate", "viewBinding", "Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentMethodsViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentMethodsViewModel;", "viewModel$delegate", "createFooterView", "Landroid/view/View;", "contentRoot", "Landroid/view/ViewGroup;", "fetchCustomerPaymentMethods", "", "finishWithGooglePay", "finishWithResult", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "resultCode", "", "onAddPaymentMethodResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "onAddPaymentMethodResult$payments_core_release", "onAddedPaymentMethod", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSupportNavigateUp", "setupRecyclerView", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,304:1\n75#2,13:305\n262#3,2:318\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity\n*L\n62#1:305,13\n142#1:318,2\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity extends AppCompatActivity {
    public static final String PRODUCT_TOKEN = "PaymentMethodsActivity";
    private final Lazy adapter$delegate;
    private final Lazy alertDisplayer$delegate;
    private final Lazy args$delegate;
    private final Lazy cardDisplayTextFactory$delegate;
    private final Lazy customerSession$delegate;
    private boolean earlyExitDueToIllegalState;
    private final Lazy startedFromPaymentSession$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity$Companion;", "", "()V", "PRODUCT_TOKEN", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentMethodsActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        lazy = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$startedFromPaymentSession$2(this));
        this.startedFromPaymentSession$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$customerSession$2(this));
        this.customerSession$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$cardDisplayTextFactory$2(this));
        this.cardDisplayTextFactory$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$alertDisplayer$2(this));
        this.alertDisplayer$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$args$2(this));
        this.args$delegate = lazy6;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(PaymentMethodsViewModel.class), new PaymentMethodsActivity$special$$inlined$viewModels$default$2(this), new PaymentMethodsActivity$viewModel$2(this), new PaymentMethodsActivity$special$$inlined$viewModels$default$3(null, this));
        lazy7 = LazyKt__LazyJVMKt.lazy(new PaymentMethodsActivity$adapter$2(this));
        this.adapter$delegate = lazy7;
    }

    private final View createFooterView(ViewGroup viewGroup) {
        if (getArgs().getPaymentMethodsFooterLayoutId() > 0) {
            View inflate = getLayoutInflater().inflate(getArgs().getPaymentMethodsFooterLayoutId(), viewGroup, false);
            inflate.setId(C18606R.C18608id.stripe_payment_methods_footer);
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

    private final void fetchCustomerPaymentMethods() {
        LiveData paymentMethods$payments_core_release = getViewModel().getPaymentMethods$payments_core_release();
        final PaymentMethodsActivity$fetchCustomerPaymentMethods$1 paymentMethodsActivity$fetchCustomerPaymentMethods$1 = new PaymentMethodsActivity$fetchCustomerPaymentMethods$1(this);
        paymentMethods$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: qO3
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                PaymentMethodsActivity.fetchCustomerPaymentMethods$lambda$6(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchCustomerPaymentMethods$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithGooglePay() {
        setResult(-1, new Intent().putExtras(new PaymentMethodsActivityStarter.Result(null, true, 1, null).toBundle()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(PaymentMethod paymentMethod, int i) {
        boolean z;
        Intent intent = new Intent();
        if (getArgs().getUseGooglePay$payments_core_release() && paymentMethod == null) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtras(new PaymentMethodsActivityStarter.Result(paymentMethod, z).toBundle());
        Unit unit = Unit.INSTANCE;
        setResult(i, intent);
        finish();
    }

    public static /* synthetic */ void finishWithResult$default(PaymentMethodsActivity paymentMethodsActivity, PaymentMethod paymentMethod, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        paymentMethodsActivity.finishWithResult(paymentMethod, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodsAdapter getAdapter() {
        return (PaymentMethodsAdapter) this.adapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodsActivityStarter.Args getArgs() {
        return (PaymentMethodsActivityStarter.Args) this.args$delegate.getValue();
    }

    private final CardDisplayTextFactory getCardDisplayTextFactory() {
        return (CardDisplayTextFactory) this.cardDisplayTextFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCustomerSession-d1pmJ48  reason: not valid java name */
    public final Object m116776getCustomerSessiond1pmJ48() {
        return ((Result) this.customerSession$delegate.getValue()).m116792unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getStartedFromPaymentSession() {
        return ((Boolean) this.startedFromPaymentSession$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodsViewModel getViewModel() {
        return (PaymentMethodsViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r0.isReusable == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onAddedPaymentMethod(PaymentMethod paymentMethod) {
        boolean z;
        PaymentMethod.Type type = paymentMethod.type;
        if (type != null) {
            z = true;
        }
        z = false;
        if (z) {
            fetchCustomerPaymentMethods();
            getViewModel().onPaymentMethodAdded$payments_core_release(paymentMethod);
            return;
        }
        finishWithResult$default(this, paymentMethod, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void setupRecyclerView() {
        final DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory = new DeletePaymentMethodDialogFactory(this, getAdapter(), getCardDisplayTextFactory(), m116776getCustomerSessiond1pmJ48(), getViewModel().getProductUsage$payments_core_release(), new C19520xe0e9443f(this));
        getAdapter().setListener$payments_core_release(new PaymentMethodsAdapter.Listener() { // from class: com.stripe.android.view.PaymentMethodsActivity$setupRecyclerView$1
            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onDeletePaymentMethodAction(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                deletePaymentMethodDialogFactory.create(paymentMethod).show();
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onGooglePayClick() {
                PaymentMethodsActivity.this.finishWithGooglePay();
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onPaymentMethodClick(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                PaymentMethodsActivity.this.getViewBinding$payments_core_release().recycler.setTappedPaymentMethod$payments_core_release(paymentMethod);
            }
        });
        getViewBinding$payments_core_release().recycler.setAdapter(getAdapter());
        getViewBinding$payments_core_release().recycler.setPaymentMethodSelectedCallback$payments_core_release(new PaymentMethodsActivity$setupRecyclerView$2(this));
        if (getArgs().getCanDeletePaymentMethods$payments_core_release()) {
            getViewBinding$payments_core_release().recycler.attachItemTouchHelper$payments_core_release(new PaymentMethodSwipeCallback(this, getAdapter(), new SwipeToDeleteCallbackListener(deletePaymentMethodDialogFactory)));
        }
    }

    public final PaymentMethodsActivityBinding getViewBinding$payments_core_release() {
        return (PaymentMethodsActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final void onAddPaymentMethodResult$payments_core_release(AddPaymentMethodActivityStarter.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof AddPaymentMethodActivityStarter.Result.Success) {
            onAddedPaymentMethod(((AddPaymentMethodActivityStarter.Result.Success) result).getPaymentMethod());
        } else {
            boolean z = result instanceof AddPaymentMethodActivityStarter.Result.Failure;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Result.m116789isFailureimpl(m116776getCustomerSessiond1pmJ48())) {
            finishWithResult(null, 0);
        } else if (ActivityUtilsKt.argsAreInvalid(this, new PaymentMethodsActivity$onCreate$1(this))) {
            this.earlyExitDueToIllegalState = true;
        } else {
            setContentView(getViewBinding$payments_core_release().getRoot());
            Integer windowFlags$payments_core_release = getArgs().getWindowFlags$payments_core_release();
            if (windowFlags$payments_core_release != null) {
                getWindow().addFlags(windowFlags$payments_core_release.intValue());
            }
            OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
            C38677bf3.m64201b(onBackPressedDispatcher, null, false, new PaymentMethodsActivity$onCreate$3(this), 3, null);
            C49882uX2<String> snackbarData$payments_core_release = getViewModel().getSnackbarData$payments_core_release();
            final PaymentMethodsActivity$onCreate$4 paymentMethodsActivity$onCreate$4 = new PaymentMethodsActivity$onCreate$4(this);
            snackbarData$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: rO3
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    PaymentMethodsActivity.onCreate$lambda$1(Function1.this, obj);
                }
            });
            C49882uX2<Boolean> progressData$payments_core_release = getViewModel().getProgressData$payments_core_release();
            final PaymentMethodsActivity$onCreate$5 paymentMethodsActivity$onCreate$5 = new PaymentMethodsActivity$onCreate$5(this);
            progressData$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: sO3
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    PaymentMethodsActivity.onCreate$lambda$2(Function1.this, obj);
                }
            });
            setupRecyclerView();
            AbstractC0407B5 registerForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new InterfaceC28515t5() { // from class: tO3
                @Override // p000.InterfaceC28515t5
                /* renamed from: a */
                public final void mo1514a(Object obj) {
                    PaymentMethodsActivity.this.onAddPaymentMethodResult$payments_core_release((AddPaymentMethodActivityStarter.Result) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…entMethodResult\n        )");
            LiveData<AddPaymentMethodActivityStarter.Args> addPaymentMethodArgs = getAdapter().getAddPaymentMethodArgs();
            final PaymentMethodsActivity$onCreate$6 paymentMethodsActivity$onCreate$6 = new PaymentMethodsActivity$onCreate$6(registerForActivityResult);
            addPaymentMethodArgs.observe(this, new InterfaceC41056fe3() { // from class: uO3
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    PaymentMethodsActivity.onCreate$lambda$3(Function1.this, obj);
                }
            });
            setSupportActionBar(getViewBinding$payments_core_release().toolbar);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo70212v(true);
                supportActionBar.mo70210x(true);
            }
            FrameLayout frameLayout = getViewBinding$payments_core_release().footerContainer;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "viewBinding.footerContainer");
            View createFooterView = createFooterView(frameLayout);
            if (createFooterView != null) {
                getViewBinding$payments_core_release().recycler.setAccessibilityTraversalBefore(createFooterView.getId());
                createFooterView.setAccessibilityTraversalAfter(getViewBinding$payments_core_release().recycler.getId());
                getViewBinding$payments_core_release().footerContainer.addView(createFooterView);
                FrameLayout frameLayout2 = getViewBinding$payments_core_release().footerContainer;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "viewBinding.footerContainer");
                frameLayout2.setVisibility(0);
            }
            fetchCustomerPaymentMethods();
            getViewBinding$payments_core_release().recycler.requestFocusFromTouch();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str;
        if (!this.earlyExitDueToIllegalState) {
            PaymentMethodsViewModel viewModel = getViewModel();
            PaymentMethod selectedPaymentMethod$payments_core_release = getAdapter().getSelectedPaymentMethod$payments_core_release();
            if (selectedPaymentMethod$payments_core_release != null) {
                str = selectedPaymentMethod$payments_core_release.f75358id;
            } else {
                str = null;
            }
            viewModel.setSelectedPaymentMethodId$payments_core_release(str);
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finishWithResult(getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
        return true;
    }
}
