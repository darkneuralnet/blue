package p000;

import android.os.Build;
import co.bird.android.model.Detail;
import java.io.File;
/* renamed from: MK6 */
/* loaded from: classes6.dex */
public final class MK6 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static KK6 m95441a() {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return new C39699dL6((short[]) null);
            case 25:
                return new C39699dL6((int[]) null);
            case 26:
                return new C39699dL6((boolean[]) null);
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new C39699dL6((float[]) null);
                }
                break;
        }
        return new C39699dL6((byte[][]) null);
    }

    /* renamed from: b */
    public static String m95440b(File file) {
        if (file.getName().endsWith(".apk")) {
            String str = "";
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            if (replaceFirst.equals("base-master")) {
                return "";
            }
            String str2 = "base-";
            if (replaceFirst.startsWith("base-")) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace(Detail.EMPTY_CHAR, ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: c */
    public static void m95439c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static <T> void m95438d(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }
}
