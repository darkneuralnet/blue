package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$updatePrimaryButton$1 extends Lambda implements Function1<PrimaryButton.UIState, PrimaryButton.UIState> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $shouldShowProcessingWhenClicked;
    final /* synthetic */ String $text;
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$updatePrimaryButton$1$1 */
    /* loaded from: classes7.dex */
    public static final class C192601 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $shouldShowProcessingWhenClicked;
        final /* synthetic */ USBankAccountFormFragment this$0;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "button", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$updatePrimaryButton$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C192611 extends Lambda implements Function1<PrimaryButton.UIState, PrimaryButton.UIState> {
            public static final C192611 INSTANCE = new C192611();

            public C192611() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final PrimaryButton.UIState invoke(PrimaryButton.UIState uIState) {
                if (uIState != null) {
                    return PrimaryButton.UIState.copy$default(uIState, null, null, false, false, 11, null);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192601(boolean z, USBankAccountFormFragment uSBankAccountFormFragment, Function0<Unit> function0) {
            super(0);
            this.$shouldShowProcessingWhenClicked = z;
            this.this$0 = uSBankAccountFormFragment;
            this.$onClick = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
            r0 = r2.this$0.getSheetViewModel();
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2() {
            BaseSheetViewModel sheetViewModel;
            BaseSheetViewModel sheetViewModel2;
            if (this.$shouldShowProcessingWhenClicked && sheetViewModel2 != null) {
                sheetViewModel2.updatePrimaryButtonState(PrimaryButton.State.StartProcessing.INSTANCE);
            }
            this.$onClick.invoke();
            sheetViewModel = this.this$0.getSheetViewModel();
            if (sheetViewModel != null) {
                sheetViewModel.updateCustomPrimaryButtonUiState(C192611.INSTANCE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$updatePrimaryButton$1(String str, boolean z, USBankAccountFormFragment uSBankAccountFormFragment, boolean z2, Function0<Unit> function0) {
        super(1);
        this.$text = str;
        this.$enabled = z;
        this.this$0 = uSBankAccountFormFragment;
        this.$shouldShowProcessingWhenClicked = z2;
        this.$onClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PrimaryButton.UIState invoke(PrimaryButton.UIState uIState) {
        boolean completePayment;
        String str = this.$text;
        C192601 c192601 = new C192601(this.$shouldShowProcessingWhenClicked, this.this$0, this.$onClick);
        boolean z = this.$enabled;
        completePayment = this.this$0.getCompletePayment();
        return new PrimaryButton.UIState(str, c192601, z, completePayment);
    }
}
