package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC11719f;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.databinding.FragmentPrimaryButtonContainerBinding;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;", "getViewBinding", "()Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;", "setViewBinding", "(Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;)V", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "setupPrimaryButton", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButtonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment\n+ 2 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt\n*L\n1#1,95:1\n16#2,11:96\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment\n*L\n38#1:96,11\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.BasePrimaryButtonContainerFragment */
/* loaded from: classes7.dex */
public abstract class BasePrimaryButtonContainerFragment extends Fragment {
    private FragmentPrimaryButtonContainerBinding viewBinding;

    private final void setupPrimaryButton() {
        ColorStateList valueOf;
        FragmentPrimaryButtonContainerBinding fragmentPrimaryButtonContainerBinding = this.viewBinding;
        if (fragmentPrimaryButtonContainerBinding == null) {
            return;
        }
        PrimaryButton primaryButton = fragmentPrimaryButtonContainerBinding.primaryButton;
        StripeTheme stripeTheme = StripeTheme.INSTANCE;
        PrimaryButtonStyle primaryButtonStyle = stripeTheme.getPrimaryButtonStyle();
        PaymentSheet.Configuration config$paymentsheet_release = getViewModel().getConfig$paymentsheet_release();
        if (config$paymentsheet_release == null || (valueOf = config$paymentsheet_release.getPrimaryButtonColor()) == null) {
            PrimaryButtonStyle primaryButtonStyle2 = stripeTheme.getPrimaryButtonStyle();
            Context baseContext = requireActivity().getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "requireActivity().baseContext");
            valueOf = ColorStateList.valueOf(StripeThemeKt.getBackgroundColor(primaryButtonStyle2, baseContext));
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(\n               …aseContext)\n            )");
        }
        primaryButton.setAppearanceConfiguration(primaryButtonStyle, valueOf);
    }

    public final FragmentPrimaryButtonContainerBinding getViewBinding() {
        return this.viewBinding;
    }

    public abstract BaseSheetViewModel getViewModel();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentPrimaryButtonContainerBinding inflate = FragmentPrimaryButtonContainerBinding.inflate(inflater, viewGroup, false);
        this.viewBinding = inflate;
        if (inflate != null) {
            return inflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.viewBinding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setupPrimaryButton();
        InterfaceC49220tP5<PrimaryButton.UIState> primaryButtonUiState = getViewModel().getPrimaryButtonUiState();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        Z30.m73800d(C33163Gq2.m104689a(viewLifecycleOwner), null, null, new C19295x42844a3c(viewLifecycleOwner, AbstractC11719f.EnumC11724b.STARTED, primaryButtonUiState, null, this), 3, null);
    }

    public final void setViewBinding(FragmentPrimaryButtonContainerBinding fragmentPrimaryButtonContainerBinding) {
        this.viewBinding = fragmentPrimaryButtonContainerBinding;
    }
}
