package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lh10;", "", "invoke", "(Lh10;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModalBottomSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,315:1\n154#2:316\n36#3:317\n1057#4,6:318\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1\n*L\n304#1:316\n306#1:317\n306#1:318,6\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ModalBottomSheetContentKt$lambda1$1 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ModalBottomSheetContentKt$lambda1$1 INSTANCE = new ComposableSingletons$ModalBottomSheetContentKt$lambda1$1();

    public ComposableSingletons$ModalBottomSheetContentKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 StripeImage, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89539n(StripeImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1641519870, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ModalBottomSheetContentKt.lambda-1.<anonymous> (ModalBottomSheetContent.kt:299)");
        }
        long m116474getTextSecondary0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116474getTextSecondary0d7_KjU();
        InterfaceC41563gV2 mo35388c = StripeImage.mo35388c(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(6)), InterfaceC4360K9.f19170a.m99141e());
        C47063pm0 m18747i = C47063pm0.m18747i(m116474getTextSecondary0d7_KjU);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m18747i);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new ComposableSingletons$ModalBottomSheetContentKt$lambda1$1$1$1(m116474getTextSecondary0d7_KjU);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C48169re0.m15656a(mo35388c, (Function1) mo89635G, interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
