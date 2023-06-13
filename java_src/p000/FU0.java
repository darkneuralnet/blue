package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.nio.CharBuffer;
@SuppressLint({"LogConditional"})
/* renamed from: FU0 */
/* loaded from: classes.dex */
public class FU0 {
    /* renamed from: a */
    public static String m107120a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* renamed from: b */
    public static String m107119b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: c */
    public static String m107118c(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return CallerData.f61059NA + i;
            }
        }
        return "UNKNOWN";
    }

    /* renamed from: d */
    public static String m107117d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public static String m107116e(MotionLayout motionLayout, int i) {
        return m107115f(motionLayout, i, -1);
    }

    /* renamed from: f */
    public static String m107115f(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 != -1) {
            if (resourceEntryName.length() > i2) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() > i2 && (length = resourceEntryName.replaceAll("[^_]", "").length()) > 0) {
                int length2 = (resourceEntryName.length() - i2) / length;
                return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace((char) 0, CoreConstants.DOT) + "_", "_");
            }
            return resourceEntryName;
        }
        return resourceEntryName;
    }

    /* renamed from: g */
    public static void m107114g(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str3);
        }
    }
}
