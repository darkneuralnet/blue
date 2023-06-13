package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lbo/app/k0;", "Lbo/app/d2;", "", "generatedDeviceId", "", C17296a.f69688o, "", "getDeviceId", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.k0 */
/* loaded from: classes.dex */
public final class C12811k0 implements InterfaceC12579d2 {

    /* renamed from: b */
    public static final C12812a f58748b = new C12812a(null);

    /* renamed from: a */
    public final SharedPreferences f58749a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\n\u0010\t\u0012\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000e"}, m28432d2 = {"Lbo/app/k0$a;", "", "", C17296a.f69688o, "()Ljava/lang/String;", "getPersistentDeviceId$annotations", "()V", "persistentDeviceId", "DEVICE_ID_KEY", "Ljava/lang/String;", "PERSISTENT_DEVICE_ID_KEY", "getPERSISTENT_DEVICE_ID_KEY$annotations", "SHARED_PREFS_FILENAME", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k0$a */
    /* loaded from: classes.dex */
    public static final class C12812a {
        public /* synthetic */ C12812a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m63464a() {
            return String.valueOf(722989291);
        }

        private C12812a() {
        }
    }

    public C12811k0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.device", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f58749a = sharedPreferences;
    }

    /* renamed from: a */
    private final void m63465a(String str) {
        this.f58749a.edit().putString("device_id", str).putString("persistent_device_id", f58748b.m63464a()).apply();
    }

    @Override // bo.app.InterfaceC12579d2
    public String getDeviceId() {
        String str = null;
        String string = this.f58749a.getString("device_id", null);
        if (!m63466a()) {
            str = string;
        }
        if (str == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            m63465a(uuid);
            return uuid;
        } else if (!this.f58749a.contains("persistent_device_id")) {
            m63465a(str);
            return str;
        } else {
            return str;
        }
    }

    /* renamed from: a */
    private final boolean m63466a() {
        if (this.f58749a.contains("persistent_device_id")) {
            if (!Intrinsics.areEqual(f58748b.m63464a(), this.f58749a.getString("persistent_device_id", ""))) {
                return true;
            }
        }
        return false;
    }
}
