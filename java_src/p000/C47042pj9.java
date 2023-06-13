package p000;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: pj9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47042pj9 {

    /* renamed from: b */
    public static final C32711Es0 f103991b = C32711Es0.m108309e(C47042pj9.class).m108292b(C43645k01.m29483k(Context.class)).m108288f(C42891ij9.f87799a).m108290d();

    /* renamed from: c */
    public static final Object f103992c = new Object();

    /* renamed from: a */
    public final Context f103993a;

    public C47042pj9(Context context) {
        this.f103993a = context;
    }

    /* renamed from: a */
    public final Vg9 m18877a(Yb9 yb9) {
        Vg9 vg9;
        String str;
        synchronized (f103992c) {
            File m18875c = m18875c();
            vg9 = null;
            try {
                String str2 = new String(new C27395pp(m18875c).m18663d(), Charset.forName(Constants.DEFAULT_ENCODING));
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    try {
                        vg9 = new Vg9(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
                    } catch (JSONException e) {
                        yb9.m74823c(EnumC38962c79.FILE_READ_RETURNED_INVALID_DATA);
                        Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON object:\n".concat(jSONObject.toString()), e);
                    }
                } catch (JSONException e2) {
                    yb9.m74823c(EnumC38962c79.FILE_READ_RETURNED_MALFORMED_DATA);
                    if (str2.length() != 0) {
                        str = "Error parsing remote config settings JSON string:\n".concat(str2);
                    } else {
                        str = new String("Error parsing remote config settings JSON string:\n");
                    }
                    Log.e("MLKitRemoteConfigSaver", str, e2);
                }
            } catch (IOException e3) {
                if (!m18875c.exists()) {
                    String obj = m18875c.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 45);
                    sb.append("remote config settings file not yet present: ");
                    sb.append(obj);
                    Log.i("MLKitRemoteConfigSaver", sb.toString());
                    return null;
                }
                yb9.m74823c(EnumC38962c79.FILE_READ_FAILED);
                String obj2 = m18875c.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 43);
                sb2.append("Error reading remote config settings file: ");
                sb2.append(obj2);
                Log.w("MLKitRemoteConfigSaver", sb2.toString(), e3);
                return null;
            }
        }
        return vg9;
    }

    /* renamed from: b */
    public final void m18876b(Vg9 vg9, Yb9 yb9) {
        File file;
        String vg92 = vg9.toString();
        synchronized (f103992c) {
            try {
                file = m18875c();
                try {
                    String obj = file.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 33);
                    sb.append("Creating remote config settings: ");
                    sb.append(obj);
                    Log.i("MLKitRemoteConfigSaver", sb.toString());
                    C27395pp c27395pp = new C27395pp(file);
                    FileOutputStream m18661f = c27395pp.m18661f();
                    try {
                        PrintWriter printWriter = new PrintWriter(m18661f);
                        printWriter.println(vg92);
                        printWriter.flush();
                        c27395pp.m18665b(m18661f);
                        String obj2 = file.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 44 + String.valueOf(vg92).length());
                        sb2.append("Succeeded writing remote config settings: ");
                        sb2.append(obj2);
                        sb2.append(":\n");
                        sb2.append(vg92);
                        Log.d("MLKitRemoteConfigSaver", sb2.toString());
                    } catch (Throwable th) {
                        c27395pp.m18666a(m18661f);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    yb9.m74823c(EnumC38962c79.FILE_WRITE_FAILED);
                    String valueOf = String.valueOf(file);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 45);
                    sb3.append("Error writing to remote config settings file ");
                    sb3.append(valueOf);
                    Log.e("MLKitRemoteConfigSaver", sb3.toString(), e);
                }
            } catch (IOException e2) {
                e = e2;
                file = null;
            }
        }
    }

    /* renamed from: c */
    public final File m18875c() {
        File m94295i = NA0.m94295i(this.f103993a);
        if (m94295i == null || !m94295i.isDirectory()) {
            Log.w("MLKitRemoteConfigSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            m94295i = this.f103993a.getFilesDir();
            if (m94295i != null && !m94295i.isDirectory()) {
                try {
                    if (!m94295i.mkdirs()) {
                        String obj = m94295i.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 15);
                        sb.append("mkdirs failed: ");
                        sb.append(obj);
                        Log.w("MLKitRemoteConfigSaver", sb.toString());
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitRemoteConfigSaver", "mkdirs threw an exception: ".concat(m94295i.toString()), e);
                }
            }
        }
        return new File(m94295i, "com.google.mlkit.RemoteConfig");
    }
}
