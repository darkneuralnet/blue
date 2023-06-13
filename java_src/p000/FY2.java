package p000;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001d\"\u0017#B'\b\u0000\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J*\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b%\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001d\u00101\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u001d\u00107\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b4\u00100R*\u0010=\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010?¨\u0006C"}, m28432d2 = {"LFY2;", "", "", "mimeType", "", "h", "Landroid/net/Uri;", "deepLink", "", "LyY2;", "arguments", "Landroid/os/Bundle;", "f", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "uri", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Ljava/util/regex/Pattern;", "fillInPattern", "c", "bundle", "name", "value", "argument", "m", C17296a.f69688o, "Ljava/lang/String;", "k", "()Ljava/lang/String;", "uriPattern", "b", DateTokenConverter.CONVERTER_KEY, "action", "g", "", "Ljava/util/List;", "", "LFY2$d;", "e", "Ljava/util/Map;", "paramArgMap", "patternFinalRegex", "Lkotlin/Lazy;", "j", "()Ljava/util/regex/Pattern;", "pattern", "Z", "isParameterizedQuery", "i", "isSingleQueryParamValueOnly", "mimeTypeFinalRegex", "mimeTypePattern", "<set-?>", "l", "()Z", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "", "()Ljava/util/List;", "argumentsNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: FY2 */
/* loaded from: classes.dex */
public final class FY2 {

    /* renamed from: m */
    public static final C2350b f9629m = new C2350b(null);
    @Deprecated

    /* renamed from: n */
    public static final Pattern f9630n = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final String f9631a;

    /* renamed from: b */
    public final String f9632b;

    /* renamed from: c */
    public final String f9633c;

    /* renamed from: d */
    public final List<String> f9634d = new ArrayList();

    /* renamed from: e */
    public final Map<String, C2352d> f9635e = new LinkedHashMap();

    /* renamed from: f */
    public String f9636f;

    /* renamed from: g */
    public final Lazy f9637g;

    /* renamed from: h */
    public boolean f9638h;

    /* renamed from: i */
    public boolean f9639i;

    /* renamed from: j */
    public String f9640j;

    /* renamed from: k */
    public final Lazy f9641k;

    /* renamed from: l */
    public boolean f9642l;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\t\b\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"LFY2$a;", "", "", "uriPattern", "b", "LFY2;", C17296a.f69688o, "Ljava/lang/String;", "action", "c", "mimeType", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: FY2$a */
    /* loaded from: classes.dex */
    public static final class C2348a {

        /* renamed from: d */
        public static final C2349a f9643d = new C2349a(null);

        /* renamed from: a */
        public String f9644a;

        /* renamed from: b */
        public String f9645b;

        /* renamed from: c */
        public String f9646c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LFY2$a$a;", "", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: FY2$a$a */
        /* loaded from: classes.dex */
        public static final class C2349a {
            public /* synthetic */ C2349a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2349a() {
            }
        }

        /* renamed from: a */
        public final FY2 m106982a() {
            return new FY2(this.f9644a, this.f9645b, this.f9646c);
        }

        /* renamed from: b */
        public final C2348a m106981b(String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.f9644a = uriPattern;
            return this;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LFY2$b;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "SCHEME_PATTERN", "Ljava/util/regex/Pattern;", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: FY2$b */
    /* loaded from: classes.dex */
    public static final class C2350b {
        public /* synthetic */ C2350b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2350b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000bJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LFY2$c;", "", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "setSubType", "subType", "mimeType", "<init>", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: FY2$c */
    /* loaded from: classes.dex */
    public static final class C2351c implements Comparable<C2351c> {

        /* renamed from: b */
        public String f9647b;

        /* renamed from: c */
        public String f9648c;

        public C2351c(String mimeType) {
            List emptyList;
            boolean z;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> split = new Regex("/").split(mimeType, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.f9647b = (String) emptyList.get(0);
            this.f9648c = (String) emptyList.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C2351c other) {
            int i;
            Intrinsics.checkNotNullParameter(other, "other");
            if (Intrinsics.areEqual(this.f9647b, other.f9647b)) {
                i = 2;
            } else {
                i = 0;
            }
            if (Intrinsics.areEqual(this.f9648c, other.f9648c)) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: b */
        public final String m106979b() {
            return this.f9648c;
        }

        /* renamed from: c */
        public final String m106978c() {
            return this.f9647b;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LFY2$d;", "", "", "name", "", C17296a.f69688o, "", "index", "b", "f", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "paramRegex", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "arguments", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: FY2$d */
    /* loaded from: classes.dex */
    public static final class C2352d {

        /* renamed from: a */
        public String f9649a;

        /* renamed from: b */
        public final List<String> f9650b = new ArrayList();

        /* renamed from: a */
        public final void m106977a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f9650b.add(name);
        }

        /* renamed from: b */
        public final String m106976b(int i) {
            return this.f9650b.get(i);
        }

        /* renamed from: c */
        public final List<String> m106975c() {
            return this.f9650b;
        }

        /* renamed from: d */
        public final String m106974d() {
            return this.f9649a;
        }

        /* renamed from: e */
        public final void m106973e(String str) {
            this.f9649a = str;
        }

        /* renamed from: f */
        public final int m106972f() {
            return this.f9650b.size();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: FY2$e */
    /* loaded from: classes.dex */
    public static final class C2353e extends Lambda implements Function0<Pattern> {
        public C2353e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Pattern invoke() {
            String str = FY2.this.f9640j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/regex/Pattern;", "b", "()Ljava/util/regex/Pattern;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: FY2$f */
    /* loaded from: classes.dex */
    public static final class C2354f extends Lambda implements Function0<Pattern> {
        public C2354f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Pattern invoke() {
            String str = FY2.this.f9636f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public FY2(String str, String str2, String str3) {
        Lazy lazy;
        Lazy lazy2;
        String replace$default;
        boolean z;
        String replace$default2;
        String replace$default3;
        this.f9631a = str;
        this.f9632b = str2;
        this.f9633c = str3;
        lazy = LazyKt__LazyJVMKt.lazy(new C2354f());
        this.f9637g = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C2353e());
        this.f9641k = lazy2;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f9638h = z;
            StringBuilder sb = new StringBuilder("^");
            if (!f9630n.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (this.f9638h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Intrinsics.checkNotNullExpressionValue(fillInPattern, "fillInPattern");
                    this.f9642l = m106993c(substring, sb, fillInPattern);
                }
                for (String paramName : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParam = parse.getQueryParameter(paramName);
                    if (queryParam == null) {
                        this.f9639i = true;
                        queryParam = paramName;
                    }
                    Matcher matcher2 = fillInPattern.matcher(queryParam);
                    C2352d c2352d = new C2352d();
                    int i = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group != null) {
                            c2352d.m106977a(group);
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String substring2 = queryParam.substring(i, matcher2.start());
                            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(substring2));
                            sb2.append("(.+?)?");
                            i = matcher2.end();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i < queryParam.length()) {
                        Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                        String substring3 = queryParam.substring(i);
                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "argRegex.toString()");
                    replace$default3 = StringsKt__StringsJVMKt.replace$default(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null);
                    c2352d.m106973e(replace$default3);
                    Map<String, C2352d> map = this.f9635e;
                    Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                    map.put(paramName, c2352d);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(fillInPattern, "fillInPattern");
                this.f9642l = m106993c(str, sb, fillInPattern);
            }
            String sb4 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "uriRegex.toString()");
            replace$default2 = StringsKt__StringsJVMKt.replace$default(sb4, ".*", "\\E.*\\Q", false, 4, (Object) null);
            this.f9636f = replace$default2;
        }
        if (this.f9633c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f9633c).matches()) {
                C2351c c2351c = new C2351c(this.f9633c);
                replace$default = StringsKt__StringsJVMKt.replace$default("^(" + c2351c.m106978c() + "|[*]+)/(" + c2351c.m106979b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
                this.f9640j = replace$default;
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + this.f9633c + " does not match to required \"type/subtype\" format").toString());
        }
    }

    /* renamed from: c */
    public final boolean m106993c(String str, StringBuilder sb, Pattern pattern) {
        boolean contains$default;
        Matcher matcher = pattern.matcher(str);
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ".*", false, 2, (Object) null);
        boolean z = !contains$default;
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f9634d.add(group);
                String substring = str.substring(i, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    /* renamed from: d */
    public final String m106992d() {
        return this.f9632b;
    }

    /* renamed from: e */
    public final List<String> m106991e() {
        List<String> plus;
        List<String> list = this.f9634d;
        ArrayList arrayList = new ArrayList();
        for (C2352d c2352d : this.f9635e.values()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c2352d.m106975c());
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList);
        return plus;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FY2)) {
            return false;
        }
        FY2 fy2 = (FY2) obj;
        if (!Intrinsics.areEqual(this.f9631a, fy2.f9631a) || !Intrinsics.areEqual(this.f9632b, fy2.f9632b) || !Intrinsics.areEqual(this.f9633c, fy2.f9633c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Bundle m106990f(Uri deepLink, Map<String, C52262yY2> arguments) {
        Matcher matcher;
        boolean z;
        Matcher matcher2;
        String str;
        String substringAfter$default;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern m106986j = m106986j();
        if (m106986j != null) {
            matcher = m106986j.matcher(deepLink.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f9634d.size();
        int i = 0;
        while (i < size) {
            String str2 = this.f9634d.get(i);
            i++;
            String value = Uri.decode(matcher.group(i));
            C52262yY2 c52262yY2 = arguments.get(str2);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
            } catch (IllegalArgumentException unused) {
            }
            if (m106983m(bundle, str2, value, c52262yY2)) {
                return null;
            }
        }
        if (this.f9638h) {
            for (String str3 : this.f9635e.keySet()) {
                C2352d c2352d = this.f9635e.get(str3);
                String queryParameter = deepLink.getQueryParameter(str3);
                if (this.f9639i) {
                    String uri = deepLink.toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "deepLink.toString()");
                    substringAfter$default = StringsKt__StringsKt.substringAfter$default(uri, '?', (String) null, 2, (Object) null);
                    if (!Intrinsics.areEqual(substringAfter$default, uri)) {
                        queryParameter = substringAfter$default;
                    }
                }
                if (queryParameter != null) {
                    Intrinsics.checkNotNull(c2352d);
                    matcher2 = Pattern.compile(c2352d.m106974d(), 32).matcher(queryParameter);
                    if (!matcher2.matches()) {
                        return null;
                    }
                } else {
                    matcher2 = null;
                }
                Bundle bundle2 = new Bundle();
                try {
                    Intrinsics.checkNotNull(c2352d);
                    int m106972f = c2352d.m106972f();
                    for (int i2 = 0; i2 < m106972f; i2++) {
                        if (matcher2 != null) {
                            str = matcher2.group(i2 + 1);
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        String m106976b = c2352d.m106976b(i2);
                        C52262yY2 c52262yY22 = arguments.get(m106976b);
                        if (str != null) {
                            if (!Intrinsics.areEqual(str, CoreConstants.CURLY_LEFT + m106976b + CoreConstants.CURLY_RIGHT) && m106983m(bundle2, m106976b, str, c52262yY22)) {
                                return null;
                            }
                        }
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        for (Map.Entry<String, C52262yY2> entry : arguments.entrySet()) {
            String key = entry.getKey();
            C52262yY2 value2 = entry.getValue();
            if (value2 != null && !value2.m3338c() && !value2.m3339b()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !bundle.containsKey(key)) {
                return null;
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public final String m106989g() {
        return this.f9633c;
    }

    /* renamed from: h */
    public final int m106988h(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.f9633c != null) {
            Pattern m106987i = m106987i();
            Intrinsics.checkNotNull(m106987i);
            if (m106987i.matcher(mimeType).matches()) {
                return new C2351c(this.f9633c).compareTo(new C2351c(mimeType));
            }
        }
        return -1;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f9631a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 0) * 31;
        String str2 = this.f9632b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f9633c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: i */
    public final Pattern m106987i() {
        return (Pattern) this.f9641k.getValue();
    }

    /* renamed from: j */
    public final Pattern m106986j() {
        return (Pattern) this.f9637g.getValue();
    }

    /* renamed from: k */
    public final String m106985k() {
        return this.f9631a;
    }

    /* renamed from: l */
    public final boolean m106984l() {
        return this.f9642l;
    }

    /* renamed from: m */
    public final boolean m106983m(Bundle bundle, String str, String str2, C52262yY2 c52262yY2) {
        if (c52262yY2 != null) {
            c52262yY2.m3340a().m78227d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }
}
