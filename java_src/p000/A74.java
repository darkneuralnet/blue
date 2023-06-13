package p000;

import android.content.Intent;
import com.facebook.C17216a;
import com.facebook.Profile;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00032\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LA74;", "", "", "e", "Lcom/facebook/Profile;", "currentProfile", "writeToCache", "", "h", "oldProfile", "f", C17296a.f69688o, "Lcom/facebook/Profile;", "currentProfileField", "LMu2;", "b", "LMu2;", "localBroadcastManager", "Ls74;", "c", "Ls74;", "profileCache", "value", "()Lcom/facebook/Profile;", "g", "(Lcom/facebook/Profile;)V", "<init>", "(LMu2;Ls74;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: A74 */
/* loaded from: classes5.dex */
public final class A74 {

    /* renamed from: d */
    public static volatile A74 f172d;

    /* renamed from: e */
    public static final C0033a f173e = new C0033a(null);

    /* renamed from: a */
    public Profile f174a;

    /* renamed from: b */
    public final C34603Mu2 f175b;

    /* renamed from: c */
    public final C48461s74 f176c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LA74$a;", "", "LA74;", C17296a.f69688o, "", "ACTION_CURRENT_PROFILE_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", "instance", "LA74;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: A74$a */
    /* loaded from: classes5.dex */
    public static final class C0033a {
        private C0033a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final A74 m116079a() {
            if (A74.f172d == null) {
                synchronized (this) {
                    if (A74.f172d == null) {
                        C34603Mu2 m94592b = C34603Mu2.m94592b(C17216a.m52741e());
                        Intrinsics.checkNotNullExpressionValue(m94592b, "LocalBroadcastManager.ge…tance(applicationContext)");
                        A74.f172d = new A74(m94592b, new C48461s74());
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            A74 a74 = A74.f172d;
            if (a74 != null) {
                return a74;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public /* synthetic */ C0033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public A74(C34603Mu2 localBroadcastManager, C48461s74 profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f175b = localBroadcastManager;
        this.f176c = profileCache;
    }

    @JvmStatic
    /* renamed from: d */
    public static final A74 m116084d() {
        return f173e.m116079a();
    }

    /* renamed from: c */
    public final Profile m116085c() {
        return this.f174a;
    }

    /* renamed from: e */
    public final boolean m116083e() {
        Profile m14759b = this.f176c.m14759b();
        if (m14759b == null) {
            return false;
        }
        m116080h(m14759b, false);
        return true;
    }

    /* renamed from: f */
    public final void m116082f(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f175b.m94590d(intent);
    }

    /* renamed from: g */
    public final void m116081g(Profile profile) {
        m116080h(profile, true);
    }

    /* renamed from: h */
    public final void m116080h(Profile profile, boolean z) {
        Profile profile2 = this.f174a;
        this.f174a = profile;
        if (z) {
            if (profile != null) {
                this.f176c.m14758c(profile);
            } else {
                this.f176c.m14760a();
            }
        }
        if (!C52364yi6.m2851a(profile2, profile)) {
            m116082f(profile2, profile);
        }
    }
}
