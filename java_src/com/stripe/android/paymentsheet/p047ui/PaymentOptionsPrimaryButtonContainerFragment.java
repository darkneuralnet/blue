package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment;", "Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;", "()V", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButtonContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,95:1\n172#2,9:96\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsPrimaryButtonContainerFragment\n*L\n77#1:96,9\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsPrimaryButtonContainerFragment */
/* loaded from: classes7.dex */
public final class PaymentOptionsPrimaryButtonContainerFragment extends BasePrimaryButtonContainerFragment {
    private final Lazy viewModel$delegate;

    public PaymentOptionsPrimaryButtonContainerFragment() {
        Function0 function0 = PaymentOptionsPrimaryButtonContainerFragment$viewModel$2.INSTANCE;
        this.viewModel$delegate = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(PaymentOptionsViewModel.class), new C19306xa38eeceb(this), new C19307xa38eecec(null, this), function0 == null ? new C19308xa38eeced(this) : function0);
    }

    @Override // com.stripe.android.paymentsheet.p047ui.BasePrimaryButtonContainerFragment
    public PaymentOptionsViewModel getViewModel() {
        return (PaymentOptionsViewModel) this.viewModel$delegate.getValue();
    }
}
