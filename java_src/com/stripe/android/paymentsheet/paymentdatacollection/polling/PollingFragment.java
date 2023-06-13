package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.p003ui.platform.ComposeView;
import com.google.android.material.bottomsheet.C17714b;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;", "Lcom/google/android/material/bottomsheet/b;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "uiState", "", "handleUiState", "finishWithSuccess", "finishWithCancellation", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "finishWithResult", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "args$delegate", "Lkotlin/Lazy;", "getArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "args", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "viewModel", "<init>", "()V", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPollingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,122:1\n106#2,15:123\n*S KotlinDebug\n*F\n+ 1 PollingFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment\n*L\n32#1:123,15\n*E\n"})
/* loaded from: classes7.dex */
public final class PollingFragment extends C17714b {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_FRAGMENT_RESULT = "KEY_FRAGMENT_RESULT_PollingFragment";
    private final Lazy args$delegate;
    private final Lazy viewModel$delegate;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;", "", "()V", "KEY_FRAGMENT_RESULT", "", "newInstance", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;", "args", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PollingFragment newInstance(PollingContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            PollingFragment pollingFragment = new PollingFragment();
            pollingFragment.setArguments(C39564d70.m44603a(TuplesKt.m28425to("KEY_POLLING_ARGS", args)));
            return pollingFragment;
        }

        private Companion() {
        }
    }

    public PollingFragment() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new PollingFragment$args$2(this));
        this.args$delegate = lazy;
        PollingFragment$viewModel$2 pollingFragment$viewModel$2 = new PollingFragment$viewModel$2(this);
        lazy2 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new PollingFragment$special$$inlined$viewModels$default$2(new PollingFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(PollingViewModel.class), new PollingFragment$special$$inlined$viewModels$default$3(lazy2), new PollingFragment$special$$inlined$viewModels$default$4(null, lazy2), pollingFragment$viewModel$2);
    }

    private final void finishWithCancellation() {
        finishWithResult(new PaymentFlowResult.Unvalidated(getArgs().getClientSecret(), 3, null, false, null, null, null, 116, null));
    }

    private final void finishWithResult(PaymentFlowResult.Unvalidated unvalidated) {
        C43033iy1.m31554a(this, KEY_FRAGMENT_RESULT, unvalidated.toBundle());
    }

    private final void finishWithSuccess() {
        finishWithResult(new PaymentFlowResult.Unvalidated(getArgs().getClientSecret(), 1, null, false, null, null, null, 124, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingContract.Args getArgs() {
        return (PollingContract.Args) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingViewModel getViewModel() {
        return (PollingViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUiState(PollingUiState pollingUiState) {
        if (pollingUiState.getPollingState() == PollingState.Success) {
            finishWithSuccess();
        } else if (pollingUiState.getPollingState() == PollingState.Canceled) {
            finishWithCancellation();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(C43575jt0.m29790c(1355583161, true, new PollingFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        C38677bf3.m64202a(onBackPressedDispatcher, getViewLifecycleOwner(), false, PollingFragment$onViewCreated$1.INSTANCE);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        Z30.m73800d(C33163Gq2.m104689a(viewLifecycleOwner), null, null, new PollingFragment$onViewCreated$2(this, null), 3, null);
    }
}
