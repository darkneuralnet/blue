package p000;

import bo.app.C12521a5;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J6\u0010\u0012\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0007R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 ¨\u0006%"}, m28432d2 = {"Lxj6;", "", "", "emailAddress", "", "c", "phoneNumber", "g", "field", "b", "productId", "currencyCode", "Ljava/math/BigDecimal;", "price", "", "quantity", "Lbo/app/a5;", "serverConfigStorageProvider", "f", "eventName", "e", "campaignId", "pageId", "h", "", "latitude", "longitude", DateTokenConverter.CONVERTER_KEY, "", "Ljava/util/Set;", "VALID_CURRENCY_CODES", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_REGEX", "PHONE_NUMBER_REGEX", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: xj6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51781xj6 {

    /* renamed from: a */
    public static final C51781xj6 f118022a = new C51781xj6();

    /* renamed from: b */
    public static final Set<String> f118023b;

    /* renamed from: c */
    public static final Regex f118024c;

    /* renamed from: d */
    public static final Regex f118025d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$a */
    /* loaded from: classes2.dex */
    public static final class C30277a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<String> f118026g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30277a(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.f118026g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Provided string field is too long [" + this.f118026g.element.length() + "]. The max length is 255, truncating provided field.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$b */
    /* loaded from: classes2.dex */
    public static final class C30278b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30278b f118027g = new C30278b();

        public C30278b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$c */
    /* loaded from: classes2.dex */
    public static final class C30279c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f118028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30279c(String str) {
            super(0);
            this.f118028g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The custom event is a blocklisted custom event: " + this.f118028g + ". Invalid custom event.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$d */
    /* loaded from: classes2.dex */
    public static final class C30280d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30280d f118029g = new C30280d();

        public C30280d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The productId is empty, not logging in-app purchase to Appboy.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$e */
    /* loaded from: classes2.dex */
    public static final class C30281e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f118030g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30281e(String str) {
            super(0);
            this.f118030g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("The productId is a blocklisted productId: ", this.f118030g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$f */
    /* loaded from: classes2.dex */
    public static final class C30282f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30282f f118031g = new C30282f();

        public C30282f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("The currencyCode is empty. Expected one of ", C51781xj6.f118023b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$g */
    /* loaded from: classes2.dex */
    public static final class C30283g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f118032g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30283g(String str) {
            super(0);
            this.f118032g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The currencyCode " + ((Object) this.f118032g) + " is invalid. Expected one of " + C51781xj6.f118023b;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$h */
    /* loaded from: classes2.dex */
    public static final class C30284h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30284h f118033g = new C30284h();

        public C30284h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The price is null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$i */
    /* loaded from: classes2.dex */
    public static final class C30285i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f118034g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30285i(int i) {
            super(0);
            this.f118034g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The requested purchase quantity of " + this.f118034g + " is less than one. Invalid purchase";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$j */
    /* loaded from: classes2.dex */
    public static final class C30286j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f118035g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30286j(int i) {
            super(0);
            this.f118035g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The requested purchase quantity of " + this.f118035g + " is greater than the maximum of 100";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$k */
    /* loaded from: classes2.dex */
    public static final class C30287k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30287k f118036g = new C30287k();

        public C30287k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Campaign ID cannot be null or blank";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: xj6$l */
    /* loaded from: classes2.dex */
    public static final class C30288l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30288l f118037g = new C30288l();

        public C30288l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Push story page ID cannot be null or blank";
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
        f118023b = of;
        f118024c = new Regex(".+@.+\\..+");
        f118025d = new Regex("^[0-9 .\\(\\)\\+\\-]+$");
    }

    private C51781xj6() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0012  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, java.lang.Object, java.lang.String] */
    @JvmStatic
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m4786b(String str) {
        boolean z;
        CharSequence trim;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    return "";
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                trim = StringsKt__StringsKt.trim((CharSequence) str);
                ?? obj = trim.toString();
                objectRef.element = obj;
                int length = obj.length();
                C51781xj6 c51781xj6 = f118022a;
                if (length > 255) {
                    C43664k20.m29442e(C43664k20.f93782a, c51781xj6, C43664k20.EnumC25082a.W, null, false, new C30277a(objectRef), 6, null);
                    ?? substring = ((String) objectRef.element).substring(0, KotlinVersion.MAX_COMPONENT_VALUE);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    objectRef.element = substring;
                }
                return (String) objectRef.element;
            }
        }
        z = true;
        if (!z) {
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m4785c(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || str.length() > 255) {
            return false;
        }
        return f118024c.matches(str);
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m4784d(double d, double d2) {
        return d < 90.0d && d > -90.0d && d2 < 180.0d && d2 > -180.0d;
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m4783e(String eventName, C12521a5 serverConfigStorageProvider) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        isBlank = StringsKt__StringsJVMKt.isBlank(eventName);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, C30278b.f118027g, 6, null);
            return false;
        } else if (!serverConfigStorageProvider.m63938c().contains(eventName)) {
            return true;
        } else {
            C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, new C30279c(eventName), 6, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @JvmStatic
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4782f(String str, String str2, BigDecimal bigDecimal, int i, C12521a5 serverConfigStorageProvider) {
        boolean z;
        boolean z2;
        CharSequence trim;
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (str != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank2) {
                z = false;
                if (!z) {
                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, C30280d.f118029g, 6, null);
                } else if (serverConfigStorageProvider.m63937d().contains(str)) {
                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, new C30281e(str), 6, null);
                } else {
                    if (str2 != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                        if (!isBlank) {
                            z2 = false;
                            if (!z2) {
                                C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, C30282f.f118031g, 6, null);
                            } else {
                                Set<String> set = f118023b;
                                trim = StringsKt__StringsKt.trim((CharSequence) str2);
                                String obj = trim.toString();
                                Locale US = Locale.US;
                                Intrinsics.checkNotNullExpressionValue(US, "US");
                                String upperCase = obj.toUpperCase(US);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                                if (!set.contains(upperCase)) {
                                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, new C30283g(str2), 6, null);
                                } else if (bigDecimal == null) {
                                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, C30284h.f118033g, 6, null);
                                } else if (i <= 0) {
                                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, new C30285i(i), 6, null);
                                } else if (i <= 100) {
                                    return true;
                                } else {
                                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, new C30286j(i), 6, null);
                                }
                            }
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                return false;
            }
        }
        z = true;
        if (!z) {
        }
        return false;
    }

    @JvmStatic
    /* renamed from: g */
    public static final boolean m4781g(String str) {
        return str != null && f118025d.matches(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4780h(String str, String str2) {
        boolean z;
        boolean z2;
        boolean isBlank;
        boolean isBlank2;
        if (str != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank2) {
                z = false;
                if (!z) {
                    C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, C30287k.f118036g, 6, null);
                } else {
                    if (str2 != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                        if (!isBlank) {
                            z2 = false;
                            if (z2) {
                                return true;
                            }
                            C43664k20.m29442e(C43664k20.f93782a, f118022a, C43664k20.EnumC25082a.W, null, false, C30288l.f118037g, 6, null);
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                return false;
            }
        }
        z = true;
        if (!z) {
        }
        return false;
    }
}
