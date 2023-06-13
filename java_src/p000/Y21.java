package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.CoreConstants;
import com.facebook.C17216a;
import com.google.zxing.WriterException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Y21 */
/* loaded from: classes5.dex */
public class Y21 {

    /* renamed from: a */
    public static final String f44467a = "Y21";

    /* renamed from: b */
    public static HashMap<String, NsdManager.RegistrationListener> f44468b = new HashMap<>();

    /* renamed from: Y21$a */
    /* loaded from: classes5.dex */
    public static class C9604a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        public final /* synthetic */ String f44469a;

        /* renamed from: b */
        public final /* synthetic */ String f44470b;

        public C9604a(String str, String str2) {
            this.f44469a = str;
            this.f44470b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            Y21.m75811a(this.f44470b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f44469a.equals(nsdServiceInfo.getServiceName())) {
                Y21.m75811a(this.f44470b);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: a */
    public static void m75811a(String str) {
        if (TD0.m84203d(Y21.class)) {
            return;
        }
        try {
            m75810b(str);
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    public static void m75810b(String str) {
        if (TD0.m84203d(Y21.class)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = f44468b.get(str);
            if (registrationListener != null) {
                try {
                    ((NsdManager) C17216a.m52741e().getSystemService("servicediscovery")).unregisterService(registrationListener);
                } catch (IllegalArgumentException e) {
                    C52364yi6.m2854X(f44467a, e);
                }
                f44468b.remove(str);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
        }
    }

    /* renamed from: c */
    public static Bitmap m75809c(String str) {
        int m108956l;
        int m108953o;
        int[] iArr;
        Bitmap createBitmap;
        int i;
        Bitmap bitmap = null;
        if (TD0.m84203d(Y21.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EnumC40431eb1.class);
            enumMap.put((EnumMap) EnumC40431eb1.MARGIN, (EnumC40431eb1) 2);
            try {
                C1837ET mo3433a = new C52244yW2().mo3433a(str, EnumC7009Qx.QR_CODE, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, enumMap);
                m108956l = mo3433a.m108956l();
                m108953o = mo3433a.m108953o();
                iArr = new int[m108956l * m108953o];
                for (int i2 = 0; i2 < m108956l; i2++) {
                    int i3 = i2 * m108953o;
                    for (int i4 = 0; i4 < m108953o; i4++) {
                        int i5 = i3 + i4;
                        if (mo3433a.m108959h(i4, i2)) {
                            i = -16777216;
                        } else {
                            i = -1;
                        }
                        iArr[i5] = i;
                    }
                }
                createBitmap = Bitmap.createBitmap(m108953o, m108956l, Bitmap.Config.ARGB_8888);
            } catch (WriterException unused) {
            }
            try {
                createBitmap.setPixels(iArr, 0, m108953o, 0, 0, m108953o, m108956l);
                return createBitmap;
            } catch (WriterException unused2) {
                bitmap = createBitmap;
                return bitmap;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
            return null;
        }
    }

    /* renamed from: d */
    public static String m75808d() {
        if (TD0.m84203d(Y21.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device", Build.DEVICE);
                jSONObject.put(RequestHeadersFactory.MODEL, Build.MODEL);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m75807e() {
        if (TD0.m84203d(Y21.class)) {
            return false;
        }
        try {
            C34512Mk1 m93522j = C34746Nk1.m93522j(C17216a.m52740f());
            if (m93522j == null) {
                return false;
            }
            if (!m93522j.m94968n().contains(DF5.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m75806f(String str) {
        if (TD0.m84203d(Y21.class)) {
            return false;
        }
        try {
            if (!m75807e()) {
                return false;
            }
            return m75805g(str);
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
            return false;
        }
    }

    @TargetApi(16)
    /* renamed from: g */
    public static boolean m75805g(String str) {
        if (TD0.m84203d(Y21.class)) {
            return false;
        }
        try {
            if (f44468b.containsKey(str)) {
                return true;
            }
            String format = String.format("%s_%s_%s", "fbsdk", String.format("%s-%s", "android", C17216a.m52725u().replace(CoreConstants.DOT, '|')), str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(format);
            nsdServiceInfo.setPort(80);
            C9604a c9604a = new C9604a(format, str);
            f44468b.put(str, c9604a);
            ((NsdManager) C17216a.m52741e().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, c9604a);
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, Y21.class);
            return false;
        }
    }
}
