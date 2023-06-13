package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.share.internal.LikeContent;
import com.facebook.share.widget.LikeView;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractServiceConnectionC39184cW3;
import p000.C47054pl1;
import p000.M80;
import p000.VD1;
@Deprecated
/* renamed from: com.facebook.share.internal.a */
/* loaded from: classes5.dex */
public class C17296a {

    /* renamed from: o */
    public static final String f69688o = "a";

    /* renamed from: p */
    public static C47054pl1 f69689p;

    /* renamed from: q */
    public static final ConcurrentHashMap<String, C17296a> f69690q = new ConcurrentHashMap<>();

    /* renamed from: r */
    public static CG6 f69691r = new CG6(1);

    /* renamed from: s */
    public static CG6 f69692s = new CG6(1);

    /* renamed from: t */
    public static Handler f69693t;

    /* renamed from: u */
    public static String f69694u;

    /* renamed from: v */
    public static boolean f69695v;

    /* renamed from: w */
    public static volatile int f69696w;

    /* renamed from: x */
    public static AbstractC3831J1 f69697x;

    /* renamed from: a */
    public String f69698a;

    /* renamed from: b */
    public LikeView.EnumC17371g f69699b;

    /* renamed from: c */
    public boolean f69700c;

    /* renamed from: d */
    public String f69701d;

    /* renamed from: e */
    public String f69702e;

    /* renamed from: f */
    public String f69703f;

    /* renamed from: g */
    public String f69704g;

    /* renamed from: h */
    public String f69705h;

    /* renamed from: i */
    public String f69706i;

    /* renamed from: j */
    public boolean f69707j;

    /* renamed from: k */
    public boolean f69708k;

    /* renamed from: l */
    public boolean f69709l;

    /* renamed from: m */
    public Bundle f69710m;

    /* renamed from: n */
    public C45485n62 f69711n;

    /* renamed from: com.facebook.share.internal.a$a */
    /* loaded from: classes5.dex */
    public class C17297a implements AbstractServiceConnectionC39184cW3.InterfaceC13588b {
        public C17297a() {
        }

        @Override // p000.AbstractServiceConnectionC39184cW3.InterfaceC13588b
        /* renamed from: a */
        public void mo52310a(Bundle bundle) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (bundle != null && bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
                boolean z = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
                    str = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                } else {
                    str = C17296a.this.f69701d;
                }
                String str6 = str;
                if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
                    str2 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                } else {
                    str2 = C17296a.this.f69702e;
                }
                String str7 = str2;
                if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
                    str3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                } else {
                    str3 = C17296a.this.f69703f;
                }
                String str8 = str3;
                if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
                    str4 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                } else {
                    str4 = C17296a.this.f69704g;
                }
                String str9 = str4;
                if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
                    str5 = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                } else {
                    str5 = C17296a.this.f69705h;
                }
                C17296a.this.m52323o0(z, str6, str7, str8, str9, str5);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$b */
    /* loaded from: classes5.dex */
    public class C17298b implements VD1.InterfaceC8575a {

        /* renamed from: a */
        public final /* synthetic */ C17314o f69713a;

        /* renamed from: b */
        public final /* synthetic */ C17316q f69714b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC17322w f69715c;

        public C17298b(C17314o c17314o, C17316q c17316q, InterfaceC17322w interfaceC17322w) {
            this.f69713a = c17314o;
            this.f69714b = c17316q;
            this.f69715c = interfaceC17322w;
        }

        @Override // p000.VD1.InterfaceC8575a
        /* renamed from: a */
        public void mo52308a(VD1 vd1) {
            FacebookRequestError error;
            C17296a.this.f69706i = this.f69713a.f69747f;
            if (C52364yi6.m2860R(C17296a.this.f69706i)) {
                C17296a.this.f69706i = this.f69714b.f69754f;
                C17296a.this.f69707j = this.f69714b.f69755g;
            }
            if (C52364yi6.m2860R(C17296a.this.f69706i)) {
                C32992Fx2.m106219h(EnumC36034Sx2.DEVELOPER_ERRORS, C17296a.f69688o, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", C17296a.this.f69698a);
                C17296a c17296a = C17296a.this;
                if (this.f69714b.getError() != null) {
                    error = this.f69714b.getError();
                } else {
                    error = this.f69713a.getError();
                }
                c17296a.m52358U("get_verified_id", error);
            }
            InterfaceC17322w interfaceC17322w = this.f69715c;
            if (interfaceC17322w != null) {
                interfaceC17322w.onComplete();
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$c */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17299c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69717a;

        static {
            int[] iArr = new int[LikeView.EnumC17371g.values().length];
            f69717a = iArr;
            try {
                iArr[LikeView.EnumC17371g.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$d */
    /* loaded from: classes5.dex */
    public static class RunnableC17300d implements Runnable {
        public RunnableC17300d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17296a.this.m52345d0();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$e */
    /* loaded from: classes5.dex */
    public static class C17301e implements M80.InterfaceC5208a {
    }

    /* renamed from: com.facebook.share.internal.a$f */
    /* loaded from: classes5.dex */
    public static class RunnableC17302f implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC17312m f69719b;

        /* renamed from: c */
        public final /* synthetic */ C17296a f69720c;

        /* renamed from: d */
        public final /* synthetic */ FacebookException f69721d;

        public RunnableC17302f(InterfaceC17312m interfaceC17312m, C17296a c17296a, FacebookException facebookException) {
            this.f69719b = interfaceC17312m;
            this.f69720c = c17296a;
            this.f69721d = facebookException;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                this.f69719b.mo52093a(this.f69720c, this.f69721d);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$g */
    /* loaded from: classes5.dex */
    public static class C17303g extends AbstractC3831J1 {
        @Override // p000.AbstractC3831J1
        /* renamed from: d */
        public void mo52309d(AccessToken accessToken, AccessToken accessToken2) {
            Context m52741e = C17216a.m52741e();
            if (accessToken2 == null) {
                int unused = C17296a.f69696w = (C17296a.f69696w + 1) % 1000;
                m52741e.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", C17296a.f69696w).apply();
                C17296a.f69690q.clear();
                C17296a.f69689p.m18820f();
            }
            C17296a.m52375D(null, "com.facebook.sdk.LikeActionController.DID_RESET");
        }
    }

    /* renamed from: com.facebook.share.internal.a$h */
    /* loaded from: classes5.dex */
    public class C17304h implements InterfaceC17322w {

        /* renamed from: a */
        public final /* synthetic */ Bundle f69722a;

        /* renamed from: com.facebook.share.internal.a$h$a */
        /* loaded from: classes5.dex */
        public class C17305a implements VD1.InterfaceC8575a {

            /* renamed from: a */
            public final /* synthetic */ C17320u f69724a;

            public C17305a(C17320u c17320u) {
                this.f69724a = c17320u;
            }

            @Override // p000.VD1.InterfaceC8575a
            /* renamed from: a */
            public void mo52308a(VD1 vd1) {
                C17296a.this.f69709l = false;
                if (this.f69724a.getError() != null) {
                    C17296a.this.m52354Y(false);
                    return;
                }
                C17296a.this.f69705h = C52364yi6.m2837h(this.f69724a.f69763f, null);
                C17296a.this.f69708k = true;
                C17296a.this.m52368K().m24337i("fb_like_control_did_like", null, C17304h.this.f69722a);
                C17304h c17304h = C17304h.this;
                C17296a.this.m52355X(c17304h.f69722a);
            }
        }

        public C17304h(Bundle bundle) {
            this.f69722a = bundle;
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17322w
        public void onComplete() {
            if (C52364yi6.m2860R(C17296a.this.f69706i)) {
                Bundle bundle = new Bundle();
                bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                C17296a.m52374E(C17296a.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                return;
            }
            VD1 vd1 = new VD1();
            C17296a c17296a = C17296a.this;
            C17320u c17320u = new C17320u(c17296a.f69706i, C17296a.this.f69699b);
            c17320u.mo52302c(vd1);
            vd1.m80222c(new C17305a(c17320u));
            vd1.m80218j();
        }
    }

    /* renamed from: com.facebook.share.internal.a$i */
    /* loaded from: classes5.dex */
    public class C17306i implements VD1.InterfaceC8575a {

        /* renamed from: a */
        public final /* synthetic */ C17321v f69726a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f69727b;

        public C17306i(C17321v c17321v, Bundle bundle) {
            this.f69726a = c17321v;
            this.f69727b = bundle;
        }

        @Override // p000.VD1.InterfaceC8575a
        /* renamed from: a */
        public void mo52308a(VD1 vd1) {
            C17296a.this.f69709l = false;
            if (this.f69726a.getError() != null) {
                C17296a.this.m52354Y(true);
                return;
            }
            C17296a.this.f69705h = null;
            C17296a.this.f69708k = false;
            C17296a.this.m52368K().m24337i("fb_like_control_did_unlike", null, this.f69727b);
            C17296a.this.m52355X(this.f69727b);
        }
    }

    /* renamed from: com.facebook.share.internal.a$j */
    /* loaded from: classes5.dex */
    public class C17307j implements InterfaceC17322w {

        /* renamed from: com.facebook.share.internal.a$j$a */
        /* loaded from: classes5.dex */
        public class C17308a implements VD1.InterfaceC8575a {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC17318s f69730a;

            /* renamed from: b */
            public final /* synthetic */ C17313n f69731b;

            public C17308a(InterfaceC17318s interfaceC17318s, C17313n c17313n) {
                this.f69730a = interfaceC17318s;
                this.f69731b = c17313n;
            }

            @Override // p000.VD1.InterfaceC8575a
            /* renamed from: a */
            public void mo52308a(VD1 vd1) {
                if (this.f69730a.getError() == null && this.f69731b.getError() == null) {
                    C17296a c17296a = C17296a.this;
                    boolean mo52305b = this.f69730a.mo52305b();
                    C17313n c17313n = this.f69731b;
                    c17296a.m52323o0(mo52305b, c17313n.f69742f, c17313n.f69743g, c17313n.f69744h, c17313n.f69745i, this.f69730a.mo52306a());
                    return;
                }
                C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Unable to refresh like state for id: '%s'", C17296a.this.f69698a);
            }
        }

        public C17307j() {
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17322w
        public void onComplete() {
            InterfaceC17318s c17317r;
            if (C17299c.f69717a[C17296a.this.f69699b.ordinal()] != 1) {
                C17296a c17296a = C17296a.this;
                c17317r = new C17315p(c17296a.f69706i, C17296a.this.f69699b);
            } else {
                C17296a c17296a2 = C17296a.this;
                c17317r = new C17317r(c17296a2.f69706i);
            }
            C17296a c17296a3 = C17296a.this;
            C17313n c17313n = new C17313n(c17296a3.f69706i, C17296a.this.f69699b);
            VD1 vd1 = new VD1();
            c17317r.mo52302c(vd1);
            c17313n.mo52302c(vd1);
            vd1.m80222c(new C17308a(c17317r, c17313n));
            vd1.m80218j();
        }
    }

    /* renamed from: com.facebook.share.internal.a$k */
    /* loaded from: classes5.dex */
    public abstract class AbstractC17309k implements InterfaceC17323x {

        /* renamed from: a */
        public GraphRequest f69733a;

        /* renamed from: b */
        public String f69734b;

        /* renamed from: c */
        public LikeView.EnumC17371g f69735c;

        /* renamed from: d */
        public FacebookRequestError f69736d;

        /* renamed from: com.facebook.share.internal.a$k$a */
        /* loaded from: classes5.dex */
        public class C17310a implements GraphRequest.InterfaceC17205b {
            public C17310a() {
            }

            @Override // com.facebook.GraphRequest.InterfaceC17205b
            /* renamed from: a */
            public void mo2794a(WD1 wd1) {
                AbstractC17309k.this.f69736d = wd1.m78704b();
                AbstractC17309k abstractC17309k = AbstractC17309k.this;
                FacebookRequestError facebookRequestError = abstractC17309k.f69736d;
                if (facebookRequestError != null) {
                    abstractC17309k.mo52304d(facebookRequestError);
                } else {
                    abstractC17309k.mo52303e(wd1);
                }
            }
        }

        public AbstractC17309k(String str, LikeView.EnumC17371g enumC17371g) {
            this.f69734b = str;
            this.f69735c = enumC17371g;
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17323x
        /* renamed from: c */
        public void mo52302c(VD1 vd1) {
            vd1.add(this.f69733a);
        }

        /* renamed from: d */
        public abstract void mo52304d(FacebookRequestError facebookRequestError);

        /* renamed from: e */
        public abstract void mo52303e(WD1 wd1);

        /* renamed from: f */
        public void m52307f(GraphRequest graphRequest) {
            this.f69733a = graphRequest;
            graphRequest.m52847F(C17216a.m52729q());
            graphRequest.m52821z(new C17310a());
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17323x
        public FacebookRequestError getError() {
            return this.f69736d;
        }
    }

    /* renamed from: com.facebook.share.internal.a$l */
    /* loaded from: classes5.dex */
    public static class RunnableC17311l implements Runnable {

        /* renamed from: b */
        public String f69739b;

        /* renamed from: c */
        public LikeView.EnumC17371g f69740c;

        /* renamed from: d */
        public InterfaceC17312m f69741d;

        public RunnableC17311l(String str, LikeView.EnumC17371g enumC17371g, InterfaceC17312m interfaceC17312m) {
            this.f69739b = str;
            this.f69740c = enumC17371g;
            this.f69741d = interfaceC17312m;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17296a.m52372G(this.f69739b, this.f69740c, this.f69741d);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.a$m */
    /* loaded from: classes5.dex */
    public interface InterfaceC17312m {
        /* renamed from: a */
        void mo52093a(C17296a c17296a, FacebookException facebookException);
    }

    /* renamed from: com.facebook.share.internal.a$n */
    /* loaded from: classes5.dex */
    public class C17313n extends AbstractC17309k {

        /* renamed from: f */
        public String f69742f;

        /* renamed from: g */
        public String f69743g;

        /* renamed from: h */
        public String f69744h;

        /* renamed from: i */
        public String f69745i;

        public C17313n(String str, LikeView.EnumC17371g enumC17371g) {
            super(str, enumC17371g);
            this.f69742f = C17296a.this.f69701d;
            this.f69743g = C17296a.this.f69702e;
            this.f69744h = C17296a.this.f69703f;
            this.f69745i = C17296a.this.f69704g;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            m52307f(new GraphRequest(AccessToken.m52920c(), str, bundle, FN1.GET));
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error fetching engagement for object '%s' with type '%s' : %s", this.f69734b, this.f69735c, facebookRequestError);
            C17296a.this.m52358U("get_engagement", facebookRequestError);
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
            JSONObject m2804x0 = C52364yi6.m2804x0(wd1.m78703c(), "engagement");
            if (m2804x0 != null) {
                this.f69742f = m2804x0.optString("count_string_with_like", this.f69742f);
                this.f69743g = m2804x0.optString("count_string_without_like", this.f69743g);
                this.f69744h = m2804x0.optString("social_sentence_with_like", this.f69744h);
                this.f69745i = m2804x0.optString("social_sentence_without_like", this.f69745i);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$o */
    /* loaded from: classes5.dex */
    public class C17314o extends AbstractC17309k {

        /* renamed from: f */
        public String f69747f;

        public C17314o(String str, LikeView.EnumC17371g enumC17371g) {
            super(str, enumC17371g);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            m52307f(new GraphRequest(AccessToken.m52920c(), "", bundle, FN1.GET));
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.m52865c().contains("og_object")) {
                this.f69736d = null;
            } else {
                C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error getting the FB id for object '%s' with type '%s' : %s", this.f69734b, this.f69735c, facebookRequestError);
            }
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
            JSONObject optJSONObject;
            JSONObject m2804x0 = C52364yi6.m2804x0(wd1.m78703c(), this.f69734b);
            if (m2804x0 != null && (optJSONObject = m2804x0.optJSONObject("og_object")) != null) {
                this.f69747f = optJSONObject.optString("id");
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$p */
    /* loaded from: classes5.dex */
    public class C17315p extends AbstractC17309k implements InterfaceC17318s {

        /* renamed from: f */
        public boolean f69749f;

        /* renamed from: g */
        public String f69750g;

        /* renamed from: h */
        public final String f69751h;

        /* renamed from: i */
        public final LikeView.EnumC17371g f69752i;

        public C17315p(String str, LikeView.EnumC17371g enumC17371g) {
            super(str, enumC17371g);
            this.f69749f = C17296a.this.f69700c;
            this.f69751h = str;
            this.f69752i = enumC17371g;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", str);
            m52307f(new GraphRequest(AccessToken.m52920c(), "me/og.likes", bundle, FN1.GET));
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17318s
        /* renamed from: a */
        public String mo52306a() {
            return this.f69750g;
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17318s
        /* renamed from: b */
        public boolean mo52305b() {
            return this.f69749f;
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error fetching like status for object '%s' with type '%s' : %s", this.f69751h, this.f69752i, facebookRequestError);
            C17296a.this.m52358U("get_og_object_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
            JSONArray m2806w0 = C52364yi6.m2806w0(wd1.m78703c(), MessageExtension.FIELD_DATA);
            if (m2806w0 != null) {
                for (int i = 0; i < m2806w0.length(); i++) {
                    JSONObject optJSONObject = m2806w0.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.f69749f = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        AccessToken m52920c = AccessToken.m52920c();
                        if (optJSONObject2 != null && AccessToken.m52909o() && C52364yi6.m2851a(m52920c.m52921b(), optJSONObject2.optString("id"))) {
                            this.f69750g = optJSONObject.optString("id");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$q */
    /* loaded from: classes5.dex */
    public class C17316q extends AbstractC17309k {

        /* renamed from: f */
        public String f69754f;

        /* renamed from: g */
        public boolean f69755g;

        public C17316q(String str, LikeView.EnumC17371g enumC17371g) {
            super(str, enumC17371g);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            bundle.putString("ids", str);
            m52307f(new GraphRequest(AccessToken.m52920c(), "", bundle, FN1.GET));
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error getting the FB id for object '%s' with type '%s' : %s", this.f69734b, this.f69735c, facebookRequestError);
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
            JSONObject m2804x0 = C52364yi6.m2804x0(wd1.m78703c(), this.f69734b);
            if (m2804x0 != null) {
                String optString = m2804x0.optString("id");
                this.f69754f = optString;
                this.f69755g = !C52364yi6.m2860R(optString);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$r */
    /* loaded from: classes5.dex */
    public class C17317r extends AbstractC17309k implements InterfaceC17318s {

        /* renamed from: f */
        public boolean f69757f;

        /* renamed from: g */
        public String f69758g;

        public C17317r(String str) {
            super(str, LikeView.EnumC17371g.PAGE);
            this.f69757f = C17296a.this.f69700c;
            this.f69758g = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id");
            AccessToken m52920c = AccessToken.m52920c();
            m52307f(new GraphRequest(m52920c, "me/likes/" + str, bundle, FN1.GET));
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17318s
        /* renamed from: a */
        public String mo52306a() {
            return null;
        }

        @Override // com.facebook.share.internal.C17296a.InterfaceC17318s
        /* renamed from: b */
        public boolean mo52305b() {
            return this.f69757f;
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error fetching like status for page id '%s': %s", this.f69758g, facebookRequestError);
            C17296a.this.m52358U("get_page_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
            JSONArray m2806w0 = C52364yi6.m2806w0(wd1.m78703c(), MessageExtension.FIELD_DATA);
            if (m2806w0 != null && m2806w0.length() > 0) {
                this.f69757f = true;
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$s */
    /* loaded from: classes5.dex */
    public interface InterfaceC17318s extends InterfaceC17323x {
        /* renamed from: a */
        String mo52306a();

        /* renamed from: b */
        boolean mo52305b();
    }

    /* renamed from: com.facebook.share.internal.a$t */
    /* loaded from: classes5.dex */
    public static class RunnableC17319t implements Runnable {

        /* renamed from: d */
        public static ArrayList<String> f69760d = new ArrayList<>();

        /* renamed from: b */
        public String f69761b;

        /* renamed from: c */
        public boolean f69762c;

        public RunnableC17319t(String str, boolean z) {
            this.f69761b = str;
            this.f69762c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                String str = this.f69761b;
                if (str != null) {
                    f69760d.remove(str);
                    f69760d.add(0, this.f69761b);
                }
                if (this.f69762c && f69760d.size() >= 128) {
                    while (64 < f69760d.size()) {
                        ArrayList<String> arrayList = f69760d;
                        C17296a.f69690q.remove(arrayList.remove(arrayList.size() - 1));
                    }
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$u */
    /* loaded from: classes5.dex */
    public class C17320u extends AbstractC17309k {

        /* renamed from: f */
        public String f69763f;

        public C17320u(String str, LikeView.EnumC17371g enumC17371g) {
            super(str, enumC17371g);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            m52307f(new GraphRequest(AccessToken.m52920c(), "me/og.likes", bundle, FN1.POST));
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.m52866b() == 3501) {
                this.f69736d = null;
                return;
            }
            C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error liking object '%s' with type '%s' : %s", this.f69734b, this.f69735c, facebookRequestError);
            C17296a.this.m52358U("publish_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
            this.f69763f = C52364yi6.m2816r0(wd1.m78703c(), "id");
        }
    }

    /* renamed from: com.facebook.share.internal.a$v */
    /* loaded from: classes5.dex */
    public class C17321v extends AbstractC17309k {

        /* renamed from: f */
        public String f69765f;

        public C17321v(String str) {
            super(null, null);
            this.f69765f = str;
            m52307f(new GraphRequest(AccessToken.m52920c(), str, null, FN1.DELETE));
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: d */
        public void mo52304d(FacebookRequestError facebookRequestError) {
            C32992Fx2.m106219h(EnumC36034Sx2.REQUESTS, C17296a.f69688o, "Error unliking object with unlike token '%s' : %s", this.f69765f, facebookRequestError);
            C17296a.this.m52358U("publish_unlike", facebookRequestError);
        }

        @Override // com.facebook.share.internal.C17296a.AbstractC17309k
        /* renamed from: e */
        public void mo52303e(WD1 wd1) {
        }
    }

    /* renamed from: com.facebook.share.internal.a$w */
    /* loaded from: classes5.dex */
    public interface InterfaceC17322w {
        void onComplete();
    }

    /* renamed from: com.facebook.share.internal.a$x */
    /* loaded from: classes5.dex */
    public interface InterfaceC17323x {
        /* renamed from: c */
        void mo52302c(VD1 vd1);

        FacebookRequestError getError();
    }

    /* renamed from: com.facebook.share.internal.a$y */
    /* loaded from: classes5.dex */
    public static class RunnableC17324y implements Runnable {

        /* renamed from: b */
        public String f69767b;

        /* renamed from: c */
        public String f69768c;

        public RunnableC17324y(String str, String str2) {
            this.f69767b = str;
            this.f69768c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17296a.m52335i0(this.f69767b, this.f69768c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public C17296a(String str, LikeView.EnumC17371g enumC17371g) {
        this.f69698a = str;
        this.f69699b = enumC17371g;
    }

    /* renamed from: D */
    public static void m52375D(C17296a c17296a, String str) {
        m52374E(c17296a, str, null);
    }

    /* renamed from: E */
    public static void m52374E(C17296a c17296a, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (c17296a != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", c17296a.m52363P());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C34603Mu2.m94592b(C17216a.m52741e()).m94590d(intent);
    }

    /* renamed from: G */
    public static void m52372G(String str, LikeView.EnumC17371g enumC17371g, InterfaceC17312m interfaceC17312m) {
        C17296a m52365N = m52365N(str);
        if (m52365N != null) {
            m52321p0(m52365N, enumC17371g, interfaceC17312m);
            return;
        }
        C17296a m52371H = m52371H(str);
        if (m52371H == null) {
            m52371H = new C17296a(str, enumC17371g);
            m52337h0(m52371H);
        }
        m52347c0(str, m52371H);
        f69693t.post(new RunnableC17300d());
        m52361R(interfaceC17312m, m52371H, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r5 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        p000.C52364yi6.m2839g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r5 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C17296a m52371H(String str) {
        Throwable th;
        InputStream inputStream;
        C17296a c17296a = null;
        try {
            try {
                inputStream = f69689p.m18819g(m52367L(str));
                if (inputStream != null) {
                    try {
                        String m2834i0 = C52364yi6.m2834i0(inputStream);
                        if (!C52364yi6.m2860R(m2834i0)) {
                            c17296a = m52370I(m2834i0);
                        }
                    } catch (IOException e) {
                        e = e;
                        Log.e(f69688o, "Unable to deserialize controller from disk", e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (str != 0) {
                    C52364yi6.m2839g(str);
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            if (str != 0) {
            }
            throw th;
        }
    }

    /* renamed from: I */
    public static C17296a m52370I(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            C17296a c17296a = new C17296a(jSONObject.getString("object_id"), LikeView.EnumC17371g.m52091a(jSONObject.optInt("object_type", LikeView.EnumC17371g.UNKNOWN.m52090b())));
            c17296a.f69701d = jSONObject.optString("like_count_string_with_like", null);
            c17296a.f69702e = jSONObject.optString("like_count_string_without_like", null);
            c17296a.f69703f = jSONObject.optString("social_sentence_with_like", null);
            c17296a.f69704g = jSONObject.optString("social_sentence_without_like", null);
            c17296a.f69700c = jSONObject.optBoolean("is_object_liked");
            c17296a.f69705h = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                c17296a.f69710m = C38953c70.m61926a(optJSONObject);
            }
            return c17296a;
        } catch (JSONException e) {
            Log.e(f69688o, "Unable to deserialize controller from JSON", e);
            return null;
        }
    }

    /* renamed from: L */
    public static String m52367L(String str) {
        String str2;
        AccessToken m52920c = AccessToken.m52920c();
        if (AccessToken.m52909o()) {
            str2 = m52920c.m52911m();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str2 = C52364yi6.m2846c0(str2);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", str, C52364yi6.m2837h(str2, ""), Integer.valueOf(f69696w));
    }

    @Deprecated
    /* renamed from: M */
    public static void m52366M(String str, LikeView.EnumC17371g enumC17371g, InterfaceC17312m interfaceC17312m) {
        if (!f69695v) {
            m52357V();
        }
        C17296a m52365N = m52365N(str);
        if (m52365N != null) {
            m52321p0(m52365N, enumC17371g, interfaceC17312m);
        } else {
            f69692s.m112483e(new RunnableC17311l(str, enumC17371g, interfaceC17312m));
        }
    }

    /* renamed from: N */
    public static C17296a m52365N(String str) {
        String m52367L = m52367L(str);
        C17296a c17296a = f69690q.get(m52367L);
        if (c17296a != null) {
            f69691r.m112483e(new RunnableC17319t(m52367L, false));
        }
        return c17296a;
    }

    /* renamed from: R */
    public static void m52361R(InterfaceC17312m interfaceC17312m, C17296a c17296a, FacebookException facebookException) {
        if (interfaceC17312m == null) {
            return;
        }
        f69693t.post(new RunnableC17302f(interfaceC17312m, c17296a, facebookException));
    }

    /* renamed from: V */
    public static synchronized void m52357V() {
        synchronized (C17296a.class) {
            if (f69695v) {
                return;
            }
            f69693t = new Handler(Looper.getMainLooper());
            f69696w = C17216a.m52741e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
            f69689p = new C47054pl1(f69688o, new C47054pl1.C27376e());
            m52341f0();
            M80.m95693b(M80.EnumC5210c.Like.m95691a(), new C17301e());
            f69695v = true;
        }
    }

    /* renamed from: c0 */
    public static void m52347c0(String str, C17296a c17296a) {
        String m52367L = m52367L(str);
        f69691r.m112483e(new RunnableC17319t(m52367L, true));
        f69690q.put(m52367L, c17296a);
    }

    /* renamed from: f0 */
    public static void m52341f0() {
        f69697x = new C17303g();
    }

    /* renamed from: h0 */
    public static void m52337h0(C17296a c17296a) {
        String m52333j0 = m52333j0(c17296a);
        String m52367L = m52367L(c17296a.f69698a);
        if (!C52364yi6.m2860R(m52333j0) && !C52364yi6.m2860R(m52367L)) {
            f69692s.m112483e(new RunnableC17324y(m52367L, m52333j0));
        }
    }

    /* renamed from: i0 */
    public static void m52335i0(String str, String str2) {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = f69689p.m18815k(str);
                outputStream.write(str2.getBytes());
            } catch (IOException e) {
                Log.e(f69688o, "Unable to serialize controller to disk", e);
                if (outputStream == null) {
                    return;
                }
            }
            C52364yi6.m2839g(outputStream);
        } catch (Throwable th) {
            if (outputStream != null) {
                C52364yi6.m2839g(outputStream);
            }
            throw th;
        }
    }

    /* renamed from: j0 */
    public static String m52333j0(C17296a c17296a) {
        JSONObject m61925b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", c17296a.f69698a);
            jSONObject.put("object_type", c17296a.f69699b.m52090b());
            jSONObject.put("like_count_string_with_like", c17296a.f69701d);
            jSONObject.put("like_count_string_without_like", c17296a.f69702e);
            jSONObject.put("social_sentence_with_like", c17296a.f69703f);
            jSONObject.put("social_sentence_without_like", c17296a.f69704g);
            jSONObject.put("is_object_liked", c17296a.f69700c);
            jSONObject.put("unlike_token", c17296a.f69705h);
            Bundle bundle = c17296a.f69710m;
            if (bundle != null && (m61925b = C38953c70.m61925b(bundle)) != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", m61925b);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(f69688o, "Unable to serialize controller to JSON", e);
            return null;
        }
    }

    /* renamed from: l0 */
    public static void m52329l0(String str) {
        f69694u = str;
        C17216a.m52741e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", f69694u).apply();
    }

    /* renamed from: p0 */
    public static void m52321p0(C17296a c17296a, LikeView.EnumC17371g enumC17371g, InterfaceC17312m interfaceC17312m) {
        LikeView.EnumC17371g m93089g = C34876Ny5.m93089g(enumC17371g, c17296a.f69699b);
        FacebookException facebookException = null;
        if (m93089g == null) {
            Object[] objArr = {c17296a.f69698a, c17296a.f69699b.toString(), enumC17371g.toString()};
            c17296a = null;
            facebookException = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", objArr);
        } else {
            c17296a.f69699b = m93089g;
        }
        m52361R(interfaceC17312m, c17296a, facebookException);
    }

    /* renamed from: F */
    public final boolean m52373F() {
        AccessToken m52920c = AccessToken.m52920c();
        if (!this.f69707j && this.f69706i != null && AccessToken.m52909o() && m52920c.m52913k() != null && m52920c.m52913k().contains("publish_actions")) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m52369J(InterfaceC17322w interfaceC17322w) {
        if (!C52364yi6.m2860R(this.f69706i)) {
            if (interfaceC17322w != null) {
                interfaceC17322w.onComplete();
                return;
            }
            return;
        }
        C17314o c17314o = new C17314o(this.f69698a, this.f69699b);
        C17316q c17316q = new C17316q(this.f69698a, this.f69699b);
        VD1 vd1 = new VD1();
        c17314o.mo52302c(vd1);
        c17316q.mo52302c(vd1);
        vd1.m80222c(new C17298b(c17314o, c17316q, interfaceC17322w));
        vd1.m80218j();
    }

    /* renamed from: K */
    public final C45485n62 m52368K() {
        if (this.f69711n == null) {
            this.f69711n = new C45485n62(C17216a.m52741e());
        }
        return this.f69711n;
    }

    @Deprecated
    /* renamed from: O */
    public String m52364O() {
        return this.f69700c ? this.f69701d : this.f69702e;
    }

    @Deprecated
    /* renamed from: P */
    public String m52363P() {
        return this.f69698a;
    }

    @Deprecated
    /* renamed from: Q */
    public String m52362Q() {
        return this.f69700c ? this.f69703f : this.f69704g;
    }

    @Deprecated
    /* renamed from: S */
    public boolean m52360S() {
        return this.f69700c;
    }

    /* renamed from: T */
    public final void m52359T(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.f69698a);
        bundle2.putString("object_type", this.f69699b.toString());
        bundle2.putString("current_action", str);
        m52368K().m24337i("fb_like_control_error", null, bundle2);
    }

    /* renamed from: U */
    public final void m52358U(String str, FacebookRequestError facebookRequestError) {
        JSONObject m52862g;
        Bundle bundle = new Bundle();
        if (facebookRequestError != null && (m52862g = facebookRequestError.m52862g()) != null) {
            bundle.putString("error", m52862g.toString());
        }
        m52359T(str, bundle);
    }

    /* renamed from: W */
    public final void m52356W(Activity activity, C33702Iy1 c33702Iy1, Bundle bundle) {
        String str;
        String enumC17371g;
        if (C37141Xq2.m76222n()) {
            str = "fb_like_control_did_present_dialog";
        } else if (C37141Xq2.m76221o()) {
            str = "fb_like_control_did_present_fallback_dialog";
        } else {
            m52359T("present_dialog", bundle);
            C52364yi6.m2853Y(f69688o, "Cannot show the Like Dialog on this device.");
            m52375D(null, "com.facebook.sdk.LikeActionController.UPDATED");
            str = null;
        }
        if (str != null) {
            LikeView.EnumC17371g enumC17371g2 = this.f69699b;
            if (enumC17371g2 != null) {
                enumC17371g = enumC17371g2.toString();
            } else {
                enumC17371g = LikeView.EnumC17371g.UNKNOWN.toString();
            }
            LikeContent m52390c = new LikeContent.C17294b().m52389d(this.f69698a).m52388e(enumC17371g).m52390c();
            if (c33702Iy1 != null) {
                new C37141Xq2(c33702Iy1).mo30029i(m52390c);
            } else {
                new C37141Xq2(activity).mo30029i(m52390c);
            }
            m52339g0(bundle);
            m52368K().m24338h("fb_like_control_did_present_dialog", bundle);
        }
    }

    /* renamed from: X */
    public final void m52355X(Bundle bundle) {
        boolean z = this.f69700c;
        if (z != this.f69708k && !m52351a0(z, bundle)) {
            m52354Y(!this.f69700c);
        }
    }

    /* renamed from: Y */
    public final void m52354Y(boolean z) {
        m52325n0(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        m52374E(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* renamed from: Z */
    public final void m52353Z(Bundle bundle) {
        this.f69709l = true;
        m52369J(new C17304h(bundle));
    }

    /* renamed from: a0 */
    public final boolean m52351a0(boolean z, Bundle bundle) {
        if (m52373F()) {
            if (z) {
                m52353Z(bundle);
                return true;
            } else if (!C52364yi6.m2860R(this.f69705h)) {
                m52349b0(bundle);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public final void m52349b0(Bundle bundle) {
        this.f69709l = true;
        VD1 vd1 = new VD1();
        C17321v c17321v = new C17321v(this.f69705h);
        c17321v.mo52302c(vd1);
        vd1.m80222c(new C17306i(c17321v, bundle));
        vd1.m80218j();
    }

    /* renamed from: d0 */
    public final void m52345d0() {
        if (!AccessToken.m52909o()) {
            m52343e0();
        } else {
            m52369J(new C17307j());
        }
    }

    /* renamed from: e0 */
    public final void m52343e0() {
        C37609Zq2 c37609Zq2 = new C37609Zq2(C17216a.m52741e(), C17216a.m52740f(), this.f69698a);
        if (!c37609Zq2.m61255g()) {
            return;
        }
        c37609Zq2.m61256f(new C17297a());
    }

    /* renamed from: g0 */
    public final void m52339g0(Bundle bundle) {
        m52329l0(this.f69698a);
        this.f69710m = bundle;
        m52337h0(this);
    }

    @Deprecated
    /* renamed from: k0 */
    public boolean m52331k0() {
        return false;
    }

    @Deprecated
    /* renamed from: m0 */
    public void m52327m0(Activity activity, C33702Iy1 c33702Iy1, Bundle bundle) {
        boolean z = !this.f69700c;
        if (m52373F()) {
            m52325n0(z);
            if (this.f69709l) {
                m52368K().m24338h("fb_like_control_did_undo_quickly", bundle);
                return;
            } else if (!m52351a0(z, bundle)) {
                m52325n0(!z);
                m52356W(activity, c33702Iy1, bundle);
                return;
            } else {
                return;
            }
        }
        m52356W(activity, c33702Iy1, bundle);
    }

    /* renamed from: n0 */
    public final void m52325n0(boolean z) {
        m52323o0(z, this.f69701d, this.f69702e, this.f69703f, this.f69704g, this.f69705h);
    }

    /* renamed from: o0 */
    public final void m52323o0(boolean z, String str, String str2, String str3, String str4, String str5) {
        boolean z2;
        String m2837h = C52364yi6.m2837h(str, null);
        String m2837h2 = C52364yi6.m2837h(str2, null);
        String m2837h3 = C52364yi6.m2837h(str3, null);
        String m2837h4 = C52364yi6.m2837h(str4, null);
        String m2837h5 = C52364yi6.m2837h(str5, null);
        if (z == this.f69700c && C52364yi6.m2851a(m2837h, this.f69701d) && C52364yi6.m2851a(m2837h2, this.f69702e) && C52364yi6.m2851a(m2837h3, this.f69703f) && C52364yi6.m2851a(m2837h4, this.f69704g) && C52364yi6.m2851a(m2837h5, this.f69705h)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        this.f69700c = z;
        this.f69701d = m2837h;
        this.f69702e = m2837h2;
        this.f69703f = m2837h3;
        this.f69704g = m2837h4;
        this.f69705h = m2837h5;
        m52337h0(this);
        m52375D(this, "com.facebook.sdk.LikeActionController.UPDATED");
    }
}
