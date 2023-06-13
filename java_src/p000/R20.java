package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import org.json.JSONObject;
/* renamed from: R20 */
/* loaded from: classes2.dex */
public class R20 {

    /* renamed from: a */
    public final S20 f31410a;

    /* renamed from: b */
    public final C30885z3 f31411b;

    /* renamed from: c */
    public final X20 f31412c;

    /* renamed from: d */
    public final String f31413d;

    public R20(S20 s20, C30885z3 c30885z3, X20 x20, String str) {
        this.f31410a = s20;
        this.f31411b = c30885z3;
        this.f31412c = x20;
        this.f31413d = str;
    }

    /* renamed from: i */
    public static R20 m87406i(String str) {
        return new R20(S20.m86080c(), C30885z3.m1902b(), X20.m77529c(), str);
    }

    /* renamed from: a */
    public final String m87414a(int i, Context context, Intent intent) {
        if (!m87407h(i)) {
            return "Request code cannot be Integer.MIN_VALUE";
        }
        if (!m87408g(context)) {
            return "The return url scheme was not set up, incorrectly set up, or more than one Activity on this device defines the same url scheme in it's Android Manifest. See https://github.com/braintree/browser-switch-android for more information on setting up a return url scheme.";
        }
        if (!m87413b(context, intent)) {
            StringBuilder sb = new StringBuilder("No installed activities can open this URL");
            Uri data = intent.getData();
            if (data != null) {
                sb.append(String.format(": %s", data.toString()));
            }
            return sb.toString();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m87413b(Context context, Intent intent) {
        return this.f31411b.m1903a(context, intent);
    }

    /* renamed from: c */
    public void m87412c(Intent intent, Context context) {
        if (intent == null) {
            return;
        }
        Uri data = intent.getData();
        Y20 m77530b = this.f31412c.m77530b(context);
        if (m77530b != null && data != null) {
            m77530b.m75813g(data);
            m77530b.m75814f("SUCCESS");
            this.f31412c.m77528d(m77530b, context);
        }
    }

    /* renamed from: d */
    public void m87411d(Fragment fragment) {
        if (fragment instanceof V20) {
            m87410e(fragment, (V20) fragment);
            return;
        }
        throw new IllegalArgumentException("Fragment must implement BrowserSwitchListener.");
    }

    /* renamed from: e */
    public void m87410e(Fragment fragment, V20 v20) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            m87409f(activity, v20);
            return;
        }
        throw new IllegalStateException("Fragment must be attached to an activity.");
    }

    /* renamed from: f */
    public void m87409f(FragmentActivity fragmentActivity, V20 v20) {
        Z20 z20;
        Context applicationContext = fragmentActivity.getApplicationContext();
        Y20 m77530b = this.f31412c.m77530b(applicationContext);
        if (m77530b != null) {
            this.f31412c.m77531a(applicationContext);
            int m75817c = m77530b.m75817c();
            JSONObject m75818b = m77530b.m75818b();
            Uri uri = null;
            if (m77530b.m75816d().equalsIgnoreCase("SUCCESS")) {
                Uri m75815e = m77530b.m75815e();
                z20 = new Z20(1, null, m75818b);
                uri = m75815e;
            } else {
                z20 = new Z20(2, null, m75818b);
            }
            v20.mo80476d4(m75817c, z20, uri);
        }
    }

    /* renamed from: g */
    public final boolean m87408g(Context context) {
        return this.f31411b.m1903a(context, this.f31410a.m86082a(this.f31413d));
    }

    /* renamed from: h */
    public final boolean m87407h(int i) {
        return i != Integer.MIN_VALUE;
    }

    /* renamed from: j */
    public void m87405j(W20 w20, Fragment fragment) {
        if (fragment instanceof V20) {
            m87404k(w20, fragment, (V20) fragment);
            return;
        }
        throw new IllegalArgumentException("Fragment must implement BrowserSwitchListener.");
    }

    /* renamed from: k */
    public void m87404k(W20 w20, Fragment fragment, V20 v20) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            m87403l(w20, activity, v20);
            return;
        }
        throw new IllegalStateException("Fragment must be attached to an activity.");
    }

    /* renamed from: l */
    public void m87403l(W20 w20, FragmentActivity fragmentActivity, V20 v20) {
        Intent m86081b;
        Context applicationContext = fragmentActivity.getApplicationContext();
        if (w20.m78903a() != null) {
            m86081b = w20.m78903a();
        } else {
            m86081b = this.f31410a.m86081b(applicationContext, w20.m78900d());
        }
        int m78901c = w20.m78901c();
        String m87414a = m87414a(m78901c, applicationContext, m86081b);
        if (m87414a == null) {
            this.f31412c.m77528d(new Y20(m78901c, m86081b.getData(), "PENDING", w20.m78902b()), applicationContext);
            applicationContext.startActivity(m86081b);
            return;
        }
        v20.mo80476d4(m78901c, new Z20(3, m87414a), null);
    }
}
