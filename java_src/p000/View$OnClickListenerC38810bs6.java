package p000;

import android.os.Bundle;
import android.view.View;
import co.bird.android.model.LegacyRepairType;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C37988aV2;
/* renamed from: bs6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class View$OnClickListenerC38810bs6 implements View.OnClickListener {

    /* renamed from: f */
    public static final Set<Integer> f59666f = new HashSet();

    /* renamed from: b */
    public View.OnClickListener f59667b;

    /* renamed from: c */
    public WeakReference<View> f59668c;

    /* renamed from: d */
    public WeakReference<View> f59669d;

    /* renamed from: e */
    public String f59670e;

    /* renamed from: bs6$a */
    /* loaded from: classes5.dex */
    public static class RunnableC13318a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f59671b;

        /* renamed from: c */
        public final /* synthetic */ String f59672c;

        public RunnableC13318a(String str, String str2) {
            this.f59671b = str;
            this.f59672c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                View$OnClickListenerC38810bs6.m62250a(this.f59671b, this.f59672c, new float[0]);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: bs6$b */
    /* loaded from: classes5.dex */
    public class RunnableC13319b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f59673b;

        /* renamed from: c */
        public final /* synthetic */ String f59674c;

        /* renamed from: d */
        public final /* synthetic */ String f59675d;

        public RunnableC13319b(JSONObject jSONObject, String str, String str2) {
            this.f59673b = jSONObject;
            this.f59674c = str;
            this.f59675d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String[] m71299o;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                String lowerCase = C52364yi6.m2817r(C17216a.m52741e()).toLowerCase();
                float[] m113563a = C31938Bk1.m113563a(this.f59673b, lowerCase);
                String m113561c = C31938Bk1.m113561c(this.f59674c, View$OnClickListenerC38810bs6.m62249b(View$OnClickListenerC38810bs6.this), lowerCase);
                if (m113563a == null || (m71299o = C37988aV2.m71299o(C37988aV2.EnumC10718a.MTML_APP_EVENT_PREDICTION, new float[][]{m113563a}, new String[]{m113561c})) == null) {
                    return;
                }
                String str = m71299o[0];
                NZ3.m93759a(this.f59675d, str);
                if (!str.equals(LegacyRepairType.OTHER_KEY)) {
                    View$OnClickListenerC38810bs6.m62250a(str, this.f59674c, m113563a);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public View$OnClickListenerC38810bs6(View view, View view2, String str) {
        this.f59667b = C45933nr6.m22285g(view);
        this.f59669d = new WeakReference<>(view);
        this.f59668c = new WeakReference<>(view2);
        this.f59670e = str.toLowerCase().replace("activity", "");
    }

    /* renamed from: a */
    public static /* synthetic */ void m62250a(String str, String str2, float[] fArr) {
        if (TD0.m84203d(View$OnClickListenerC38810bs6.class)) {
            return;
        }
        try {
            m62245f(str, str2, fArr);
        } catch (Throwable th) {
            TD0.m84205b(th, View$OnClickListenerC38810bs6.class);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ String m62249b(View$OnClickListenerC38810bs6 view$OnClickListenerC38810bs6) {
        if (TD0.m84203d(View$OnClickListenerC38810bs6.class)) {
            return null;
        }
        try {
            return view$OnClickListenerC38810bs6.f59670e;
        } catch (Throwable th) {
            TD0.m84205b(th, View$OnClickListenerC38810bs6.class);
            return null;
        }
    }

    /* renamed from: c */
    public static void m62248c(View view, View view2, String str) {
        if (TD0.m84203d(View$OnClickListenerC38810bs6.class)) {
            return;
        }
        try {
            int hashCode = view.hashCode();
            Set<Integer> set = f59666f;
            if (!set.contains(Integer.valueOf(hashCode))) {
                C45933nr6.m22274r(view, new View$OnClickListenerC38810bs6(view, view2, str));
                set.add(Integer.valueOf(hashCode));
            }
        } catch (Throwable th) {
            TD0.m84205b(th, View$OnClickListenerC38810bs6.class);
        }
    }

    /* renamed from: f */
    public static void m62245f(String str, String str2, float[] fArr) {
        if (TD0.m84203d(View$OnClickListenerC38810bs6.class)) {
            return;
        }
        try {
            if (QU5.m88465f(str)) {
                new C45485n62(C17216a.m52741e()).m24340f(str, str2);
            } else if (QU5.m88466e(str)) {
                m62243h(str, str2, fArr);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, View$OnClickListenerC38810bs6.class);
        }
    }

    /* renamed from: g */
    public static boolean m62244g(String str, String str2) {
        if (TD0.m84203d(View$OnClickListenerC38810bs6.class)) {
            return false;
        }
        try {
            String m93756d = NZ3.m93756d(str);
            if (m93756d == null) {
                return false;
            }
            if (!m93756d.equals(LegacyRepairType.OTHER_KEY)) {
                C52364yi6.m2818q0(new RunnableC13318a(m93756d, str2));
                return true;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, View$OnClickListenerC38810bs6.class);
            return false;
        }
    }

    /* renamed from: h */
    public static void m62243h(String str, String str2, float[] fArr) {
        if (TD0.m84203d(View$OnClickListenerC38810bs6.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            try {
                bundle.putString(AnalyticsRequestV2.PARAM_EVENT_NAME, str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest m52823x = GraphRequest.m52823x(null, String.format(Locale.US, "%s/suggested_events", C17216a.m52740f()), null, null);
                m52823x.m52850C(bundle);
                m52823x.m52837j();
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            TD0.m84205b(th, View$OnClickListenerC38810bs6.class);
        }
    }

    /* renamed from: d */
    public final void m62247d(String str, String str2, JSONObject jSONObject) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C52364yi6.m2818q0(new RunnableC13319b(jSONObject, str2, str));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: e */
    public final void m62246e() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            View view = this.f59668c.get();
            View view2 = this.f59669d.get();
            if (view != null && view2 != null) {
                try {
                    String m90185d = PU5.m90185d(view2);
                    String m93758b = NZ3.m93758b(view2, m90185d);
                    if (m93758b == null || m62244g(m93758b, m90185d)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", PU5.m90187b(view, view2));
                    jSONObject.put("screenname", this.f59670e);
                    m62247d(m93758b, m90185d, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f59667b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            m62246e();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
