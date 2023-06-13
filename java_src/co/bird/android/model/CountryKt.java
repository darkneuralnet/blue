package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"getFlagEmoji", "", "", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CountryKt {
    public static final CharSequence getFlagEmoji(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] chars = Character.toChars((Character.codePointAt(str, 0) - 65) + 127462);
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(firstLetter)");
        String str2 = new String(chars);
        char[] chars2 = Character.toChars((Character.codePointAt(str, 1) - 65) + 127462);
        Intrinsics.checkNotNullExpressionValue(chars2, "toChars(secondLetter)");
        String str3 = new String(chars2);
        return str2 + str3;
    }
}
