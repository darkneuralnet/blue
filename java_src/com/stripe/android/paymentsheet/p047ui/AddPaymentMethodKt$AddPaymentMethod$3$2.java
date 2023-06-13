package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,178:1\n36#2:179\n1057#3,6:180\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2\n*L\n106#1:179\n106#1:180,6\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$3$2 */
/* loaded from: classes7.dex */
public final class AddPaymentMethodKt$AddPaymentMethod$3$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ FormArguments $arguments;
    final /* synthetic */ Context $context;
    final /* synthetic */ LinkHandler $linkHandler;
    final /* synthetic */ EX2<InlineSignupViewState> $linkSignupState$delegate;
    final /* synthetic */ InterfaceC48627sP5<Boolean> $processing$delegate;
    final /* synthetic */ LpmRepository.SupportedPaymentMethod $selectedItem;
    final /* synthetic */ EX2<String> $selectedPaymentMethodCode$delegate;
    final /* synthetic */ BaseSheetViewModel $sheetViewModel;
    final /* synthetic */ GX2<Boolean> $showCheckboxFlow;
    final /* synthetic */ boolean $showLinkInlineSignup;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$3$2$1 */
    /* loaded from: classes7.dex */
    public static final class C192921 extends Lambda implements Function1<LpmRepository.SupportedPaymentMethod, Unit> {
        final /* synthetic */ LpmRepository.SupportedPaymentMethod $selectedItem;
        final /* synthetic */ EX2<String> $selectedPaymentMethodCode$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192921(LpmRepository.SupportedPaymentMethod supportedPaymentMethod, EX2<String> ex2) {
            super(1);
            this.$selectedItem = supportedPaymentMethod;
            this.$selectedPaymentMethodCode$delegate = ex2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LpmRepository.SupportedPaymentMethod supportedPaymentMethod) {
            invoke2(supportedPaymentMethod);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LpmRepository.SupportedPaymentMethod selectedLpm) {
            Intrinsics.checkNotNullParameter(selectedLpm, "selectedLpm");
            if (Intrinsics.areEqual(this.$selectedItem, selectedLpm)) {
                return;
            }
            this.$selectedPaymentMethodCode$delegate.setValue(selectedLpm.getCode());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$3$2$3 */
    /* loaded from: classes7.dex */
    public static final class C192933 extends Lambda implements Function1<FormFieldValues, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ LpmRepository.SupportedPaymentMethod $selectedItem;
        final /* synthetic */ BaseSheetViewModel $sheetViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192933(Context context, LpmRepository.SupportedPaymentMethod supportedPaymentMethod, BaseSheetViewModel baseSheetViewModel) {
            super(1);
            this.$context = context;
            this.$selectedItem = supportedPaymentMethod;
            this.$sheetViewModel = baseSheetViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FormFieldValues formFieldValues) {
            invoke2(formFieldValues);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(FormFieldValues formFieldValues) {
            this.$sheetViewModel.updateSelection(formFieldValues != null ? AddPaymentMethodKt.transformToPaymentSelection(formFieldValues, this.$context, this.$selectedItem) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodKt$AddPaymentMethod$3$2(BaseSheetViewModel baseSheetViewModel, LpmRepository.SupportedPaymentMethod supportedPaymentMethod, boolean z, LinkHandler linkHandler, GX2<Boolean> gx2, EX2<InlineSignupViewState> ex2, FormArguments formArguments, InterfaceC48627sP5<Boolean> interfaceC48627sP5, EX2<String> ex22, Context context) {
        super(2);
        this.$sheetViewModel = baseSheetViewModel;
        this.$selectedItem = supportedPaymentMethod;
        this.$showLinkInlineSignup = z;
        this.$linkHandler = linkHandler;
        this.$showCheckboxFlow = gx2;
        this.$linkSignupState$delegate = ex2;
        this.$arguments = formArguments;
        this.$processing$delegate = interfaceC48627sP5;
        this.$selectedPaymentMethodCode$delegate = ex22;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [Et0] */
    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean AddPaymentMethod$lambda$1;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-754720141, i, -1, "com.stripe.android.paymentsheet.ui.AddPaymentMethod.<anonymous>.<anonymous> (AddPaymentMethod.kt:91)");
        }
        BaseSheetViewModel baseSheetViewModel = this.$sheetViewModel;
        AddPaymentMethod$lambda$1 = AddPaymentMethodKt.AddPaymentMethod$lambda$1(this.$processing$delegate);
        boolean z = !AddPaymentMethod$lambda$1;
        List<LpmRepository.SupportedPaymentMethod> supportedPaymentMethods$paymentsheet_release = this.$sheetViewModel.getSupportedPaymentMethods$paymentsheet_release();
        LpmRepository.SupportedPaymentMethod supportedPaymentMethod = this.$selectedItem;
        boolean z2 = this.$showLinkInlineSignup;
        LinkPaymentLauncher linkLauncher = this.$linkHandler.getLinkLauncher();
        GX2<Boolean> gx2 = this.$showCheckboxFlow;
        C192921 c192921 = new C192921(this.$selectedItem, this.$selectedPaymentMethodCode$delegate);
        EX2<InlineSignupViewState> ex2 = this.$linkSignupState$delegate;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(ex2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new AddPaymentMethodKt$AddPaymentMethod$3$2$2$1(ex2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        PaymentElementKt.PaymentElement(baseSheetViewModel, z, supportedPaymentMethods$paymentsheet_release, supportedPaymentMethod, z2, linkLauncher, gx2, c192921, mo89635G, this.$arguments, new C192933(this.$context, this.$selectedItem, this.$sheetViewModel), interfaceC32720Et0, (LpmRepository.SupportedPaymentMethod.$stable << 9) | 2097672 | (LinkPaymentLauncher.$stable << 15) | ((Amount.$stable | PaymentMethodCreateParams.$stable) << 27), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
