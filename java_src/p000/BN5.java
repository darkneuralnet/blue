package p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u001b\b\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LBN5;", "", "", "toString", "", C17296a.f69688o, "Ljava/lang/String;", "getCallingApplicationPackage", "()Ljava/lang/String;", "callingApplicationPackage", "", "b", "Z", "isOpenedByAppLink", "()Z", "<init>", "(Ljava/lang/String;Z)V", "c", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: BN5 */
/* loaded from: classes5.dex */
public final class BN5 {

    /* renamed from: c */
    public static final C0603a f2242c = new C0603a(null);

    /* renamed from: a */
    public final String f2243a;

    /* renamed from: b */
    public final boolean f2244b;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, m28432d2 = {"LBN5$a;", "", "LBN5;", "b", "", C17296a.f69688o, "", "CALL_APPLICATION_PACKAGE_KEY", "Ljava/lang/String;", "OPENED_BY_APP_LINK_KEY", "SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: BN5$a */
    /* loaded from: classes5.dex */
    public static final class C0603a {
        private C0603a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m114059a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        @JvmStatic
        /* renamed from: b */
        public final BN5 m114058b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e());
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new BN5(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
        }

        public /* synthetic */ C0603a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BN5(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    /* renamed from: a */
    public final void m114060a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C17216a.m52741e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f2243a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f2244b);
        edit.apply();
    }

    public String toString() {
        String str;
        if (this.f2244b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f2243a != null) {
            return str + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f2243a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return str;
    }

    public BN5(String str, boolean z) {
        this.f2243a = str;
        this.f2244b = z;
    }
}
