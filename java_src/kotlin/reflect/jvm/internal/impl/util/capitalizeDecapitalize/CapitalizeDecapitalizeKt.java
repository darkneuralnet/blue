package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
@SourceDebugExtension({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n288#3,2:146\n288#3,2:148\n766#3:150\n857#3,2:151\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:146,2\n57#1:148,2\n72#1:150\n72#1:151,2\n78#1:153,3\n*E\n"})
/* loaded from: classes8.dex */
public final class CapitalizeDecapitalizeKt {
    public static final String capitalizeAsciiOnly(String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final String decapitalizeAsciiOnly(String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z2 = true;
        }
        if (z2) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        return str;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z) {
        boolean z2;
        boolean z3;
        IntRange indices;
        Integer num;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && isUpperCaseCharAt(str, 0, z)) {
            if (str.length() != 1 && isUpperCaseCharAt(str, 1, z)) {
                indices = StringsKt__StringsKt.getIndices(str);
                Iterator<Integer> it = indices.iterator();
                while (true) {
                    if (it.hasNext()) {
                        num = it.next();
                        if (!isUpperCaseCharAt(str, num.intValue(), z)) {
                            break;
                        }
                    } else {
                        num = null;
                        break;
                    }
                }
                Integer num2 = num;
                if (num2 != null) {
                    int intValue = num2.intValue() - 1;
                    StringBuilder sb = new StringBuilder();
                    String substring = str.substring(0, intValue);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(toLowerCase(substring, z));
                    String substring2 = str.substring(intValue);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring2);
                    return sb.toString();
                }
                return toLowerCase(str, z);
            } else if (z) {
                return decapitalizeAsciiOnly(str);
            } else {
                if (str.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    char lowerCase = Character.toLowerCase(str.charAt(0));
                    String substring3 = str.substring(1);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                    return lowerCase + substring3;
                }
                return str;
            }
        }
        return str;
    }

    private static final boolean isUpperCaseCharAt(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            if ('A' > charAt || charAt >= '[') {
                return false;
            }
            return true;
        }
        return Character.isUpperCase(charAt);
    }

    private static final String toLowerCase(String str, boolean z) {
        if (z) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }
}
