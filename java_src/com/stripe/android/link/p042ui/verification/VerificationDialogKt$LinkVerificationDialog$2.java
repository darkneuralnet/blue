package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.LinkPaymentLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$2 */
/* loaded from: classes7.dex */
public final class VerificationDialogKt$LinkVerificationDialog$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LinkPaymentLauncher $linkLauncher;
    final /* synthetic */ Function1<Boolean, Unit> $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$2(LinkPaymentLauncher linkPaymentLauncher, Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$linkLauncher = linkPaymentLauncher;
        this.$onResult = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        VerificationDialogKt.LinkVerificationDialog(this.$linkLauncher, this.$onResult, interfaceC32720Et0, this.$$changed | 1);
    }
}
