package p000;

import android.content.SharedPreferences;
import com.facebook.C17216a;
import com.facebook.Profile;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"Ls74;", "", "Lcom/facebook/Profile;", "b", Scopes.PROFILE, "", "c", C17296a.f69688o, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: s74  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48461s74 {

    /* renamed from: b */
    public static final C28181a f108310b = new C28181a(null);

    /* renamed from: a */
    public final SharedPreferences f108311a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Ls74$a;", "", "", "CACHED_PROFILE_KEY", "Ljava/lang/String;", "SHARED_PREFERENCES_NAME", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: s74$a */
    /* loaded from: classes5.dex */
    public static final class C28181a {
        private C28181a() {
        }

        public /* synthetic */ C28181a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C48461s74() {
        SharedPreferences sharedPreferences = C17216a.m52741e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.f108311a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m14760a() {
        this.f108311a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* renamed from: b */
    public final Profile m14759b() {
        String string = this.f108311a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m14758c(Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject m52759g = profile.m52759g();
        if (m52759g != null) {
            this.f108311a.edit().putString("com.facebook.ProfileManager.CachedProfile", m52759g.toString()).apply();
        }
    }
}
