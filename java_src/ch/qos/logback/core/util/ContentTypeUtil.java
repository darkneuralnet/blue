package ch.qos.logback.core.util;

import com.stripe.android.financialconnections.domain.Entry;
/* loaded from: classes.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int indexOf;
        int i;
        if (str == null || (indexOf = str.indexOf(47)) == -1 || (i = indexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(Entry.TYPE_TEXT);
    }
}
