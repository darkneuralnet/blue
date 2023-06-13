package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
public class C11814a {

    /* renamed from: androidx.profileinstaller.a$a */
    /* loaded from: classes.dex */
    public static class C11815a {
        private C11815a() {
        }

        /* renamed from: a */
        public static File m66814a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    private C11814a() {
    }

    /* renamed from: a */
    public static boolean m66816a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (m66816a(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* renamed from: b */
    public static void m66815b(Context context, ProfileInstallReceiver.C11810a c11810a) {
        if (m66816a(C11815a.m66814a(context))) {
            c11810a.mo66787a(14, null);
        } else {
            c11810a.mo66787a(15, null);
        }
    }
}
