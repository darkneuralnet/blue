package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p000.InterfaceC50338vI1;
/* renamed from: ZC1 */
/* loaded from: classes6.dex */
public class ZC1 {

    /* renamed from: a */
    public final C31722Am1 f47917a;

    /* renamed from: b */
    public final ET2 f47918b;

    /* renamed from: c */
    public final C38659bd5 f47919c;

    /* renamed from: d */
    public final X94<InterfaceC42265hg6> f47920d;

    /* renamed from: e */
    public final X94<InterfaceC50338vI1> f47921e;

    /* renamed from: f */
    public final InterfaceC35934Sm1 f47922f;

    public ZC1(C31722Am1 c31722Am1, ET2 et2, X94<InterfaceC42265hg6> x94, X94<InterfaceC50338vI1> x942, InterfaceC35934Sm1 interfaceC35934Sm1) {
        this(c31722Am1, et2, new C38659bd5(c31722Am1.m115293j()), x94, x942, interfaceC35934Sm1);
    }

    /* renamed from: b */
    public static String m73631b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: h */
    public static boolean m73625h(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m73624i(Task task) throws Exception {
        return m73626g((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: c */
    public Task<?> m73630c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m73629d(m73622k(ET2.m108940c(this.f47917a), "*", bundle));
    }

    /* renamed from: d */
    public final Task<String> m73629d(Task<Bundle> task) {
        return task.continueWith(new ExecutorC49647u74(), new Continuation() { // from class: YC1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String m73624i;
                m73624i = ZC1.this.m73624i(task2);
                return m73624i;
            }
        });
    }

    /* renamed from: e */
    public final String m73628e() {
        try {
            return m73631b(MessageDigest.getInstance("SHA-1").digest(this.f47917a.m115291l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public Task<String> m73627f() {
        return m73629d(m73622k(ET2.m108940c(this.f47917a), "*", new Bundle()));
    }

    /* renamed from: g */
    public final String m73626g(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: j */
    public final void m73623j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        InterfaceC50338vI1.EnumC29474a mo8930a;
        bundle.putString(Action.SCOPE_ATTRIBUTE, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f47917a.m115290m().m18705c());
        bundle.putString("gmsv", Integer.toString(this.f47918b.m108939d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f47918b.m108942a());
        bundle.putString("app_ver_name", this.f47918b.m108941b());
        bundle.putString("firebase-app-name-hash", m73628e());
        try {
            String mo71914b = ((AbstractC37749a52) Tasks.await(this.f47922f.mo47278a(false))).mo71914b();
            if (!TextUtils.isEmpty(mo71914b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo71914b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f47922f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        InterfaceC50338vI1 interfaceC50338vI1 = this.f47921e.get();
        InterfaceC42265hg6 interfaceC42265hg6 = this.f47920d.get();
        if (interfaceC50338vI1 != null && interfaceC42265hg6 != null && (mo8930a = interfaceC50338vI1.mo8930a("fire-iid")) != InterfaceC50338vI1.EnumC29474a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo8930a.m8929a()));
            bundle.putString("Firebase-Client", interfaceC42265hg6.mo36101a());
        }
    }

    /* renamed from: k */
    public final Task<Bundle> m73622k(String str, String str2, Bundle bundle) {
        try {
            m73623j(str, str2, bundle);
            return this.f47919c.m64259a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: l */
    public Task<?> m73621l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m73629d(m73622k(str, "/topics/" + str2, bundle));
    }

    /* renamed from: m */
    public Task<?> m73620m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m73629d(m73622k(str, "/topics/" + str2, bundle));
    }

    public ZC1(C31722Am1 c31722Am1, ET2 et2, C38659bd5 c38659bd5, X94<InterfaceC42265hg6> x94, X94<InterfaceC50338vI1> x942, InterfaceC35934Sm1 interfaceC35934Sm1) {
        this.f47917a = c31722Am1;
        this.f47918b = et2;
        this.f47919c = c38659bd5;
        this.f47920d = x94;
        this.f47921e = x942;
        this.f47922f = interfaceC35934Sm1;
    }
}
