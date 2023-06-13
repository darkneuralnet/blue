package p000;

import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* renamed from: hK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42061hK6 {

    /* renamed from: a */
    public final String f85006a;

    public C42061hK6(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f85006a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    public static String m36532g(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
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
    public final void m36538a(String str, @Nullable Object... objArr) {
        m36533f(3, str, objArr);
    }

    /* renamed from: b */
    public final void m36537b(String str, @Nullable Object... objArr) {
        m36533f(6, str, objArr);
    }

    /* renamed from: c */
    public final void m36536c(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m36532g(this.f85006a, str, objArr), th);
        }
    }

    /* renamed from: d */
    public final void m36535d(String str, @Nullable Object... objArr) {
        m36533f(4, str, objArr);
    }

    /* renamed from: e */
    public final void m36534e(String str, @Nullable Object... objArr) {
        m36533f(5, str, objArr);
    }

    /* renamed from: f */
    public final int m36533f(int i, String str, @Nullable Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m36532g(this.f85006a, str, objArr));
        }
        return 0;
    }
}
