package p000;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
/* renamed from: sc9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48750sc9 {

    /* renamed from: b */
    public static final C32711Es0 f109048b = C32711Es0.m108309e(C48750sc9.class).m108292b(C43645k01.m29483k(Context.class)).m108288f(C45193mc9.f98445a).m108290d();

    /* renamed from: c */
    public static final Object f109049c = new Object();

    /* renamed from: a */
    public final Context f109050a;

    public C48750sc9(Context context) {
        this.f109050a = context;
    }

    /* renamed from: a */
    public final C52307yc9 m13940a(Yb9 yb9) {
        C52307yc9 c52307yc9;
        String str;
        String str2;
        String str3;
        synchronized (f109049c) {
            File m13939b = m13939b(yb9);
            c52307yc9 = null;
            try {
                String str4 = new String(new C27395pp(m13939b).m18663d(), Charset.forName(Constants.DEFAULT_ENCODING));
                try {
                    C51629xT7 m98833b = KU7.m98833b(str4);
                    if (!(m98833b instanceof C43931kU7)) {
                        Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON element:\n".concat(m98833b.toString()));
                        yb9.m74823c(EnumC38962c79.FILE_READ_RETURNED_MALFORMED_DATA);
                    } else {
                        C43931kU7 m5236a = m98833b.m5236a();
                        try {
                            C39236cb9 c39236cb9 = new C39236cb9(m5236a.m28918c("fid").m74990e());
                            String m74990e = m5236a.m28918c("refreshToken").m74990e();
                            String m74990e2 = m5236a.m28918c("temporaryToken").m74990e();
                            long m74992b = m5236a.m28918c("temporaryTokenExpiryTimestamp").m74992b();
                            String obj = c39236cb9.toString();
                            StringBuilder sb = new StringBuilder(obj.length() + 5);
                            sb.append("fid: ");
                            sb.append(obj);
                            Log.d("MLKitInstallationIdSaver", sb.toString());
                            String valueOf = String.valueOf(m74990e);
                            if (valueOf.length() != 0) {
                                str2 = "refresh_token: ".concat(valueOf);
                            } else {
                                str2 = new String("refresh_token: ");
                            }
                            Log.d("MLKitInstallationIdSaver", str2);
                            String valueOf2 = String.valueOf(m74990e2);
                            if (valueOf2.length() != 0) {
                                str3 = "temporary_token: ".concat(valueOf2);
                            } else {
                                str3 = new String("temporary_token: ");
                            }
                            Log.d("MLKitInstallationIdSaver", str3);
                            StringBuilder sb2 = new StringBuilder(44);
                            sb2.append("temporary token expiry: ");
                            sb2.append(m74992b);
                            Log.d("MLKitInstallationIdSaver", sb2.toString());
                            c52307yc9 = new C52307yc9(c39236cb9, m74990e, m74990e2, m74992b);
                        } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                            yb9.m74823c(EnumC38962c79.FILE_READ_RETURNED_INVALID_DATA);
                            String obj2 = m5236a.toString();
                            StringBuilder sb3 = new StringBuilder(str4.length() + 72 + obj2.length());
                            sb3.append("Error traversing installation info JSON object:\nraw json:\n");
                            sb3.append(str4);
                            sb3.append("\nparsed json:\n");
                            sb3.append(obj2);
                            Log.e("MLKitInstallationIdSaver", sb3.toString(), e);
                        }
                    }
                } catch (zzcq e2) {
                    if (str4.length() != 0) {
                        str = "Error parsing installation info JSON object:\n".concat(str4);
                    } else {
                        str = new String("Error parsing installation info JSON object:\n");
                    }
                    Log.e("MLKitInstallationIdSaver", str, e2);
                    yb9.m74823c(EnumC38962c79.FILE_READ_RETURNED_MALFORMED_DATA);
                }
            } catch (IOException e3) {
                if (!m13939b.exists()) {
                    String obj3 = m13939b.toString();
                    StringBuilder sb4 = new StringBuilder(obj3.length() + 38);
                    sb4.append("Installation id file not yet present: ");
                    sb4.append(obj3);
                    Log.i("MLKitInstallationIdSaver", sb4.toString());
                    return null;
                }
                yb9.m74823c(EnumC38962c79.FILE_READ_FAILED);
                String obj4 = m13939b.toString();
                StringBuilder sb5 = new StringBuilder(obj4.length() + 36);
                sb5.append("Error reading installation id file: ");
                sb5.append(obj4);
                Log.w("MLKitInstallationIdSaver", sb5.toString(), e3);
                return null;
            }
        }
        return c52307yc9;
    }

    /* renamed from: b */
    public final File m13939b(Yb9 yb9) {
        File m94295i = NA0.m94295i(this.f109050a);
        if (m94295i == null || !m94295i.isDirectory()) {
            Log.w("MLKitInstallationIdSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            m94295i = this.f109050a.getFilesDir();
            if (m94295i != null && !m94295i.isDirectory()) {
                try {
                    if (!m94295i.mkdirs()) {
                        String obj = m94295i.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 15);
                        sb.append("mkdirs failed: ");
                        sb.append(obj);
                        Log.w("MLKitInstallationIdSaver", sb.toString());
                        yb9.m74822d(EnumC38962c79.DIRECTORY_CREATION_FAILED);
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitInstallationIdSaver", "mkdirs threw an exception: ".concat(m94295i.toString()), e);
                    yb9.m74822d(EnumC38962c79.DIRECTORY_CREATION_FAILED);
                }
            }
        }
        return new File(m94295i, "com.google.mlkit.InstallationId");
    }

    /* renamed from: c */
    public final void m13938c(C52307yc9 c52307yc9, Yb9 yb9) {
        File file;
        C27395pp c27395pp;
        FileOutputStream m18661f;
        String format = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", c52307yc9.m3164b().m61181a(), c52307yc9.m3163c(), c52307yc9.m3162d(), Long.valueOf(c52307yc9.m3165a()));
        synchronized (f109049c) {
            try {
                file = m13939b(yb9);
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
                yb9.m74823c(EnumC38962c79.FILE_WRITE_FAILED);
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
