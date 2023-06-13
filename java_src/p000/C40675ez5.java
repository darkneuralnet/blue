package p000;

import android.content.SharedPreferences;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u000eB*\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002R/\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR>\u0010#\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001b0 0\u001a0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR8\u0010%\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0$0\u001a0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e¨\u0006("}, m28432d2 = {"Lez5;", "LIX2;", "", "prefsName", "Ljava/util/Locale;", "locale", "Landroid/content/SharedPreferences;", "g", "Lfz5;", "f", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "sharedPreferencesName", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "sharedPreferencesProvider", "LNR3;", "b", "LNR3;", "delegate", "", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedLocales", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "()Ljava/util/Map;", "strings", "", "LDW3;", "e", "quantityStrings", "", "stringArrays", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ez5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40675ez5 implements IX2 {

    /* renamed from: g */
    public static final C20161a f79236g = new C20161a(null);

    /* renamed from: a */
    public final Function1<String, SharedPreferences> f79237a;

    /* renamed from: b */
    public final NR3 f79238b;

    /* renamed from: c */
    public final Set<Locale> f79239c;

    /* renamed from: d */
    public final Map<Locale, Map<String, CharSequence>> f79240d;

    /* renamed from: e */
    public final Map<Locale, Map<String, Map<DW3, CharSequence>>> f79241e;

    /* renamed from: f */
    public final Map<Locale, Map<String, CharSequence[]>> f79242f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lez5$a;", "", "", "LOCALES_SHARED_PREF_NAME", "Ljava/lang/String;", "QUANTITY_STRINGS_SHARED_PREF_NAME", "STRINGS_SHARED_PREF_NAME", "STRING_ARRAYS_SHARED_PREF_NAME", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ez5$a */
    /* loaded from: classes7.dex */
    public static final class C20161a {
        public /* synthetic */ C20161a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20161a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/util/Locale;", "locale", "LVk2;", "", "", C17296a.f69688o, "(Ljava/util/Locale;)LVk2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ez5$b */
    /* loaded from: classes7.dex */
    public static final class C20162b extends Lambda implements Function1<Locale, InterfaceC36619Vk2<String, CharSequence>> {
        public C20162b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC36619Vk2<String, CharSequence> invoke(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new C38286az5(C40675ez5.this.m42304g("dev.b3nedikt.restring.Restring_Strings", locale), C40353eS5.f78400a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Ljava/util/Locale;", "locale", "LVk2;", "", "", "LDW3;", "", C17296a.f69688o, "(Ljava/util/Locale;)LVk2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ez5$c */
    /* loaded from: classes7.dex */
    public static final class C20163c extends Lambda implements Function1<Locale, InterfaceC36619Vk2<String, Map<DW3, ? extends CharSequence>>> {
        public C20163c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC36619Vk2<String, Map<DW3, CharSequence>> invoke(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new C38286az5(C40675ez5.this.m42304g("dev.b3nedikt.restring.Restring_Quantity_Strings", locale), C36081Tc4.f35781a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Ljava/util/Locale;", "locale", "LVk2;", "", "", "", C17296a.f69688o, "(Ljava/util/Locale;)LVk2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ez5$d */
    /* loaded from: classes7.dex */
    public static final class C20164d extends Lambda implements Function1<Locale, InterfaceC36619Vk2<String, CharSequence[]>> {
        public C20164d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC36619Vk2<String, CharSequence[]> invoke(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new C38286az5(C40675ez5.this.m42304g("dev.b3nedikt.restring.Restring_String_Arrays", locale), RR5.f32030a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40675ez5(Function1<? super String, ? extends SharedPreferences> sharedPreferencesProvider) {
        Intrinsics.checkNotNullParameter(sharedPreferencesProvider, "sharedPreferencesProvider");
        this.f79237a = sharedPreferencesProvider;
        NR3 nr3 = new NR3(m42305f(), new C20162b(), new C20163c(), new C20164d());
        this.f79238b = nr3;
        this.f79239c = nr3.mo29257b();
        this.f79240d = nr3.mo29256c();
        this.f79241e = nr3.mo29255d();
        this.f79242f = nr3.mo29258a();
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: a */
    public Map<Locale, Map<String, CharSequence[]>> mo29258a() {
        return this.f79242f;
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: b */
    public Set<Locale> mo29257b() {
        return this.f79239c;
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: c */
    public Map<Locale, Map<String, CharSequence>> mo29256c() {
        return this.f79240d;
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: d */
    public Map<Locale, Map<String, Map<DW3, CharSequence>>> mo29255d() {
        return this.f79241e;
    }

    /* renamed from: f */
    public final C41268fz5<Locale> m42305f() {
        return new C41268fz5<>(this.f79237a.invoke("dev.b3nedikt.restring.Restring_Locals"), C32038Bv2.f3038a, "Locales");
    }

    /* renamed from: g */
    public final SharedPreferences m42304g(String str, Locale locale) {
        return this.f79237a.invoke(str + '_' + C32506Dv2.f6572a.m109700b(locale));
    }
}
