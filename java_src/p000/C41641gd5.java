package p000;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.C13109s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
import p000.X10;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\rJ(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0007J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J.\u0010\u001a\u001a\u00020\u0004\"\u0010\b\u0000\u0010\u0017*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 J2\u0010\"\u001a\u00020\u0004\"\u0010\b\u0000\u0010\u0017*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00063"}, m28432d2 = {"Lgd5;", "", "LU10;", "config", "", "n", "b", "", "key", "defaultValue", "h", "", "f", "", DateTokenConverter.CONVERTER_KEY, "", "", "g", "c", "", "value", "j", "m", "T", "Ljava/util/EnumSet;", "updateValue", "p", "o", C17296a.f69688o, "l", "(Ljava/lang/String;Ljava/lang/Integer;)V", "i", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "enumSet", "k", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "getStorageMap", "()Landroid/content/SharedPreferences;", "storageMap", "Landroid/content/SharedPreferences$Editor;", "Landroid/content/SharedPreferences$Editor;", "e", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "editor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: gd5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41641gd5 {

    /* renamed from: c */
    public static final C22394a f83957c = new C22394a(null);

    /* renamed from: a */
    public final SharedPreferences f83958a;

    /* renamed from: b */
    public SharedPreferences.Editor f83959b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lgd5$a;", "", "", "SHARED_PREFERENCES_NAME", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: gd5$a */
    /* loaded from: classes2.dex */
    public static final class C22394a {
        public /* synthetic */ C22394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22394a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: gd5$b */
    /* loaded from: classes2.dex */
    public static final class C22395b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22395b f83960g = new C22395b();

        public C22395b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Clearing Braze Override configuration cache";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: gd5$c */
    /* loaded from: classes2.dex */
    public static final class C22396c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ U10 f83961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22396c(U10 u10) {
            super(0);
            this.f83961g = u10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Setting Braze Override configuration with config: ", this.f83961g);
        }
    }

    public C41641gd5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f83958a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m37969a() {
        SharedPreferences.Editor editor = this.f83959b;
        if (editor == null) {
            return;
        }
        editor.apply();
    }

    /* renamed from: b */
    public final void m37968b() {
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C22395b.f83960g, 7, null);
        this.f83958a.edit().clear().apply();
    }

    /* renamed from: c */
    public final boolean m37967c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f83958a.contains(key);
    }

    /* renamed from: d */
    public final boolean m37966d(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f83958a.getBoolean(key, z);
    }

    /* renamed from: e */
    public final SharedPreferences.Editor m37965e() {
        return this.f83959b;
    }

    /* renamed from: f */
    public final int m37964f(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f83958a.getInt(key, i);
    }

    /* renamed from: g */
    public final Set<String> m37963g(String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f83958a.getStringSet(key, set);
    }

    /* renamed from: h */
    public final String m37962h(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f83958a.getString(key, str);
    }

    /* renamed from: i */
    public final void m37961i(String str, Boolean bool) {
        if (bool == null) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        SharedPreferences.Editor m37965e = m37965e();
        if (m37965e == null) {
            return;
        }
        m37965e.putBoolean(str, booleanValue);
    }

    /* renamed from: j */
    public final void m37960j(String key, Enum<?> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (r3 != null) {
            m37957m(key, r3.toString());
        }
    }

    /* renamed from: k */
    public final <T extends Enum<T>> void m37959k(EnumSet<T> enumSet, String str) {
        if (enumSet == null) {
            return;
        }
        Set<String> m62985a = C13109s0.m62985a(enumSet);
        SharedPreferences.Editor editor = this.f83959b;
        if (editor != null) {
            editor.putStringSet(str, m62985a);
        }
    }

    /* renamed from: l */
    public final void m37958l(String str, Integer num) {
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        SharedPreferences.Editor m37965e = m37965e();
        if (m37965e == null) {
            return;
        }
        m37965e.putInt(str, intValue);
    }

    /* renamed from: m */
    public final void m37957m(String key, String str) {
        SharedPreferences.Editor m37965e;
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null && (m37965e = m37965e()) != null) {
            m37965e.putString(key, str);
        }
    }

    /* renamed from: n */
    public final void m37956n(U10 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C22396c(config), 6, null);
        m37955o();
        m37957m(X10.EnumC9269b.API_KEY.m77562b(), config.f36630b);
        m37957m(X10.EnumC9269b.SERVER_TARGET_KEY.m77562b(), config.f36631c);
        m37960j(X10.EnumC9269b.SDK_FLAVOR.m77562b(), config.f36640l);
        m37961i(X10.EnumC9269b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.m77562b(), config.f36651w);
        m37957m(X10.EnumC9269b.CUSTOM_ENDPOINT.m77562b(), config.f36634f);
        m37957m(X10.EnumC9269b.SMALL_NOTIFICATION_ICON_KEY.m77562b(), config.f36632d);
        m37957m(X10.EnumC9269b.LARGE_NOTIFICATION_ICON_KEY.m77562b(), config.f36633e);
        m37958l(X10.EnumC9269b.SESSION_TIMEOUT_KEY.m77562b(), config.f36641m);
        m37958l(X10.EnumC9269b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.m77562b(), config.f36642n);
        m37958l(X10.EnumC9269b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.m77562b(), config.f36643o);
        m37961i(X10.EnumC9269b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.m77562b(), config.f36648t);
        m37961i(X10.EnumC9269b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.m77562b(), config.f36649u);
        m37961i(X10.EnumC9269b.ENABLE_LOCATION_COLLECTION_KEY.m77562b(), config.f36650v);
        m37958l(X10.EnumC9269b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.m77562b(), config.f36644p);
        m37958l(X10.EnumC9269b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.m77562b(), config.f36645q);
        m37958l(X10.EnumC9269b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.m77562b(), config.f36646r);
        m37957m(X10.EnumC9269b.DEFAULT_NOTIFICATION_CHANNEL_NAME.m77562b(), config.f36635g);
        m37957m(X10.EnumC9269b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.m77562b(), config.f36636h);
        m37961i(X10.EnumC9269b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.m77562b(), config.f36652x);
        m37957m(X10.EnumC9269b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.m77562b(), config.f36637i);
        m37961i(X10.EnumC9269b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.m77562b(), config.f36653y);
        m37961i(X10.EnumC9269b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.m77562b(), config.f36654z);
        m37957m(X10.EnumC9269b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.m77562b(), config.f36638j);
        m37961i(X10.EnumC9269b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.m77562b(), config.f36615A);
        m37961i(X10.EnumC9269b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.m77562b(), config.f36626L);
        m37961i(X10.EnumC9269b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.m77562b(), config.f36616B);
        m37961i(X10.EnumC9269b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.m77562b(), config.f36617C);
        m37961i(X10.EnumC9269b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.m77562b(), config.f36618D);
        m37961i(X10.EnumC9269b.GEOFENCES_ENABLED.m77562b(), config.f36619E);
        m37961i(X10.EnumC9269b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.m77562b(), config.f36620F);
        m37957m(X10.EnumC9269b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.m77562b(), config.f36639k);
        m37961i(X10.EnumC9269b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.m77562b(), config.f36621G);
        m37958l(X10.EnumC9269b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.m77562b(), config.f36647s);
        m37961i(X10.EnumC9269b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.m77562b(), config.f36622H);
        m37961i(X10.EnumC9269b.SDK_AUTH_ENABLED.m77562b(), config.f36623I);
        m37961i(X10.EnumC9269b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.m77562b(), config.f36624J);
        m37959k(config.f36625K, X10.EnumC9269b.DEVICE_OBJECT_ALLOWLIST_VALUE.m77562b());
        m37959k(config.f36627M, X10.EnumC9269b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY.m77562b());
        EnumSet<EnumC49593u20> enumSet = config.f36628N;
        if (enumSet != null) {
            m37954p(X10.EnumC9269b.SDK_METADATA_PUBLIC_KEY.m77562b(), enumSet);
        }
        m37969a();
    }

    /* renamed from: o */
    public final void m37955o() {
        this.f83959b = this.f83958a.edit();
    }

    /* renamed from: p */
    public final <T extends Enum<T>> void m37954p(String key, EnumSet<T> updateValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(updateValue, "updateValue");
        Set<String> m37963g = m37963g(key, new HashSet());
        if (m37963g != null) {
            m37963g.addAll(C13109s0.m62985a(updateValue));
        }
        this.f83958a.edit().putStringSet(key, m37963g).apply();
    }
}
