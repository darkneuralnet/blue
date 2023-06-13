package com.stripe.android.uicore.elements;

import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "autofillType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$defaultAutofillEventReporter$1 extends Lambda implements Function1<String, Unit> {
    public static final TextFieldUIKt$defaultAutofillEventReporter$1 INSTANCE = new TextFieldUIKt$defaultAutofillEventReporter$1();

    public TextFieldUIKt$defaultAutofillEventReporter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "autofillType");
        Logger companion = Logger.Companion.getInstance(false);
        companion.debug("LocalAutofillEventReporter " + autofillType + " event not reported");
    }
}
