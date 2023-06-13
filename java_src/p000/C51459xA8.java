package p000;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* renamed from: xA8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51459xA8 {

    /* renamed from: a */
    public final String f117168a;

    public C51459xA8(String str) {
        String str2;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        if (str.length() != 0) {
            str2 = sb2.concat(str);
        } else {
            str2 = new String(sb2);
        }
        this.f117168a = str2;
    }

    /* renamed from: f */
    public static String m5749f(String str, String str2, Object... objArr) {
        String str3;
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                if (str2.length() != 0) {
                    str3 = "Unable to format ".concat(str2);
                } else {
                    str3 = new String("Unable to format ");
                }
                Log.e("PlayCore", str3, e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final int m5754a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m5749f(this.f117168a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m5753b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m5749f(this.f117168a, "Phonesky is not installed.", objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m5752c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m5749f(this.f117168a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m5751d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m5749f(this.f117168a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m5750e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m5749f(this.f117168a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
