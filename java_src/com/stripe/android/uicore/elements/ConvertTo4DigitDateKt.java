package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m28432d2 = {"convertTo4DigitDate", "", "input", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConvertTo4DigitDateKt {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r1 > 2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String convertTo4DigitDate(String input) {
        boolean isBlank;
        int digitToInt;
        Intrinsics.checkNotNullParameter(input, "input");
        String str = "0" + input;
        isBlank = StringsKt__StringsJVMKt.isBlank(input);
        boolean z = true;
        if (!(!isBlank) || input.charAt(0) == '0' || input.charAt(0) == '1') {
            if (input.length() > 1 && input.charAt(0) == '1') {
                digitToInt = CharsKt__CharKt.digitToInt(input.charAt(1));
            }
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return input;
    }
}
