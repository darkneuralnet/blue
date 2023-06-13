package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C11759u;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$sheetViewModel$2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,486:1\n172#2,9:487\n172#2,9:496\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$sheetViewModel$2\n*L\n94#1:487,9\n99#1:496,9\n*E\n"})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$sheetViewModel$2 extends Lambda implements Function0<BaseSheetViewModel> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$sheetViewModel$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192581 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192581(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            C11759u.InterfaceC11763b paymentOptionsViewModelFactory;
            paymentOptionsViewModelFactory = this.this$0.getPaymentOptionsViewModelFactory();
            return paymentOptionsViewModelFactory;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$sheetViewModel$2$2 */
    /* loaded from: classes7.dex */
    public static final class C192592 extends Lambda implements Function0<C11759u.InterfaceC11763b> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192592(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            C11759u.InterfaceC11763b paymentSheetViewModelFactory;
            paymentSheetViewModelFactory = this.this$0.getPaymentSheetViewModelFactory();
            return paymentSheetViewModelFactory;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$sheetViewModel$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BaseSheetViewModel invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        if (requireActivity instanceof PaymentOptionsActivity) {
            USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
            return (BaseSheetViewModel) C33234Gy1.m104545b(uSBankAccountFormFragment, Reflection.getOrCreateKotlinClass(PaymentOptionsViewModel.class), new C19240xef65d9ed(uSBankAccountFormFragment), new C19241xef65d9ee(null, uSBankAccountFormFragment), new C192581(uSBankAccountFormFragment)).getValue();
        } else if (requireActivity instanceof PaymentSheetActivity) {
            USBankAccountFormFragment uSBankAccountFormFragment2 = this.this$0;
            return (BaseSheetViewModel) C33234Gy1.m104545b(uSBankAccountFormFragment2, Reflection.getOrCreateKotlinClass(PaymentSheetViewModel.class), new C19243xef65d9f0(uSBankAccountFormFragment2), new C19244xef65d9f1(null, uSBankAccountFormFragment2), new C192592(uSBankAccountFormFragment2)).getValue();
        } else {
            return null;
        }
    }
}
