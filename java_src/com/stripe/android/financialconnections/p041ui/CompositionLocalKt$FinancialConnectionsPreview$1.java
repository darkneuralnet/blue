package com.stripe.android.financialconnections.p041ui;

import android.content.Context;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.core.Logger;
import com.stripe.android.uicore.image.NetworkImageDecoder;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\ncom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n76#2:40\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\ncom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1\n*L\n29#1:40\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.CompositionLocalKt$FinancialConnectionsPreview$1 */
/* loaded from: classes7.dex */
public final class CompositionLocalKt$FinancialConnectionsPreview$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ OY2 $navController;
    final /* synthetic */ boolean $reducedBrandingOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositionLocalKt$FinancialConnectionsPreview$1(OY2 oy2, boolean z, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$navController = oy2;
        this.$reducedBrandingOverride = z;
        this.$content = function2;
        this.$$dirty = i;
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
            C35528Qt0.m87816Z(-2034057758, i, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsPreview.<anonymous> (CompositionLocal.kt:23)");
        }
        C41806gu0.m37353a(new W94[]{FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController().m81907c(this.$navController), FinancialConnectionsSheetNativeActivityKt.getLocalReducedBranding().m81907c(Boolean.valueOf(this.$reducedBrandingOverride)), FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader().m81907c(new StripeImageLoader((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g()), Logger.Companion.noop(), null, new NetworkImageDecoder(), null))}, this.$content, interfaceC32720Et0, (this.$$dirty & 112) | 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
