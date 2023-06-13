package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.amazonaws.services.p026s3.internal.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: LJ6 */
/* loaded from: classes8.dex */
public class LJ6 extends AbstractRunnableC45044mM6 {

    /* renamed from: c */
    public EnumC39097cM6 f21095c;

    /* renamed from: d */
    public Map<String, String> f21096d = new HashMap();

    /* renamed from: e */
    public Handler f21097e;

    /* renamed from: f */
    public SF2 f21098f;

    /* renamed from: g */
    public VF2 f21099g;

    /* renamed from: h */
    public JSONObject f21100h;

    /* renamed from: LJ6$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C4804a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21101a;

        static {
            int[] iArr = new int[EnumC39097cM6.values().length];
            f21101a = iArr;
            try {
                iArr[EnumC39097cM6.RAMP_CONFIG_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21101a[EnumC39097cM6.REMOTE_CONFIG_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LJ6(@NonNull EnumC39097cM6 enumC39097cM6, @NonNull VF2 vf2, @NonNull Handler handler, @Nullable JSONObject jSONObject) {
        this.f21095c = enumC39097cM6;
        this.f21099g = vf2;
        this.f21097e = handler;
        this.f21098f = vf2.m80160d() == null ? new SF2() : vf2.m80160d();
        this.f21100h = jSONObject;
    }

    /* renamed from: b */
    public void m97343b() {
        if (this.f21099g.m80155i()) {
            m97340e();
        } else {
            m25795a();
        }
    }

    /* renamed from: c */
    public final void m97342c(int i, String str) {
        Class<?> cls = getClass();
        KJ6.m99012a(cls, 0, "MagesGetRequest for " + this.f21095c.toString() + " returned status code " + i + ", and responseString: " + str);
    }

    /* renamed from: d */
    public final void m97341d(String str) throws JSONException {
        int i = C4804a.f21101a[this.f21095c.ordinal()];
        if (i == 1) {
            AbstractC37902aL6.m71613b(this.f21099g.m80162b(), str, "RAMP_CONFIG");
        } else if (i != 2) {
        } else {
            JSONObject jSONObject = new JSONObject(str);
            AbstractC37902aL6.m71613b(this.f21099g.m80162b(), jSONObject.toString(), "REMOTE_CONFIG");
            C44460lN6.m27376l(jSONObject);
            if (jSONObject.optJSONArray(WL6.NOT_COLLECTIBLE_LIST.toString()) != null) {
                C44460lN6.m27379i(true);
            }
        }
    }

    /* renamed from: e */
    public void m97340e() {
        Handler handler;
        Message obtain;
        m97339f();
        try {
            RF2 m85801a = this.f21098f.m85801a(EnumC37911aM6.GET);
            String m97338g = m97338g();
            if (m97338g == null) {
                return;
            }
            m85801a.mo85725e(Uri.parse(m97338g));
            Map<String, String> map = this.f21096d;
            if (map != null && !map.isEmpty()) {
                m85801a.mo85726d(this.f21096d);
            }
            Handler handler2 = this.f21097e;
            if (handler2 != null) {
                int m64630a = EnumC38504bM6.GET_REQUEST_STARTED.m64630a();
                handler2.sendMessage(Message.obtain(handler2, m64630a, "Magnes Request Started for URL: " + m97338g));
            }
            int mo85729a = m85801a.mo85729a(null);
            String str = new String(m85801a.mo85728b(), Constants.DEFAULT_ENCODING);
            m97342c(mo85729a, str);
            if (mo85729a == EnumC38504bM6.HTTP_STATUS_200.m64630a()) {
                m97341d(str);
                handler = this.f21097e;
                if (handler == null) {
                    return;
                }
                obtain = Message.obtain(handler, EnumC38504bM6.GET_REQUEST_SUCCEEDED.m64630a(), str);
            } else {
                handler = this.f21097e;
                if (handler == null) {
                    return;
                }
                int m64630a2 = EnumC38504bM6.GET_REQUEST_ERROR.m64630a();
                obtain = Message.obtain(handler, m64630a2, mo85729a + " : " + str);
            }
            handler.sendMessage(obtain);
        } catch (Exception e) {
            Handler handler3 = this.f21097e;
            if (handler3 != null) {
                handler3.sendMessage(Message.obtain(handler3, EnumC38504bM6.GET_REQUEST_ERROR.m64630a(), e));
            }
        }
    }

    /* renamed from: f */
    public void m97339f() {
        if (this.f21095c == EnumC39097cM6.PRODUCTION_BEACON_URL) {
            m97336i();
        }
    }

    /* renamed from: g */
    public final String m97338g() {
        if (this.f21095c == EnumC39097cM6.PRODUCTION_BEACON_URL) {
            if (this.f21100h == null) {
                return null;
            }
            String m97337h = m97337h();
            if (m97337h != null && m97337h.length() > 0) {
                return m97337h;
            }
        }
        return this.f21095c.toString();
    }

    /* renamed from: h */
    public final String m97337h() {
        if (this.f21100h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(EnumC39097cM6.PRODUCTION_BEACON_URL.toString());
        sb.append("?p=");
        sb.append(this.f21100h.optString("pairing_id"));
        sb.append("&i=");
        sb.append(this.f21100h.optString(XL6.IP_ADDRS.toString()));
        sb.append("&t=");
        sb.append(String.valueOf(System.currentTimeMillis() / 1000));
        int m80159e = this.f21099g.m80159e();
        if (m80159e == WF2.DEFAULT.m78677a()) {
            sb.append("&s=");
            sb.append(this.f21100h.optString(WL6.APP_ID.toString()));
        } else {
            sb.append("&a=");
            sb.append(m80159e);
        }
        return sb.toString();
    }

    /* renamed from: i */
    public final void m97336i() {
        JSONObject jSONObject = this.f21100h;
        if (jSONObject == null) {
            return;
        }
        Map<String, String> map = this.f21096d;
        JSONObject jSONObject2 = this.f21100h;
        WL6 wl6 = WL6.APP_VERSION;
        map.put("User-Agent", String.format("%s/%s/%s/%s/Android", jSONObject.optString(WL6.APP_ID.toString()), jSONObject2.optString(wl6.toString()), this.f21100h.optString(wl6.toString()), this.f21100h.optString(WL6.APP_GUID.toString())));
        this.f21096d.put("Accept-Language", "en-us");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f21097e == null) {
            return;
        }
        m97340e();
    }
}
