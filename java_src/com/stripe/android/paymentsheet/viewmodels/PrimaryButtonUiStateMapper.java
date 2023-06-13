package com.stripe.android.paymentsheet.viewmodels;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0007\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "", "Lcom/stripe/android/ui/core/Amount;", "amount", "", "buyButtonLabel", "continueButtonLabel", "LEu1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "forCompleteFlow", "forCustomFlow", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "", "isProcessingPayment", "Z", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "currentScreenFlow", "LEu1;", "buttonsEnabledFlow", "amountFlow", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "selectionFlow", "customPrimaryButtonUiStateFlow", "Lkotlin/Function0;", "", "onClick", "Lkotlin/jvm/functions/Function0;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function0;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PrimaryButtonUiStateMapper {
    private final InterfaceC32730Eu1<Amount> amountFlow;
    private final InterfaceC32730Eu1<Boolean> buttonsEnabledFlow;
    private final PaymentSheet.Configuration config;
    private final Context context;
    private final InterfaceC32730Eu1<PaymentSheetScreen> currentScreenFlow;
    private final InterfaceC32730Eu1<PrimaryButton.UIState> customPrimaryButtonUiStateFlow;
    private final boolean isProcessingPayment;
    private final Function0<Unit> onClick;
    private final InterfaceC32730Eu1<PaymentSelection> selectionFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryButtonUiStateMapper(Context context, PaymentSheet.Configuration configuration, boolean z, InterfaceC32730Eu1<? extends PaymentSheetScreen> currentScreenFlow, InterfaceC32730Eu1<Boolean> buttonsEnabledFlow, InterfaceC32730Eu1<Amount> amountFlow, InterfaceC32730Eu1<? extends PaymentSelection> selectionFlow, InterfaceC32730Eu1<PrimaryButton.UIState> customPrimaryButtonUiStateFlow, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentScreenFlow, "currentScreenFlow");
        Intrinsics.checkNotNullParameter(buttonsEnabledFlow, "buttonsEnabledFlow");
        Intrinsics.checkNotNullParameter(amountFlow, "amountFlow");
        Intrinsics.checkNotNullParameter(selectionFlow, "selectionFlow");
        Intrinsics.checkNotNullParameter(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.context = context;
        this.config = configuration;
        this.isProcessingPayment = z;
        this.currentScreenFlow = currentScreenFlow;
        this.buttonsEnabledFlow = buttonsEnabledFlow;
        this.amountFlow = amountFlow;
        this.selectionFlow = selectionFlow;
        this.customPrimaryButtonUiStateFlow = customPrimaryButtonUiStateFlow;
        this.onClick = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buyButtonLabel(Amount amount) {
        String str;
        PaymentSheet.Configuration configuration = this.config;
        if (configuration != null) {
            str = configuration.getPrimaryButtonLabel();
        } else {
            str = null;
        }
        if (str != null) {
            return this.config.getPrimaryButtonLabel();
        }
        if (this.isProcessingPayment) {
            String string = this.context.getString(C19159R.string.stripe_paymentsheet_pay_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ntsheet_pay_button_label)");
            if (amount != null) {
                Resources resources = this.context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                String buildPayButtonLabel = amount.buildPayButtonLabel(resources);
                if (buildPayButtonLabel != null) {
                    return buildPayButtonLabel;
                }
            }
            return string;
        }
        String string2 = this.context.getString(C19159R.string.stripe_setup_button_label);
        Intrinsics.checkNotNullExpressionValue(string2, "{\n            context.ge…p_button_label)\n        }");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String continueButtonLabel() {
        String str;
        PaymentSheet.Configuration configuration = this.config;
        if (configuration != null) {
            str = configuration.getPrimaryButtonLabel();
        } else {
            str = null;
        }
        if (str == null) {
            String string = this.context.getString(C19159R.string.stripe_continue_button_label);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…pe_continue_button_label)");
            return string;
        }
        return str;
    }

    public final InterfaceC32730Eu1<PrimaryButton.UIState> forCompleteFlow() {
        return C36708Vu1.m79260k(this.currentScreenFlow, this.buttonsEnabledFlow, this.amountFlow, this.selectionFlow, this.customPrimaryButtonUiStateFlow, new PrimaryButtonUiStateMapper$forCompleteFlow$1(this, null));
    }

    public final InterfaceC32730Eu1<PrimaryButton.UIState> forCustomFlow() {
        return C36708Vu1.m79259l(this.currentScreenFlow, this.buttonsEnabledFlow, this.selectionFlow, this.customPrimaryButtonUiStateFlow, new PrimaryButtonUiStateMapper$forCustomFlow$1(this, null));
    }
}
