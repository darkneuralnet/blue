package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: IK6 */
/* loaded from: classes6.dex */
public final class IK6 {

    /* renamed from: a */
    public final C42672iM6 f15369a;

    /* renamed from: b */
    public final Context f15370b;

    /* renamed from: c */
    public final GK6 f15371c;
    @Nullable

    /* renamed from: d */
    public PackageInfo f15372d;

    /* renamed from: e */
    public final MK6 f15373e;

    public IK6(Context context, C42672iM6 c42672iM6, MK6 mk6, byte[] bArr) {
        GK6 gk6 = new GK6(new TJ6(c42672iM6));
        this.f15369a = c42672iM6;
        this.f15373e = mk6;
        this.f15370b = context;
        this.f15371c = gk6;
    }

    @Nullable
    /* renamed from: e */
    public static X509Certificate m102473e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        android.util.Log.e("SplitCompat", r13);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m102477a(File[] fileArr) {
        PackageInfo m102474d = m102474d();
        ArrayList<X509Certificate> arrayList = null;
        if (m102474d != null && m102474d.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : m102474d.signatures) {
                X509Certificate m102473e = m102473e(signature);
                if (m102473e != null) {
                    arrayList.add(m102473e);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] m77064g = XN6.m77064g(absolutePath);
                    if (m77064g == null || m77064g.length == 0 || m77064g[0].length == 0) {
                        break;
                    } else if (arrayList.isEmpty()) {
                        String sb = "No certificates found for app.";
                        break;
                    } else {
                        for (X509Certificate x509Certificate : arrayList) {
                            for (X509Certificate[] x509CertificateArr : m77064g) {
                                int i = x509CertificateArr[0].equals(x509Certificate) ? 0 : i + 1;
                            }
                            Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                    sb2.append("Downloaded split ");
                    sb2.append(absolutePath);
                    sb2.append(" is not signed.");
                    Log.e("SplitCompat", sb2.toString(), e);
                }
            } catch (Exception e2) {
                Log.e("SplitCompat", "Split verification error.", e2);
                return false;
            }
        }
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    /* renamed from: b */
    public final boolean m102476b(File[] fileArr) throws IOException, XmlPullParserException {
        PackageInfo m102474d;
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? m102474d().getLongVersionCode() : m102474d.versionCode;
        AssetManager assetManager = (AssetManager) C46814pL6.m19456c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f15371c.m105385a(assetManager, fileArr[length]);
        } while (longVersionCode == this.f15371c.m105384b());
        return false;
    }

    /* renamed from: c */
    public final boolean m102475c(List<Intent> list) throws IOException {
        for (Intent intent : list) {
            if (!this.f15369a.m34119c(intent.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: d */
    public final PackageInfo m102474d() {
        if (this.f15372d == null) {
            try {
                this.f15372d = this.f15370b.getPackageManager().getPackageInfo(this.f15370b.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f15372d;
    }
}
