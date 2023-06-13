package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConfirmRemoveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmRemoveDialog.kt\ncom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n36#2:56\n1057#3,6:57\n*S KotlinDebug\n*F\n+ 1 ConfirmRemoveDialog.kt\ncom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt$ConfirmRemoveDialog$3\n*L\n39#1:56\n39#1:57,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.ConfirmRemoveDialogKt$ConfirmRemoveDialog$3 */
/* loaded from: classes7.dex */
public final class ConfirmRemoveDialogKt$ConfirmRemoveDialog$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<Boolean, Unit> $onDialogDismissed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmRemoveDialogKt$ConfirmRemoveDialog$3(Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$onDialogDismissed = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [Et0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-189371234, i, -1, "com.stripe.android.link.ui.wallet.ConfirmRemoveDialog.<anonymous> (ConfirmRemoveDialog.kt:36)");
        }
        Function1<Boolean, Unit> function1 = this.$onDialogDismissed;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(function1);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new ConfirmRemoveDialogKt$ConfirmRemoveDialog$3$1$1(function1);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C43714k70.m29276c(mo89635G, null, false, null, null, null, null, null, null, ComposableSingletons$ConfirmRemoveDialogKt.INSTANCE.m116569getLambda2$link_release(), interfaceC32720Et0, 805306368, 510);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
