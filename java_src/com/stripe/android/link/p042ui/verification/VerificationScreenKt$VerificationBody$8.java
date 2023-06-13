package com.stripe.android.link.p042ui.verification;

import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$8 */
/* loaded from: classes7.dex */
public final class VerificationScreenKt$VerificationBody$8 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $headerStringResId;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;
    final /* synthetic */ int $messageStringResId;
    final /* synthetic */ Function0<Unit> $onVerificationCompleted;
    final /* synthetic */ boolean $showChangeEmailMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$8(int i, int i2, boolean z, LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, Function0<Unit> function0, int i3, int i4) {
        super(2);
        this.$headerStringResId = i;
        this.$messageStringResId = i2;
        this.$showChangeEmailMessage = z;
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$onVerificationCompleted = function0;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        VerificationScreenKt.VerificationBody(this.$headerStringResId, this.$messageStringResId, this.$showChangeEmailMessage, this.$linkAccount, this.$injector, this.$onVerificationCompleted, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
