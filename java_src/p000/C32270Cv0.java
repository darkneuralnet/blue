package p000;

import android.content.Context;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.firebase.remoteconfig.internal.C18378b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Cv0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32270Cv0 {

    /* renamed from: c */
    public static final Map<String, C32270Cv0> f4883c = new HashMap();

    /* renamed from: a */
    public final Context f4884a;

    /* renamed from: b */
    public final String f4885b;

    public C32270Cv0(Context context, String str) {
        this.f4884a = context;
        this.f4885b = str;
    }

    /* renamed from: c */
    public static synchronized C32270Cv0 m111355c(Context context, String str) {
        C32270Cv0 c32270Cv0;
        synchronized (C32270Cv0.class) {
            Map<String, C32270Cv0> map = f4883c;
            if (!map.containsKey(str)) {
                map.put(str, new C32270Cv0(context, str));
            }
            c32270Cv0 = map.get(str);
        }
        return c32270Cv0;
    }

    /* renamed from: a */
    public synchronized Void m111357a() {
        this.f4884a.deleteFile(this.f4885b);
        return null;
    }

    /* renamed from: b */
    public String m111356b() {
        return this.f4885b;
    }

    /* renamed from: d */
    public synchronized C18378b m111354d() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f4884a.openFileInput(this.f4885b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                C18378b m46998b = C18378b.m46998b(new JSONObject(new String(bArr, Constants.DEFAULT_ENCODING)));
                fileInputStream.close();
                return m46998b;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    /* renamed from: e */
    public synchronized Void m111353e(C18378b c18378b) throws IOException {
        FileOutputStream openFileOutput = this.f4884a.openFileOutput(this.f4885b, 0);
        openFileOutput.write(c18378b.toString().getBytes(Constants.DEFAULT_ENCODING));
        openFileOutput.close();
        return null;
    }
}
