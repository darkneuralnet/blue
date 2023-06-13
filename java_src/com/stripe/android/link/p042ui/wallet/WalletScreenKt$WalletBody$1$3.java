package com.stripe.android.link.p042ui.wallet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.p042ui.ErrorMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,545:1\n76#2:546\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$1$3\n*L\n155#1:546\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$1$3 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$1$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ ErrorMessage $alertMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$WalletBody$1$3(ErrorMessage errorMessage) {
        super(2);
        this.$alertMessage = errorMessage;
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
            C35528Qt0.m87816Z(-1110162179, i, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous> (WalletScreen.kt:154)");
        }
        ErrorMessage errorMessage = this.$alertMessage;
        Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
        C38909c26.m62000e(errorMessage.getMessage(resources), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65534);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
