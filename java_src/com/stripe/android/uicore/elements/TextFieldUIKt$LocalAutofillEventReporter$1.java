package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class TextFieldUIKt$LocalAutofillEventReporter$1 extends FunctionReferenceImpl implements Function0<Function1<? super String, ? extends Unit>> {
    public static final TextFieldUIKt$LocalAutofillEventReporter$1 INSTANCE = new TextFieldUIKt$LocalAutofillEventReporter$1();

    public TextFieldUIKt$LocalAutofillEventReporter$1() {
        super(0, TextFieldUIKt.class, "defaultAutofillEventReporter", "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super String, ? extends Unit> invoke() {
        Function1<? super String, ? extends Unit> defaultAutofillEventReporter;
        defaultAutofillEventReporter = TextFieldUIKt.defaultAutofillEventReporter();
        return defaultAutofillEventReporter;
    }
}
