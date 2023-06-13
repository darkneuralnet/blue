package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\b\u0010\n¨\u0006\u0011"}, m28432d2 = {"Lbo/app/h4;", "Lbo/app/j2;", "", "b", "()Z", "isAutomaticRegistrationEnabled", "", "pushToken", C17296a.f69688o, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LX10;", "configurationProvider", "<init>", "(Landroid/content/Context;LX10;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.h4 */
/* loaded from: classes.dex */
public final class C12722h4 implements InterfaceC12792j2 {

    /* renamed from: c */
    public static final C12723a f58613c = new C12723a(null);

    /* renamed from: a */
    private final X10 f58614a;

    /* renamed from: b */
    public final SharedPreferences f58615b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"Lbo/app/h4$a;", "", "", "PUSH_SHARED_PREFERENCES_FILENAME", "Ljava/lang/String;", "PUSH_SHARED_PREFERENCES_PERSISTENT_DEVICE_ID", "getPUSH_SHARED_PREFERENCES_PERSISTENT_DEVICE_ID$annotations", "()V", "PUSH_SHARED_PREFERENCES_REGISTRATION_ID_KEY", "PUSH_SHARED_PREFERENCES_VERSION_CODE", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h4$a */
    /* loaded from: classes.dex */
    public static final class C12723a {
        public /* synthetic */ C12723a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12723a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h4$b */
    /* loaded from: classes.dex */
    public static final class C12724b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f58616b;

        /* renamed from: c */
        final /* synthetic */ int f58617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12724b(int i, int i2) {
            super(0);
            this.f58616b = i;
            this.f58617c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Stored push registration ID version code " + this.f58616b + " does not match live version code " + this.f58617c + ". Not returning saved registration ID.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h4$c */
    /* loaded from: classes.dex */
    public static final class C12725c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12725c f58618b = new C12725c();

        public C12725c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Device identifier differs from saved device identifier. Returning null token.";
        }
    }

    public C12722h4(Context context, X10 configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f58614a = configurationProvider;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f58615b = sharedPreferences;
    }

    /* renamed from: b */
    private final boolean m63611b() {
        if (!this.f58614a.isFirebaseCloudMessagingRegistrationEnabled() && !this.f58614a.isAdmMessagingRegistrationEnabled()) {
            return false;
        }
        return true;
    }

    @Override // bo.app.InterfaceC12792j2
    /* renamed from: a */
    public synchronized String mo63488a() {
        int versionCode;
        int i;
        if (m63611b() && this.f58615b.contains("version_code") && (versionCode = this.f58614a.getVersionCode()) != (i = this.f58615b.getInt("version_code", Integer.MIN_VALUE))) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12724b(i, versionCode), 6, null);
            return null;
        }
        if (this.f58615b.contains("device_identifier")) {
            if (!Intrinsics.areEqual(C12811k0.f58748b.m63464a(), this.f58615b.getString("device_identifier", ""))) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12725c.f58618b, 6, null);
                return null;
            }
        }
        return this.f58615b.getString("registration_id", null);
    }

    @Override // bo.app.InterfaceC12792j2
    /* renamed from: a */
    public synchronized void mo63487a(String str) {
        if (str != null) {
            this.f58615b.edit().putString("registration_id", str).putInt("version_code", this.f58614a.getVersionCode()).putString("device_identifier", C12811k0.f58748b.m63464a()).apply();
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
