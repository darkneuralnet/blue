package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, m28432d2 = {"canAcceptInput", "", "Lcom/stripe/android/uicore/elements/TextFieldState;", "currentValue", "", "proposedValue", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldStateKt {
    public static final boolean canAcceptInput(TextFieldState textFieldState, String currentValue, String proposedValue) {
        Intrinsics.checkNotNullParameter(textFieldState, "<this>");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(proposedValue, "proposedValue");
        if (textFieldState.isFull() && proposedValue.length() > currentValue.length()) {
            return false;
        }
        return true;
    }
}
