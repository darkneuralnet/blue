package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.domain.PartnerNotice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerCalloutKt$PartnerCallout$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ PartnerNotice $partnerNotice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerCalloutKt$PartnerCallout$2(InterfaceC41563gV2 interfaceC41563gV2, PartnerNotice partnerNotice, Function1<? super String, Unit> function1, int i, int i2) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$partnerNotice = partnerNotice;
        this.$onClickableTextClick = function1;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PartnerCalloutKt.PartnerCallout(this.$modifier, this.$partnerNotice, this.$onClickableTextClick, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
