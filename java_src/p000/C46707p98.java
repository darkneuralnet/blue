package p000;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
/* renamed from: p98  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46707p98 {
    /* renamed from: a */
    public static File m19855a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }
}
