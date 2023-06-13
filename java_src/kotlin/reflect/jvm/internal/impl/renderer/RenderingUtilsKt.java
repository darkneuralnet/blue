package kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt__StringsJVMKt;
@SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,75:1\n1083#2,2:76\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n29#1:76,2\n*E\n"})
/* loaded from: classes8.dex */
public final class RenderingUtilsKt {
    public static final String render(Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!shouldBeEscaped(name)) {
            String asString = name.asString();
            Intrinsics.checkNotNullExpressionValue(asString, "asString()");
            return asString;
        }
        StringBuilder sb = new StringBuilder();
        String asString2 = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString2, "asString()");
        sb.append('`' + asString2);
        sb.append('`');
        return sb.toString();
    }

    public static final String renderFqName(List<Name> pathSegments) {
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb.length() > 0) {
                sb.append(InstructionFileId.DOT);
            }
            sb.append(render(name));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String replacePrefixesInTypeRepresentations(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(lowerPrefix, "lowerPrefix");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(upperPrefix, "upperPrefix");
        Intrinsics.checkNotNullParameter(foldedPrefix, "foldedPrefix");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(lowerRendered, lowerPrefix, false, 2, null);
        if (startsWith$default) {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(upperRendered, upperPrefix, false, 2, null);
            if (startsWith$default2) {
                String substring = lowerRendered.substring(lowerPrefix.length());
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                String substring2 = upperRendered.substring(upperPrefix.length());
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                String str = foldedPrefix + substring;
                if (Intrinsics.areEqual(substring, substring2)) {
                    return str;
                }
                if (typeStringsDifferOnlyInNullability(substring, substring2)) {
                    return str + '!';
                }
            }
        }
        return null;
    }

    private static final boolean shouldBeEscaped(Name name) {
        boolean z;
        boolean z2;
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString()");
        if (KeywordStringsGenerated.KEYWORDS.contains(asString)) {
            return true;
        }
        int i = 0;
        while (true) {
            if (i < asString.length()) {
                char charAt = asString.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7 + '?', r8) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean typeStringsDifferOnlyInNullability(String lower, String upper) {
        String replace$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(lower, "lower");
        Intrinsics.checkNotNullParameter(upper, "upper");
        replace$default = StringsKt__StringsJVMKt.replace$default(upper, CallerData.f61059NA, "", false, 4, (Object) null);
        if (!Intrinsics.areEqual(lower, replace$default)) {
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(upper, CallerData.f61059NA, false, 2, null);
            if (endsWith$default) {
            }
            if (!Intrinsics.areEqual(CoreConstants.LEFT_PARENTHESIS_CHAR + lower + ")?", upper)) {
                return false;
            }
        }
        return true;
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "<this>");
        List<Name> pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments()");
        return renderFqName(pathSegments);
    }
}
