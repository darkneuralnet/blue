package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.VD1;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0002\u0013\u0017B\u0019\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, m28432d2 = {"LG1;", "", "", "i", "", "e", "f", "Lcom/facebook/AccessToken$a;", "callback", "j", "Lcom/facebook/AccessToken;", "currentAccessToken", "saveToCache", "n", "oldAccessToken", "l", "o", "p", "k", C17296a.f69688o, "Lcom/facebook/AccessToken;", "currentAccessTokenField", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tokenRefreshInProgress", "Ljava/util/Date;", "c", "Ljava/util/Date;", "lastAttemptedTokenExtendDate", "LMu2;", DateTokenConverter.CONVERTER_KEY, "LMu2;", "localBroadcastManager", "LF1;", "LF1;", "accessTokenCache", "value", "g", "()Lcom/facebook/AccessToken;", "m", "(Lcom/facebook/AccessToken;)V", "<init>", "(LMu2;LF1;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: G1 */
/* loaded from: classes5.dex */
public final class C2597G1 {

    /* renamed from: f */
    public static C2597G1 f10725f;

    /* renamed from: g */
    public static final C2598a f10726g = new C2598a(null);

    /* renamed from: a */
    public AccessToken f10727a;

    /* renamed from: b */
    public final AtomicBoolean f10728b;

    /* renamed from: c */
    public Date f10729c;

    /* renamed from: d */
    public final C34603Mu2 f10730d;

    /* renamed from: e */
    public final C2048F1 f10731e;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LG1$a;", "", "LG1;", "e", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", DateTokenConverter.CONVERTER_KEY, "c", "", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "TOKEN_EXTEND_GRAPH_PATH", "", "TOKEN_EXTEND_RETRY_SECONDS", "I", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "LG1;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: G1$a */
    /* loaded from: classes5.dex */
    public static final class C2598a {
        private C2598a() {
        }

        /* renamed from: c */
        public final GraphRequest m105993c(AccessToken accessToken, GraphRequest.InterfaceC17205b interfaceC17205b) {
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", "fb_extend_sso_token");
            bundle.putString(AnalyticsRequestV2.PARAM_CLIENT_ID, accessToken.m52921b());
            return new GraphRequest(accessToken, "oauth/access_token", bundle, FN1.GET, interfaceC17205b, null, 32, null);
        }

        /* renamed from: d */
        public final GraphRequest m105992d(AccessToken accessToken, GraphRequest.InterfaceC17205b interfaceC17205b) {
            return new GraphRequest(accessToken, "me/permissions", new Bundle(), FN1.GET, interfaceC17205b, null, 32, null);
        }

        @JvmStatic
        /* renamed from: e */
        public final C2597G1 m105991e() {
            C2597G1 c2597g1;
            C2597G1 c2597g12 = C2597G1.f10725f;
            if (c2597g12 == null) {
                synchronized (this) {
                    c2597g1 = C2597G1.f10725f;
                    if (c2597g1 == null) {
                        C34603Mu2 m94592b = C34603Mu2.m94592b(C17216a.m52741e());
                        Intrinsics.checkNotNullExpressionValue(m94592b, "LocalBroadcastManager.ge…tance(applicationContext)");
                        C2597G1 c2597g13 = new C2597G1(m94592b, new C2048F1());
                        C2597G1.f10725f = c2597g13;
                        c2597g1 = c2597g13;
                    }
                }
                return c2597g1;
            }
            return c2597g12;
        }

        public /* synthetic */ C2598a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0007¨\u0006\u001c"}, m28432d2 = {"LG1$b;", "", "", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "accessToken", "", "b", "I", "c", "()I", "g", "(I)V", "expiresAt", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "f", "(Ljava/lang/Long;)V", "dataAccessExpirationTime", DateTokenConverter.CONVERTER_KEY, "h", "graphDomain", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: G1$b */
    /* loaded from: classes5.dex */
    public static final class C2599b {

        /* renamed from: a */
        public String f10732a;

        /* renamed from: b */
        public int f10733b;

        /* renamed from: c */
        public Long f10734c;

        /* renamed from: d */
        public String f10735d;

        /* renamed from: a */
        public final String m105990a() {
            return this.f10732a;
        }

        /* renamed from: b */
        public final Long m105989b() {
            return this.f10734c;
        }

        /* renamed from: c */
        public final int m105988c() {
            return this.f10733b;
        }

        /* renamed from: d */
        public final String m105987d() {
            return this.f10735d;
        }

        /* renamed from: e */
        public final void m105986e(String str) {
            this.f10732a = str;
        }

        /* renamed from: f */
        public final void m105985f(Long l) {
            this.f10734c = l;
        }

        /* renamed from: g */
        public final void m105984g(int i) {
            this.f10733b = i;
        }

        /* renamed from: h */
        public final void m105983h(String str) {
            this.f10735d = str;
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: G1$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC2600c implements Runnable {
        public RunnableC2600c(AccessToken.InterfaceC17186a interfaceC17186a) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C2597G1.this.m106001k(null);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LVD1;", "it", "", C17296a.f69688o, "(LVD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: G1$d */
    /* loaded from: classes5.dex */
    public static final class C2601d implements VD1.InterfaceC8575a {

        /* renamed from: b */
        public final /* synthetic */ C2599b f10738b;

        /* renamed from: c */
        public final /* synthetic */ AccessToken f10739c;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f10740d;

        /* renamed from: e */
        public final /* synthetic */ Set f10741e;

        /* renamed from: f */
        public final /* synthetic */ Set f10742f;

        /* renamed from: g */
        public final /* synthetic */ Set f10743g;

        public C2601d(C2599b c2599b, AccessToken accessToken, AccessToken.InterfaceC17186a interfaceC17186a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f10738b = c2599b;
            this.f10739c = accessToken;
            this.f10740d = atomicBoolean;
            this.f10741e = set;
            this.f10742f = set2;
            this.f10743g = set3;
        }

        @Override // p000.VD1.InterfaceC8575a
        /* renamed from: a */
        public final void mo52308a(VD1 it) {
            boolean z;
            String str;
            Set<String> m52913k;
            Set<String> m52918e;
            Set<String> m52917g;
            Date m52916h;
            Date m52919d;
            Intrinsics.checkNotNullParameter(it, "it");
            String m105990a = this.f10738b.m105990a();
            int m105988c = this.f10738b.m105988c();
            Long m105989b = this.f10738b.m105989b();
            String m105987d = this.f10738b.m105987d();
            try {
                C2598a c2598a = C2597G1.f10726g;
                if (c2598a.m105991e().m106005g() != null) {
                    AccessToken m106005g = c2598a.m105991e().m106005g();
                    if (m106005g != null) {
                        str = m106005g.m52910n();
                    } else {
                        str = null;
                    }
                    if (str == this.f10739c.m52910n()) {
                        if (!this.f10740d.get() && m105990a == null && m105988c == 0) {
                            C2597G1.this.f10728b.set(false);
                            return;
                        }
                        if (m105990a == null) {
                            m105990a = this.f10739c.m52911m();
                        }
                        String str2 = m105990a;
                        String m52921b = this.f10739c.m52921b();
                        String m52910n = this.f10739c.m52910n();
                        if (this.f10740d.get()) {
                            m52913k = this.f10741e;
                        } else {
                            m52913k = this.f10739c.m52913k();
                        }
                        Set<String> set = m52913k;
                        if (this.f10740d.get()) {
                            m52918e = this.f10742f;
                        } else {
                            m52918e = this.f10739c.m52918e();
                        }
                        Set<String> set2 = m52918e;
                        if (this.f10740d.get()) {
                            m52917g = this.f10743g;
                        } else {
                            m52917g = this.f10739c.m52917g();
                        }
                        Set<String> set3 = m52917g;
                        EnumC3312I1 m52912l = this.f10739c.m52912l();
                        try {
                            if (this.f10738b.m105988c() != 0) {
                                m52916h = new Date(this.f10738b.m105988c() * 1000);
                            } else {
                                m52916h = this.f10739c.m52916h();
                            }
                            Date date = new Date();
                            if (m105989b != null) {
                                m52919d = new Date(1000 * m105989b.longValue());
                            } else {
                                m52919d = this.f10739c.m52919d();
                            }
                            c2598a.m105991e().m105999m(new AccessToken(str2, m52921b, m52910n, set, set2, set3, m52912l, m52916h, date, m52919d, m105987d));
                            C2597G1.this.f10728b.set(false);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            C2597G1.this.f10728b.set(z);
                            throw th;
                        }
                    }
                }
                C2597G1.this.f10728b.set(false);
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: G1$e */
    /* loaded from: classes5.dex */
    public static final class C2602e implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f10744a;

        /* renamed from: b */
        public final /* synthetic */ Set f10745b;

        /* renamed from: c */
        public final /* synthetic */ Set f10746c;

        /* renamed from: d */
        public final /* synthetic */ Set f10747d;

        public C2602e(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f10744a = atomicBoolean;
            this.f10745b = set;
            this.f10746c = set2;
            this.f10747d = set3;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            JSONArray optJSONArray;
            Intrinsics.checkNotNullParameter(response, "response");
            JSONObject m78702d = response.m78702d();
            if (m78702d != null && (optJSONArray = m78702d.optJSONArray(MessageExtension.FIELD_DATA)) != null) {
                this.f10744a.set(true);
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String status = optJSONObject.optString("status");
                        if (!C52364yi6.m2860R(optString) && !C52364yi6.m2860R(status)) {
                            Intrinsics.checkNotNullExpressionValue(status, "status");
                            Locale locale = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                            if (status != null) {
                                String lowerCase = status.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                if (lowerCase != null) {
                                    int hashCode = lowerCase.hashCode();
                                    if (hashCode != -1309235419) {
                                        if (hashCode != 280295099) {
                                            if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                                this.f10746c.add(optString);
                                            }
                                        } else if (lowerCase.equals("granted")) {
                                            this.f10745b.add(optString);
                                        }
                                    } else if (lowerCase.equals("expired")) {
                                        this.f10747d.add(optString);
                                    }
                                }
                                Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: G1$f */
    /* loaded from: classes5.dex */
    public static final class C2603f implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ C2599b f10748a;

        public C2603f(C2599b c2599b) {
            this.f10748a = c2599b;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            JSONObject m78702d = response.m78702d();
            if (m78702d != null) {
                this.f10748a.m105986e(m78702d.optString("access_token"));
                this.f10748a.m105984g(m78702d.optInt("expires_at"));
                this.f10748a.m105985f(Long.valueOf(m78702d.optLong("data_access_expiration_time")));
                this.f10748a.m105983h(m78702d.optString("graph_domain", null));
            }
        }
    }

    public C2597G1(C34603Mu2 localBroadcastManager, C2048F1 accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f10730d = localBroadcastManager;
        this.f10731e = accessTokenCache;
        this.f10728b = new AtomicBoolean(false);
        this.f10729c = new Date(0L);
    }

    @JvmStatic
    /* renamed from: h */
    public static final C2597G1 m106004h() {
        return f10726g.m105991e();
    }

    /* renamed from: e */
    public final void m106007e() {
        m106000l(m106005g(), m106005g());
    }

    /* renamed from: f */
    public final void m106006f() {
        if (!m105996p()) {
            return;
        }
        m106002j(null);
    }

    /* renamed from: g */
    public final AccessToken m106005g() {
        return this.f10727a;
    }

    /* renamed from: i */
    public final boolean m106003i() {
        AccessToken m108114f = this.f10731e.m108114f();
        if (m108114f == null) {
            return false;
        }
        m105998n(m108114f, false);
        return true;
    }

    /* renamed from: j */
    public final void m106002j(AccessToken.InterfaceC17186a interfaceC17186a) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            m106001k(interfaceC17186a);
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC2600c(interfaceC17186a));
        }
    }

    /* renamed from: k */
    public final void m106001k(AccessToken.InterfaceC17186a interfaceC17186a) {
        AccessToken m106005g = m106005g();
        if (m106005g == null) {
            if (interfaceC17186a != null) {
                interfaceC17186a.m52904a(new FacebookException("No current access token to refresh"));
            }
        } else if (!this.f10728b.compareAndSet(false, true)) {
            if (interfaceC17186a != null) {
                interfaceC17186a.m52904a(new FacebookException("Refresh already in progress"));
            }
        } else {
            this.f10729c = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C2599b c2599b = new C2599b();
            C2598a c2598a = f10726g;
            VD1 vd1 = new VD1(c2598a.m105992d(m106005g, new C2602e(atomicBoolean, hashSet, hashSet2, hashSet3)), c2598a.m105993c(m106005g, new C2603f(c2599b)));
            vd1.m80222c(new C2601d(c2599b, m106005g, interfaceC17186a, atomicBoolean, hashSet, hashSet2, hashSet3));
            vd1.m80218j();
        }
    }

    /* renamed from: l */
    public final void m106000l(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C17216a.m52741e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f10730d.m94590d(intent);
    }

    /* renamed from: m */
    public final void m105999m(AccessToken accessToken) {
        m105998n(accessToken, true);
    }

    /* renamed from: n */
    public final void m105998n(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f10727a;
        this.f10727a = accessToken;
        this.f10728b.set(false);
        this.f10729c = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f10731e.m108113g(accessToken);
            } else {
                this.f10731e.m108119a();
                Context m52741e = C17216a.m52741e();
                Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
                C52364yi6.m2841f(m52741e);
            }
        }
        if (!C52364yi6.m2851a(accessToken2, accessToken)) {
            m106000l(accessToken2, accessToken);
            m105997o();
        }
    }

    /* renamed from: o */
    public final void m105997o() {
        Date date;
        Context m52741e = C17216a.m52741e();
        AccessToken.C17188c c17188c = AccessToken.f69314q;
        AccessToken m52897e = c17188c.m52897e();
        AlarmManager alarmManager = (AlarmManager) m52741e.getSystemService("alarm");
        if (c17188c.m52895g()) {
            if (m52897e != null) {
                date = m52897e.m52916h();
            } else {
                date = null;
            }
            if (date != null && alarmManager != null) {
                Intent intent = new Intent(m52741e, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, m52897e.m52916h().getTime(), PendingIntent.getBroadcast(m52741e, 0, intent, 0));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: p */
    public final boolean m105996p() {
        AccessToken m106005g = m106005g();
        if (m106005g == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!m106005g.m52912l().m103077a() || time - this.f10729c.getTime() <= ((long) DateTimeConstants.MILLIS_PER_HOUR) || time - m106005g.m52914j().getTime() <= ((long) DateTimeConstants.MILLIS_PER_DAY)) {
            return false;
        }
        return true;
    }
}
