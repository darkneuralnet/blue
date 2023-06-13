package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.p041ui.TextResource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$2 */
/* loaded from: classes7.dex */
public final class TextKt$AnnotatedText$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Map<StringAnnotation, GN5> $annotationStyles;
    final /* synthetic */ G26 $defaultStyle;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ TextResource $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextKt$AnnotatedText$2(TextResource textResource, Function1<? super String, Unit> function1, G26 g26, InterfaceC41563gV2 interfaceC41563gV2, Map<StringAnnotation, GN5> map, int i, int i2) {
        super(2);
        this.$text = textResource;
        this.$onClickableTextClick = function1;
        this.$defaultStyle = g26;
        this.$modifier = interfaceC41563gV2;
        this.$annotationStyles = map;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TextKt.AnnotatedText(this.$text, this.$onClickableTextClick, this.$defaultStyle, this.$modifier, this.$annotationStyles, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
