package com.stripe.android.paymentsheet.p047ui;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC11719f;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;", "Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;", "()V", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButtonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,95:1\n172#2,9:96\n16#3,11:105\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment\n*L\n62#1:96,9\n69#1:105,11\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetPrimaryButtonContainerFragment */
/* loaded from: classes7.dex */
public final class PaymentSheetPrimaryButtonContainerFragment extends BasePrimaryButtonContainerFragment {
    private final Lazy viewModel$delegate;

    public PaymentSheetPrimaryButtonContainerFragment() {
        Function0 function0 = PaymentSheetPrimaryButtonContainerFragment$viewModel$2.INSTANCE;
        this.viewModel$delegate = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(PaymentSheetViewModel.class), new C19318x7b7ae8ac(this), new C19319x7b7ae8ad(null, this), function0 == null ? new C19320x7b7ae8ae(this) : function0);
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BasePrimaryButtonContainerFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC32730Eu1<PaymentSheetViewState> buyButtonState = getViewModel().getBuyButtonState();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        Z30.m73800d(C33163Gq2.m104689a(viewLifecycleOwner), null, null, new C19315xde32b864(viewLifecycleOwner, AbstractC11719f.EnumC11724b.STARTED, buyButtonState, null, this), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BasePrimaryButtonContainerFragment
    public PaymentSheetViewModel getViewModel() {
        return (PaymentSheetViewModel) this.viewModel$delegate.getValue();
    }
}
