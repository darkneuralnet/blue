package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.Locale;
/* renamed from: vl1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C50610vl1 {
    private C50610vl1() {
    }

    /* renamed from: a */
    public static String m8198a(String str) {
        int lastIndexOf;
        if (!C44504lS5.m27273b(str) || (lastIndexOf = str.lastIndexOf(InstructionFileId.DOT)) == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toLowerCase(Locale.US).trim();
    }

    /* renamed from: b */
    public static String m8197b(Long l) {
        return m8196c(l, true);
    }

    /* renamed from: c */
    public static String m8196c(Long l, boolean z) {
        int i;
        String str;
        String str2 = "";
        if (l == null || l.longValue() < 0) {
            return "";
        }
        if (z) {
            i = 1000;
        } else {
            i = 1024;
        }
        if (l.longValue() < i) {
            return l + " B";
        }
        double d = i;
        int log = (int) (Math.log(l.longValue()) / Math.log(d));
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = "kMGTPE";
        } else {
            str = "KMGTPE";
        }
        sb.append(str.charAt(log - 1));
        if (!z) {
            str2 = "i";
        }
        sb.append(str2);
        return String.format(Locale.US, "%.1f %sB", Double.valueOf(l.longValue() / Math.pow(d, log)), sb.toString());
    }
}
