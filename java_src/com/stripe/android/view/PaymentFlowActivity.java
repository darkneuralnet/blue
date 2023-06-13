package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.stripe.android.C18606R;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.databinding.PaymentFlowActivityBinding;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.utils.ActivityUtilsKt;
import com.stripe.android.view.PaymentFlowActivity;
import com.stripe.android.view.PaymentFlowActivityStarter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000201H\u0016J\u0012\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=H\u0002J'\u0010>\u001a\u0002012\b\u0010?\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0000¢\u0006\u0002\bCJ\b\u0010D\u001a\u000201H\u0002J\u0016\u0010E\u001a\u0002012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\b\u0010F\u001a\u000201H\u0002J\u0016\u0010G\u001a\u0002012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\"\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010?\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b-\u0010.¨\u0006N"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/StripeActivity;", "()V", "args", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "args$delegate", "Lkotlin/Lazy;", "customerSession", "Lcom/stripe/android/CustomerSession;", "getCustomerSession", "()Lcom/stripe/android/CustomerSession;", "customerSession$delegate", "keyboardController", "Lcom/stripe/android/view/KeyboardController;", "getKeyboardController", "()Lcom/stripe/android/view/KeyboardController;", "keyboardController$delegate", "paymentFlowPagerAdapter", "Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "getPaymentFlowPagerAdapter", "()Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "paymentFlowPagerAdapter$delegate", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "getPaymentSessionConfig", "()Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig$delegate", "shippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "viewBinding", "Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentFlowViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentFlowViewModel;", "viewModel$delegate", "viewPager", "Lcom/stripe/android/view/PaymentFlowViewPager;", "getViewPager", "()Lcom/stripe/android/view/PaymentFlowViewPager;", "viewPager$delegate", "finishWithData", "", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "hasNextPage", "", "hasPreviousPage", "onActionSave", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShippingInfoError", "error", "", "onShippingInfoSaved", "shippingInformation", "shippingMethods", "", "Lcom/stripe/android/model/ShippingMethod;", "onShippingInfoSaved$payments_core_release", "onShippingInfoSubmitted", "onShippingInfoValidated", "onShippingMethodSave", "onShippingMethodsReady", "validateShippingInformation", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentFlowActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFlowActivity.kt\ncom/stripe/android/view/PaymentFlowActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n75#2,13:264\n1#3:277\n*S KotlinDebug\n*F\n+ 1 PaymentFlowActivity.kt\ncom/stripe/android/view/PaymentFlowActivity\n*L\n45#1:264,13\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentFlowActivity extends StripeActivity {
    public static final String PRODUCT_TOKEN = "PaymentFlowActivity";
    private final Lazy args$delegate;
    private final Lazy customerSession$delegate;
    private final Lazy keyboardController$delegate;
    private final Lazy paymentFlowPagerAdapter$delegate;
    private final Lazy paymentSessionConfig$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewModel$delegate;
    private final Lazy viewPager$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowActivity$Companion;", "", "()V", "PRODUCT_TOKEN", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentFlowActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        lazy = LazyKt__LazyJVMKt.lazy(new PaymentFlowActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new PaymentFlowActivity$viewPager$2(this));
        this.viewPager$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(PaymentFlowActivity$customerSession$2.INSTANCE);
        this.customerSession$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new PaymentFlowActivity$args$2(this));
        this.args$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new PaymentFlowActivity$paymentSessionConfig$2(this));
        this.paymentSessionConfig$delegate = lazy5;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(PaymentFlowViewModel.class), new PaymentFlowActivity$special$$inlined$viewModels$default$2(this), new PaymentFlowActivity$viewModel$2(this), new PaymentFlowActivity$special$$inlined$viewModels$default$3(null, this));
        lazy6 = LazyKt__LazyJVMKt.lazy(new PaymentFlowActivity$paymentFlowPagerAdapter$2(this));
        this.paymentFlowPagerAdapter$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new PaymentFlowActivity$keyboardController$2(this));
        this.keyboardController$delegate = lazy7;
    }

    private final void finishWithData(PaymentSessionData paymentSessionData) {
        setResult(-1, new Intent().putExtra(PaymentSession.EXTRA_PAYMENT_SESSION_DATA, paymentSessionData));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowActivityStarter.Args getArgs() {
        return (PaymentFlowActivityStarter.Args) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSession getCustomerSession() {
        return (CustomerSession) this.customerSession$delegate.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowPagerAdapter getPaymentFlowPagerAdapter() {
        return (PaymentFlowPagerAdapter) this.paymentFlowPagerAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSessionConfig getPaymentSessionConfig() {
        return (PaymentSessionConfig) this.paymentSessionConfig$delegate.getValue();
    }

    private final ShippingInformation getShippingInfo() {
        return ((ShippingInfoWidget) getViewPager().findViewById(C18606R.C18608id.shipping_info_widget)).getShippingInformation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowActivityBinding getViewBinding() {
        return (PaymentFlowActivityBinding) this.viewBinding$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewModel getViewModel() {
        return (PaymentFlowViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewPager getViewPager() {
        return (PaymentFlowViewPager) this.viewPager$delegate.getValue();
    }

    private final boolean hasNextPage() {
        return getViewPager().getCurrentItem() + 1 < getPaymentFlowPagerAdapter().getCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasPreviousPage() {
        return getViewPager().getCurrentItem() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShippingInfoError(Throwable th) {
        PaymentSessionData copy;
        String message = th.getMessage();
        boolean z = false;
        setProgressBarVisible(false);
        if (!((message == null || message.length() == 0) ? true : true)) {
            showError(message);
        } else {
            String string = getString(C18606R.string.invalid_shipping_information);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.invalid_shipping_information)");
            showError(string);
        }
        PaymentFlowViewModel viewModel = getViewModel();
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        viewModel.setPaymentSessionData$payments_core_release(copy);
    }

    public static /* synthetic */ void onShippingInfoSaved$payments_core_release$default(PaymentFlowActivity paymentFlowActivity, ShippingInformation shippingInformation, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        paymentFlowActivity.onShippingInfoSaved$payments_core_release(shippingInformation, list);
    }

    private final void onShippingInfoSubmitted() {
        PaymentSessionData copy;
        getKeyboardController().hide();
        ShippingInformation shippingInfo = getShippingInfo();
        if (shippingInfo != null) {
            PaymentFlowViewModel viewModel = getViewModel();
            copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : shippingInfo, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
            viewModel.setPaymentSessionData$payments_core_release(copy);
            setProgressBarVisible(true);
            validateShippingInformation(getPaymentSessionConfig().getShippingInformationValidator$payments_core_release(), getPaymentSessionConfig().getShippingMethodsFactory$payments_core_release(), shippingInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShippingInfoValidated(List<ShippingMethod> list) {
        ShippingInformation shippingInformation = getViewModel().getPaymentSessionData$payments_core_release().getShippingInformation();
        if (shippingInformation != null) {
            LiveData saveCustomerShippingInformation$payments_core_release = getViewModel().saveCustomerShippingInformation$payments_core_release(shippingInformation);
            final PaymentFlowActivity$onShippingInfoValidated$1$1 paymentFlowActivity$onShippingInfoValidated$1$1 = new PaymentFlowActivity$onShippingInfoValidated$1$1(this, list);
            saveCustomerShippingInformation$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: kM3
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    PaymentFlowActivity.onShippingInfoValidated$lambda$2$lambda$1(Function1.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onShippingInfoValidated$lambda$2$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void onShippingMethodSave() {
        PaymentSessionData copy;
        copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : ((SelectShippingMethodWidget) getViewPager().findViewById(C18606R.C18608id.select_shipping_method_widget)).getSelectedShippingMethod(), (r22 & 64) != 0 ? r1.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        finishWithData(copy);
    }

    private final void onShippingMethodsReady(List<ShippingMethod> list) {
        setProgressBarVisible(false);
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(list);
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(true);
        if (hasNextPage()) {
            PaymentFlowViewModel viewModel = getViewModel();
            viewModel.setCurrentPage$payments_core_release(viewModel.getCurrentPage$payments_core_release() + 1);
            getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
            return;
        }
        finishWithData(getViewModel().getPaymentSessionData$payments_core_release());
    }

    private final void validateShippingInformation(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        LiveData validateShippingInformation$payments_core_release = getViewModel().validateShippingInformation$payments_core_release(shippingInformationValidator, shippingMethodsFactory, shippingInformation);
        final PaymentFlowActivity$validateShippingInformation$1 paymentFlowActivity$validateShippingInformation$1 = new PaymentFlowActivity$validateShippingInformation$1(this);
        validateShippingInformation$payments_core_release.observe(this, new InterfaceC41056fe3() { // from class: lM3
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                PaymentFlowActivity.validateShippingInformation$lambda$4(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateShippingInformation$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onActionSave() {
        if (PaymentFlowPage.ShippingInfo == getPaymentFlowPagerAdapter().getPageAt$payments_core_release(getViewPager().getCurrentItem())) {
            onShippingInfoSubmitted();
        } else {
            onShippingMethodSave();
        }
    }

    @Override // com.stripe.android.view.StripeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ActivityUtilsKt.argsAreInvalid(this, new PaymentFlowActivity$onCreate$1(this))) {
            return;
        }
        PaymentFlowActivityStarter.Args.Companion companion = PaymentFlowActivityStarter.Args.Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        Integer windowFlags$payments_core_release = companion.create(intent).getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        ShippingInformation submittedShippingInfo$payments_core_release = getViewModel().getSubmittedShippingInfo$payments_core_release();
        if (submittedShippingInfo$payments_core_release == null) {
            submittedShippingInfo$payments_core_release = getPaymentSessionConfig().getPrepopulatedShippingInfo();
        }
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(getViewModel().getShippingMethods$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(getViewModel().isShippingInfoSubmitted$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInformation$payments_core_release(submittedShippingInfo$payments_core_release);
        getPaymentFlowPagerAdapter().setSelectedShippingMethod$payments_core_release(getViewModel().getSelectedShippingMethod$payments_core_release());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        final AbstractC36566Ve3 m64201b = C38677bf3.m64201b(onBackPressedDispatcher, null, false, new PaymentFlowActivity$onCreate$onBackPressedCallback$1(this), 3, null);
        getViewPager().setAdapter(getPaymentFlowPagerAdapter());
        getViewPager().addOnPageChangeListener(new ViewPager.InterfaceC12076i() { // from class: com.stripe.android.view.PaymentFlowActivity$onCreate$3
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
            public void onPageSelected(int i) {
                PaymentFlowPagerAdapter paymentFlowPagerAdapter;
                PaymentFlowPagerAdapter paymentFlowPagerAdapter2;
                boolean hasPreviousPage;
                PaymentFlowViewModel viewModel;
                PaymentFlowPagerAdapter paymentFlowPagerAdapter3;
                PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
                paymentFlowPagerAdapter = paymentFlowActivity.getPaymentFlowPagerAdapter();
                paymentFlowActivity.setTitle(paymentFlowPagerAdapter.getPageTitle(i));
                paymentFlowPagerAdapter2 = PaymentFlowActivity.this.getPaymentFlowPagerAdapter();
                if (paymentFlowPagerAdapter2.getPageAt$payments_core_release(i) == PaymentFlowPage.ShippingInfo) {
                    viewModel = PaymentFlowActivity.this.getViewModel();
                    viewModel.setShippingInfoSubmitted$payments_core_release(false);
                    paymentFlowPagerAdapter3 = PaymentFlowActivity.this.getPaymentFlowPagerAdapter();
                    paymentFlowPagerAdapter3.setShippingInfoSubmitted$payments_core_release(false);
                }
                AbstractC36566Ve3 abstractC36566Ve3 = m64201b;
                hasPreviousPage = PaymentFlowActivity.this.hasPreviousPage();
                abstractC36566Ve3.setEnabled(hasPreviousPage);
            }
        });
        getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
        m64201b.setEnabled(hasPreviousPage());
        setTitle(getPaymentFlowPagerAdapter().getPageTitle(getViewPager().getCurrentItem()));
    }

    public final /* synthetic */ void onShippingInfoSaved$payments_core_release(ShippingInformation shippingInformation, List shippingMethods) {
        PaymentSessionData copy;
        Intrinsics.checkNotNullParameter(shippingMethods, "shippingMethods");
        onShippingMethodsReady(shippingMethods);
        PaymentFlowViewModel viewModel = getViewModel();
        copy = r3.copy((r22 & 1) != 0 ? r3.isShippingInfoRequired : false, (r22 & 2) != 0 ? r3.isShippingMethodRequired : false, (r22 & 4) != 0 ? r3.cartTotal : 0L, (r22 & 8) != 0 ? r3.shippingTotal : 0L, (r22 & 16) != 0 ? r3.shippingInformation : shippingInformation, (r22 & 32) != 0 ? r3.shippingMethod : null, (r22 & 64) != 0 ? r3.paymentMethod : null, (r22 & 128) != 0 ? getViewModel().getPaymentSessionData$payments_core_release().useGooglePay : false);
        viewModel.setPaymentSessionData$payments_core_release(copy);
    }
}
