package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.p048ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.views.ChallengeFragment;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 b2\u00020\u0001:\u0001bBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0006\u0010I\u001a\u00020JJ&\u0010K\u001a\u00020J2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\b\u0010L\u001a\u00020JH\u0002J\b\u0010M\u001a\u00020JH\u0002J\u0010\u0010N\u001a\u00020J2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020JH\u0016J\u0010\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010R\u001a\u00020J2\u0006\u0010U\u001a\u00020VH\u0002J\u0018\u0010W\u001a\u00020J2\u0006\u0010X\u001a\u00020Y2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010Z\u001a\u00020J2\u0006\u0010S\u001a\u00020TH\u0002J\u001a\u0010[\u001a\u00020J2\u0006\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\u0006\u0010`\u001a\u00020JJ\b\u0010a\u001a\u00020JH\u0002R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b&\u0010'R\u001d\u0010)\u001a\u0004\u0018\u00010*8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b0\u00101R\u001d\u00103\u001a\u0004\u0018\u0001048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001a\u001a\u0004\b5\u00106R\u000e\u00108\u001a\u000209X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u001a\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020;8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010=R\u0014\u0010A\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001b\u0010D\u001a\u00020E8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u001a\u001a\u0004\bF\u0010GR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "Landroidx/fragment/app/Fragment;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V", "_viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "brandZoneView", "Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "getBrandZoneView", "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView$delegate", "Lkotlin/Lazy;", "challengeAction", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "getChallengeAction", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "challengeEntryViewFactory", "Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "getChallengeEntryViewFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "challengeEntryViewFactory$delegate", "challengeZoneSelectView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "getChallengeZoneSelectView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "challengeZoneSelectView$delegate", "challengeZoneTextView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "getChallengeZoneTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "challengeZoneTextView$delegate", "challengeZoneView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "getChallengeZoneView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView$delegate", "challengeZoneWebView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "getChallengeZoneWebView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "challengeZoneWebView$delegate", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "uiTypeCode", "", "getUiTypeCode", "()Ljava/lang/String;", "uiTypeCode$delegate", "userEntry", "getUserEntry$3ds2sdk_release", "viewBinding", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "clickSubmitButton", "", "configure", "configureChallengeZoneView", "configureInformationZoneView", "onChallengeRequestResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "onDestroyView", "onError", MessageExtension.FIELD_DATA, "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "throwable", "", "onSuccess", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "onTimeout", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshUi", "updateBrandZoneImages", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeFragment extends Fragment {
    public static final String ARG_CRES = "arg_cres";
    public static final Companion Companion = new Companion(null);
    private StripeChallengeFragmentBinding _viewBinding;
    private final Lazy brandZoneView$delegate;
    private final ChallengeActionHandler challengeActionHandler;
    private final Lazy challengeEntryViewFactory$delegate;
    private final Lazy challengeZoneSelectView$delegate;
    private final Lazy challengeZoneTextView$delegate;
    private final Lazy challengeZoneView$delegate;
    private final Lazy challengeZoneWebView$delegate;
    private ChallengeResponseData cresData;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final UiType initialUiType;
    private final IntentData intentData;
    private final TransactionTimer transactionTimer;
    private final StripeUiCustomization uiCustomization;
    private final Lazy uiTypeCode$delegate;
    private final Lazy viewModel$delegate;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;", "", "()V", "ARG_CRES", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiType.values().length];
            try {
                iArr[UiType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiType.SingleSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiType.MultiSelect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UiType.Html.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UiType.OutOfBand.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment(StripeUiCustomization uiCustomization, TransactionTimer transactionTimer, ErrorRequestExecutor errorRequestExecutor, ErrorReporter errorReporter, ChallengeActionHandler challengeActionHandler, UiType uiType, IntentData intentData, CoroutineContext workContext) {
        super(C19336R.C19339layout.stripe_challenge_fragment);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
        Intrinsics.checkNotNullParameter(errorRequestExecutor, "errorRequestExecutor");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = uiType;
        this.intentData = intentData;
        this.workContext = workContext;
        lazy = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$uiTypeCode$2(this));
        this.uiTypeCode$delegate = lazy;
        this.viewModel$delegate = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new ChallengeFragment$special$$inlined$activityViewModels$default$1(this), new ChallengeFragment$special$$inlined$activityViewModels$default$2(null, this), new ChallengeFragment$viewModel$2(this));
        lazy2 = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$challengeEntryViewFactory$2(this));
        this.challengeEntryViewFactory$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$challengeZoneView$2(this));
        this.challengeZoneView$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$brandZoneView$2(this));
        this.brandZoneView$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$challengeZoneTextView$2(this));
        this.challengeZoneTextView$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$challengeZoneSelectView$2(this));
        this.challengeZoneSelectView$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new ChallengeFragment$challengeZoneWebView$2(this));
        this.challengeZoneWebView$delegate = lazy7;
    }

    private final void configure(ChallengeZoneTextView challengeZoneTextView, ChallengeZoneSelectView challengeZoneSelectView, ChallengeZoneWebView challengeZoneWebView) {
        ChallengeResponseData challengeResponseData = null;
        if (challengeZoneTextView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneTextView);
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData2 = null;
            }
            challengeZoneView.setSubmitButton(challengeResponseData2.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SUBMIT));
            ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData = challengeResponseData3;
            }
            challengeZoneView2.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (challengeZoneSelectView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneSelectView);
            ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData4 = this.cresData;
            if (challengeResponseData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData4 = null;
            }
            challengeZoneView3.setSubmitButton(challengeResponseData4.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.NEXT));
            ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData = challengeResponseData5;
            }
            challengeZoneView4.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (challengeZoneWebView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneWebView);
            getChallengeZoneView().setInfoHeaderText(null, null);
            getChallengeZoneView().setInfoText(null, null);
            getChallengeZoneView().setSubmitButton(null, null);
            challengeZoneWebView.setOnClickListener(new View.OnClickListener() { // from class: wh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeFragment.configure$lambda$3(ChallengeFragment.this, view);
                }
            });
            getBrandZoneView().setVisibility(8);
        } else {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData6 = null;
            }
            if (challengeResponseData6.getUiType() == UiType.OutOfBand) {
                ChallengeZoneView challengeZoneView5 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData7 = this.cresData;
                if (challengeResponseData7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData = challengeResponseData7;
                }
                challengeZoneView5.setSubmitButton(challengeResponseData.getOobContinueLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.CONTINUE));
            }
        }
        configureChallengeZoneView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$3(ChallengeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().onSubmitClicked(this$0.getChallengeAction());
    }

    private final void configureChallengeZoneView() {
        int i;
        ChallengeZoneView challengeZoneView = getChallengeZoneView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        challengeZoneView.setInfoHeaderText(challengeResponseData.getChallengeInfoHeader(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData3 = null;
        }
        challengeZoneView2.setInfoText(challengeResponseData3.getChallengeInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData4 = null;
        }
        if (challengeResponseData4.getShouldShowChallengeInfoTextIndicator()) {
            i = C19336R.C19337drawable.stripe_3ds2_ic_indicator;
        } else {
            i = 0;
        }
        challengeZoneView3.setInfoTextIndicator(i);
        ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        challengeZoneView4.setWhitelistingLabel(challengeResponseData2.getWhitelistingInfoText(), this.uiCustomization.getLabelCustomization(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        getChallengeZoneView().setSubmitButtonClickListener(new View.OnClickListener() { // from class: xh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.configureChallengeZoneView$lambda$7(ChallengeFragment.this, view);
            }
        });
        getChallengeZoneView().setResendButtonClickListener(new View.OnClickListener() { // from class: yh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.configureChallengeZoneView$lambda$8(ChallengeFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChallengeZoneView$lambda$7(ChallengeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().onSubmitClicked(this$0.getChallengeAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChallengeZoneView$lambda$8(ChallengeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
    }

    private final void configureInformationZoneView() {
        InformationZoneView informationZoneView = getViewBinding$3ds2sdk_release().caInformationZone;
        Intrinsics.checkNotNullExpressionValue(informationZoneView, "viewBinding.caInformationZone");
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        String whyInfoLabel = challengeResponseData.getWhyInfoLabel();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData3 = null;
        }
        informationZoneView.setWhyInfo(whyInfoLabel, challengeResponseData3.getWhyInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData4 = null;
        }
        String expandInfoLabel = challengeResponseData4.getExpandInfoLabel();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        informationZoneView.setExpandInfo(expandInfoLabel, challengeResponseData2.getExpandInfoText(), this.uiCustomization.getLabelCustomization());
        String accentColor = this.uiCustomization.getAccentColor();
        if (accentColor != null) {
            informationZoneView.setToggleColor$3ds2sdk_release(Color.parseColor(accentColor));
        }
    }

    private final BrandZoneView getBrandZoneView() {
        return (BrandZoneView) this.brandZoneView$delegate.getValue();
    }

    private final ChallengeAction getChallengeAction() {
        int i;
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        if (uiType == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        }
        if (i != 4) {
            if (i != 5) {
                return new ChallengeAction.NativeForm(getUserEntry$3ds2sdk_release());
            }
            return ChallengeAction.Oob.INSTANCE;
        }
        return new ChallengeAction.HtmlForm(getUserEntry$3ds2sdk_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeEntryViewFactory getChallengeEntryViewFactory() {
        return (ChallengeEntryViewFactory) this.challengeEntryViewFactory$delegate.getValue();
    }

    private final ChallengeZoneView getChallengeZoneView() {
        return (ChallengeZoneView) this.challengeZoneView$delegate.getValue();
    }

    private final String getUiTypeCode() {
        return (String) this.uiTypeCode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChallengeRequestResult(ChallengeRequestResult challengeRequestResult) {
        if (challengeRequestResult instanceof ChallengeRequestResult.Success) {
            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) challengeRequestResult;
            onSuccess(success.getCreqData(), success.getCresData());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
            onError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
            onError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).getThrowable());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
            onTimeout(((ChallengeRequestResult.Timeout) challengeRequestResult).getData());
        }
    }

    private final void onError(ErrorData errorData) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.ProtocolError(errorData, this.initialUiType, this.intentData));
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(errorData);
    }

    private final void onSuccess(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
        ChallengeResult failed;
        if (challengeResponseData.isChallengeCompleted()) {
            getViewModel$3ds2sdk_release().stopTimer();
            if (challengeRequestData.getCancelReason() != null) {
                failed = new ChallengeResult.Canceled(getUiTypeCode(), this.initialUiType, this.intentData);
            } else {
                String transStatus = challengeResponseData.getTransStatus();
                if (transStatus == null) {
                    transStatus = "";
                }
                if (Intrinsics.areEqual("Y", transStatus)) {
                    failed = new ChallengeResult.Succeeded(getUiTypeCode(), this.initialUiType, this.intentData);
                } else {
                    failed = new ChallengeResult.Failed(getUiTypeCode(), this.initialUiType, this.intentData);
                }
            }
            getViewModel$3ds2sdk_release().onFinish(failed);
            return;
        }
        getViewModel$3ds2sdk_release().onNextScreen(challengeResponseData);
    }

    private final void onTimeout(ErrorData errorData) {
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(errorData);
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Timeout(getUiTypeCode(), this.initialUiType, this.intentData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void updateBrandZoneImages() {
        Map mapOf;
        BrandZoneView brandZoneView = getViewBinding$3ds2sdk_release().caBrandZone;
        Intrinsics.checkNotNullExpressionValue(brandZoneView, "viewBinding.caBrandZone");
        Pair[] pairArr = new Pair[2];
        ImageView issuerImageView$3ds2sdk_release = brandZoneView.getIssuerImageView$3ds2sdk_release();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        pairArr[0] = TuplesKt.m28425to(issuerImageView$3ds2sdk_release, challengeResponseData.getIssuerImage());
        ImageView paymentSystemImageView$3ds2sdk_release = brandZoneView.getPaymentSystemImageView$3ds2sdk_release();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData3;
        }
        pairArr[1] = TuplesKt.m28425to(paymentSystemImageView$3ds2sdk_release, challengeResponseData2.getPaymentSystemImage());
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        for (Map.Entry entry : mapOf.entrySet()) {
            LiveData<Bitmap> image = getViewModel$3ds2sdk_release().getImage((ChallengeResponseData.Image) entry.getValue(), getResources().getDisplayMetrics().densityDpi);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            final ChallengeFragment$updateBrandZoneImages$1$1 challengeFragment$updateBrandZoneImages$1$1 = new ChallengeFragment$updateBrandZoneImages$1$1((ImageView) entry.getKey());
            image.observe(viewLifecycleOwner, new InterfaceC41056fe3() { // from class: vh0
                @Override // p000.InterfaceC41056fe3
                public final void onChanged(Object obj) {
                    ChallengeFragment.updateBrandZoneImages$lambda$5$lambda$4(Function1.this, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBrandZoneImages$lambda$5$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void clickSubmitButton() {
        getViewModel$3ds2sdk_release().submit(getChallengeAction());
    }

    public final ChallengeZoneSelectView getChallengeZoneSelectView$3ds2sdk_release() {
        return (ChallengeZoneSelectView) this.challengeZoneSelectView$delegate.getValue();
    }

    public final ChallengeZoneTextView getChallengeZoneTextView$3ds2sdk_release() {
        return (ChallengeZoneTextView) this.challengeZoneTextView$delegate.getValue();
    }

    public final ChallengeZoneWebView getChallengeZoneWebView$3ds2sdk_release() {
        return (ChallengeZoneWebView) this.challengeZoneWebView$delegate.getValue();
    }

    public final String getUserEntry$3ds2sdk_release() {
        int i;
        ChallengeResponseData challengeResponseData = this.cresData;
        String str = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        if (uiType == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    str = "";
                } else {
                    ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
                    if (challengeZoneWebView$3ds2sdk_release != null) {
                        str = challengeZoneWebView$3ds2sdk_release.getUserEntry();
                    }
                }
            } else {
                ChallengeZoneSelectView challengeZoneSelectView$3ds2sdk_release = getChallengeZoneSelectView$3ds2sdk_release();
                if (challengeZoneSelectView$3ds2sdk_release != null) {
                    str = challengeZoneSelectView$3ds2sdk_release.getUserEntry();
                }
            }
        } else {
            ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = getChallengeZoneTextView$3ds2sdk_release();
            if (challengeZoneTextView$3ds2sdk_release != null) {
                str = challengeZoneTextView$3ds2sdk_release.getUserEntry();
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final StripeChallengeFragmentBinding getViewBinding$3ds2sdk_release() {
        StripeChallengeFragmentBinding stripeChallengeFragmentBinding = this._viewBinding;
        if (stripeChallengeFragmentBinding != null) {
            return stripeChallengeFragmentBinding;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ChallengeResponseData challengeResponseData;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            challengeResponseData = (ChallengeResponseData) arguments.getParcelable(ARG_CRES);
        } else {
            challengeResponseData = null;
        }
        if (challengeResponseData == null) {
            onError(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.cresData = challengeResponseData;
        this._viewBinding = StripeChallengeFragmentBinding.bind(view);
        LiveData<String> challengeText = getViewModel$3ds2sdk_release().getChallengeText();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        final ChallengeFragment$onViewCreated$1 challengeFragment$onViewCreated$1 = new ChallengeFragment$onViewCreated$1(this);
        challengeText.observe(viewLifecycleOwner, new InterfaceC41056fe3() { // from class: zh0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeFragment.onViewCreated$lambda$0(Function1.this, obj);
            }
        });
        LiveData<Unit> refreshUi = getViewModel$3ds2sdk_release().getRefreshUi();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        final ChallengeFragment$onViewCreated$2 challengeFragment$onViewCreated$2 = new ChallengeFragment$onViewCreated$2(this);
        refreshUi.observe(viewLifecycleOwner2, new InterfaceC41056fe3() { // from class: Ah0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeFragment.onViewCreated$lambda$1(Function1.this, obj);
            }
        });
        LiveData<ChallengeRequestResult> challengeRequestResult = getViewModel$3ds2sdk_release().getChallengeRequestResult();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        final ChallengeFragment$onViewCreated$3 challengeFragment$onViewCreated$3 = new ChallengeFragment$onViewCreated$3(this);
        challengeRequestResult.observe(viewLifecycleOwner3, new InterfaceC41056fe3() { // from class: Bh0
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                ChallengeFragment.onViewCreated$lambda$2(Function1.this, obj);
            }
        });
        updateBrandZoneImages();
        configure(getChallengeZoneTextView$3ds2sdk_release(), getChallengeZoneSelectView$3ds2sdk_release(), getChallengeZoneWebView$3ds2sdk_release());
        configureInformationZoneView();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void refreshUi() {
        boolean isBlank;
        boolean z;
        boolean isBlank2;
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        boolean z2 = true;
        if (challengeResponseData.getUiType() == UiType.Html) {
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData3 = null;
            }
            String acsHtmlRefresh = challengeResponseData3.getAcsHtmlRefresh();
            if (acsHtmlRefresh != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(acsHtmlRefresh);
                if (!isBlank2) {
                    z = false;
                    if (!z) {
                        ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
                        if (challengeZoneWebView$3ds2sdk_release != null) {
                            ChallengeResponseData challengeResponseData4 = this.cresData;
                            if (challengeResponseData4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            } else {
                                challengeResponseData2 = challengeResponseData4;
                            }
                            challengeZoneWebView$3ds2sdk_release.loadHtml(challengeResponseData2.getAcsHtmlRefresh());
                            return;
                        }
                        return;
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData5 = null;
        }
        if (challengeResponseData5.getUiType() == UiType.OutOfBand) {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData6 = null;
            }
            String challengeAdditionalInfoText = challengeResponseData6.getChallengeAdditionalInfoText();
            if (challengeAdditionalInfoText != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(challengeAdditionalInfoText);
                if (!isBlank) {
                    z2 = false;
                }
            }
            if (!z2) {
                ChallengeZoneView challengeZoneView = getChallengeZoneView();
                ChallengeResponseData challengeResponseData7 = this.cresData;
                if (challengeResponseData7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData2 = challengeResponseData7;
                }
                challengeZoneView.setInfoText(challengeResponseData2.getChallengeAdditionalInfoText(), this.uiCustomization.getLabelCustomization());
                getChallengeZoneView().setInfoTextIndicator(0);
            }
        }
    }

    private final void onError(Throwable th) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.RuntimeError(th, this.initialUiType, this.intentData));
    }
}
