package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: pW1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46908pW1 {

    /* renamed from: c */
    public static final String[] f103761c = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f103762a;

    /* renamed from: b */
    public final String f103763b;

    public C46908pW1(C31722Am1 c31722Am1) {
        this.f103762a = c31722Am1.m115293j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f103763b = m19161b(c31722Am1);
    }

    /* renamed from: b */
    public static String m19161b(C31722Am1 c31722Am1) {
        String m18704d = c31722Am1.m115290m().m18704d();
        if (m18704d != null) {
            return m18704d;
        }
        String m18705c = c31722Am1.m115290m().m18705c();
        if (!m18705c.startsWith("1:") && !m18705c.startsWith("2:")) {
            return m18705c;
        }
        String[] split = m18705c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m19160c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    public final String m19162a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String m19159d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey m19158e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: f */
    public String m19157f() {
        synchronized (this.f103762a) {
            String m19156g = m19156g();
            if (m19156g != null) {
                return m19156g;
            }
            return m19155h();
        }
    }

    /* renamed from: g */
    public final String m19156g() {
        String string;
        synchronized (this.f103762a) {
            string = this.f103762a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    public final String m19155h() {
        synchronized (this.f103762a) {
            String string = this.f103762a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m19158e = m19158e(string);
            if (m19158e == null) {
                return null;
            }
            return m19160c(m19158e);
        }
    }

    /* renamed from: i */
    public String m19154i() {
        synchronized (this.f103762a) {
            for (String str : f103761c) {
                String string = this.f103762a.getString(m19162a(this.f103763b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m19159d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
