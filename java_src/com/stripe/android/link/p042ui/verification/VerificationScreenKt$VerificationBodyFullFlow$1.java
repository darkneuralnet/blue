package com.stripe.android.link.p042ui.verification;

import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBodyFullFlow$1 */
/* loaded from: classes7.dex */
public final class VerificationScreenKt$VerificationBodyFullFlow$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBodyFullFlow$1(LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, int i) {
        super(2);
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        VerificationScreenKt.VerificationBodyFullFlow(this.$linkAccount, this.$injector, interfaceC32720Et0, this.$$changed | 1);
    }
}
