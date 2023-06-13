package p000;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: pf8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47001pf8 {

    /* renamed from: a */
    public static final Pattern f103900a = Pattern.compile("(\\w+).*");

    /* renamed from: a */
    public static String m19006a(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        AbstractC45711nU8 listIterator = ((ZP8) list).listIterator(0);
        StringBuilder sb = new StringBuilder();
        C43824kI8.m29081b(sb, listIterator, "+");
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() != 0) {
            return "transform=".concat(valueOf);
        }
        return new String("transform=");
    }

    /* renamed from: b */
    public static String m19005b(String str) {
        String str2;
        Matcher matcher = f103900a.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Invalid fragment spec: ".concat(valueOf);
            } else {
                str2 = new String("Invalid fragment spec: ");
            }
            throw new IllegalArgumentException(str2);
        }
        return matcher.group(1);
    }
}
