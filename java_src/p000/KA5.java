package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
/* renamed from: KA5 */
/* loaded from: classes2.dex */
public class KA5 {

    /* renamed from: a */
    public static boolean f19227a = true;

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: a */
    public static boolean m99110a(Context context, String str, String str2, String str3, int i) {
        boolean z;
        ByteArrayInputStream byteArrayInputStream;
        boolean z2;
        if (!f19227a) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length != 0) {
                z = true;
            } else {
                z = false;
            }
            int length = signatureArr.length;
            ByteArrayInputStream byteArrayInputStream2 = null;
            int i2 = 0;
            while (i2 < length) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(signatureArr[i2].toByteArray());
                } catch (CertificateException unused) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(byteArrayInputStream);
                    String name = x509Certificate.getSubjectX500Principal().getName();
                    String name2 = x509Certificate.getIssuerX500Principal().getName();
                    int hashCode = x509Certificate.getPublicKey().hashCode();
                    if (str2.equals(name) && str3.equals(name2) && i == hashCode) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z &= z2;
                    if (!z) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused2) {
                        }
                        return false;
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused3) {
                    }
                    i2++;
                    byteArrayInputStream2 = byteArrayInputStream;
                } catch (CertificateException unused4) {
                    byteArrayInputStream2 = byteArrayInputStream;
                    if (byteArrayInputStream2 != null) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    if (byteArrayInputStream2 != null) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th;
                }
            }
            return z;
        } catch (PackageManager.NameNotFoundException unused7) {
            return false;
        }
    }
}
