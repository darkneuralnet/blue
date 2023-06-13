package com.stripe.android.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C11758t;
import com.stripe.android.C18606R;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.PaymentAuthWebViewActivityBinding;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0017\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0014J\u0010\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "get_args", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "_args$delegate", "Lkotlin/Lazy;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "logger$delegate", "viewBinding", "Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "viewModel$delegate", "cancelIntentSource", "", "createResultIntent", "Landroid/content/Intent;", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "customizeToolbar", "onAuthComplete", "error", "", "onAuthComplete$payments_core_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentAuthWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,189:1\n75#2,13:190\n*S KotlinDebug\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity\n*L\n38#1:190,13\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private final Lazy _args$delegate;
    private final Lazy logger$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewModel$delegate;

    public PaymentAuthWebViewActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new PaymentAuthWebViewActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new PaymentAuthWebViewActivity$_args$2(this));
        this._args$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new PaymentAuthWebViewActivity$logger$2(this));
        this.logger$delegate = lazy3;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(PaymentAuthWebViewActivityViewModel.class), new PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2(this), new PaymentAuthWebViewActivity$viewModel$2(this), new PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelIntentSource() {
        setResult(-1, getViewModel().getCancellationResult$payments_core_release());
        finish();
    }

    private final Intent createResultIntent(PaymentFlowResult.Unvalidated unvalidated) {
        Intent putExtras = new Intent().putExtras(unvalidated.toBundle());
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent().putExtras(paymentFlowResult.toBundle())");
        return putExtras;
    }

    private final void customizeToolbar() {
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar()");
        PaymentAuthWebViewActivityViewModel.ToolbarTitleData toolbarTitle$payments_core_release = getViewModel().getToolbarTitle$payments_core_release();
        if (toolbarTitle$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            getViewBinding().toolbar.setTitle(CustomizeUtils.INSTANCE.buildStyledText(this, toolbarTitle$payments_core_release.getText$payments_core_release(), toolbarTitle$payments_core_release.getToolbarCustomization$payments_core_release()));
        }
        String toolbarBackgroundColor$payments_core_release = getViewModel().getToolbarBackgroundColor$payments_core_release();
        if (toolbarBackgroundColor$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int parseColor = Color.parseColor(toolbarBackgroundColor$payments_core_release);
            getViewBinding().toolbar.setBackgroundColor(parseColor);
            CustomizeUtils.INSTANCE.setStatusBarColor(this, parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentAuthWebViewActivityBinding getViewBinding() {
        return (PaymentAuthWebViewActivityBinding) this.viewBinding$delegate.getValue();
    }

    private final PaymentAuthWebViewActivityViewModel getViewModel() {
        return (PaymentAuthWebViewActivityViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentBrowserAuthContract.Args get_args() {
        return (PaymentBrowserAuthContract.Args) this._args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void onAuthComplete$payments_core_release(Throwable th) {
        if (th != null) {
            getViewModel().logError();
            setResult(-1, createResultIntent(PaymentFlowResult.Unvalidated.copy$default(getViewModel().getPaymentResult$payments_core_release(), null, 2, StripeException.Companion.create(th), true, null, null, null, 113, null)));
        } else {
            getViewModel().logComplete();
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean isBlank;
        super.onCreate(bundle);
        PaymentBrowserAuthContract.Args args = get_args();
        if (args == null) {
            setResult(0);
            finish();
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate()");
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        customizeToolbar();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        C38677bf3.m64201b(onBackPressedDispatcher, null, false, new PaymentAuthWebViewActivity$onCreate$1(this), 3, null);
        String clientSecret = args.getClientSecret();
        setResult(-1, createResultIntent(getViewModel().getPaymentResult$payments_core_release()));
        isBlank = StringsKt__StringsJVMKt.isBlank(clientSecret);
        if (isBlank) {
            getLogger().debug("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        C49882uX2 c49882uX2 = new C49882uX2(Boolean.FALSE);
        final PaymentAuthWebViewActivity$onCreate$2 paymentAuthWebViewActivity$onCreate$2 = new PaymentAuthWebViewActivity$onCreate$2(this);
        c49882uX2.observe(this, new InterfaceC41056fe3() { // from class: CL3
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                PaymentAuthWebViewActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
        PaymentAuthWebViewClient paymentAuthWebViewClient = new PaymentAuthWebViewClient(getLogger(), c49882uX2, clientSecret, args.getReturnUrl(), new PaymentAuthWebViewActivity$onCreate$webViewClient$1(this), new PaymentAuthWebViewActivity$onCreate$webViewClient$2(this));
        getViewBinding().webView.setOnLoadBlank$payments_core_release(new PaymentAuthWebViewActivity$onCreate$3(paymentAuthWebViewClient));
        getViewBinding().webView.setWebViewClient(paymentAuthWebViewClient);
        getViewBinding().webView.setWebChromeClient(new PaymentAuthWebChromeClient(this, getLogger()));
        getViewModel().logStart();
        getViewBinding().webView.loadUrl(args.getUrl(), getViewModel().getExtraHeaders());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getLogger().debug("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(C18606R.C18610menu.payment_auth_web_view_menu, menu);
        String buttonText$payments_core_release = getViewModel().getButtonText$payments_core_release();
        if (buttonText$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(C18606R.C18608id.action_close).setTitle(buttonText$payments_core_release);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        getViewBinding().webViewContainer.removeAllViews();
        getViewBinding().webView.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getLogger().debug("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == C18606R.C18608id.action_close) {
            cancelIntentSource();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
