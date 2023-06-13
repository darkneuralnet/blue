package com.stripe.android.link.p042ui.signup;

import com.stripe.android.core.injection.NonFallbackInjector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$2 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$SignUpBody$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NonFallbackInjector $injector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$2(NonFallbackInjector nonFallbackInjector, int i) {
        super(2);
        this.$injector = nonFallbackInjector;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SignUpScreenKt.SignUpBody(this.$injector, interfaceC32720Et0, this.$$changed | 1);
    }
}
