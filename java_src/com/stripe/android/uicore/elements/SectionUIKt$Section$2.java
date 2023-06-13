package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SectionUIKt$Section$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $contentInCard;
    final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> $contentOutsideCard;
    final /* synthetic */ String $error;
    final /* synthetic */ Integer $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SectionUIKt$Section$2(Integer num, String str, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, int i, int i2) {
        super(2);
        this.$title = num;
        this.$error = str;
        this.$contentOutsideCard = function2;
        this.$contentInCard = function22;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SectionUIKt.Section(this.$title, this.$error, this.$contentOutsideCard, this.$contentInCard, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
