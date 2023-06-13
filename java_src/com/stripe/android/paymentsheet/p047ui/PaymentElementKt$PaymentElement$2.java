package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentElementKt$PaymentElement$2 */
/* loaded from: classes7.dex */
public final class PaymentElementKt$PaymentElement$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FormArguments $formArguments;
    final /* synthetic */ LinkPaymentLauncher $linkPaymentLauncher;
    final /* synthetic */ Function1<FormFieldValues, Unit> $onFormFieldValuesChanged;
    final /* synthetic */ Function1<LpmRepository.SupportedPaymentMethod, Unit> $onItemSelectedListener;
    final /* synthetic */ Function2<LinkPaymentLauncher.Configuration, InlineSignupViewState, Unit> $onLinkSignupStateChanged;
    final /* synthetic */ LpmRepository.SupportedPaymentMethod $selectedItem;
    final /* synthetic */ BaseSheetViewModel $sheetViewModel;
    final /* synthetic */ InterfaceC32730Eu1<Boolean> $showCheckboxFlow;
    final /* synthetic */ boolean $showLinkInlineSignup;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $supportedPaymentMethods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentElementKt$PaymentElement$2(BaseSheetViewModel baseSheetViewModel, boolean z, List<LpmRepository.SupportedPaymentMethod> list, LpmRepository.SupportedPaymentMethod supportedPaymentMethod, boolean z2, LinkPaymentLauncher linkPaymentLauncher, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1, Function1<? super LpmRepository.SupportedPaymentMethod, Unit> function1, Function2<? super LinkPaymentLauncher.Configuration, ? super InlineSignupViewState, Unit> function2, FormArguments formArguments, Function1<? super FormFieldValues, Unit> function12, int i, int i2) {
        super(2);
        this.$sheetViewModel = baseSheetViewModel;
        this.$enabled = z;
        this.$supportedPaymentMethods = list;
        this.$selectedItem = supportedPaymentMethod;
        this.$showLinkInlineSignup = z2;
        this.$linkPaymentLauncher = linkPaymentLauncher;
        this.$showCheckboxFlow = interfaceC32730Eu1;
        this.$onItemSelectedListener = function1;
        this.$onLinkSignupStateChanged = function2;
        this.$formArguments = formArguments;
        this.$onFormFieldValuesChanged = function12;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentElementKt.PaymentElement(this.$sheetViewModel, this.$enabled, this.$supportedPaymentMethods, this.$selectedItem, this.$showLinkInlineSignup, this.$linkPaymentLauncher, this.$showCheckboxFlow, this.$onItemSelectedListener, this.$onLinkSignupStateChanged, this.$formArguments, this.$onFormFieldValuesChanged, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
