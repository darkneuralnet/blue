package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* renamed from: je7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43432je7 {

    /* renamed from: a */
    public static final int f93102a;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L12;
     */
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() == 1) {
                    if (str.charAt(0) >= 'S') {
                    }
                }
            }
            i2 = 0;
        }
        f93102a = i2;
    }

    /* renamed from: a */
    public static PendingIntent m30138a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
