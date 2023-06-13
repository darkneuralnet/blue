package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TrailingIcon$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TextFieldIcon.Trailing $trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TrailingIcon$2$1(TextFieldIcon.Trailing trailing) {
        super(0);
        this.$trailingIcon = trailing;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> onClick = this.$trailingIcon.getOnClick();
        if (onClick != null) {
            onClick.invoke();
        }
    }
}
