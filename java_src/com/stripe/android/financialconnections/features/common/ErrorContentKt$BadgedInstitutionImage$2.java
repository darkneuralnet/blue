package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorContentKt$BadgedInstitutionImage$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Pair<AbstractC45562nE3, InterfaceC42444hy5> $badge;
    final /* synthetic */ String $institutionIconUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorContentKt$BadgedInstitutionImage$2(String str, Pair<? extends AbstractC45562nE3, ? extends InterfaceC42444hy5> pair, int i) {
        super(2);
        this.$institutionIconUrl = str;
        this.$badge = pair;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ErrorContentKt.BadgedInstitutionImage(this.$institutionIconUrl, this.$badge, interfaceC32720Et0, this.$$changed | 1);
    }
}
