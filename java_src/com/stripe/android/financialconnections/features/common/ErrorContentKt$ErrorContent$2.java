package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorContentKt$ErrorContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Pair<AbstractC45562nE3, InterfaceC42444hy5> $badge;
    final /* synthetic */ String $content;
    final /* synthetic */ String $iconUrl;
    final /* synthetic */ Pair<String, Function0<Unit>> $primaryCta;
    final /* synthetic */ Pair<String, Function0<Unit>> $secondaryCta;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorContentKt$ErrorContent$2(String str, Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair, String str2, String str3, Pair<String, ? extends Function0<Unit>> pair2, Pair<String, ? extends Function0<Unit>> pair3, int i, int i2) {
        super(2);
        this.$iconUrl = str;
        this.$badge = pair;
        this.$title = str2;
        this.$content = str3;
        this.$primaryCta = pair2;
        this.$secondaryCta = pair3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ErrorContentKt.ErrorContent(this.$iconUrl, this.$badge, this.$title, this.$content, this.$primaryCta, this.$secondaryCta, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
