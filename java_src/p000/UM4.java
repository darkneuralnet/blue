package p000;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0007R(\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR(\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010 \u0012\u0004\b$\u0010\u0017\u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b+\u0010\u0017\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, m28432d2 = {"LUM4;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "e", "Ljava/util/Locale;", "locale", "", "", "", "strings", "f", "base", "h", "LbS5;", "b", "LbS5;", DateTokenConverter.CONVERTER_KEY, "()LbS5;", "g", "(LbS5;)V", "getStringRepository$annotations", "()V", "stringRepository", "", "", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "managedStrings", "LAv2;", "LAv2;", "()LAv2;", "setLocaleProvider", "(LAv2;)V", "getLocaleProvider$annotations", "localeProvider", "value", C17296a.f69688o, "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "getLocale$annotations", "<init>", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: UM4 */
/* loaded from: classes7.dex */
public final class UM4 {

    /* renamed from: b */
    public static InterfaceC38557bS5 f37300b;

    /* renamed from: a */
    public static final UM4 f37299a = new UM4();

    /* renamed from: c */
    public static final Map<Integer, String> f37301c = new LinkedHashMap();

    /* renamed from: d */
    public static InterfaceC31804Av2 f37302d = WX0.f41228a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "sharedPreferencesName", "Landroid/content/SharedPreferences;", "b", "(Ljava/lang/String;)Landroid/content/SharedPreferences;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: UM4$a */
    /* loaded from: classes7.dex */
    public static final class C8268a extends Lambda implements Function1<String, SharedPreferences> {

        /* renamed from: g */
        public final /* synthetic */ Context f37303g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8268a(Context context) {
            super(1);
            this.f37303g = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final SharedPreferences invoke(String sharedPreferencesName) {
            Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
            SharedPreferences sharedPreferences = this.f37303g.getSharedPreferences(sharedPreferencesName, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    private UM4() {
    }

    /* renamed from: a */
    public static final Locale m81595a() {
        return f37302d.mo78255a();
    }

    /* renamed from: b */
    public static final InterfaceC31804Av2 m81594b() {
        return f37302d;
    }

    /* renamed from: d */
    public static final InterfaceC38557bS5 m81592d() {
        InterfaceC38557bS5 interfaceC38557bS5 = f37300b;
        if (interfaceC38557bS5 != null) {
            return interfaceC38557bS5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stringRepository");
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m81591e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m81589g(new C43724k80(new C40675ez5(new C8268a(context))));
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m81590f(Locale locale, Map<String, ? extends CharSequence> strings) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Map<String, CharSequence> map = C39150cS5.m61300a(m81592d()).mo29256c().get(locale);
        if (map != null) {
            map.putAll(strings);
        }
    }

    /* renamed from: g */
    public static final void m81589g(InterfaceC38557bS5 interfaceC38557bS5) {
        Intrinsics.checkNotNullParameter(interfaceC38557bS5, "<set-?>");
        f37300b = interfaceC38557bS5;
    }

    @JvmStatic
    /* renamed from: h */
    public static final Context m81588h(Context base) {
        boolean z;
        Intrinsics.checkNotNullParameter(base, "base");
        if (f37300b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return base;
        }
        if (base.getResources() instanceof ZM4) {
            return base;
        }
        return VM4.f38901b.m79932a(base, m81592d());
    }

    /* renamed from: c */
    public final Map<Integer, String> m81593c() {
        return f37301c;
    }
}
