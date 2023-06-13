package p000;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
/* renamed from: mo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45311mo7 {

    /* renamed from: b */
    public static final C32711Es0 f98837b = C32711Es0.m108309e(C45311mo7.class).m108292b(C43645k01.m29483k(Context.class)).m108288f(C44718lo7.f96760a).m108290d();

    /* renamed from: c */
    public static final Object f98838c = new Object();

    /* renamed from: a */
    public final Context f98839a;

    public C45311mo7(Context context) {
        this.f98839a = context;
    }

    /* renamed from: a */
    public final C45904no7 m24902a(C43532jo7 c43532jo7) {
        C45904no7 c45904no7;
        String str;
        String str2;
        String str3;
        synchronized (f98838c) {
            File m24901b = m24901b(c43532jo7);
            c45904no7 = null;
            try {
                String str4 = new String(new C27395pp(m24901b).m18663d(), Charset.forName(Constants.DEFAULT_ENCODING));
                try {
                    Pv9 m77616b = Wv9.m77616b(str4);
                    if (!(m77616b instanceof Uv9)) {
                        Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON element:\n".concat(m77616b.toString()));
                        c43532jo7.m29891c(EnumC52998zm7.FILE_READ_RETURNED_MALFORMED_DATA);
                    } else {
                        Uv9 m89367a = m77616b.m89367a();
                        try {
                            C39974do7 c39974do7 = new C39974do7(m89367a.m80611c("fid").m76050e());
                            String m76050e = m89367a.m80611c("refreshToken").m76050e();
                            String m76050e2 = m89367a.m80611c("temporaryToken").m76050e();
                            long m76052b = m89367a.m80611c("temporaryTokenExpiryTimestamp").m76052b();
                            String obj = c39974do7.toString();
                            StringBuilder sb = new StringBuilder(obj.length() + 5);
                            sb.append("fid: ");
                            sb.append(obj);
                            Log.d("MLKitInstallationIdSaver", sb.toString());
                            String valueOf = String.valueOf(m76050e);
                            if (valueOf.length() != 0) {
                                str2 = "refresh_token: ".concat(valueOf);
                            } else {
                                str2 = new String("refresh_token: ");
                            }
                            Log.d("MLKitInstallationIdSaver", str2);
                            String valueOf2 = String.valueOf(m76050e2);
                            if (valueOf2.length() != 0) {
                                str3 = "temporary_token: ".concat(valueOf2);
                            } else {
                                str3 = new String("temporary_token: ");
                            }
                            Log.d("MLKitInstallationIdSaver", str3);
                            StringBuilder sb2 = new StringBuilder(44);
                            sb2.append("temporary token expiry: ");
                            sb2.append(m76052b);
                            Log.d("MLKitInstallationIdSaver", sb2.toString());
                            c45904no7 = new C45904no7(c39974do7, m76050e, m76050e2, m76052b);
                        } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                            c43532jo7.m29891c(EnumC52998zm7.FILE_READ_RETURNED_INVALID_DATA);
                            String obj2 = m89367a.toString();
                            StringBuilder sb3 = new StringBuilder(str4.length() + 72 + obj2.length());
                            sb3.append("Error traversing installation info JSON object:\nraw json:\n");
                            sb3.append(str4);
                            sb3.append("\nparsed json:\n");
                            sb3.append(obj2);
                            Log.e("MLKitInstallationIdSaver", sb3.toString(), e);
                        }
                    }
                } catch (zzwl e2) {
                    if (str4.length() != 0) {
                        str = "Error parsing installation info JSON object:\n".concat(str4);
                    } else {
                        str = new String("Error parsing installation info JSON object:\n");
                    }
                    Log.e("MLKitInstallationIdSaver", str, e2);
                    c43532jo7.m29891c(EnumC52998zm7.FILE_READ_RETURNED_MALFORMED_DATA);
                }
            } catch (IOException e3) {
                if (!m24901b.exists()) {
                    String obj3 = m24901b.toString();
                    StringBuilder sb4 = new StringBuilder(obj3.length() + 38);
                    sb4.append("Installation id file not yet present: ");
                    sb4.append(obj3);
                    Log.i("MLKitInstallationIdSaver", sb4.toString());
                    return null;
                }
                c43532jo7.m29891c(EnumC52998zm7.FILE_READ_FAILED);
                String obj4 = m24901b.toString();
                StringBuilder sb5 = new StringBuilder(obj4.length() + 36);
                sb5.append("Error reading installation id file: ");
                sb5.append(obj4);
                Log.w("MLKitInstallationIdSaver", sb5.toString(), e3);
                return null;
            }
        }
        return c45904no7;
    }

    /* renamed from: b */
    public final File m24901b(C43532jo7 c43532jo7) {
        File m94295i = NA0.m94295i(this.f98839a);
        if (m94295i == null || !m94295i.isDirectory()) {
            Log.w("MLKitInstallationIdSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            m94295i = this.f98839a.getFilesDir();
            if (m94295i != null && !m94295i.isDirectory()) {
                try {
                    if (!m94295i.mkdirs()) {
                        String obj = m94295i.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 15);
                        sb.append("mkdirs failed: ");
                        sb.append(obj);
                        Log.w("MLKitInstallationIdSaver", sb.toString());
                        c43532jo7.m29890d(EnumC52998zm7.DIRECTORY_CREATION_FAILED);
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitInstallationIdSaver", "mkdirs threw an exception: ".concat(m94295i.toString()), e);
                    c43532jo7.m29890d(EnumC52998zm7.DIRECTORY_CREATION_FAILED);
                }
            }
        }
        return new File(m94295i, "com.google.mlkit.InstallationId");
    }

    /* renamed from: c */
    public final void m24900c(C45904no7 c45904no7, C43532jo7 c43532jo7) {
        File file;
        C27395pp c27395pp;
        FileOutputStream m18661f;
        String format = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", c45904no7.m22345b().m43686a(), c45904no7.m22344c(), c45904no7.m22343d(), Long.valueOf(c45904no7.m22346a()));
        synchronized (f98838c) {
            try {
                file = m24901b(c43532jo7);
            } catch (IOException e) {
                e = e;
                file = null;
            }
            try {
                String obj = file.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 26);
                sb.append("Creating installation id: ");
                sb.append(obj);
                Log.i("MLKitInstallationIdSaver", sb.toString());
                c27395pp = new C27395pp(file);
                m18661f = c27395pp.m18661f();
            } catch (IOException e2) {
                e = e2;
                c43532jo7.m29891c(EnumC52998zm7.FILE_WRITE_FAILED);
                String valueOf = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                sb2.append("Error writing to installation id file ");
                sb2.append(valueOf);
                Log.e("MLKitInstallationIdSaver", sb2.toString(), e);
            }
            try {
                PrintWriter printWriter = new PrintWriter(m18661f);
                printWriter.println(format);
                printWriter.flush();
                c27395pp.m18665b(m18661f);
                String obj2 = file.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 37 + String.valueOf(format).length());
                sb3.append("Succeeded writing installation id: ");
                sb3.append(obj2);
                sb3.append(":\n");
                sb3.append(format);
                Log.d("MLKitInstallationIdSaver", sb3.toString());
            } catch (Throwable th) {
                c27395pp.m18666a(m18661f);
                throw th;
            }
        }
    }
}
