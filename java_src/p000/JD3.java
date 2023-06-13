package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
/* renamed from: JD3 */
/* loaded from: classes.dex */
public final class JD3 {

    /* renamed from: JD3$a */
    /* loaded from: classes.dex */
    public static class C3937a {
        private C3937a() {
        }

        /* renamed from: a */
        public static Signature[] m100947a(SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            return apkContentsSigners;
        }

        /* renamed from: b */
        public static long m100946b(PackageInfo packageInfo) {
            long longVersionCode;
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }

        /* renamed from: c */
        public static Signature[] m100945c(SigningInfo signingInfo) {
            Signature[] signingCertificateHistory;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }

        /* renamed from: d */
        public static boolean m100944d(SigningInfo signingInfo) {
            boolean hasMultipleSigners;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return hasMultipleSigners;
        }

        /* renamed from: e */
        public static boolean m100943e(PackageManager packageManager, String str, byte[] bArr, int i) {
            boolean hasSigningCertificate;
            hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i);
            return hasSigningCertificate;
        }
    }

    private JD3() {
    }

    /* renamed from: a */
    public static long m100948a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3937a.m100946b(packageInfo);
        }
        return packageInfo.versionCode;
    }
}
