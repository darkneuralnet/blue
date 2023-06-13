package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.focus.C11312i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,257:1\n154#2:258\n67#3,3:259\n66#3:262\n36#3:269\n1057#4,6:263\n1057#4,6:270\n76#5:276\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1\n*L\n135#1:258\n136#1:259,3\n136#1:262\n156#1:269\n136#1:263,6\n156#1:270,6\n133#1:276\n*E\n"})
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPElementUI$2$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ OTPElementColors $colors;
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ EX2<Integer> $focusedElementIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$2$1$1(OTPElement oTPElement, int i, EX2<Integer> ex2, boolean z, C11309h c11309h, InterfaceC32037Bv1 interfaceC32037Bv1, boolean z2, OTPElementColors oTPElementColors, int i2) {
        super(2);
        this.$element = oTPElement;
        this.$index = i;
        this.$focusedElementIndex$delegate = ex2;
        this.$isSelected = z;
        this.$focusRequester = c11309h;
        this.$focusManager = interfaceC32037Bv1;
        this.$enabled = z2;
        this.$colors = oTPElementColors;
        this.$$dirty = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-25718618, i, -1, "com.stripe.android.uicore.elements.OTPElementUI.<anonymous>.<anonymous>.<anonymous> (OTPElementUI.kt:131)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(this.$element.getController().getFieldValues$stripe_ui_core_release().get(this.$index), "", null, interfaceC32720Et0, 56, 2);
        InterfaceC41563gV2 m114254o = BB5.m114254o(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(56));
        EX2<Integer> ex2 = this.$focusedElementIndex$delegate;
        Integer valueOf = Integer.valueOf(this.$index);
        Boolean valueOf2 = Boolean.valueOf(this.$isSelected);
        int i2 = this.$index;
        boolean z = this.$isSelected;
        EX2<Integer> ex22 = this.$focusedElementIndex$delegate;
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(valueOf2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1(i2, z, ex22);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 m17172b = C47638qk2.m17172b(C11298b.m68823a(m114254o, (Function1) mo89635G), new OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2(this.$index, this.$focusManager, this.$element, m105206a));
        Integer valueOf3 = Integer.valueOf(this.$index);
        int i3 = this.$index;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(valueOf3);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$3$1(i3);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 m40620b = C41198fs5.m40620b(m17172b, false, (Function1) mo89635G2, 1, null);
        if (this.$index == 0) {
            m40620b = C11312i.m68775a(m40620b, this.$focusRequester);
        }
        String invoke$lambda$0 = invoke$lambda$0(m105206a);
        boolean z2 = this.$isSelected;
        OTPElement oTPElement = this.$element;
        int i4 = this.$index;
        InterfaceC32037Bv1 interfaceC32037Bv1 = this.$focusManager;
        boolean z3 = this.$enabled;
        OTPElementColors oTPElementColors = this.$colors;
        int i5 = this.$$dirty;
        OTPElementUIKt.OTPInputBox(invoke$lambda$0, z2, oTPElement, i4, interfaceC32037Bv1, m40620b, z3, oTPElementColors, interfaceC32720Et0, ((i5 << 18) & 3670016) | 33280 | ((i5 << 12) & 29360128));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
