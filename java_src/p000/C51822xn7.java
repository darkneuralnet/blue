package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* renamed from: xn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51822xn7 {

    /* renamed from: c */
    public static final Object f118129c = new Object();

    /* renamed from: a */
    public final Context f118130a;

    /* renamed from: b */
    public final C51229wn7 f118131b;

    public C51822xn7(Context context) {
        C51229wn7 c51229wn7 = new C51229wn7(null);
        this.f118130a = context;
        this.f118131b = c51229wn7;
    }

    /* renamed from: a */
    public final C41250fx7 m4695a(String str, String str2, String str3, int i, C33141Gn7 c33141Gn7, long j) {
        File file;
        synchronized (f118129c) {
            try {
                try {
                    file = m4694b(str, "com.google.perception", 2);
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                file = null;
            }
            try {
                byte[] m18663d = new C27395pp(file).m18663d();
                if (m18663d == null) {
                    return null;
                }
                try {
                    C32439Dn7 m109931F = C32439Dn7.m109931F(m18663d, C53068zt7.m154a());
                    if (!m109931F.m109924M()) {
                        Log.w("AccelerationAllowlistPersistence", "No persistence time in cached entry, discarding it");
                    } else if (System.currentTimeMillis() / 1000 <= m109931F.m109930G().m15009D() + j) {
                        if (!m109931F.m109928I().equals(str2)) {
                            Log.i("AccelerationAllowlistPersistence", "Different client library version, discarding cached content");
                            return null;
                        }
                        return m109931F.m109929H();
                    }
                    Log.i("AccelerationAllowlistPersistence", "Cache expired");
                    return null;
                } catch (zzaqw e2) {
                    String obj = file.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 29);
                    sb.append("Invalid cached data in file: ");
                    sb.append(obj);
                    Log.e("AccelerationAllowlistPersistence", sb.toString(), e2);
                    c33141Gn7.m104717c(bz9.FILE_READ_RETURNED_MALFORMED_DATA);
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                if (file != null) {
                    if (!file.exists()) {
                        String obj2 = file.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 41);
                        sb2.append("No acceleration allowlist cache file at: ");
                        sb2.append(obj2);
                        Log.i("AccelerationAllowlistPersistence", sb2.toString());
                    } else {
                        String obj3 = file.toString();
                        StringBuilder sb3 = new StringBuilder(obj3.length() + 49);
                        sb3.append("Error reading acceleration allowlist cache file: ");
                        sb3.append(obj3);
                        Log.w("AccelerationAllowlistPersistence", sb3.toString(), e);
                        c33141Gn7.m104717c(bz9.FILE_READ_FAILED);
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("Unable to access acceleration allowlist cache file: ");
                    sb4.append("null");
                    Log.w("AccelerationAllowlistPersistence", sb4.toString(), e);
                    c33141Gn7.m104717c(bz9.FILE_READ_FAILED);
                }
                return null;
            }
        }
    }

    /* renamed from: b */
    public final File m4694b(String str, String str2, int i) throws IOException {
        String format = String.format("com.google.mlkit.AccelerationAllowList.%s.%s.%s", str, "com.google.perception", "NNAPI");
        File m94295i = NA0.m94295i(this.f118130a);
        if (m94295i == null || !m94295i.isDirectory()) {
            Log.w("AccelerationAllowlistPersistence", "noBackupFilesDir doesn't exist, using regular files directory instead");
            m94295i = this.f118130a.getFilesDir();
            if (!m94295i.isDirectory()) {
                try {
                    if (!m94295i.mkdirs()) {
                        String valueOf = String.valueOf(m94295i);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
                        sb.append("mkdirs failed: ");
                        sb.append(valueOf);
                        Log.w("AccelerationAllowlistPersistence", sb.toString());
                        String valueOf2 = String.valueOf(m94295i);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 33);
                        sb2.append("Unable to create persistence dir ");
                        sb2.append(valueOf2);
                        throw new IOException(sb2.toString());
                    }
                } catch (SecurityException e) {
                    Log.w("AccelerationAllowlistPersistence", "mkdirs threw an exception: ".concat(String.valueOf(m94295i)), e);
                    throw new IOException("Unable to create persistence dir ".concat(String.valueOf(m94295i)), e);
                }
            }
        }
        return new File(m94295i, format);
    }

    /* renamed from: c */
    public final void m4693c(C41250fx7 c41250fx7, String str, String str2, String str3, int i, C33141Gn7 c33141Gn7) {
        File file;
        C32205Cn7 m109933D = C32439Dn7.m109933D();
        m109933D.m111686p(c41250fx7);
        C47763qw7 m15008E = C48356rw7.m15008E();
        m15008E.m16772p(System.currentTimeMillis() / 1000);
        m109933D.m111684r((C48356rw7) m15008E.mo42381i());
        m109933D.m111685q(str2);
        C32439Dn7 c32439Dn7 = (C32439Dn7) m109933D.mo42381i();
        synchronized (f118129c) {
            try {
                file = m4694b(str, "com.google.perception", 2);
            } catch (IOException e) {
                e = e;
                file = null;
            }
            try {
                String obj = file.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 33);
                sb.append("Saving nnapi allowlist cache to: ");
                sb.append(obj);
                Log.i("AccelerationAllowlistPersistence", sb.toString());
                C27395pp c27395pp = new C27395pp(file);
                FileOutputStream m18661f = c27395pp.m18661f();
                try {
                    c32439Dn7.m2345a(m18661f);
                    c27395pp.m18665b(m18661f);
                    String obj2 = file.toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 36);
                    sb2.append("Succeeded storing allowlist to file ");
                    sb2.append(obj2);
                    Log.d("AccelerationAllowlistPersistence", sb2.toString());
                } catch (Throwable th) {
                    c27395pp.m18666a(m18661f);
                    c33141Gn7.m104717c(bz9.FILE_WRITE_FAILED);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                String valueOf = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 44);
                sb3.append("Error writing to nnapi allowlist cache file ");
                sb3.append(valueOf);
                Log.e("AccelerationAllowlistPersistence", sb3.toString(), e);
                c33141Gn7.m104717c(bz9.FILE_WRITE_FAILED);
            }
        }
    }
}
