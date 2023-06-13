package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Channel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015*\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LQ10;", "", "Landroid/net/Uri;", "", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "uri", "Lcom/appboy/enums/Channel;", "channel", "", C17296a.f69688o, "LKQ5;", MessageExtension.FIELD_DATA, "e", "(Landroid/content/Context;LKQ5;)V", "", "action", "Lorg/json/JSONObject;", "f", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lkotlin/Pair;", "c", "(Landroid/net/Uri;)Lkotlin/Pair;", "LQ10$a;", "b", "(LKQ5;)LQ10$a;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Q10 */
/* loaded from: classes2.dex */
public final class Q10 {

    /* renamed from: a */
    public static final Q10 f29655a = new Q10();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum j uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m28432d2 = {"LQ10$a;", "", "", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "key", "LcO1;", "c", "LcO1;", "()LcO1;", "impl", "<init>", "(Ljava/lang/String;ILjava/lang/String;LcO1;)V", C17296a.f69688o, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Q10$a */
    /* loaded from: classes2.dex */
    public static final class EnumC6632a {

        /* renamed from: d */
        public static final C6633a f29656d;

        /* renamed from: e */
        public static final Map<String, EnumC6632a> f29657e;

        /* renamed from: f */
        public static final EnumC6632a f29658f = new EnumC6632a("CONTAINER", 0, "container", C36284Tz0.f36576b);

        /* renamed from: g */
        public static final EnumC6632a f29659g = new EnumC6632a("LOG_CUSTOM_EVENT", 1, "logCustomEvent", C45396mx2.f99107b);

        /* renamed from: h */
        public static final EnumC6632a f29660h = new EnumC6632a("SET_CUSTOM_ATTRIBUTE", 2, "setCustomUserAttribute", C35551Qv5.f31237b);

        /* renamed from: i */
        public static final EnumC6632a f29661i = new EnumC6632a("REQUEST_PUSH_PERMISSION", 3, "requestPushPermission", C40271eJ4.f78225b);

        /* renamed from: j */
        public static final EnumC6632a f29662j;

        /* renamed from: k */
        public static final EnumC6632a f29663k;

        /* renamed from: l */
        public static final EnumC6632a f29664l;

        /* renamed from: m */
        public static final EnumC6632a f29665m;

        /* renamed from: n */
        public static final EnumC6632a f29666n;

        /* renamed from: o */
        public static final EnumC6632a f29667o;

        /* renamed from: p */
        public static final EnumC6632a f29668p;

        /* renamed from: q */
        public static final EnumC6632a f29669q;

        /* renamed from: r */
        public static final EnumC6632a f29670r;

        /* renamed from: s */
        public static final /* synthetic */ EnumC6632a[] f29671s;

        /* renamed from: b */
        public final String f29672b;

        /* renamed from: c */
        public final InterfaceC39110cO1 f29673c;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LQ10$a$a;", "", "", "value", "LQ10$a;", C17296a.f69688o, "", "map", "Ljava/util/Map;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: Q10$a$a */
        /* loaded from: classes2.dex */
        public static final class C6633a {
            public /* synthetic */ C6633a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final EnumC6632a m89124a(String str) {
                Map map = EnumC6632a.f29657e;
                if (str == null) {
                    str = "";
                }
                Object obj = map.get(str);
                if (obj == null) {
                    obj = EnumC6632a.f29670r;
                }
                return (EnumC6632a) obj;
            }

            private C6633a() {
            }
        }

        static {
            int mapCapacity;
            int coerceAtLeast;
            int i = 0;
            C12298b8 c12298b8 = C12298b8.f56958b;
            f29662j = new EnumC6632a("ADD_TO_SUBSCRIPTION_GROUP", 4, "addToSubscriptionGroup", c12298b8);
            f29663k = new EnumC6632a("REMOVE_FROM_SUBSCRIPTION_GROUP", 5, "removeFromSubscriptionGroup", c12298b8);
            f29664l = new EnumC6632a("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 6, "addToCustomAttributeArray", C10574a8.f49859b);
            f29665m = new EnumC6632a("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 7, "removeFromCustomAttributeArray", C44202kw4.f95239b);
            f29666n = new EnumC6632a("SET_EMAIL_SUBSCRIPTION", 8, "setEmailNotificationSubscriptionType", C36019Sv5.f34495b);
            f29667o = new EnumC6632a("SET_PUSH_NOTIFICATION_SUBSCRIPTION", 9, "setPushNotificationSubscriptionType", C37657Zv5.f49482b);
            f29668p = new EnumC6632a("OPEN_LINK_IN_WEBVIEW", 10, "openLinkInWebview", C36827Wh3.f41537b);
            f29669q = new EnumC6632a("OPEN_LINK_EXTERNALLY", 11, "openLink", C36593Vh3.f39485b);
            f29670r = new EnumC6632a("INVALID", 12, "", C51434x83.f117118a);
            f29671s = m89128a();
            f29656d = new C6633a(null);
            EnumC6632a[] values = values();
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            int length = values.length;
            while (i < length) {
                EnumC6632a enumC6632a = values[i];
                i++;
                linkedHashMap.put(enumC6632a.m89125d(), enumC6632a);
            }
            f29657e = linkedHashMap;
        }

        public EnumC6632a(String str, int i, String str2, InterfaceC39110cO1 interfaceC39110cO1) {
            this.f29672b = str2;
            this.f29673c = interfaceC39110cO1;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC6632a[] m89128a() {
            return new EnumC6632a[]{f29658f, f29659g, f29660h, f29661i, f29662j, f29663k, f29664l, f29665m, f29666n, f29667o, f29668p, f29669q, f29670r};
        }

        public static EnumC6632a valueOf(String str) {
            return (EnumC6632a) Enum.valueOf(EnumC6632a.class, str);
        }

        public static EnumC6632a[] values() {
            return (EnumC6632a[]) f29671s.clone();
        }

        /* renamed from: c */
        public final InterfaceC39110cO1 m89126c() {
            return this.f29673c;
        }

        /* renamed from: d */
        public final String m89125d() {
            return this.f29672b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$b */
    /* loaded from: classes2.dex */
    public static final class C6634b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Channel f29674g;

        /* renamed from: h */
        public final /* synthetic */ Uri f29675h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6634b(Channel channel, Uri uri) {
            super(0);
            this.f29674g = channel;
            this.f29675h = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Attempting to parse Braze Action with channel " + this.f29674g + " and uri:\n'" + this.f29675h + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$c */
    /* loaded from: classes2.dex */
    public static final class C6635c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C6635c f29676g = new C6635c();

        public C6635c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to decode Braze Action into both version and json components. Doing nothing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$d */
    /* loaded from: classes2.dex */
    public static final class C6636d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f29677g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6636d(String str) {
            super(0);
            this.f29677g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze Actions version " + this.f29677g + " is unsupported. Version must be v1";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$e */
    /* loaded from: classes2.dex */
    public static final class C6637e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f29678g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6637e(Uri uri) {
            super(0);
            this.f29678g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse uri as a Braze Action.\n'" + this.f29678g + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$f */
    /* loaded from: classes2.dex */
    public static final class C6638f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f29679g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6638f(Uri uri) {
            super(0);
            this.f29679g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Done handling Braze uri\n'" + this.f29679g + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$g */
    /* loaded from: classes2.dex */
    public static final class C6639g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ EnumC6632a f29680g;

        /* renamed from: h */
        public final /* synthetic */ KQ5 f29681h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6639g(EnumC6632a enumC6632a, KQ5 kq5) {
            super(0);
            this.f29680g = enumC6632a;
            this.f29681h = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot parse invalid action of type " + this.f29680g + " and data " + this.f29681h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$h */
    /* loaded from: classes2.dex */
    public static final class C6640h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f29682g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6640h(Uri uri) {
            super(0);
            this.f29682g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to parse version and encoded action from uri: ", this.f29682g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$i */
    /* loaded from: classes2.dex */
    public static final class C6641i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f29683g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6641i(String str) {
            super(0);
            this.f29683g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to decode action into json. Action:\n'" + ((Object) this.f29683g) + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$j */
    /* loaded from: classes2.dex */
    public static final class C6642j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ EnumC6632a f29684g;

        /* renamed from: h */
        public final /* synthetic */ KQ5 f29685h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6642j(EnumC6632a enumC6632a, KQ5 kq5) {
            super(0);
            this.f29684g = enumC6632a;
            this.f29685h = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Performing Braze Action type " + this.f29684g + " with data " + this.f29685h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Q10$k */
    /* loaded from: classes2.dex */
    public static final class C6643k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ KQ5 f29686g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6643k(KQ5 kq5) {
            super(0);
            this.f29686g = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to run with data ", this.f29686g);
        }
    }

    private Q10() {
    }

    /* renamed from: a */
    public final void m89134a(Context context, Uri uri, Channel channel) {
        Pair m89132c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C6634b(channel, uri), 6, null);
        try {
            m89132c = m89132c(uri);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C6637e(uri), 4, null);
        }
        if (m89132c == null) {
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, C6635c.f29676g, 6, null);
            return;
        }
        String str = (String) m89132c.component1();
        JSONObject jSONObject = (JSONObject) m89132c.component2();
        if (!Intrinsics.areEqual(str, "v1")) {
            C43664k20.m29442e(c43664k20, this, null, null, false, new C6636d(str), 7, null);
            return;
        }
        m89130e(context, new KQ5(jSONObject, channel));
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C6638f(uri), 6, null);
    }

    /* renamed from: b */
    public final /* synthetic */ EnumC6632a m89133b(KQ5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        EnumC6632a m89124a = EnumC6632a.f29656d.m89124a(C31696Aj2.m115351h(data.m98896j(), "type"));
        if (!m89124a.m89126c().mo5819a(data)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C6639g(m89124a, data), 7, null);
            return EnumC6632a.f29670r;
        }
        return m89124a;
    }

    /* renamed from: c */
    public final /* synthetic */ Pair m89132c(Uri uri) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host != null && lastPathSegment != null) {
            try {
                jSONObject = m89129f(lastPathSegment);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, uri, C43664k20.EnumC25082a.E, e, false, new C6641i(lastPathSegment), 4, null);
                jSONObject = null;
            }
            if (jSONObject == null) {
                return null;
            }
            return new Pair(host, jSONObject);
        }
        C43664k20.m29442e(C43664k20.f93782a, uri, null, null, false, new C6640h(uri), 7, null);
        return null;
    }

    /* renamed from: d */
    public final boolean m89131d(Uri uri) {
        return Intrinsics.areEqual(uri == null ? null : uri.getScheme(), "brazeActions");
    }

    /* renamed from: e */
    public final /* synthetic */ void m89130e(Context context, KQ5 data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            EnumC6632a m89133b = m89133b(data);
            if (m89133b == EnumC6632a.f29670r) {
                return;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C6642j(m89133b, data), 6, null);
            m89133b.m89126c().mo5818b(context, data);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C6643k(data), 4, null);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ JSONObject m89129f(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        byte[] decode = Base64.decode(action, 8);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(action, Base64.URL_SAFE)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, decode.length - 1, 2);
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                iArr[i2 / 2] = (decode[i2] & UByte.MAX_VALUE) | ((decode[i2 + 1] & UByte.MAX_VALUE) << 8);
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            int i4 = iArr[i];
            i++;
            if (i4 >= 0 && i4 <= 65535) {
                sb.append((char) i4);
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid Char code: ", Integer.valueOf(i4)));
            }
        }
        return new JSONObject(sb.toString());
    }
}
