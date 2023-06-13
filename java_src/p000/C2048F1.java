package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0007\u000fB\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LF1;", "", "Lcom/facebook/AccessToken;", "f", "accessToken", "", "g", C17296a.f69688o, "", "e", "h", "Lkp2;", "Lkp2;", "tokenCachingStrategyField", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "sharedPreferences", "LF1$b;", "c", "LF1$b;", "tokenCachingStrategyFactory", DateTokenConverter.CONVERTER_KEY, "()Lkp2;", "tokenCachingStrategy", "()Lcom/facebook/AccessToken;", "cachedAccessToken", "legacyAccessToken", "<init>", "(Landroid/content/SharedPreferences;LF1$b;)V", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: F1 */
/* loaded from: classes5.dex */
public final class C2048F1 {

    /* renamed from: d */
    public static final C2049a f8430d = new C2049a(null);

    /* renamed from: a */
    public C44130kp2 f8431a;

    /* renamed from: b */
    public final SharedPreferences f8432b;

    /* renamed from: c */
    public final C2050b f8433c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LF1$a;", "", "", "CACHED_ACCESS_TOKEN_KEY", "Ljava/lang/String;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: F1$a */
    /* loaded from: classes5.dex */
    public static final class C2049a {
        private C2049a() {
        }

        public /* synthetic */ C2049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, m28432d2 = {"LF1$b;", "", "Lkp2;", C17296a.f69688o, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: F1$b */
    /* loaded from: classes5.dex */
    public static final class C2050b {
        /* renamed from: a */
        public final C44130kp2 m108111a() {
            Context m52741e = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
            return new C44130kp2(m52741e, null, 2, null);
        }
    }

    public C2048F1(SharedPreferences sharedPreferences, C2050b tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f8432b = sharedPreferences;
        this.f8433c = tokenCachingStrategyFactory;
    }

    /* renamed from: a */
    public final void m108119a() {
        this.f8432b.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m108112h()) {
            m108116d().m28388a();
        }
    }

    /* renamed from: b */
    public final AccessToken m108118b() {
        String string = this.f8432b.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.f69314q.m52900b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final AccessToken m108117c() {
        Bundle m28386c = m108116d().m28386c();
        if (m28386c != null && C44130kp2.f95036d.m28379g(m28386c)) {
            return AccessToken.f69314q.m52899c(m28386c);
        }
        return null;
    }

    /* renamed from: d */
    public final C44130kp2 m108116d() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            if (this.f8431a == null) {
                synchronized (this) {
                    if (this.f8431a == null) {
                        this.f8431a = this.f8433c.m108111a();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            C44130kp2 c44130kp2 = this.f8431a;
            if (c44130kp2 != null) {
                return c44130kp2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final boolean m108115e() {
        return this.f8432b.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: f */
    public final AccessToken m108114f() {
        if (m108115e()) {
            return m108118b();
        }
        if (m108112h()) {
            AccessToken m108117c = m108117c();
            if (m108117c != null) {
                m108113g(m108117c);
                m108116d().m28388a();
                return m108117c;
            }
            return m108117c;
        }
        return null;
    }

    /* renamed from: g */
    public final void m108113g(AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f8432b.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m52906r().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: h */
    public final boolean m108112h() {
        return C17216a.m52721y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2048F1() {
        this(r0, new C2050b());
        SharedPreferences sharedPreferences = C17216a.m52741e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
    }
}
