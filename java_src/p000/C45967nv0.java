package p000;

import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.C18378b;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
/* renamed from: nv0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45967nv0 {

    /* renamed from: e */
    public static final Charset f101071e = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: f */
    public static final Pattern f101072f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    public static final Pattern f101073g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    public final Set<BiConsumer<String, C18378b>> f101074a = new HashSet();

    /* renamed from: b */
    public final Executor f101075b;

    /* renamed from: c */
    public final C34601Mu0 f101076c;

    /* renamed from: d */
    public final C34601Mu0 f101077d;

    public C45967nv0(Executor executor, C34601Mu0 c34601Mu0, C34601Mu0 c34601Mu02) {
        this.f101075b = executor;
        this.f101076c = c34601Mu0;
        this.f101077d = c34601Mu02;
    }

    /* renamed from: e */
    public static C18378b m22186e(C34601Mu0 c34601Mu0) {
        return c34601Mu0.m94602f();
    }

    /* renamed from: f */
    public static Set<String> m22185f(C34601Mu0 c34601Mu0) {
        HashSet hashSet = new HashSet();
        C18378b m22186e = m22186e(c34601Mu0);
        if (m22186e == null) {
            return hashSet;
        }
        Iterator<String> keys = m22186e.m46994f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: g */
    public static String m22184g(C34601Mu0 c34601Mu0, String str) {
        C18378b m22186e = m22186e(c34601Mu0);
        if (m22186e == null) {
            return null;
        }
        try {
            return m22186e.m46994f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m22181j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    /* renamed from: b */
    public void m22189b(BiConsumer<String, C18378b> biConsumer) {
        synchronized (this.f101074a) {
            this.f101074a.add(biConsumer);
        }
    }

    /* renamed from: c */
    public final void m22188c(final String str, final C18378b c18378b) {
        if (c18378b == null) {
            return;
        }
        synchronized (this.f101074a) {
            for (final BiConsumer<String, C18378b> biConsumer : this.f101074a) {
                this.f101075b.execute(new Runnable() { // from class: mv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BiConsumer.this.accept(str, c18378b);
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public Map<String, InterfaceC35475Qn1> m22187d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m22185f(this.f101076c));
        hashSet.addAll(m22185f(this.f101077d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, m22183h(str));
        }
        return hashMap;
    }

    /* renamed from: h */
    public InterfaceC35475Qn1 m22183h(String str) {
        String m22184g = m22184g(this.f101076c, str);
        if (m22184g != null) {
            m22188c(str, m22186e(this.f101076c));
            return new C35709Rn1(m22184g, 2);
        }
        String m22184g2 = m22184g(this.f101077d, str);
        if (m22184g2 != null) {
            return new C35709Rn1(m22184g2, 1);
        }
        m22181j(str, "FirebaseRemoteConfigValue");
        return new C35709Rn1("", 0);
    }
}
