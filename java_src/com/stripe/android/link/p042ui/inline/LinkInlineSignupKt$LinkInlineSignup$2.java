package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.LinkPaymentLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$2 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ LinkPaymentLauncher $linkPaymentLauncher;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function2<LinkPaymentLauncher.Configuration, InlineSignupViewState, Unit> $onStateChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkInlineSignupKt$LinkInlineSignup$2(LinkPaymentLauncher linkPaymentLauncher, boolean z, Function2<? super LinkPaymentLauncher.Configuration, ? super InlineSignupViewState, Unit> function2, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$linkPaymentLauncher = linkPaymentLauncher;
        this.$enabled = z;
        this.$onStateChanged = function2;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LinkInlineSignupKt.LinkInlineSignup(this.$linkPaymentLauncher, this.$enabled, this.$onStateChanged, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
