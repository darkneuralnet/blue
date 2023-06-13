package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.LiveData;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.p048ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 N2\u00020\u0001:\u0001NB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020>H\u0002J\b\u0010@\u001a\u00020>H\u0002J\u0012\u0010A\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\b\u0010D\u001a\u00020>H\u0014J\b\u0010E\u001a\u00020>H\u0016J\b\u0010F\u001a\u00020>H\u0014J\b\u0010G\u001a\u00020>H\u0014J\u0010\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020MH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b:\u0010;¨\u0006O"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "getChallengeActionHandler", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler$delegate", "Lkotlin/Lazy;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter$delegate", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "getErrorRequestExecutor", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor$delegate", "fragment", "Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "getFragment$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "fragment$delegate", "fragmentViewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "getFragmentViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "fragmentViewBinding$delegate", "keyboardController", "Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "getKeyboardController", "()Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "keyboardController$delegate", "progressDialog", "Landroid/app/Dialog;", "progressDialogFactory", "Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "getProgressDialogFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "progressDialogFactory$delegate", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "getTransactionTimer", "()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer$delegate", "viewArgs", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "getViewArgs", "()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "viewArgs$delegate", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "configureHeaderZone", "", "dismissDialog", "dismissKeyboard", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLowMemory", "onPause", "onResume", "onTrimMemory", "level", "", "startFragment", "cres", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final SC0 WORK_CONTEXT = T41.m84377b();
    private final Lazy challengeActionHandler$delegate;
    private final Lazy errorReporter$delegate;
    private final Lazy errorRequestExecutor$delegate;
    private final Lazy fragment$delegate;
    private final Lazy fragmentViewBinding$delegate;
    private final Lazy keyboardController$delegate;
    private Dialog progressDialog;
    private final Lazy progressDialogFactory$delegate;
    private final Lazy transactionTimer$delegate;
    private final Lazy viewArgs$delegate;
    private final Lazy viewBinding$delegate;
    private final Lazy viewModel$delegate;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;", "", "LSC0;", "WORK_CONTEXT", "LSC0;", "<init>", "()V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ChallengeActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        Lazy lazy10;
        lazy = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$transactionTimer$2(this));
        this.transactionTimer$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$errorReporter$2(this));
        this.errorReporter$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$fragment$2(this));
        this.fragment$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$fragmentViewBinding$2(this));
        this.fragmentViewBinding$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$viewBinding$2(this));
        this.viewBinding$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$challengeActionHandler$2(this));
        this.challengeActionHandler$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$errorRequestExecutor$2(this));
        this.errorRequestExecutor$delegate = lazy7;
        this.viewModel$delegate = new C11758t(Reflection.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new ChallengeActivity$special$$inlined$viewModels$default$2(this), new ChallengeActivity$viewModel$2(this), new ChallengeActivity$special$$inlined$viewModels$default$3(null, this));
        lazy8 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$viewArgs$2(this));
        this.viewArgs$delegate = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$keyboardController$2(this));
        this.keyboardController$delegate = lazy9;
        lazy10 = LazyKt__LazyJVMKt.lazy(new ChallengeActivity$progressDialogFactory$2(this));
        this.progressDialogFactory$delegate = lazy10;
    }

    private final void configureHeaderZone() {
        final ThreeDS2Button customize = new HeaderZoneCustomizer(this).customize(getViewArgs().getUiCustomization$3ds2sdk_release().getToolbarCustomization(), getViewArgs().getUiCustomization$3ds2sdk_release().getButtonCustomization(UiCustomization.ButtonType.CANCEL));
        if (customize != null) {
            customize.setOnClickListener(new View.OnClickListener() { // from class: uh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.configureHeaderZone$lambda$5(ThreeDS2Button.this, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureHeaderZone$lambda$5(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissKeyboard() {
        getKeyboardController().hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeActionHandler getChallengeActionHandler() {
        return (ChallengeActionHandler) this.challengeActionHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorRequestExecutor getErrorRequestExecutor() {
        return (ErrorRequestExecutor) this.errorRequestExecutor$delegate.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeSubmitDialogFactory getProgressDialogFactory() {
        return (ChallengeSubmitDialogFactory) this.progressDialogFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionTimer getTransactionTimer() {
        return (TransactionTimer) this.transactionTimer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeViewArgs getViewArgs() {
        return (ChallengeViewArgs) this.viewArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFragment(ChallengeResponseData challengeResponseData) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        AbstractC11685m m67311q = supportFragmentManager.m67311q();
        Intrinsics.checkNotNullExpressionValue(m67311q, "beginTransaction()");
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        m67311q.m67100x(animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT(), animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT());
        m67311q.m67102v(getViewBinding$3ds2sdk_release().fragmentContainer.getId(), ChallengeFragment.class, C39564d70.m44603a(TuplesKt.m28425to(ChallengeFragment.ARG_CRES, challengeResponseData)));
        m67311q.mo67115i();
    }

    public final ChallengeFragment getFragment$3ds2sdk_release() {
        return (ChallengeFragment) this.fragment$delegate.getValue();
    }

    public final StripeChallengeFragmentBinding getFragmentViewBinding$3ds2sdk_release() {
        return (StripeChallengeFragmentBinding) this.fragmentViewBinding$delegate.getValue();
    }

    public final StripeChallengeActivityBinding getViewBinding$3ds2sdk_release() {
        return (StripeChallengeActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getSupportFragmentManager().m67282z1(new ChallengeFragmentFactory(getViewArgs().getUiCustomization$3ds2sdk_release(), getTransactionTimer(), getErrorRequestExecutor(), getErrorReporter(), getChallengeActionHandler(), getViewArgs().getCresData$3ds2sdk_release().getUiType(), getViewArgs().getIntentData$3ds2sdk_release(), WORK_CONTEXT));
        super.onCreate(bundle);
        getOnBackPressedDispatcher().m70497c(new AbstractC36566Ve3() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$onCreate$1
            {
                super(true);
            }

            @Override // p000.AbstractC36566Ve3
            public void handleOnBackPressed() {
                ChallengeActivity.this.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
            }
        });
        getWindow().setFlags(8192, 8192);
        setContentView(getViewBinding$3ds2sdk_release().getRoot());
        LiveData<ChallengeAction> submitClicked = getViewModel$3ds2sdk_release().getSubmitClicked();
        final ChallengeActivity$onCreate$2 challengeActivity$onCreate$2 = new ChallengeActivity$onCreate$2(this);
        submitClicked.observe(this, new InterfaceC41056fe3() { // from class: qh0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
        LiveData<ChallengeResult> shouldFinish = getViewModel$3ds2sdk_release().getShouldFinish();
        final ChallengeActivity$onCreate$3 challengeActivity$onCreate$3 = new ChallengeActivity$onCreate$3(this);
        shouldFinish.observe(this, new InterfaceC41056fe3() { // from class: rh0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
        configureHeaderZone();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        LiveData<ChallengeResponseData> nextScreen = getViewModel$3ds2sdk_release().getNextScreen();
        final ChallengeActivity$onCreate$4 challengeActivity$onCreate$4 = new ChallengeActivity$onCreate$4(this, objectRef);
        nextScreen.observe(this, new InterfaceC41056fe3() { // from class: sh0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeActivity.onCreate$lambda$2(Function1.this, obj);
            }
        });
        if (bundle == null) {
            getViewModel$3ds2sdk_release().onNextScreen(getViewArgs().getCresData$3ds2sdk_release());
        }
        LiveData<Boolean> timeout = getViewModel$3ds2sdk_release().getTimeout();
        final ChallengeActivity$onCreate$5 challengeActivity$onCreate$5 = new ChallengeActivity$onCreate$5(this, objectRef);
        timeout.observe(this, new InterfaceC41056fe3() { // from class: th0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeActivity.onCreate$lambda$3(Function1.this, obj);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dismissDialog();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel$3ds2sdk_release().setShouldRefreshUi(true);
        dismissKeyboard();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getViewModel$3ds2sdk_release().getShouldRefreshUi()) {
            getViewModel$3ds2sdk_release().onRefreshUi();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }
}
