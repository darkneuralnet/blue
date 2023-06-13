package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lbo/app/v4;", "", "", "isDisabled", C17296a.f69688o, "()Z", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.v4 */
/* loaded from: classes.dex */
public final class C13179v4 {

    /* renamed from: b */
    public static final C13180a f59378b = new C13180a(null);

    /* renamed from: a */
    private final SharedPreferences f59379a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/v4$a;", "", "", "PREFS_NAME", "Ljava/lang/String;", "SDK_DISABLED_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v4$a */
    /* loaded from: classes.dex */
    public static final class C13180a {
        public /* synthetic */ C13180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13180a() {
        }
    }

    public C13179v4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59379a = new SharedPreferencesC12589e(context, "persistent.com.appboy.storage.sdk_enabled_cache");
    }

    /* renamed from: a */
    public final boolean m62861a() {
        return this.f59379a.getBoolean("appboy_sdk_disabled", false);
    }
}
