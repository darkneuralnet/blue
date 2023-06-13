package p000;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* renamed from: El2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32650El2 {
    @KeepForSdk
    /* renamed from: a */
    public static int m108403a(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            return Log.e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    @SuppressLint({"LogTagMismatch"})
    /* renamed from: b */
    public static int m108402b(@RecentlyNonNull Throwable th, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                return Log.e("Vision", String.format(str, objArr), th);
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + valueOf.length());
            sb.append(format);
            sb.append(": ");
            sb.append(valueOf);
            return Log.e("Vision", sb.toString());
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: c */
    public static int m108401c(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            return Log.i("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: d */
    public static int m108400d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 2)) {
            return Log.v("Vision", String.format(str, objArr));
        }
        return 0;
    }
}
