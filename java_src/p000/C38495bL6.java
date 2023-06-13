package p000;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: bL6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38495bL6 extends AbstractRunnableC45044mM6 {

    /* renamed from: c */
    public EnumC39097cM6 f57324c;

    /* renamed from: d */
    public Map<String, String> f57325d = new HashMap();

    /* renamed from: e */
    public Handler f57326e;

    /* renamed from: f */
    public SF2 f57327f;

    /* renamed from: g */
    public VF2 f57328g;

    /* renamed from: h */
    public JSONObject f57329h;

    /* renamed from: i */
    public boolean f57330i;

    /* renamed from: bL6$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C12373a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57331a;

        static {
            int[] iArr = new int[EnumC39097cM6.values().length];
            f57331a = iArr;
            try {
                iArr[EnumC39097cM6.DEVICE_INFO_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57331a[EnumC39097cM6.SANDBOX_DEVICE_INFO_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57331a[EnumC39097cM6.PRODUCTION_JSON_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57331a[EnumC39097cM6.STAGE_PROD_JSON_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57331a[EnumC39097cM6.AUDIT_JSON_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57331a[EnumC39097cM6.STAGE_AUDIT_JSON_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C38495bL6(@NonNull EnumC39097cM6 enumC39097cM6, @NonNull JSONObject jSONObject, boolean z, @NonNull VF2 vf2, @NonNull Handler handler) {
        this.f57324c = enumC39097cM6;
        this.f57329h = jSONObject;
        this.f57330i = z;
        this.f57326e = handler;
        this.f57328g = vf2;
        this.f57327f = vf2.m80160d() == null ? new SF2() : vf2.m80160d();
    }

    /* renamed from: b */
    public final String m64645b(JSONObject jSONObject) {
        return String.format(Locale.US, "Dyson/%S (%S %S)", jSONObject.optString(WL6.COMP_VERSION.toString()), jSONObject.optString(WL6.OS_TYPE.toString()), Build.VERSION.RELEASE);
    }

    /* renamed from: c */
    public void m64644c() {
        if (this.f57328g.m80155i()) {
            m64642e();
        } else {
            m25795a();
        }
    }

    /* renamed from: d */
    public final void m64643d(int i, String str) {
        Class<?> cls = getClass();
        KJ6.m99012a(cls, 0, "MagnesPostRequest for " + this.f57324c.toString() + " returned status code " + i + ", and responseString: " + str);
    }

    /* renamed from: e */
    public void m64642e() {
        Handler handler;
        Message obtain;
        m64641f();
        try {
            RF2 m85801a = this.f57327f.m85801a(EnumC37911aM6.POST);
            String m64640g = m64640g();
            String m64639h = m64639h();
            if (m64640g != null && m64639h != null) {
                m85801a.mo85725e(Uri.parse(m64640g));
                m85801a.mo85726d(this.f57325d);
                Handler handler2 = this.f57326e;
                handler2.sendMessage(Message.obtain(handler2, EnumC38504bM6.POST_REQUEST_STARTED.m64630a(), m64640g));
                int mo85729a = m85801a.mo85729a(m64639h.getBytes(Constants.DEFAULT_ENCODING));
                String str = new String(m85801a.mo85728b(), Constants.DEFAULT_ENCODING);
                Log.d("MagnesPostRequest", "MagnesPostRequest returned PayPal-Debug-Id: " + m85801a.mo85727c());
                m64643d(mo85729a, str);
                if (mo85729a == EnumC38504bM6.HTTP_STATUS_200.m64630a()) {
                    handler = this.f57326e;
                    if (handler == null) {
                        return;
                    }
                    obtain = Message.obtain(handler, EnumC38504bM6.POST_REQUEST_SUCCEEDED.m64630a(), str);
                } else {
                    handler = this.f57326e;
                    if (handler == null) {
                        return;
                    }
                    obtain = Message.obtain(handler, EnumC38504bM6.POST_REQUEST_ERROR.m64630a(), Integer.valueOf(mo85729a));
                }
                handler.sendMessage(obtain);
            }
        } catch (Exception e) {
            KJ6.m99011b(getClass(), 3, e);
            Handler handler3 = this.f57326e;
            if (handler3 != null) {
                handler3.sendMessage(Message.obtain(handler3, EnumC38504bM6.POST_REQUEST_ERROR.m64630a(), e));
            }
        }
    }

    /* renamed from: f */
    public void m64641f() {
        Map<String, String> m1459q;
        if (this.f57328g == null) {
            return;
        }
        try {
            int i = C12373a.f57331a[this.f57324c.ordinal()];
            if (i == 1 || i == 2) {
                m1459q = C52760zN6.m1459q(this.f57328g.m80162b());
                if (m1459q == null) {
                    return;
                }
            } else {
                m1459q = C52760zN6.m1461o(this.f57328g.m80162b());
                if (m1459q == null) {
                    return;
                }
            }
            this.f57325d = m1459q;
        } catch (Exception e) {
            KJ6.m99011b(C52760zN6.class, 3, e);
        }
    }

    /* renamed from: g */
    public final String m64640g() {
        if (this.f57328g == null || this.f57326e == null) {
            return null;
        }
        switch (C12373a.f57331a[this.f57324c.ordinal()]) {
            case 1:
            case 2:
                return this.f57328g.m80161c() == EnumC51736xf1.LIVE ? UF2.m81767g().f37132a.m27370r() : EnumC39097cM6.SANDBOX_DEVICE_INFO_URL.toString();
            case 3:
            case 4:
            case 5:
            case 6:
                return (this.f57328g.m80161c() == EnumC51736xf1.LIVE ? this.f57330i ? EnumC39097cM6.AUDIT_JSON_URL : EnumC39097cM6.PRODUCTION_JSON_URL : this.f57330i ? EnumC39097cM6.STAGE_AUDIT_JSON_URL : EnumC39097cM6.STAGE_PROD_JSON_URL).toString();
            default:
                return this.f57324c.toString();
        }
    }

    /* renamed from: h */
    public final String m64639h() throws Exception {
        if (this.f57329h == null) {
            return null;
        }
        int i = C12373a.f57331a[this.f57324c.ordinal()];
        if (i == 1 || i == 2) {
            String m64638i = m64638i();
            if (m64638i == null) {
                return null;
            }
            return m64638i;
        }
        return this.f57329h.toString();
    }

    /* renamed from: i */
    public final String m64638i() throws Exception {
        if (this.f57329h == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appGuid", this.f57329h.optString(WL6.APP_GUID.toString()));
        hashMap.put("libraryVersion", m64645b(this.f57329h));
        hashMap.put("additionalData", this.f57329h.toString());
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), Constants.DEFAULT_ENCODING));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), Constants.DEFAULT_ENCODING));
        }
        KJ6.m99012a(getClass(), 0, "Encoded Device info payload : " + sb.toString());
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f57326e == null) {
            return;
        }
        m64642e();
    }
}
