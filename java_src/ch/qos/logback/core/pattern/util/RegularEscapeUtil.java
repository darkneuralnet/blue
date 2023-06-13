package ch.qos.logback.core.pattern.util;
/* loaded from: classes.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'n') {
                    charAt2 = '\n';
                } else if (charAt2 == 'r') {
                    charAt2 = '\r';
                } else if (charAt2 == 't') {
                    charAt2 = '\t';
                } else if (charAt2 == 'f') {
                    charAt2 = '\f';
                }
                char c = charAt2;
                i2 = i3;
                charAt = c;
            }
            sb.append(charAt);
            i = i2;
        }
        return sb.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c, int i) {
        char c2;
        if (str.indexOf(c) >= 0 || c == '\\') {
            stringBuffer.append(c);
        } else if (c != '_') {
            if (c == 'n') {
                c2 = '\n';
            } else if (c == 'r') {
                c2 = '\r';
            } else if (c != 't') {
                String formatEscapeCharsForListing = formatEscapeCharsForListing(str);
                throw new IllegalArgumentException("Illegal char '" + c + " at column " + i + ". Only \\\\, \\_" + formatEscapeCharsForListing + ", \\t, \\n, \\r combinations are allowed as escape characters.");
            } else {
                c2 = '\t';
            }
            stringBuffer.append(c2);
        }
    }

    public String formatEscapeCharsForListing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(", \\");
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
